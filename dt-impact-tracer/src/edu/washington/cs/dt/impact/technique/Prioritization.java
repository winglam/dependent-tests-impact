package edu.washington.cs.dt.impact.technique;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.data.TestFunctionStatement;
import edu.washington.cs.dt.impact.order.Relative;
import edu.washington.cs.dt.impact.order.Standard;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;

public class Prioritization extends Test {
    public Prioritization(ORDER order, String outputFilename, File inputTestFolder, COVERAGE coverage, File dependentTestsFile, boolean getCoverage) {
        super(inputTestFolder, coverage, dependentTestsFile);

        if (order == ORDER.ABSOLUTE || order == ORDER.RELATIVE) {
            Collections.sort(methodList);
            if (order == ORDER.RELATIVE) {
                methodList = new Relative(outputFilename, methodList, allLines).getMethodList();
            }
            if (getCoverage) {
                methodList = changeToCoverage();
            }
            orderObj = new Standard(outputFilename, methodList);
        } else if (order == ORDER.RANDOM) {
            Collections.shuffle(methodList);
            orderObj = new Standard(outputFilename, methodList);
        } else {
            System.err.println("Test prioritization is specified with an incompatible order. Compatible orders are: absolute, relative and random.");
            System.exit(0);
        }
    }

    private List<TestFunctionStatement> changeToCoverage() {
        Set<String> allLinesCpy = new HashSet<String>(allLines);
        List<TestFunctionStatement> coverageList = new LinkedList<TestFunctionStatement>();
        while (methodList.size() > 0) {
            TestFunctionStatement tfs = methodList.remove(0);
            int beforeSize = allLinesCpy.size();
            allLinesCpy.removeAll(tfs.getLines());
            int afterSize = beforeSize - allLinesCpy.size();

            // record the percent of coverage as xx.xx%
            long displayPercent = (long) ((((double) afterSize) / allLines.size()) * 10000);
            coverageList.add(new TestFunctionStatement(tfs.getName() + " : " + displayPercent));
        }
        return coverageList;
    }
}
