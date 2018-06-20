package edu.washington.cs.dt.impact.tools;

import com.google.common.collect.Lists;
import com.reedoei.eunomia.functional.Func;
import com.reedoei.eunomia.string.Context;
import com.reedoei.eunomia.string.matching.LineMatch;
import com.reedoei.eunomia.string.searching.Searcher;
import com.reedoei.eunomia.string.searching.StringSearch;
import com.reedoei.eunomia.util.FileUtil;
import com.reedoei.eunomia.util.ListUtil;
import com.reedoei.eunomia.util.PairStream;
import com.reedoei.eunomia.util.StandardMain;
import com.reedoei.eunomia.util.StringUtil;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResultsFigureGenerator;
import edu.washington.cs.dt.impact.order.Standard;
import edu.washington.cs.dt.impact.util.Constants;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PitResultAnalyzer extends StandardMain {
    private static final int MUTANT_GROUP_SIZE = 5;
    private static final int MUTANT_GROUP_COUNT = 100;
    private Path outputDir;

    private PitResultAnalyzer(final String[] args) {
        super(args);
    }

    public static void main(final String[] args) throws Exception {
        new PitResultAnalyzer(args).run();
    }

    private Path getMutationsPath(final Path parent) throws IOException {
        return Files.list(parent)
                .max(Comparator.comparingLong(p -> p.toFile().lastModified()))
                .map(p -> p.resolve("mutations.xml"))
                .orElseThrow(() -> new IOException("No mutations.xml found in path: " + parent));
    }

    @Override
    protected void run() throws Exception {
        final Path basePath = Paths.get(getRequiredArg("basePath"));

        final Path origMutationsPath = getMutationsPath(basePath.resolve("target").resolve("pit").resolve("orig"));
        final Path autoMutationsPath = getMutationsPath(basePath.resolve("target").resolve("pit").resolve("auto"));

        run(origMutationsPath, autoMutationsPath,
            Paths.get(getRequiredArg("resultFiles")),
            Paths.get(getRequiredArg("outputDir")));
    }

    private void run(final Path origMutationsPath, final Path autoMutationsPath, final Path resultFilesPath, final Path outputDir)
            throws IOException, DocumentException {
        this.outputDir = outputDir;

        final List<Double> origAverages = averageResults("orig", resultFilesPath, origMutationsPath);
        final List<Double> autoAverages = averageResults("auto", resultFilesPath, autoMutationsPath);

        System.out.println(latexString("orig", origAverages, resultFilesPath));
        System.out.println(latexString("auto", autoAverages, resultFilesPath));
    }

    private String latexString(final String origOrAuto, final List<Double> values, final Path resultFilesPath)
            throws IOException {
        final EnhancedResults results = EnhancedResultsFigureGenerator.setup(true,
                resultFilesPath.toString(), outputDir.toString());
        final Constants.TECHNIQUE technique = getTechnique(resultFilesPath);

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

    private List<Double> averageResults(final String origOrAuto, final Path resultFilesPath, final Path mutationsPath)
            throws IOException, DocumentException {
        final List<MutationGroup> mutationGroups = createMutationGroups(mutationsPath);
        generateResults(resultFilesPath, mutationGroups);

        final Constants.TECHNIQUE technique = getTechnique(resultFilesPath);

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
     * @param resultFilesPath The path to the directory containing the enhanced result files.
     * @return The guessed technique based on the files in the resultFilesPath.
     */
    private Constants.TECHNIQUE getTechnique(final Path resultFilesPath) throws IOException {
        // Use a frequency map instead of stopping at the first one because
        // selection/parallelization results folders will have one prioritization file in them
        // for the original order.
        final Map<Constants.TECHNIQUE, Integer> freqMap = new HashMap<>();

        for (final Path path : Files.list(resultFilesPath).collect(Collectors.toList())) {
            for (final Constants.TECHNIQUE technique : Constants.TECHNIQUE.values()) {
                if (path.toFile().getName().contains(technique.name())) {
                    freqMap.compute(technique, Util.incrementBy(1));
                }
            }
        }

        return Util.maxKey(freqMap)
                .orElseThrow(() -> new IllegalArgumentException("Result path does not contain any files with any of " +
                        Arrays.toString(Constants.TECHNIQUE.values()) + " in their name."));
    }

    private List<Double> results(final String origOrAuto, final Constants.TECHNIQUE technique, final MutationGroup mutationGroup) {
        System.out.printf("\rGenerating results for group %d.", mutationGroup.index);

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

    private Path outputPath(final MutationGroup mutationGroup) {
        return outputDir.resolve(Integer.toString(mutationGroup.index));
    }

    private List<MutationGroup> createMutationGroups(final Path mutationsPath)
            throws MalformedURLException, DocumentException {
        final List<Mutation> mutations =
                Util.readXmlDoc(mutationsPath.toFile()).getRootElement().elements("mutation").stream()
                        .filter(m -> m.attribute("status").getValue().equals("KILLED"))
                        .map(Mutation::new)
                        .collect(Collectors.toList());

        // Select the groups randomly
        Collections.shuffle(mutations);

        final List<List<Mutation>> groups = Lists.partition(mutations, MUTANT_GROUP_SIZE);

        return Func.mapWithIndex(
                MutationGroup::new,
                groups.subList(0, Math.min(MUTANT_GROUP_COUNT, groups.size())));
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

    private void generateResults(final Path resultFilesPath, final List<MutationGroup> mutationGroups)
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
                                                 final MutationGroup mutationGroup)
            throws IOException {
        final List<String> mutationInformation = new ArrayList<>();
        mutationInformation.add("\n");
        mutationInformation.add(Constants.MUTANT_LIST);
        mutationInformation.add(Func.map(Mutation::toString, mutationGroup.mutations).toString());

        final List<String> coverageStr = mutationGroup.showCoverage(testOrder);

        return new StringSearch(FileUtil.readFile(file.toPath()))
                .searchFirst(Searcher.contains(Constants.COVERAGE_STRING))
                .flatMap(LineMatch::nextLine)
                .map(l -> l.map(Func.constant(coverageStr.toString())).insertAfter(mutationInformation))
                .map(LineMatch::getLines)
                .orElseThrow(() -> new RuntimeException("Coverage string not present or no coverage line in: " + file.getAbsolutePath()));
    }

    private void processGroup(final File file, final MutationGroup mutationGroup) {
        readTestOrder(file).ifPresent(testOrder -> {
            try {
                final List<String> newLines = generateResultsForGroup(file, testOrder, mutationGroup);

                // Write modified file to $MUTANT_GROUP_INDEX/$FILENAME
                // Where $FILENAME is the original filename.
                final Path outputPath = outputPath(mutationGroup).resolve(file.getName());
                Files.createDirectories(outputPath.getParent());
                Files.write(outputPath, StringUtil.unlines(newLines).getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * @param s The fully qualified name in the format package.class.method(package.class)
     * @return The fully qualified name in the format package.class.method
     */
    private static String formatQName(final String s) {
        final String[] parts = s.split("\\(");
        return parts[0];
    }

    public static class MutationGroup {
        private final int index;
        private final List<Mutation> mutations;

        public MutationGroup(final int index, final List<Mutation> mutations) {
            this.index = index;
            this.mutations = mutations;
        }

        private List<Double> coverage(final List<String> testOrder) {
            final List<Mutation> mutationListCopy = new ArrayList<>(mutations);

            final List<Double> result = new ArrayList<>();

            for (final String test : testOrder) {
                final int sizeBefore = mutationListCopy.size();
                mutationListCopy.removeIf(m -> m.coveredBy(test));
                final int sizeAfter = mutationListCopy.size();

                final double coverage = (sizeBefore - sizeAfter) / (double)mutations.size();
                result.add(coverage);
            }

            return result;
        }

        public List<String> showCoverage(final List<String> testOrder) {
            return coverage(testOrder).stream()
                    .map(Standard::formatPercent)
                    .collect(Collectors.toList());
        }
    }

    public static class Mutation {
        private final String mutator;
        private final String lineNumber;
        private final String index;
        private final List<String> killingTests;

        public Mutation(final Element mutation) {
            this.mutator = mutation.element("mutator").getText();
            this.lineNumber = mutation.element("lineNumber").getText();
            this.index = mutation.element("index").getText();

            this.killingTests =
                    Arrays.stream(mutation.element("killingTest").getText().split(","))
                    .map(PitResultAnalyzer::formatQName)
                    .collect(Collectors.toList());
        }

        public Mutation(final String mutator,
                        final String lineNumber,
                        final String index,
                        final List<String> killingTests) {
            this.mutator = mutator;
            this.lineNumber = lineNumber;
            this.index = index;
            this.killingTests = killingTests;
        }

        @Override
        public String toString() {
            return mutator + "-" + lineNumber + "-" + index;
        }

        public boolean coveredBy(final String test) {
            return killingTests.contains(test);
        }
    }
}
