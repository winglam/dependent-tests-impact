/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Data class representing a test case.
 */

package edu.washington.cs.dt.impact.data;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestFunctionStatement implements Comparable<TestFunctionStatement> {

    private String methodName;
    // all lines that this test method contains
    private Set<String> allLines;
    // current lines of this test method that have yet to be covered
    private Set<String> currentLines;

    // list of tests that when executed before reveals methodName as a dependent test
    protected Set<TestFunctionStatement> execBefore;
    // list of tests that when executed after reveals methodName as a dependent test
    protected Set<TestFunctionStatement> execAfter;

    public TestFunctionStatement(String name) {
        this.methodName = name;
        currentLines = new LinkedHashSet<String>();
        allLines = new LinkedHashSet<String>();
        execBefore = new HashSet<TestFunctionStatement>();
        execAfter = new HashSet<TestFunctionStatement>();
    }

    /**
     * @param isBefore
     *          true if tmd reveals this test as a dependent test when executed before this test
     *          false if tmd reveals this test as a dependent test when executed after this test.
     */
    public void addDependentTest(TestFunctionStatement tmd, boolean isBefore) {
        if (tmd != null) {
            allLines.addAll(tmd.getLines());
            if (isBefore) {
                execBefore.add(tmd);
            } else {
                execAfter.add(tmd);
            }
        }
    }

    public Set<TestFunctionStatement> getDependentTests(boolean isBefore) {
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
    public int compareTo(TestFunctionStatement o) {
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
