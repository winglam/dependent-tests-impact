package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.data.Frequency;
import edu.washington.cs.dt.impact.data.ProjectEnhancedResults;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
                    .orElseThrow(() -> new IllegalArgumentException("Result path does not contain any files with any of " +
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

    public boolean containsDTs(final boolean unen) {
        final Constants.TECHNIQUE technique = getTechnique(resultFilesPath);

        return containsDTs(origProj, unen, technique) || containsDTs(autoProj, unen, technique);
    }

    private boolean containsDTs(final ProjectEnhancedResults project, final boolean unen, final Constants.TECHNIQUE technique) {
        final int figNum = Constants.TECHNIQUE_FIGNUMS.technique(technique);

        return IntStream.range(0, project.getLength(figNum))
                // Unenhanced is even, enhanced is odd.
                .filter(i -> unen ? i % 2 == 0 : i % 2 != 0)
                .anyMatch(i -> {
                    for (final boolean isOriginal : ListUtil.fromArray(true, false)) {
                        // Ignore the unen argument, we handle it by filtering above.
                        if (project.containsDT(true, i, figNum, isOriginal)) {
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

    public List<Double> prioValues(final String origOrAuto) {
        return EnhancedResultsFigureGenerator.generate17Values(getProject(origOrAuto));
    }

    public String generatePrioString(final String origOrAuto, final List<Double> values) {
        return EnhancedResultsFigureGenerator.generate17WithValues(getProject(origOrAuto), new ArrayList<>(), values);
    }

    public List<Double> seleValues(final String origOrAuto) {
        return EnhancedResultsFigureGenerator.generate18Values(getProject(origOrAuto));
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
        return EnhancedResultsFigureGenerator.generate19Values(getProject(origOrAuto));
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
}
