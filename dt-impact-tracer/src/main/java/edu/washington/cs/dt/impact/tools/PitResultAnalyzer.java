package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.data.Frequency;
import com.reedoei.eunomia.functional.Func;
import com.reedoei.eunomia.string.Context;
import com.reedoei.eunomia.string.matching.LineMatch;
import com.reedoei.eunomia.string.searching.Searcher;
import com.reedoei.eunomia.string.searching.StringSearch;
import com.reedoei.eunomia.util.FileUtil;
import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.collections.PairStream;
import com.reedoei.eunomia.util.StandardMain;
import com.reedoei.eunomia.util.StringUtil;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResultsFigureGenerator;
import edu.washington.cs.dt.impact.util.Constants;
import org.dom4j.DocumentException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PitResultAnalyzer extends StandardMain {
    private Path outputDir;
    private Path resultFilesPath;

    private PitResultAnalyzer(final String[] args) {
        super(args);
    }

    public static void main(final String[] args) throws Exception {
        new PitResultAnalyzer(args).run();
    }

    @Override
    protected void run() throws Exception {
        final Path basePath = Paths.get(getRequiredArg("basePath"));

        final Path origMutationsPath = basePath.resolve("target").resolve("pit").resolve("orig");
        final Path autoMutationsPath = basePath.resolve("target").resolve("pit").resolve("auto");

        run(origMutationsPath, autoMutationsPath,
            Paths.get(getRequiredArg("resultFiles")),
            Paths.get(getRequiredArg("outputDir")));
    }

    private void run(final Path origMutationsPath, final Path autoMutationsPath, final Path resultFilesPath, final Path outputDir)
            throws IOException, DocumentException {
        this.outputDir = outputDir;
        this.resultFilesPath = resultFilesPath;

        final List<Double> origAverages = averageResults("orig", origMutationsPath);
        final List<Double> autoAverages = averageResults("auto", autoMutationsPath);

        System.out.println(latexString("orig", origAverages));
        System.out.println(latexString("auto", autoAverages));
    }

    private String latexString(final String origOrAuto, final List<Double> values)
            throws IOException {
        final EnhancedResults results = EnhancedResultsFigureGenerator.setup(true,
                resultFilesPath.toString(), outputDir.toString());
        final Constants.TECHNIQUE technique = getTechnique();

        switch (technique) {
            case PRIORITIZATION:
                return results.generatePrioString(origOrAuto, values);

            case SELECTION:
                return results.generateSeleString(origOrAuto, values);

            case PARALLELIZATION:
                return results.generateParaString(origOrAuto, values);

            default:
                throw new IllegalArgumentException("Unhandled technique: " + technique);
        }
    }

    private List<Double> averageResults(final String origOrAuto, final Path mutationsPath)
            throws IOException, DocumentException {
        final MutantMatrix mutantMatrix = MutantMatrix.fromPath(mutationsPath);

        final List<MutantMatrix.MutationGroup> mutationGroups = mutantMatrix.createMutationGroups();

        generateResults(mutationGroups);

        final Constants.TECHNIQUE technique = getTechnique();

        // TODO: Record this information somewhere if this is what we end up doing.
        System.out.printf("Using %d mutation groups for %s %s results\n", mutationGroups.size(), origOrAuto, technique);

        final List<Double> result = mutationGroups.stream()
                .map(g -> results(origOrAuto, technique, g))
                .reduce((current, newVals) -> Util.zipWith((a, b) -> a + b, current, newVals))
                .map(totals -> Func.map(t -> t / mutationGroups.size(), totals))
                .orElseThrow(() -> new IllegalStateException("Not enough mutation groups or some other error occurred when calculating averages"));

        // To end the line we print out in results()
        System.out.println();
        return result;
    }

    /**
     * @return The guessed technique based on the files in the resultFilesPath.
     */
    private Constants.TECHNIQUE getTechnique() throws IOException {
        // Use a frequency map instead of stopping at the first one because
        // selection/parallelization results folders will have one prioritization file in them
        // for the original order.
        final Map<Constants.TECHNIQUE, Integer> freqMap = new HashMap<>();

        final Frequency<Constants.TECHNIQUE> frequency = Frequency.empty();

        for (final Path path : Files.list(resultFilesPath).collect(Collectors.toList())) {
            for (final Constants.TECHNIQUE technique : Constants.TECHNIQUE.values()) {
                if (path.toFile().getName().contains(technique.name())) {
                    frequency.count(technique);
                }
            }
        }

        return frequency.max()
                .orElseThrow(() -> new IllegalArgumentException("Result path does not contain any files with any of " +
                        Arrays.toString(Constants.TECHNIQUE.values()) + " in their name."));
    }

    private List<Double> results(final String origOrAuto, final Constants.TECHNIQUE technique, final MutantMatrix.MutationGroup mutationGroup) {
        System.out.printf("\rGenerating results for group %d.", mutationGroup.getIndex());

        final Path outputPath = outputPath(mutationGroup);

        final EnhancedResults results =
                EnhancedResultsFigureGenerator.setup(true, outputPath.toString(), outputDir.toString());

        switch (technique) {
            case PRIORITIZATION:
                return results.prioValues(origOrAuto);

            case SELECTION:
                return results.seleValues(origOrAuto);

            case PARALLELIZATION:
                return results.paraValues(origOrAuto);

            default:
                throw new IllegalArgumentException("Unhandled technique: " + technique);
        }
    }

    private Path outputPath(final MutantMatrix.MutationGroup mutationGroup) {
        return outputDir.resolve(Integer.toString(mutationGroup.getIndex()));
    }

    private Optional<List<String>> readTestOrder(final File file) {
        try {
            return new StringSearch(FileUtil.readFile(file.toPath()))
                    .search(Searcher.contains(Constants.TEST_ORDER_LIST))
                    .map(Context.applyNextLine(ListUtil.reader(Function.identity())))
                    .findFirst();
        } catch (IOException e) {
            return Optional.empty();
        }
    }

    private void generateResults(final List<MutantMatrix.MutationGroup> mutationGroups)
            throws IOException {
        Files.createDirectories(outputDir);

        final File[] files = resultFilesPath.toFile().listFiles();
        if (files != null) {
            PairStream.product(Arrays.asList(files), mutationGroups)
                    .forEach(this::processGroup);
        }
    }

    private List<String> generateResultsForGroup(final File file,
                                                 final List<String> testOrder,
                                                 final MutantMatrix.MutationGroup mutationGroup)
            throws IOException {
        final List<String> mutationInformation = new ArrayList<>();
        mutationInformation.add("\n");
        mutationInformation.add(Constants.MUTANT_LIST);
        mutationInformation.add(mutationGroup.toString());

        final List<String> coverageStr = mutationGroup.showCoverage(testOrder);

        return new StringSearch(FileUtil.readFile(file.toPath()))
                .searchFirst(Searcher.contains(Constants.COVERAGE_STRING))
                .flatMap(LineMatch::nextLine)
                .map(l -> l.map(Func.constant(coverageStr.toString())).insertAfter(mutationInformation))
                .map(LineMatch::getLines)
                .orElseThrow(() -> new RuntimeException("Coverage string not present or no coverage line in: " + file.getAbsolutePath()));
    }

    private void processGroup(final File file, final MutantMatrix.MutationGroup mutationGroup) {
        readTestOrder(file).ifPresent(testOrder -> {
            try {
                final List<String> newLines = generateResultsForGroup(file, testOrder, mutationGroup);

                // Write modified file to MUTANT_GROUP_INDEX/FILENAME
                // Where FILENAME is the original filename.
                final Path outputPath = outputPath(mutationGroup).resolve(file.getName());
                Files.createDirectories(outputPath.getParent());
                Files.write(outputPath, StringUtil.unlines(newLines).getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
