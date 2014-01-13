package edu.washington.cs.dt.impact.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestMethodData implements Comparable<TestMethodData> {

    private String methodName;
    private Set<String> allLines;
    private Set<String> currentLines;

    public TestMethodData(String name) {
        this.methodName = name;
        currentLines = new LinkedHashSet<String>();
        allLines = new LinkedHashSet<String>();
    }

    public void addLine(String line) {
        allLines.add(line);
    }

    public void reset() {
        currentLines = new LinkedHashSet<String>(allLines);
    }

    public int getLineCount() {
        return currentLines.size();
    }

    public String getName() {
        return methodName;
    }

    public void removeLines(Set<String> lines) {
        currentLines.removeAll(lines);
    }

    public Set<String> getLines() {
        return currentLines;
    }

    @Override
    public int compareTo(TestMethodData o) {
        int mLineCount = currentLines.size();
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
