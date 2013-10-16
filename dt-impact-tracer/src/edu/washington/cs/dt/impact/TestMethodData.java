package edu.washington.cs.dt.impact;

import java.util.HashSet;
import java.util.Set;

public class TestMethodData implements Comparable<TestMethodData>{

    private String methodName;
    private Set<String> lines;

    public TestMethodData(String name) {
        this.methodName = name;
        lines = new HashSet<String>();
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public int getLineCount() {
        return lines.size();
    }

    public String getName() {
        return methodName;
    }

    @Override
    public int compareTo(TestMethodData o) {
        int mLineCount = lines.size();
        int oLineCount = o.getLineCount();

        if (mLineCount < oLineCount) {
            return 1;
        } else if (mLineCount > oLineCount) {
            return -1;
        } else {
            return 0;
        }
    }
}
