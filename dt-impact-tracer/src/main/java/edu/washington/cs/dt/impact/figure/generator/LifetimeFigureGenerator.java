package edu.washington.cs.dt.impact.figure.generator;

import edu.washington.cs.dt.impact.tools.lifetime.PrecomputedLifetime;

import java.nio.file.Path;
import java.util.Date;

public class LifetimeFigureGenerator {
    private final PrecomputedLifetime precomputedLifetime;

    public LifetimeFigureGenerator(final Date startDate, final Path resultPaths) {
        this.precomputedLifetime = new PrecomputedLifetime(startDate, resultPaths);
    }
}
