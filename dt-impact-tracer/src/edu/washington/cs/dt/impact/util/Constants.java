package edu.washington.cs.dt.impact.util;

public class Constants {
    public enum COVERAGE {
        STATEMENT, FUNCTION, BRANCH
    }

    public final static TECHNIQUE DEFAULT_TECHNIQUE = TECHNIQUE.PRIORITIZATION;
    public final static String DEFAULT_TEST_DIR = "sootTestOutput";

    public enum TECHNIQUE {
        PRIORITIZATION, SELECTION, PARALLELIZATION
    };

    public enum ORDER {
        RANDOM, ABSOLUTE, RELATIVE, ORIGINAL, TIME
    }
}
