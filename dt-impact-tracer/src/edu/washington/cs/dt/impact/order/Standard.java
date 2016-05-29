/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 *
 *         Reorders a list of TestFunctionStatement based on its dependent tests if specified to do so.
 *         Prints the ordered list of tests.
 */

package edu.washington.cs.dt.impact.order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.data.TestFunctionStatement;

public class Standard {
    protected String filename;
    protected List<TestFunctionStatement> methodList;
    protected boolean getCoverage;
    protected Set<String> allLines;

    public Standard(String outputFileName, List<TestFunctionStatement> methodList, boolean getCoverage,
            Set<String> allLines) {
        this.filename = outputFileName;
        this.methodList = methodList;
        this.getCoverage = getCoverage;
        this.allLines = allLines;
    }

    public Standard(String outputFileName, List<TestFunctionStatement> methodList) {
        this(outputFileName, methodList, false);
    }

    public Standard(String outputFileName, List<TestFunctionStatement> methodList, boolean getCoverage) {
        this(outputFileName, methodList, getCoverage, null);
    }

    public void checkForDependentTests() {
        List<TestFunctionStatement> orderedListOfTests = new LinkedList<TestFunctionStatement>();
        for (TestFunctionStatement test : methodList) {
            applyDeps(orderedListOfTests.size(), orderedListOfTests, test);
        }
        methodList = orderedListOfTests;
    }

    private int applyDeps(int index, List<TestFunctionStatement> orderedListOfTests, TestFunctionStatement newTest) {
        if (!orderedListOfTests.contains(newTest)) {
            Set<TestFunctionStatement> testsThatNeedsToExecuteBeforeNewTest = newTest.getDependentTests(false);
            // Add all tests that needs to come before newTest to the orderedListOfTests
            for (TestFunctionStatement positiveDependee : testsThatNeedsToExecuteBeforeNewTest) {
                index = applyDeps(index, orderedListOfTests, positiveDependee);
            }

            // Add newTest to orderedListOfTests
            orderedListOfTests.add(index, newTest);
            index += 1;
        }
        return index;
    }

    // Used to get the percent coverage each test is responsible for based on their current
    // order in methodList
    public List<TestFunctionStatement> getCoverage(boolean includeName) {
        // TODO does not work with parallelization, not sure why.
        Set<String> allLinesCpy = new HashSet<String>(allLines);
        List<TestFunctionStatement> coverageList = new LinkedList<TestFunctionStatement>();
        while (methodList.size() > 0) {
            TestFunctionStatement tfs = methodList.remove(0);
            tfs.reset();
            int beforeSize = allLinesCpy.size();
            allLinesCpy.removeAll(tfs.getLines());
            int afterSize = beforeSize - allLinesCpy.size();

            // record the percent of coverage as xx.xx%
            long displayPercent = (long) ((((double) afterSize) / allLines.size()) * 10000);
            if (includeName) {
                tfs.setName((tfs.getName() + " : " + displayPercent));
            } else {
                tfs.setName(String.valueOf(displayPercent));
            }
            coverageList.add(tfs);
        }
        return coverageList;
    }

    public List<TestFunctionStatement> getMethodList() {
        return methodList;
    }

    public void printResults() {
        if (getCoverage) {
            methodList = getCoverage(true);
        }

        if (filename == null) {
            for (TestFunctionStatement methodData : methodList) {
                System.out.println(methodData.getName());
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(filename);
                writer = new BufferedWriter(output);

                for (TestFunctionStatement methodData : methodList) {
                    writer.write(methodData.getName() + "\n");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                    if (output != null) {
                        output.close();
                    }
                } catch (IOException e) {
                    // Ignore issues during closing
                }
            }
        }
    }
}
