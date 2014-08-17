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
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class TestFunctionStatement extends Observable implements Comparable<TestFunctionStatement>, Observer {

    private String methodName;
    // all lines that this test method contains
    private Set<String> allLines;
    // current lines of this test method that have yet to be covered
    private Set<String> currentLines;

    // lines belonging to this test's and its dependencies'
    private Set<Set<String>> setOfCurrentLines;
    // tests that this test depends on
    private Set<TestFunctionStatement> observers;

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
        observers = new HashSet<TestFunctionStatement>();
        setOfCurrentLines = new HashSet<Set<String>>();
        setOfCurrentLines.add(currentLines);
    }

    /**
     * @param isBefore
     *          true if tmd reveals this test as a dependent test when executed before this test
     *          false if tmd reveals this test as a dependent test when executed after this test.
     */
    public void addDependentTest(TestFunctionStatement tmd, boolean isBefore) {
        if (tmd != null) {
            tmd.customAddObserver(this);
            setOfCurrentLines.addAll(tmd.getTests());
            setChanged();
            notifyObservers(new HashSet<Object>());
            if (isBefore) {
                execBefore.add(tmd);
            } else {
                execAfter.add(tmd);
            }
        }
    }

    public void customAddObserver(TestFunctionStatement tmd) {
        observers.add(tmd);
        this.addObserver(tmd);
    }

    public Set<TestFunctionStatement> getObservers() {
        return observers;
    }

    public Set<TestFunctionStatement> getDependentTests(boolean isBefore) {
        if (isBefore) {
            return execBefore;
        } else {
            return execAfter;
        }
    }

    public long getLineCount() {
        Set<String> lines = new HashSet<String>();
        for (Set<String> s : setOfCurrentLines) {
            lines.addAll(s);
        }
        return lines.size();
    }

    public String getName() {
        return methodName;
    }

    public void addLine(String line) {
        allLines.add(line);
    }

    public void reset() {
        currentLines.clear();
        currentLines.addAll(allLines);
    }

    public void removeLines(Set<String> lines) {
        currentLines.removeAll(lines);
    }

    public void retainLines(Set<String> lines) {
        currentLines.retainAll(lines);
    }

    public Set<String> getLines() {
        Set<String> lines = new HashSet<String>();
        for (Set<String> s : setOfCurrentLines) {
            lines.addAll(s);
        }
        return Collections.unmodifiableSet(lines);
    }

    public Set<Set<String>> getTests() {
        return setOfCurrentLines;
    }

    public void setName(String name) {
        this.methodName = name;
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

    @SuppressWarnings("unchecked")
    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof HashSet<?>)){
            throw new RuntimeException("Observer received incompatible arg.");
        }

        if (!(o instanceof TestFunctionStatement)) {
            throw new RuntimeException("Observer received incompatible o.");
        }

        Set<Object> newArgs = (HashSet<Object>) arg;
        TestFunctionStatement tmd = (TestFunctionStatement) o;
        if (!newArgs.contains(o)) {
            setOfCurrentLines.addAll(tmd.getTests());
            newArgs.add(o);
            setChanged();
            notifyObservers(newArgs);
        }
    }
}
