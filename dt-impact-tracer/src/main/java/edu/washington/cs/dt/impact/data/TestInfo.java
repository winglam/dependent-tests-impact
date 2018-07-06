package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.RESULT;

/**
 * Created by winglam on 7/1/18.
 *
 * This class is meant to contain the time a dependent test ran in isolation and the test execution result of a
 * dependent test in isolation.
 */
public class TestInfo {
    private final long time;
    private final RESULT result;

    public TestInfo(long time, RESULT result) {
        this.result = result;
        this.time = time;
    }

    public long getTime() {
        return time;
    }
    public RESULT getResult() {
        return result;
    }
}
