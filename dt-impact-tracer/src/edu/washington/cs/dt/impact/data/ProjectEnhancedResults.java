package edu.washington.cs.dt.impact.data;

public class ProjectEnhancedResults extends Project {
    private String name;
    private double orig_time_value;
    private double orig_apfd_value;

    /*
     * fig**[i] corresponds to orig value
     * fig**[i+1] corresponds to new value
     * where i=0, i+=2
     * so when doing calculations, do data = fig**[i] - fig**[i+1]
     */
    // corresponds to T3, T4, T5, and T7 respectively
    private double[] fig17_values;
    // corresponds to S1, S2, S3, S4, S5, and S6 respectively
    private double[] fig18_values;
    /*
     * corresponds to S1, S2, S3, S4, S5 and S6
     * fig18_percents[i] corresponds to nonenhanced
     * fig18_percents[i + 1] corresponds to enhanced
     */
    private double[] fig18_percents;

    /*
     * fig19[i] is the original test suite data value
     * fig19[i+1] is the speedup for the dependence-aware algorithm
     * where i =0, i+=2
     */
    // corresponds to P1(Original Order)
    private double[] fig19_orig_order;
    // corresponds to P2(Time-Minimized)
    private double[] fig19_time_order;

    private boolean[] fig17_nonzero;
    private boolean[] fig18_nonzero;
    private boolean[] fig19_nonzero_time;
    private boolean[] fig19_nonzero_orig;

    private boolean uses_fig17;
    private boolean uses_fig18;
    private boolean uses_fig19;

    private Double[][] fig17_time_en;
    private Double[][] fig18_time_en;
    private Double[][] fig19_time_en;
    private Double[][] fig17_time_unen;
    private Double[][] fig18_time_unen;
    private Double[][] fig19_time_unen;
    private Double[] orig_time;
    private Double[] orig_coverage;
    private String[] orig_tests;
    private String[][] fig17_enhanced_tests;
    private String[][] fig17_unenhanced_tests;
    private String[][] fig18_enhanced_tests;
    private String[][] fig18_unenhanced_tests;
    private String[][] fig19_enhanced_tests;
    private String[][] fig19_unenhanced_tests;

    public Double[][] getFig18_time_en() {
        return fig18_time_en;
    }

    public Double[][] getFig17_time_unen() {
        return fig17_time_unen;
    }

    public Double[][] getFig18_time_unen() {
        return fig18_time_unen;
    }

    public String[][] getFig18_enhanced_tests() {
        return fig18_enhanced_tests;
    }

    public String[][] getFig18_unenhanced_tests() {
        return fig18_unenhanced_tests;
    }

    public String[][] getFig19_enhanced_tests() {
        return fig19_enhanced_tests;
    }

    public String[][] getFig19_unenhanced_tests() {
        return fig19_unenhanced_tests;
    }

    public Double[][] getFig19_time_unen() {
        return fig19_time_unen;
    }

    public Double[] getOrig_time() {
        return orig_time;
    }

    public void setOrig_time(Double[] orig_time) {
        this.orig_time = orig_time;
    }

    public Double[] getOrig_coverage() {
        return orig_coverage;
    }

    public void setOrig_coverage(Double[] orig_coverage) {
        this.orig_coverage = orig_coverage;
    }

    public String[] getOrig_tests() {
        return orig_tests;
    }

    public void setOrig_tests(String[] orig_tests) {
        this.orig_tests = orig_tests;
    }

    public ProjectEnhancedResults(String projName) {
        name = projName;
        orig_time_value = 0;
        orig_apfd_value = 0;
        fig17_values = new double[4 * 2];
        fig18_values = new double[6 * 2];
        fig18_percents = new double[6 * 2];
        fig19_orig_order = new double[2 * 4];
        fig19_time_order = new double[2 * 4];
        fig17_nonzero = new boolean[4 * 2];
        fig18_nonzero = new boolean[6 * 2];
        fig19_nonzero_orig = new boolean[4 * 2];
        fig19_nonzero_time = new boolean[4 * 2];
        uses_fig17 = false;
        uses_fig18 = false;
        uses_fig19 = false;
        fig17_time_en = new Double[4 * 2][];
        fig18_time_en = new Double[6 * 2][];
        fig19_time_en = new Double[2 * 4][];
        fig17_time_unen = new Double[4 * 2][];
        fig18_time_unen = new Double[6 * 2][];
        fig19_time_unen = new Double[2 * 4][];
        fig17_enhanced_tests = new String[4 * 2][];
        fig17_unenhanced_tests = new String[4 * 2][];
        fig18_enhanced_tests = new String[6 * 2][];
        fig18_unenhanced_tests = new String[6 * 2][];
        fig19_enhanced_tests = new String[4 * 2][];
        fig19_unenhanced_tests = new String[4 * 2][];
    }

