package edu.washington.cs.dt.impact.figure.generator;

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

public class EnhancedResults {
    /**
     * @return The guessed technique based on the files in the resultFilesPath.
     */
    public static Constants.TECHNIQUE getTechnique(final Path resultFilesPath) throws IOException {
        // Use a frequency map instead of stopping at the first one because
        // selection/parallelization results folders will have one prioritization file in them
        // for the original order.
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

    private final ProjectEnhancedResults origProj;
    private final ProjectEnhancedResults autoProj;

    public EnhancedResults(final ProjectEnhancedResults origProj,
                           final ProjectEnhancedResults autoProj) {
        this.origProj = origProj;
        this.autoProj = autoProj;
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
