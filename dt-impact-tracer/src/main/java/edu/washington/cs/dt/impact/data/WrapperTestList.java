package edu.washington.cs.dt.impact.data;

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
}
