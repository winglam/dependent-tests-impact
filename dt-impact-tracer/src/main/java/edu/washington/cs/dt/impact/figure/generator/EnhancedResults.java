package edu.washington.cs.dt.impact.figure.generator;

import edu.washington.cs.dt.impact.data.ProjectEnhancedResults;

import java.util.ArrayList;
import java.util.List;

public class EnhancedResults {
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
