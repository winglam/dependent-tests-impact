package edu.washington.cs.dt.impact.objects;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.util.TestMethodData;

public class RelativeOrderObject extends StandardOrderObject {
    private Set<String> allLines;

    public RelativeOrderObject(String outputFileName, List<TestMethodData> methodList, Set<String> allLines) {
        super(outputFileName, methodList);
        this.allLines = allLines;
        this.methodList = generateRelativeOrderList();
    }

    public List<TestMethodData> generateRelativeOrderList() {
        List<TestMethodData> returnList = new LinkedList<TestMethodData>();
        Set<String> currentLines = new HashSet<String>(allLines);
        while (methodList.size() > 0) {
            TestMethodData highestData = methodList.remove(0);
            returnList.add(highestData);
            Set<String> highestDataLines = highestData.getLines();
            for (TestMethodData methodData : methodList) {
                methodData.removeLines(highestDataLines);
            }
            currentLines.removeAll(highestDataLines);

            // all possible lines of code have been executed
            if (currentLines.size() == 0) {
                currentLines = new HashSet<String>(allLines);
                for (TestMethodData tmd : methodList) {
                    tmd.reset();
                }
            }

            Collections.sort(methodList);
        }
        return returnList;
    }
}
