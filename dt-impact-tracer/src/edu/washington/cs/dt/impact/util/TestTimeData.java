package edu.washington.cs.dt.impact.util;


public class TestTimeData extends TestMethodData {
    private long count;

    public TestTimeData(String name, long count) {
        super(name);
        this.count = count;
    }

    /**
     * @param isBefore true if the ttd reveals this test as a dependent test if ttd is executed before this test
     *        false if ttd reveals this test as a dependent test if ttd is executed after this test.
     */
    public void addDependentTest(TestTimeData ttd, boolean isBefore) {
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