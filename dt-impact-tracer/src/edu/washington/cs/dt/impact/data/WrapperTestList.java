package edu.washington.cs.dt.impact.data;

import java.util.List;

public class WrapperTestList {
    private int numNotFixedDT;
    private int numFixedDT;
    private long totalTime;
    private List<String> coverage;
    private double APFD;
    private String timeEachTest;
    private List<String> testList;

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
        return numNotFixedDT;
    }

    public void setNumNotFixedDT(int numNotFixedDT) {
        this.numNotFixedDT = numNotFixedDT;
    }

    public int getNumFixedDT() {
        return numFixedDT;
    }

    public void setNumFixedDT(int numFixedDT) {
        this.numFixedDT = numFixedDT;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
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
}
