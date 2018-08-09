package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.collections.StreamUtil;
import com.reedoei.eunomia.data.Frequency;
import com.reedoei.eunomia.io.files.FileUtil;
import edu.washington.cs.dt.impact.data.ProjectEnhancedResults;
import edu.washington.cs.dt.impact.data.TestInfo;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EnhancedResults {
    /**
     * @return The guessed technique based on the files in the resultFilesPath.
     */
    public static Constants.TECHNIQUE getTechnique(final Path resultFilesPath) {
        try {
            // Use a frequency map instead of stopping at the first one because
            // selection/parallelization results folders will have one prioritization file in them
            // for the original order.
            final Frequency<Constants.TECHNIQUE> frequency = Frequency.empty();

            for (final Path path : Files.walk(resultFilesPath).collect(Collectors.toList())) {
                for (final Constants.TECHNIQUE technique : Constants.TECHNIQUE.values()) {
                    if (path.toFile().getName().contains(technique.name())) {
                        frequency.count(technique);
                    }
                }
            }

            return frequency.max()
                    .orElseThrow(() -> new IllegalArgumentException("Path " + resultFilesPath + " does not contain any files with any of " +
                            Arrays.toString(Constants.TECHNIQUE.values()) + " in their name."));
        } catch (IOException e) {
            final String filename = resultFilesPath.getFileName().toString();
            switch (filename) {
                case "prioritization-results":
                    return Constants.TECHNIQUE.PRIORITIZATION;
                case "selection-results":
                    return Constants.TECHNIQUE.SELECTION;
                default:
                    return Constants.TECHNIQUE.PARALLELIZATION;
            }
        }
    }

    private final ProjectEnhancedResults origProj;
    private final ProjectEnhancedResults autoProj;

    private final Path resultFilesPath;

    public EnhancedResults(final ProjectEnhancedResults origProj,
                           final ProjectEnhancedResults autoProj,
                           final Path resultFilesPath) {
        this.origProj = origProj;
        this.autoProj = autoProj;
        this.resultFilesPath = resultFilesPath;
    }

    public Path resultFilesPath() {
        return resultFilesPath;
    }

    public boolean containsDTs(final boolean unen) {
        final Constants.TECHNIQUE technique = getTechnique(resultFilesPath);

        return (origProj != null && containsDTs(origProj, unen, technique)) ||
               (autoProj != null && containsDTs(autoProj, unen, technique));
    }

    private boolean containsDTs(final ProjectEnhancedResults project, final boolean unen, final Constants.TECHNIQUE technique) {
        final int figNum = Constants.TECHNIQUE_FIGNUMS.technique(technique);

        return IntStream.range(0, project.getLength(figNum))
                // Unenhanced is even, enhanced is odd.
                .filter(i -> unen ? i % 2 == 0 : i % 2 != 0)
                .anyMatch(i -> {
                    for (final boolean isOriginal : ListUtil.fromArray(true, false)) {
                        // Ignore the unen argument, we handle it by filtering above.
                        if (project.getFigNumDTs(figNum, isOriginal)[i]) {
                            return true;
                        }
                    }

                    return false;
                });
    }

    private ProjectEnhancedResults getProject(final String origOrAuto) {
        switch (origOrAuto) {
            case "orig":
                return origProj;

            case "auto":
                return autoProj;

            default:
                throw new IllegalArgumentException("Unknown type: " + origOrAuto);
        }
    }

    private ProjectEnhancedResults getOtherProject(final String origOrAuto) {
        if (getProject(origOrAuto) == origProj) {
            return autoProj;
        } else {
            return origProj;
        }
    }

    public List<Double> values(final String origOrAuto) throws IOException {
        final Constants.TECHNIQUE technique = getTechnique(resultFilesPath);
        switch (technique) {
            case PRIORITIZATION:
                return prioValues(origOrAuto);
            case SELECTION:
                return seleValues(origOrAuto);
            case PARALLELIZATION:
                return paraValues(origOrAuto);
            default:
                throw new IllegalArgumentException("Unhandled technique: " + technique);
        }
    }

    private List<Double> readOrGenerate(final String technique, final String origOrAuto,
                                        final Supplier<List<Double>> generator) {
        final Path outputFile = Paths.get("cached")
                .resolve(resultFilesPath.toString().replace("/", "-").substring(1)
                        + "-" + technique
                        + "-" + origOrAuto);

        try {
            if (Files.exists(outputFile)) {
                return ListUtil.read(Double::parseDouble, FileUtil.readFile(outputFile));
            }
        } catch (IOException ignored) {}

        final List<Double> values = generator.get();
        try {
            Files.write(outputFile, values.toString().getBytes());
        } catch (IOException ignored) {}
        return values;
    }

    public List<Double> prioValues(final String origOrAuto) {
        return readOrGenerate("prio", origOrAuto, () -> EnhancedResultsFigureGenerator.generate17Values(getProject(origOrAuto)));
    }

    public String generatePrioString(final String origOrAuto, final List<Double> values) {
        return EnhancedResultsFigureGenerator.generate17WithValues(getProject(origOrAuto), new ArrayList<>(), values);
    }

    public List<Double> seleValues(final String origOrAuto) {
        return readOrGenerate("sele", origOrAuto, () -> EnhancedResultsFigureGenerator.generate18Values(getProject(origOrAuto)));
    }

    public String generateSeleString(final String origOrAuto, final List<Double> values) {
        final ProjectEnhancedResults proj = getProject(origOrAuto);
        final ProjectEnhancedResults otherProj = getOtherProject(origOrAuto);

        final double orig_time_value = (proj.getOrigTimeValue() == 0)
                ? otherProj.getOrigTimeValue()
                : proj.getOrigTimeValue();
        return EnhancedResultsFigureGenerator.generate18WithValues(proj, orig_time_value,
                new ArrayList<>(), new ArrayList<>(),
                new EnhancedResultsFigureGenerator.PercentWrapper(), origOrAuto, values);
    }

    public List<Double> paraValues(final String origOrAuto) {
        return readOrGenerate("para", origOrAuto, () -> EnhancedResultsFigureGenerator.generate19Values(getProject(origOrAuto)));
    }

    public String generateParaString(final String origOrAuto, final List<Double> values) {
        final ProjectEnhancedResults proj = getProject(origOrAuto);
        final ProjectEnhancedResults otherProj = getOtherProject(origOrAuto);

        final double orig_time_value = (proj.getOrigTimeValue() == 0)
                ? otherProj.getOrigTimeValue()
                : proj.getOrigTimeValue();

        return EnhancedResultsFigureGenerator.generate19WithValues(proj, orig_time_value,
                new ArrayList<>(), new EnhancedResultsFigureGenerator.PercentWrapper(),
                values);
    }

    private Optional<Double> runtime(final ProjectEnhancedResults proj, final int i, final int figNum, final boolean isOriginal) {
        // Ignoring unen argument, because it only affects the index, and we're iterate over all values of it anyway
        final Collection<TestInfo> values = proj.get_orig_info(true, i, figNum, isOriginal).values();
        if (values.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(values.stream().mapToDouble(t -> t.getTime() / 1E9).sum());
        }
    }

    private Stream<Double> runtimes(final int figNum, final ProjectEnhancedResults proj) {
        return StreamUtil.removeEmpty(
                IntStream.range(0, proj.getLength(figNum)).boxed()
                         .flatMap(i -> Stream.of(runtime(proj, i, figNum, true),
                                    runtime(proj, i, figNum, false))));
    }

    public Stream<Double> runtimes(final int figNum, final String origOrAuto) {
        return runtimes(figNum, getProject(origOrAuto));
    }
}
