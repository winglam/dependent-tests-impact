/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Reorders a list of TestFunctionStatement based on its dependent tests if specified to do so.
 * Prints the ordered list of tests.
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
    private boolean getCoverage;
    protected Set<String> allLines;

    public Standard(String outputFileName, List<TestFunctionStatement> methodList, boolean getCoverage, Set<String> allLines) {
        this.filename = outputFileName;
        this.methodList = methodList;
        this.getCoverage = getCoverage;
        this.allLines = allLines;
    }

    public Standard(String outputFileName, List<TestFunctionStatement> methodList) {
        this.filename = outputFileName;
        this.methodList = methodList;
        this.getCoverage = false;
        allLines = null;
    }

    public void checkForDependentTests() {
        Set<TestFunctionStatement> printedTests = new HashSet<TestFunctionStatement>();
        List<TestFunctionStatement> dtMethodList = new LinkedList<TestFunctionStatement>();
        for (TestFunctionStatement tmd : methodList) {
            sortDT(dtMethodList.size(), dtMethodList, printedTests, tmd);
        }
        this.methodList = dtMethodList;
    }

    private int sortDT(int index, List<TestFunctionStatement> dtMethodList,
            Set<TestFunctionStatement> printedTests, TestFunctionStatement methodData) {
        if (!printedTests.contains(methodData)) {
            Set<TestFunctionStatement> execBefore = methodData.getDependentTests(true);
            for (TestFunctionStatement tmd : execBefore) {
                if (dtMethodList.indexOf(tmd) >= 0 && dtMethodList.indexOf(tmd) < index) {
                    index = dtMethodList.indexOf(tmd);
                }
            }

            Set<TestFunctionStatement> execAfter = methodData.getDependentTests(false);
            for (TestFunctionStatement tmd : execAfter) {
                index = sortDT(index, dtMethodList, printedTests, tmd);
            }

            // check again whether recursive call earlier has added methodData already
            if (!printedTests.contains(methodData)) {
                printedTests.add(methodData);
                dtMethodList.add(index, methodData);
                index += 1;

                // check whether after adding methodData at the
                // index affected any of its dependencies
                moveTestsBefore(dtMethodList, methodData);

                // check whether after adding methodData at the index affected
                // any tests that depends on methodData
                for (TestFunctionStatement tmd : methodData.getObservers()) {
                    moveTests(dtMethodList, methodData, tmd);
                }
            }

            for (TestFunctionStatement tmd : execBefore) {
                index = sortDT(index, dtMethodList, printedTests, tmd);
            }
        }
        return index;
    }

    private void moveTestsBefore(List<TestFunctionStatement> dtMethodList,
            TestFunctionStatement dep) {
        for (TestFunctionStatement methodDataTests : dep.getDependentTests(false)) {
            if (dtMethodList.indexOf(methodDataTests) > dtMethodList.indexOf(dep)) {
                dtMethodList.remove(methodDataTests);
                dtMethodList.add(dtMethodList.indexOf(dep), methodDataTests);
                moveTestsBefore(dtMethodList, methodDataTests);
                // check whether after moving methodData elsewhere whether that
                // affected any tests that depends on methodData
                for (TestFunctionStatement testsDependingOnMethodData
                        : methodDataTests.getObservers()) {
                    moveTests(dtMethodList, methodDataTests, testsDependingOnMethodData);
                }
            }
        }
    }

    private void moveTests(List<TestFunctionStatement> dtMethodList, TestFunctionStatement dependent,
            TestFunctionStatement independent) {
        // get the independent test's list of before dependencies and check whether the
        // dependent test is in it
        Set<TestFunctionStatement> befores = independent.getDependentTests(true);
        if (befores.contains(dependent)) {
            if (dtMethodList.indexOf(independent) > dtMethodList.indexOf(dependent)) {
                // move the indep test up to the dep test and check whether that affected
                // any test that depends on the independent test
                dtMethodList.remove(independent);
                dtMethodList.add(dtMethodList.indexOf(dependent), independent);
                moveTestsBefore(dtMethodList, independent);
                for (TestFunctionStatement tmd : independent.getObservers()) {
                    moveTests(dtMethodList, independent, tmd);
                }
            }
        }
    }

    // Used to get the percent coverage each test is responsible for based on their current
    // order in methodList
    private List<TestFunctionStatement> changeToCoverage() {
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
            tfs.setName((tfs.getName() + " : " + displayPercent));
            coverageList.add(tfs);
        }
        return coverageList;
    }

    public void printResults() {
        if (getCoverage) {
            methodList = changeToCoverage();
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
