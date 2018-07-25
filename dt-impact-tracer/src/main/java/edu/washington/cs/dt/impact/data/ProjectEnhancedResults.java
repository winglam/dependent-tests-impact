package edu.washington.cs.dt.impact.data;

import com.google.common.base.Preconditions;
import com.reedoei.eunomia.collections.ListUtil;
import edu.washington.cs.dt.impact.util.Constants;

import java.util.HashMap;
import java.util.Map;

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

    private Double[][] fig17Coverages;
    private Double[][] fig18Coverages;
    private Double[][] fig19OrigCoverages;
    private Double[][] fig19TimeCoverages;

    private String[] fig17FirstDt;
    private String[] fig18FirstDt;
    private String[] fig19OrigFirstDt;
    private String[] fig19TimeFirstDt;

    private TestToInfoWrapper[] all_test_info;
    private TestToInfoWrapper[] dt_info;
    private TestToInfoWrapper[] orig_test_info;

    // For test parallelization only
    private TestToInfoWrapper[] all_test_info_time;
    private TestToInfoWrapper[] dt_info_time;
    private TestToInfoWrapper[] orig_test_info_time;

    private Constants.COVERAGE coverageType = Constants.COVERAGE.STATEMENT;
    private String testType;

    public Constants.COVERAGE getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(Constants.COVERAGE coverageType) {
        this.coverageType = coverageType;
    }

    public String get_first_dt(boolean unen, int i, int figNum) {
        return get_first_dt(unen, i, figNum, false);
    }

    public String get_first_dt(boolean unen, int i, int figNum, boolean isOriginal) {
        int index = unen ? i : i + 1;

        if (figNum == 17) {
            return fig17FirstDt[index];
        } else if (figNum == 18) {
            return fig18FirstDt[index];
        } else {
            if (isOriginal) {
                return fig19OrigFirstDt[index];
            } else {
                return fig19TimeFirstDt[index];
            }
        }
    }

    public void setCoverage(int figNum, Double[] coverages, int index) {
        setCoverage(figNum, coverages, index, false);
    }

    public void setCoverage(int figNum, Double[] coverages, int index, boolean isOriginal) {
        if (figNum == 17) {
            fig17Coverages[index] = coverages;
        } else if (figNum == 18) {
            fig18Coverages[index] = coverages;
        } else {
            if (isOriginal) {
                fig19OrigCoverages[index] = coverages;
            } else {
                fig19TimeCoverages[index] = coverages;
            }
        }
    }

    public Double[] getCoverages(boolean unen, int i, int figNum) {
        return getCoverages(unen, i, figNum, false);
    }

    public Double[] getCoverages(boolean unen, int i, int figNum, boolean isOriginal) {
        int index = unen ? i : i + 1;

        if (figNum == 17) {
            return fig17Coverages[index];
        } else if (figNum == 18) {
            return fig18Coverages[index];
        } else {
            if (isOriginal) {
                return fig19OrigCoverages[index];
            } else {
                return fig19TimeCoverages[index];
            }
        }
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestType() {
        return testType;
    }

    public class TestToInfoWrapper {
        public Map<String, TestInfo> testToInfo;
        public TestToInfoWrapper() {
            testToInfo = new HashMap<>();
        }
        public TestToInfoWrapper(Map<String, TestInfo> testToInfo) {
            this.testToInfo = testToInfo;
        }
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

        fig17FirstDt = new String[4 * 2];
        fig18FirstDt = new String[6 * 2];
        fig19TimeFirstDt = new String[2 * 4];
        fig19OrigFirstDt= new String[2 * 4];

        fig17Coverages = new Double[4 * 2][];
        fig18Coverages = new Double[6 * 2][];
        fig19TimeCoverages = new Double[2 * 4][];
        fig19OrigCoverages= new Double[2 * 4][];
    }

    public boolean setup() {
        for (int i = 0; i < dt_info.length; i++) {
            TestToInfoWrapper testToInfoWrapper = dt_info[i];
            Preconditions.checkNotNull(testToInfoWrapper, "Missing dt_info data for: " + i);
        }

        if (!verifyOriginalOrders()) {
            return false;
        }

        if (isFig17()) {
            getFirstDTs(17);
        } else if (isFig18()) {
            getFirstDTs(18);
        } else if (isFig19()) {
            for (int i = 0; i < dt_info_time.length; i++) {
                TestToInfoWrapper testToInfoWrapper = dt_info_time[i];
                Preconditions.checkNotNull(testToInfoWrapper, "Missing dt_info_time data for: " + i);
            }

            getFirstDTs(19);
        }

        return true;
    }

    private void getFirstDTs(final int figNum) {
        for (final boolean isOriginal : ListUtil.fromArray(false, true)) {
            for (final boolean unen : ListUtil.fromArray(false, true)) {
                for (int i = 0; i < all_test_info.length; i += 2) {
                    int finalI = unen ? i : i + 1;
                    final String dt = getFirstDT(unen, i, figNum, isOriginal);

                    if (figNum == 17) {
                        fig17FirstDt[finalI] = dt;
                    } else if (figNum == 18) {
                        fig18FirstDt[finalI] = dt;
                    } else {
                        if (isOriginal) {
                            fig19OrigFirstDt[finalI] = dt;
                        } else {
                            fig19TimeFirstDt[finalI] = dt;
                        }
                    }
                }
            }
        }
    }

    private String getFirstDT(boolean unen, int i, int figNum, boolean isOriginal) {
        final Map<String, TestInfo> dt_info = get_dt_info(unen, i, figNum, isOriginal);

        for (final String testName : get_fig_TestList(unen, i, figNum, isOriginal)) {
            if (dt_info.containsKey(testName)) {
                return testName;
            }
        }

        return null;
    }

    private boolean verifyOriginalOrders() {
        for (int i = 0; i < all_test_info.length; i += 2) {
            final Map<String, TestInfo> unenhanced = get_orig_info(true, i, 17, true);
            final Map<String, TestInfo> enhanced = get_orig_info(false, i, 17, true);

            for (final String testName : unenhanced.keySet()) {
                if (enhanced.containsKey(testName)) {
                    if (!unenhanced.get(testName).getResult().equals(enhanced.get(testName).getResult())) {
                        System.out.println("[ERROR] When verifying original order results, found:");
                        System.out.printf("17: %b, 18: %b, 19: %b\n", isFig17(), isFig18(), isFig19());
                        System.out.println("Test: " + testName + " was " + unenhanced.get(testName).getResult()
                                + " when run in original order for unenhanced, and "
                                + enhanced.get(testName).getResult() + " when run in original order for enhanced.");
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private void initInfo(int size) {
        if (all_test_info == null)
            all_test_info = new TestToInfoWrapper[size];
        if (orig_test_info == null)
            orig_test_info = new TestToInfoWrapper[size];
        if (dt_info == null)
            dt_info = new TestToInfoWrapper[size];
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
        initInfo(4 * 2);
    }

    public void useFig18() {
        uses_fig18 = true;
        initInfo(6 * 2);
    }

    public void useFig19() {
        uses_fig19 = true;
        int size = 2 * 4;
        initInfo(size);
        if (all_test_info_time == null)
            all_test_info_time = new TestToInfoWrapper[size];
        if (orig_test_info_time == null)
            orig_test_info_time = new TestToInfoWrapper[size];
        if (dt_info_time == null)
            dt_info_time = new TestToInfoWrapper[size];
    }

    public Map<String, TestInfo> get_all_test_info(boolean unen, int i, int figNum, boolean isOriginal) {
        TestToInfoWrapper retVal;
        if (figNum == 17) {
            if (unen) {
                retVal = all_test_info[i];
            } else {
                retVal = all_test_info[i+1];
            }
        } else if (figNum == 18){
            if (unen) {
                retVal = all_test_info[i];
            } else {
                retVal = all_test_info[i+1];
            }
        } else {
            int index = -1;
            if (unen) {
                index = i;
            } else {
                index = i+1;
            }
            if (isOriginal) {
                retVal = all_test_info[index];
            } else {
                retVal = all_test_info_time[index];
            }
        }
        return retVal.testToInfo;
    }

    public Map<String, TestInfo> get_orig_info(boolean unen, int i, int figNum, boolean isOriginal) {
        TestToInfoWrapper retVal;
        if (figNum == 17) {
            if (unen) {
                retVal = orig_test_info[i];
            } else {
                retVal = orig_test_info[i+1];
            }
        } else if (figNum == 18){
            if (unen) {
                retVal = orig_test_info[i];
            } else {
                retVal = orig_test_info[i+1];
            }
        } else {
            int index = -1;
            if (unen) {
                index = i;
            } else {
                index = i+1;
            }
            if (isOriginal) {
                retVal = orig_test_info[index];
            } else {
                retVal = orig_test_info_time[index];
            }
        }
        return retVal.testToInfo;
    }

    public Map<String, TestInfo> get_dt_info(boolean unen, int i, int figNum, boolean isOriginal) {
        TestToInfoWrapper retVal;
        if (figNum == 17) {
            if (unen) {
                retVal = dt_info[i];
            } else {
                retVal = dt_info[i+1];
            }
        } else if (figNum == 18){
            if (unen) {
                retVal = dt_info[i];
            } else {
                retVal = dt_info[i+1];
            }
        } else {
            int index = -1;
            if (unen) {
                index = i;
            } else {
                index = i+1;
            }
            if (isOriginal) {
                retVal = dt_info[index];
            } else {
                retVal = dt_info_time[index];
            }
        }
        return retVal.testToInfo;
    }

    public void addAllTestsInfo(Map<String, TestInfo> testsInfo, int index) {
        addAllTestsInfo(testsInfo, index, true);
    }

    public void addAllTestsInfo(Map<String, TestInfo> testsInfo, int index, boolean isOriginal) {
        if (isOriginal) {
            all_test_info[index] = new TestToInfoWrapper(testsInfo);
        } else {
            all_test_info_time[index] = new TestToInfoWrapper(testsInfo);
        }
    }

    public void addIsolationInfo(Map<String, TestInfo> testsInfo, int index) {
        addIsolationInfo(testsInfo, index, true);
    }

    public void addIsolationInfo(Map<String, TestInfo> testsInfo, int index, boolean isOriginal) {
        if (isOriginal) {
            dt_info[index] = new TestToInfoWrapper(testsInfo);
        } else {
            dt_info_time[index] = new TestToInfoWrapper(testsInfo);
        }
    }

    public void addOrigInfo(Map<String, TestInfo> testsInfo, int index) {
        addOrigInfo(testsInfo, index, true);
    }

    public void addOrigInfo(Map<String, TestInfo> testsInfo, int index, boolean isOriginal) {
        if (isOriginal) {
            orig_test_info[index] = new TestToInfoWrapper(testsInfo);
        } else {
            orig_test_info_time[index] = new TestToInfoWrapper(testsInfo);
        }
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

    public int getLength(int figNum) {
        if (figNum == 17) {
            return fig17_num_DTs.length;
        } else if (figNum == 18) {
            return fig18_num_DTs.length;
        } else {
            return fig19_num_DTs_time.length;
        }
    }

    public boolean containsDT(boolean unen, int i, int figNum) {
        return containsDT(unen, i, figNum, false);
    }

    public boolean containsDT(boolean unen, int i, int figNum, boolean isOriginal) {
        int index = unen ? i : i + 1;

        if (figNum == 17) {
            return fig17_num_DTs[index];
        } else if (figNum == 18) {
            return fig18_num_DTs[index];
        } else {
            if (isOriginal) {
                return fig19_num_DTs_orig[index];
            } else {
                return fig19_num_DTs_time[index];
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
}
