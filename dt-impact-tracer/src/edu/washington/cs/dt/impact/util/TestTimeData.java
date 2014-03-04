package edu.washington.cs.dt.impact.util;


public class TestTimeData extends TestMethodData {
    private long count;

    public TestTimeData(String name, long count) {
        super(name);

        this.count = count;
    }

    @Override
    public long getLineCount() {
        return count;
    }
}