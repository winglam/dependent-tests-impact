package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.impact.runner.Runner;
import edu.washington.cs.dt.impact.util.Constants;

import java.util.ArrayList;
import java.util.List;
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
            outputArr.add("\nTest order list:\n");
            outputArr.add(getTestList() + "\n");
        }

        if (getTimeEachTest() != null) {
            outputArr.add("\n" + Constants.TIME_STRING + "\n");
            outputArr.add(getTimeEachTest() + "\n");
        }

        if (getNumNotFixedDT() != 0) {
            outputArr.add("\n" + Constants.NOT_FIXED_DTS + "\n");
            outputArr.add(getNotFixedDT() + "\n");
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
}
