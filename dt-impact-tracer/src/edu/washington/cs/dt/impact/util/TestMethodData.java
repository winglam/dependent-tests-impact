package edu.washington.cs.dt.impact.util;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestMethodData implements Comparable<TestMethodData> {

    private String methodName;
    private Set<String> allLines;
    private Set<String> currentLines;

    // list of tests that when executed before reveals methodName as a dependent test
    protected Set<TestMethodData> execBefore;
    // list of tests that when executed after reveals methodName as a dependent test
    protected Set<TestMethodData> execAfter;

    public TestMethodData(String name) {
        this.methodName = name;
        currentLines = new LinkedHashSet<String>();
        allLines = new LinkedHashSet<String>();
        execBefore = new HashSet<TestMethodData>();
        execAfter = new HashSet<TestMethodData>();
    }

    /**
     * @param isBefore true if the tmd reveals this test as a dependent test if tmd is executed before this test
     *        false if tmd reveals this test as a dependent test if tmd is executed after this test.
     */
    public void addDependentTest(TestMethodData tmd, boolean isBefore) {
        if (tmd != null) {
            allLines.addAll(tmd.getLines());
            if (isBefore) {
                execBefore.add(tmd);
            } else {
                execAfter.add(tmd);
            }
        }
    }

    public Set<TestMethodData> getDependentTests(boolean isBefore) {
        if (isBefore) {
            return execBefore;
        } else {
            return execAfter;
        }
    }

    public long getLineCount() {
        return currentLines.size();
    }

    public String getName() {
        return methodName;
    }

    public void addLine(String line) {
        allLines.add(line);
    }

    public void reset() {
        currentLines = new LinkedHashSet<String>(allLines);
    }

    public void removeLines(Set<String> lines) {
        currentLines.removeAll(lines);
    }

    public void retainLines(Set<String> lines) {
        currentLines.retainAll(lines);
    }

    public Set<String> getLines() {
        return Collections.unmodifiableSet(currentLines);
    }

    @Override
    public String toString() {
        return getName() + " : " + getLineCount();
    }

    @Override
    public int compareTo(TestMethodData o) {
        long mLineCount = getLineCount();
        long oLineCount = o.getLineCount();

        if (mLineCount < oLineCount) {
            return 1;
        } else if (mLineCount > oLineCount) {
            return -1;
        } else {
            return 0;
        }
    }
}
