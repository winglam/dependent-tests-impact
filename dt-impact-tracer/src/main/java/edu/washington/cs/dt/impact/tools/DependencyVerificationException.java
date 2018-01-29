package edu.washington.cs.dt.impact.tools;

public class DependencyVerificationException extends Exception {
    public DependencyVerificationException(final String dependentTestName) {
        super("Failed to find all dependencies for: " + dependentTestName);
    }
}
