package edu.washington.cs.dt.impact.data;

public class ProjectEnhancedResults extends Project {
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

    private boolean[] fig17_num_DTs;
    private boolean[] fig18_num_DTs;
    private boolean[] fig19_num_DTs_time;
    private boolean[] fig19_num_DTs_orig;
    private Double[][] fig17_time;
    private Double[][] fig18_time;
    private Double[][] fig19_time_time;
    private Double[][] fig19_time_orig;

    private String[][] fig17_test_list;
    private String[][] fig18_test_list;
    private String[][] fig19_test_list_time;
    private String[][] fig19_test_list_orig;

    private boolean uses_fig17;
    private boolean uses_fig18;
    private boolean uses_fig19;

    private Double[] orig_time;
    private Double[] orig_coverage;
    private String[] orig_tests;

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
        super(projName);
        orig_time_value = 0;
        orig_apfd_value = 0;
        fig17_values = new double[4 * 2];
        fig18_values = new double[6 * 2];
        fig18_percents = new double[6 * 2];
        fig19_orig_order = new double[2 * 4];
        fig19_time_order = new double[2 * 4];
        fig17_num_DTs = new boolean[4 * 2];
        fig18_num_DTs = new boolean[6 * 2];
        fig19_num_DTs_orig = new boolean[4 * 2];
        fig19_num_DTs_time = new boolean[4 * 2];
        uses_fig17 = false;
        uses_fig18 = false;
        uses_fig19 = false;
        fig17_time = new Double[4 * 2][];
        fig18_time = new Double[6 * 2][];
        fig19_time_time = new Double[2 * 4][];
        fig19_time_orig = new Double[2 * 4][];
        fig17_test_list = new String[4 * 2][];
        fig18_test_list = new String[6 * 2][];
        fig19_test_list_time = new String[4 * 2][];
        fig19_test_list_orig = new String[4 * 2][];
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

    public double[] get_fig_values(int figNum) {
        if (figNum == 17) {
            return fig17_values;
        } else {
            return fig18_values;
        }
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
            fig17_num_DTs[index] = numTotal != 0;
        } else if (figNum == 18) {
            fig18_num_DTs[index] = numTotal != 0;
        } else {
            throw new RuntimeException();
        }
    }

    public void setNumTotalDependentTestsPara(boolean isOriginal, int index, int numTotal) {
        if (isOriginal) {
            fig19_num_DTs_orig[index] = numTotal != 0;
        } else {
            fig19_num_DTs_time[index] = numTotal != 0;
        }
    }

    public void setTimeInfo(int figNum, int index, Double[] timeList) {
        if (figNum == 17) {
            fig17_time[index] = timeList;
        } else if (figNum == 18) {
            fig18_time[index] = timeList;
        }
    }

    public void setTimeInfoPara(boolean isOriginal, int index, Double[] timeList) {
        if (isOriginal) {
            fig19_time_orig[index] = timeList;
        } else {
            fig19_time_time[index] = timeList;
        }
    }

    public void setTestList(int figNum, int index, String[] testList) {
        if (figNum == 17) {
            fig17_test_list[index] = testList;
        } else if (figNum == 18) {
            fig18_test_list[index] = testList;
        }
    }

    public void setTestListPara(boolean isOriginal, int index, String[] testList) {
        if (isOriginal) {
            fig19_test_list_orig[index] = testList;
        } else {
            fig19_test_list_time[index] = testList;
        }
    }

    public boolean get_fig_NumOfDTs(boolean unen, int i, int figNum) {
        if (figNum == 17) {
            if (unen) {
                return fig17_num_DTs[i];
            } else {
                return fig17_num_DTs[i+1];
            }
        } else {
            if (unen) {
                return fig18_num_DTs[i];
            } else {
                return fig18_num_DTs[i+1];
            }
        }
    }

    public Double[] get_fig_Time(boolean unen, int i, int figNum) {
        return get_fig_Time(unen, i,figNum, false);
    }

    public Double[] get_fig_Time(boolean unen, int i, int figNum, boolean isOriginal) {
        if (figNum == 17) {
            if (unen) {
                return fig17_time[i];
            } else {
                return fig17_time[i+1];
            }
        } else if (figNum == 18){
            if (unen) {
                return fig18_time[i];
            } else {
                return fig18_time[i+1];
            }
        } else {
            int index = -1;
            if (unen) {
                index = i;
            } else {
                index = i+1;
            }
            if (isOriginal) {
                return fig19_time_orig[index];
            } else {
                return fig19_time_time[index];
            }
        }
    }

    public String[] get_fig_TestList(boolean unen, int i, int figNum) {
        return get_fig_TestList(unen, i, figNum, false);
    }

    public String[] get_fig_TestList(boolean unen, int i, int figNum, boolean isOriginal) {
        if (figNum == 17) {
            if (unen) {
                return fig17_test_list[i];
            } else {
                return fig17_test_list[i + 1];
            }
        } else if (figNum == 18) {
            if (unen) {
                return fig18_test_list[i];
            } else {
                return fig18_test_list[i + 1];
            }
        } else {
            int index = -1;
            if (unen) {
                index = i;
            } else {
                index = i + 1;
            }
            if (isOriginal) {
                return fig19_test_list_orig[index];
            } else {
                return fig19_test_list_time[index];
            }
        }
    }



    public boolean get_fig19_NumOfDTs_orig_unen(int i) {
        return fig19_num_DTs_orig[i];
    }

    public boolean get_fig19_NumOfDTs_orig_en(int i) {
        return fig19_num_DTs_orig[i+1];
    }

    public boolean get_fig19_NumOfDTs_time_unen(int i) {
        return fig19_num_DTs_time[i];
    }

    public boolean get_fig19_NumOfDTs_time_en(int i) {
        return fig19_num_DTs_time[i+1];
    }
}
