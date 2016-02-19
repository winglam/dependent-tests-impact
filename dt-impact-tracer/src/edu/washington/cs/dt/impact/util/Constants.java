/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 *         Constants used throughout this project.
 */

package edu.washington.cs.dt.impact.util;

public class Constants {
    public final static TECHNIQUE DEFAULT_TECHNIQUE = TECHNIQUE.PRIORITIZATION;
    public final static String DEFAULT_TEST_DIR = "sootTestOutput";
    public static final String TEST_LINE = "Test: ";

    public static String getOutputFileName(COVERAGE coverage, TECHNIQUE technique, ORDER order, PROJECT project,
            TEST_TYPE test_type, MACHINES machines, DT_SETTING dt_setting, TD_SETTING td_setting) {
        String ret_str;
        if (technique == TECHNIQUE.PARALLELIZATION) {
            ret_str = technique + "-" + test_type + "-" + project + "-" + order + "-" + dt_setting + "-" + td_setting
                    + "-" + machines;
        } else {
            ret_str = technique + "-" + test_type + "-" + project + "-" + coverage + "-" + order + "-" + dt_setting
                    + "-" + td_setting;
        }
        return ret_str.concat(".txt");
    }

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

    /**
     * Test types that are currently supported.
     */
    public enum TEST_TYPE {
        ORIG, AUTO
    }

    /**
     * Test projects that are currently supported.
     */
    public enum PROJECT {
        CRYSTAL, JFREECHART, JODATIME, SYNOPTIC, XML_SECURITY
    }

    /**
     * Number of machines that are currently supported.
     */
    public enum MACHINES {
        ONE(1), TWO(2), FOUR(4), EIGHT(8), SIXTEEN(16);
        private final int value;

        private MACHINES(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * Whether we nullified DTs or not.
     */
    public enum DT_SETTING {
        FIXED_DT, CONTAINS_DT
    }

    /**
     * Whether test dependence was provided.
     */
    public enum TD_SETTING {
        GIVEN_TD, OMITTED_TD
    }

}
