package edu.washington.cs.dt.impact.order;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.data.TestFunctionStatement;

public class Relative extends Standard {
    private Set<String> allLines;

    public Relative(String outputFileName, List<TestFunctionStatement> methodList, final Set<String> allLines) {
        super(outputFileName, methodList);
        this.allLines = allLines;
        this.methodList = generateRelativeOrderList();
    }

    private List<TestFunctionStatement> generateRelativeOrderList() {
        List<TestFunctionStatement> returnList = new LinkedList<TestFunctionStatement>();
        Set<String> currentLines = new HashSet<String>(allLines);
        while (methodList.size() > 0) {
            TestFunctionStatement highestData = methodList.remove(0);
            returnList.add(highestData);
            Set<String> highestDataLines = highestData.getLines();
            for (TestFunctionStatement methodData : methodList) {
                methodData.removeLines(highestDataLines);
            }
            currentLines.removeAll(highestDataLines);

            // all possible lines of code have been executed
            if (currentLines.size() == 0) {
                currentLines = new HashSet<String>(allLines);
                for (TestFunctionStatement tmd : methodList) {
                    tmd.reset();
                }
            }

            Collections.sort(methodList);
        }
        return returnList;
    }

    public List<TestFunctionStatement> getMethodList() {
        return methodList;
    }
}
