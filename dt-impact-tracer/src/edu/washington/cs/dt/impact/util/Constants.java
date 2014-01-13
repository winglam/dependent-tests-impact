package edu.washington.cs.dt.impact.util;

public class Constants {
    public enum COVERAGE {
        STATEMENT, FUNCTION, BRANCH
    }

    public final static TECHNIQUE DEFAULT_TECHNIQUE = TECHNIQUE.PRIORITIZATION_ABSOLUTE;
    public final static String DEFAULT_TEST_DIR = "sootTestOutput";

    public enum TECHNIQUE {
        PRIORITIZATION_ABSOLUTE, PRIORITIZATION_RELATIVE, SELECTION, RANDOM
    };
}
