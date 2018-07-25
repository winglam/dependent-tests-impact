package edu.washington.cs.dt.impact.tools;

import com.google.common.base.Preconditions;
import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.functional.Func;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResultsFigureGenerator;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EnhancedResultAverager {
    private final List<Averager<Double>> averagers = new ArrayList<>();

    private final String origOrAuto;
    private final Constants.TECHNIQUE technique;

    private final List<Path> resultFilesPaths = new ArrayList<>();
    private final List<EnhancedResults> enhancedResults = new ArrayList<>();

    public EnhancedResultAverager(final String origOrAuto, final Path resultFilesParent) throws IOException {
        this(origOrAuto, EnhancedResults.getTechnique(resultFilesParent));
    }

    public EnhancedResultAverager(final String origOrAuto, final Constants.TECHNIQUE technique) {
        this.origOrAuto = origOrAuto;
        this.technique = technique;
    }

    public EnhancedResultAverager add(final Path resultFilesPath) throws IOException {
        resultFilesPaths.add(resultFilesPath);

        final EnhancedResults results = getResults(resultFilesPath);
        enhancedResults.add(results);

        addValues(results.values(origOrAuto));

        return this;
    }

    public List<EnhancedResults> enhancedResults() {
        return enhancedResults;
    }

    private EnhancedResults getResults(final Path resultFilesPath) throws IOException {
//        checkFiles(resultFilesParent);
//        checkFilesSimple(resultFilesParent);

        System.out.printf("[INFO] Generating %s results for %s\n", origOrAuto, resultFilesPath);

        final Path outputPath = Files.createTempDirectory("output");

        return EnhancedResultsFigureGenerator.setup(true, resultFilesPath, outputPath);
    }

    private void ensureAveragerCapacity(final int size) {
        for (int i = averagers.size(); i < size; i++) {
            averagers.add(new Averager<>());
        }
    }

    private void addValues(final List<Double> values) {
        ensureAveragerCapacity(values.size());
        Util.zipWith(Averager::add, averagers, values);
    }

    private void checkFilesSimple(final Path resultFilesPath) throws IOException {
        final Constants.TECHNIQUE technique = EnhancedResults.getTechnique(resultFilesPath);

        final int count = Math.toIntExact(Files.list(resultFilesPath).count());

        final int target;
        if (technique == Constants.TECHNIQUE.PRIORITIZATION) {
            target = 18;
        } else if (technique == Constants.TECHNIQUE.SELECTION) {
            target = 26;
        } else {
            target = 18;
        }

        if (count != target) {
            throw new IllegalStateException("Missing some files in " + resultFilesPath);
        }
    }

    private void checkFiles(final Path resultFilesPath) throws IOException {
        final Constants.TECHNIQUE technique = EnhancedResults.getTechnique(resultFilesPath);

        final Set<String> paths =
                Files.list(resultFilesPath)
                        .map(Path::getFileName)
                        .map(Path::toString)
                        .collect(Collectors.toSet());

        final Set<Pattern> patterns =
                filenames("[A-Za-z0-9_]+", technique).stream()
                .map(Pattern::compile)
                .collect(Collectors.toSet());

        for (final Pattern pattern : patterns) {
            if (paths.stream().noneMatch(pattern.asPredicate())) {
                System.out.println("Missing file: " + pattern.toString());
            }
        }
    }

    private Set<String> filenames(final String projectName, final Constants.TECHNIQUE technique) {
        final Set<String> results = new HashSet<>();

        for (final Constants.TEST_TYPE testType : Constants.TEST_TYPE.values()) {
            for (final Constants.COVERAGE coverage : Constants.COVERAGE.values()) {
                for (final Constants.ORDER order : Constants.ORDER.values()) {
                    for (final Constants.MACHINES machines : Constants.MACHINES.values()) {
                        for (final Constants.DT_SETTING dtSetting : Constants.DT_SETTING.values()) {
                            for (final Constants.TD_SETTING tdSetting : Constants.TD_SETTING.values()) {
                                results.add(Constants.getOutputFileName(coverage, technique, order, projectName,
                                        testType, machines, dtSetting, tdSetting));
                            }
                        }
                    }
                }
            }
        }

        return results;
    }

    public String latexString() throws IOException {
        Preconditions.checkState(!resultFilesPaths.isEmpty(), "Must have added at least one result file path BEFORE generating latex string!");

        final Path outputPath = Files.createTempDirectory("output");
        final EnhancedResults results =
                // We only need the results files paths for the subject name, so we can just use the first one.
                EnhancedResultsFigureGenerator.setup(true, resultFilesPaths.get(0), outputPath);

        final List<Double> values = Func.map(Averager::mean, averagers);

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

    public List<Double> means() {
        return ListUtil.map(Averager::mean, averagers);
    }

    public List<Averager<Double>> averagers() {
        return averagers;
    }
}
