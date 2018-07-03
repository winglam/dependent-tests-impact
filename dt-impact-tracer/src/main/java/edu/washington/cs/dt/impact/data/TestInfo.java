package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.RESULT;

/**
 * Created by winglam on 7/1/18.
 *
 * This class is meant to contain the time a dependent test ran in isolation and the test execution result of a
 * dependent test in isolation.
 */
public class TestInfo {
    private long isolationTime;
    private RESULT isolationResult;

    public TestInfo(long isolationTime, RESULT isolationResult) {
        this.isolationResult = isolationResult;
        this.isolationTime = isolationTime;
    }

    public long getIsolationTime() {
        return isolationTime;
    }
    public RESULT getIsolationResult() {
        return isolationResult;
    }
}
