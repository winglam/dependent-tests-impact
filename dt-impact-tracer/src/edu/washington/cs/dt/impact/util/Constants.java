/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 */

package edu.washington.cs.dt.impact.util;

public class Constants {

    public final static TECHNIQUE DEFAULT_TECHNIQUE = TECHNIQUE.PRIORITIZATION;
    public final static String DEFAULT_TEST_DIR = "sootTestOutput";

    /**
     * Coverage information that is currently supported.
     */
    public enum COVERAGE {
        STATEMENT, FUNCTION
    }

    /**
     * Testing techniques that are currently supported.
     */
    public enum TECHNIQUE {
        PRIORITIZATION, SELECTION, PARALLELIZATION
    }

    /**
     * Test orders that are currently supported.
     */
    public enum ORDER {
        RANDOM, ABSOLUTE, RELATIVE, ORIGINAL, TIME
    }
}
