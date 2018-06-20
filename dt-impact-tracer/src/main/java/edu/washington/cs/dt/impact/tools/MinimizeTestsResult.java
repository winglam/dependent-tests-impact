package edu.washington.cs.dt.impact.tools;

import javax.annotation.Nonnull;
import java.util.List;

public class MinimizeTestsResult {
    @Nonnull
    private final String dependentTest;

    @Nonnull
    private final List<String> deps;

    public MinimizeTestsResult(@Nonnull final String dependentTest,
                               @Nonnull final List<String> deps) {
        this.dependentTest = dependentTest;
        this.deps = deps;
    }

    @Nonnull
    public List<String> getDeps() {
        return deps;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("Dependent test: " + dependentTest + "\n");

        for (String dep : deps) {
            result.append(dep).append("\n");
        }

        return result.toString();
    }
}
