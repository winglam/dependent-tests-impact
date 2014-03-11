package edu.washington.cs.dt.impact.data;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestList implements Comparable<TestList> {
    private List<TestFunctionStatement> testList;
    private int count;

    public TestList() {
        testList = new LinkedList<TestFunctionStatement>();
        count = 0;
    }

    public void addTest(TestFunctionStatement tmd) {
        testList.add(tmd);
        count += tmd.getLineCount();
    }

    public int getCount() {
        return count;
    }

    public List<TestFunctionStatement> getTestList() {
        return Collections.unmodifiableList(testList);
    }

    @Override
    public int compareTo(TestList o) {
        if (count < o.getCount()) {
            return -1;
        } else if (count > o.getCount()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return count + "";
    }
}