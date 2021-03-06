package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.impact.runner.Runner;
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WrapperTestList {
    private Set<String> notFixedDT;
    private int numFixedDT;
    private double nullifyDTTime;
    private List<String> coverage;
    private double APFD;
    private String timeEachTest;
    private List<String> testList;
    private double newOrderTime;
    private String dtList;
    private int testListSize;

    private double avgDepFindTime = -1; // -1 if we didn't look for dependent tests at all. Time is in seconds.
    private Map<String, RESULT> origOrderResults;
    private Map<String, Long> origOrderTimes = new HashMap<>();
    private Map<String, RESULT> testOrderResults;

    private final Map<String, RESULT> isolationResults = new HashMap<>();
    private final Map<String, Long> isolationTimes = new HashMap<>();

    public int getTestListSize() {
        return testListSize;
    }

    public void setTestListSize(int size) {
        this.testListSize = size;
    }

    public String getDtList() {
        return dtList;
    }

    public void setDtList(String dtList) {
        this.dtList = dtList;
    }

    public double getNewOrderTime() {
        return newOrderTime;
    }

    public void setNewOrderTime(double newOrderTime) {
        this.newOrderTime = newOrderTime;
    }

    public List<String> getTestList() {
        return testList;
    }

    public void setTestList(List<String> testList) {
        this.testList = testList;
    }

    public String getTimeEachTest() {
        return timeEachTest;
    }

    public void setTimeEachTest(String timeEachTest) {
        this.timeEachTest = timeEachTest;
    }

    public int getNumNotFixedDT() {
        return notFixedDT.size();
    }

    public Set<String> getNotFixedDT() {
        return notFixedDT;
    }

    public void setNumNotFixedDT(Set<String> notFixedDT) {
        this.notFixedDT = notFixedDT;
    }

    public int getNumFixedDT() {
        return numFixedDT;
    }

    public void setNumFixedDT(int numFixedDT) {
        this.numFixedDT = numFixedDT;
    }

    public double getNullifyDTTime() {
        return nullifyDTTime;
    }

    public void setNullifyDTTime(double nullifyDTTime) {
        this.nullifyDTTime = nullifyDTTime;
    }

    public List<String> getCoverage() {
        return coverage;
    }

    public void setCoverage(List<String> coverage) {
        this.coverage = coverage;
    }

    public double getAPFD() {
        return APFD;
    }

    public void setAPFD(double aPFD) {
        APFD = aPFD;
    }

    public void setAvgDepFindTime(double avgDepFindTime) {
        this.avgDepFindTime = avgDepFindTime;
    }

    public double getAvgDepFindTime() {
        return avgDepFindTime;
    }

    public List<String> output(final boolean getCoverage, final List<String> origOrderTestList) {
        final List<String> outputArr = new ArrayList<>();

        outputArr.add(Constants.TIME_INCL_DTF + " " + Runner.nanosecondToSecond(getNullifyDTTime()) + "\n");
        outputArr.add(Constants.NUM_TESTS_OUT_OF_ORIG + " " + getTestListSize()
                + " / " + origOrderTestList.size() + "\n");
        outputArr.add(Constants.NUM_NOT_FIXED_DTS + " " + getNumNotFixedDT() + "\n");
        outputArr.add(Constants.FIXED_DTS + " " + getNumFixedDT() + "\n");

        // If negative, we didn't run the dt finder, so shouldn't report this number.
        if (getAvgDepFindTime() >= 0) {
            outputArr.add("\n" + Constants.AVG_DEP_FIND_TIME_STRING + " " + getAvgDepFindTime() + "\n");
        }

        if (getCoverage) {
            outputArr.add(Constants.APFD_VALUE + " " + getAPFD() + "\n");
        }

        outputArr.add(Constants.ORDER_TIME + " " + Runner.nanosecondToSecond(getNewOrderTime()) + "\n");

        if (getTestList() != null) {
            outputArr.add("\n" + Constants.TEST_ORDER_LIST + "\n");
            outputArr.add(getTestList() + "\n");
        }

        if (getOrigOrderResults() != null) {
            outputArr.add("\n" + Constants.ORIG_TEST_RESULTS + "\n");
            outputArr.add(getOrigOrderResults() + "\n");

            outputArr.add("\n" + Constants.ORIG_TEST_TIMES + "\n");
            outputArr.add(getOrigOrderTimes() + "\n");
        }

        if (getTestOrderResults() != null) {
            outputArr.add("\n" + Constants.ALL_TEST_RESULTS +"\n");
            outputArr.add(getTestOrderResults() + "\n");
        }

        if (getTimeEachTest() != null) {
            outputArr.add("\n" + Constants.TIME_STRING + "\n");
            outputArr.add(getTimeEachTest() + "\n");
        }

        if (getNumNotFixedDT() != 0) {
            outputArr.add("\n" + Constants.NOT_FIXED_DTS + "\n");
            outputArr.add(getNotFixedDT() + "\n");

            outputArr.add("\n" + Constants.ISOLATION_RESULTS + "\n");
            outputArr.add(getIsolationResults() + "\n");

            outputArr.add("\n" + Constants.ISOLATION_TIMES + "\n");
            outputArr.add(getIsolationTimes() + "\n");
        }

        if (getDtList() != null) {
            outputArr.add("\n" + Constants.DT_LIST + "\n");
            outputArr.add(getDtList() + "\n");
        }

        if (getCoverage) {
            outputArr.add("\n" + Constants.COVERAGE_STRING + "\n");
            outputArr.add(getCoverage() + "\n");
        }

        outputArr.add("--------------------------\n");

        return outputArr;
    }

    private Map<String, Long> getOrigOrderTimes() {
        return origOrderTimes;
    }

    public void setOrigOrderResults(final TestExecResult nameToOrigResults) {
        origOrderResults = nameToOrigResults.getNameToResultsMap();

        nameToOrigResults.getAllTests().forEach(testName ->
                origOrderTimes.put(testName, nameToOrigResults.getResult(testName).getExecTime()));
    }

    public Map<String, RESULT> getOrigOrderResults() {
        return origOrderResults;
    }

    public void setTestOrderResults(final Map<String,RESULT> nameToTestResults) {
        testOrderResults = nameToTestResults;
    }

    public Map<String, RESULT> getTestOrderResults() {
        return testOrderResults;
    }

    public void isolationResult(final String changedTest, final String classPath) {
        final TestExecResult result =
                new FixedOrderRunner(classPath, Collections.singletonList(changedTest))
                .run().getExecutionRecords().get(0);

        final RESULT testResult = result.getResult(changedTest).result;
        isolationResults.put(changedTest, testResult);

        final long time = result.getResult(changedTest).getExecTime();
        isolationTimes.put(changedTest, time);
    }

    public Map<String, Long> getIsolationTimes() {
        return isolationTimes;
    }

    public Map<String, RESULT> getIsolationResults() {
        return isolationResults;
    }
}
