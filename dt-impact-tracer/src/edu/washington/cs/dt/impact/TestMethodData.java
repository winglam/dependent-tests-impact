package edu.washington.cs.dt.impact;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestMethodData implements Comparable<TestMethodData>{
    public static Constants.CATEGORY category = Constants.CATEGORY.STATEMENT;

    private String methodName;
    private Set<String> mLines;

    public TestMethodData(String name) {
        this.methodName = name;
        mLines = new LinkedHashSet<String>();
    }

    public void addLine(String line) {
        if (category == Constants.CATEGORY.STATEMENT && (!line.contains(">>>>>>>>") || !line.contains("<<<<<<<<"))) {
            mLines.add(line);
        } else if (category == Constants.CATEGORY.FUNCTION && line.contains("<<<<<<<<")) {
            mLines.add(line);
        }
    }

    public int getLineCount() {
        return mLines.size();
    }

    public String getName() {
        return methodName;
    }

    public void removeLines(Set<String> lines) {
        for (String line : lines) {
            mLines.remove(line);
        }
    }

    public Set<String> getLines() {
        return mLines;
    }

    @Override
    public int compareTo(TestMethodData o) {
        int mLineCount = mLines.size();
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
