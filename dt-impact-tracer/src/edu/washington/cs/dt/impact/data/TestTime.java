/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Data class representing a test case. Contains a time counter representing the time
 * in nanoseconds it takes to execute this test case.
 */

package edu.washington.cs.dt.impact.data;


public class TestTime extends TestFunctionStatement {
    private long count;

    public TestTime(String name, long count) {
        super(name);
        this.count = count;
    }

    /**
     * @param isBefore
     *          true if ttd reveals this test as a dependent test when executed before this test
     *          false if ttd reveals this test as a dependent test when executed after this test.
     */
    public void addDependentTest(TestTime ttd, boolean isBefore) {
        if (ttd != null) {
            count += ttd.getLineCount();
            if (isBefore) {
                execBefore.add(ttd);
            } else {
                execAfter.add(ttd);
            }
        }
    }

    @Override
    public long getLineCount() {
        return count;
    }
}