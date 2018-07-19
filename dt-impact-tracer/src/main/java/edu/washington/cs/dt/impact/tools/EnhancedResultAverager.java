package edu.washington.cs.dt.impact.tools;

import com.google.common.base.Preconditions;
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
import java.util.List;

public class EnhancedResultAverager {
    private final List<Averager<Double>> averagers = new ArrayList<>();
    private final String origOrAuto;
    private final Constants.TECHNIQUE technique;
    private final List<Path> resultFilesPaths = new ArrayList<>();

    public EnhancedResultAverager(final String origOrAuto, final Path resultFilesPath) throws IOException {
        this(origOrAuto, EnhancedResults.getTechnique(resultFilesPath));
    }

    public EnhancedResultAverager(final String origOrAuto, final Constants.TECHNIQUE technique) {
        this.origOrAuto = origOrAuto;
        this.technique = technique;
    }

    public EnhancedResultAverager add(final Path resultFilesPath) throws IOException {
        resultFilesPaths.add(resultFilesPath);
        addValues(results(resultFilesPath));

        return this;
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

    private List<Double> results(final Path resultFilesPath) throws IOException {
        System.out.printf("[INFO] Generating results for %s\n", resultFilesPath);

        final Path outputPath = Files.createTempDirectory("output");

//        System.out.println(values);

        return EnhancedResultsFigureGenerator.setup(true, resultFilesPath, outputPath).values(origOrAuto);
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
        return Func.map(Averager::mean, averagers);
    }

    public List<Averager<Double>> getAveragers() {
        return averagers;
    }
}
