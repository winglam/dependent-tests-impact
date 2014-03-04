package edu.washington.cs.dt.impact.objects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import edu.washington.cs.dt.impact.util.TestMethodData;

public class TestListObject implements Comparable<TestListObject> {
    private List<TestMethodData> testList;
    private int count;

    public TestListObject() {
        testList = new LinkedList<TestMethodData>();
        count = 0;
    }

    public void addTest(TestMethodData tmd) {
        testList.add(tmd);
        count += tmd.getLineCount();
    }

    public int getCount() {
        return count;
    }

    public List<TestMethodData> getTestList() {
        return Collections.unmodifiableList(testList);
    }

    @Override
    public int compareTo(TestListObject o) {
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