    public boolean isFig17() {
        return uses_fig17;
    }

    public boolean isFig18() {
        return uses_fig18;
    }

    public boolean isFig19() {
        return uses_fig19;
    }

    public void useFig17() {
        uses_fig17 = true;
    }

    public void useFig18() {
        uses_fig18 = true;
    }

    public void useFig19() {
        uses_fig19 = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public double[] get_fig17_values() {
        return fig17_values;
    }

    public double[] get_fig18_values() {
        return fig18_values;
    }

    public double[] get_fig18_time() {
        return fig18_percents;
    }

    public double[] get_fig19_orig() {
        return fig19_orig_order;
    }

    public double[] get_fig19_time() {
        return fig19_time_order;
    }

    public void setOrigTimeValue(double val) {
        orig_time_value = val;
    }

    public double getOrigTimeValue() {
        return orig_time_value;
    }

    public void setOrigAPFDValue(double val) {
        orig_apfd_value = val;
    }

    public double getOrigAPFDValue() {
        return orig_apfd_value;
    }

    /*
     * @param figNum represents the figure number in the paper (17, 18, or 19)
     *
     * @param index indicates which column in the figure it corresponds to (i.e. Figure 17 column 0 represents T3)
     *
     * @param numTotal is the total number of DTS for that file
     */
    public void setNumTotalDependentTests(int figNum, int index, int numTotal) {
        if (figNum == 17) {
            fig17_nonzero[index] = numTotal != 0;
        } else if (figNum == 18) {
            fig18_nonzero[index] = numTotal != 0;
        } else {
            throw new RuntimeException();
        }
    }

    public void setNumTotalDependentTestsPara(boolean isOriginal, int index, int numTotal) {
        if (isOriginal) {
            fig19_nonzero_orig[index] = numTotal != 0;
        } else {
            fig19_nonzero_time[index] = numTotal != 0;
        }
    }

    public void setTimeInfo(int figNum, int index, Double[] timeList, boolean isEnhanced) {
        if (figNum == 17) {
            if (isEnhanced) {
                fig17_time_en[index] = timeList;
            } else {
                fig17_time_unen[index] = timeList;
            }
        } else if (figNum == 18) {
            if (isEnhanced) {
                fig18_time_en[index] = timeList;
            } else {
                fig18_time_unen[index] = timeList;
            }
        } else { // 19
            if (isEnhanced) {
                fig19_time_en[index] = timeList;
            } else {
                fig19_time_unen[index] = timeList;
            }
        }
    }

    public void setTestList(int figNum, int index, String[] testList, boolean isEnhanced) {
        if (figNum == 17) {
            if (isEnhanced) {
                fig17_enhanced_tests[index] = testList;
            } else {
                fig17_unenhanced_tests[index] = testList;
            }
        } else if (figNum == 18) {
            if (isEnhanced) {
                fig18_enhanced_tests[index] = testList;
            } else {
                fig18_unenhanced_tests[index] = testList;
            }
        } else { // 19
            if (isEnhanced) {
                fig19_enhanced_tests[index] = testList;
            } else {
                fig19_unenhanced_tests[index] = testList;
            }
        }
    }

    public boolean[] get_fig17_nonZeroNumOfDTS() {
        return fig17_nonzero;
    }

    public boolean[] get_fig18_nonZeroNumOfDTS() {
        return fig18_nonzero;
    }

    public boolean[] get_fig19_nonZeroNumOfDTSOrig() {
        return fig19_nonzero_orig;
    }

    public boolean[] get_fig19_nonZeroNumOfDTSTime() {
        return fig19_nonzero_time;
    }
}
