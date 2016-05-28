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
            sortDT(orderedListOfTests.size(), orderedListOfTests, test);
        }
        this.methodList = orderedListOfTests;
    }

    private int sortDT(int index, List<TestFunctionStatement> orderedListOfTests, TestFunctionStatement newTest) {
        // Check if we have already added newTest to orderedListOfTests
        if (!orderedListOfTests.contains(newTest)) {
            // Get all the tests that needs to execute after newTest
            Set<TestFunctionStatement> testsThatNeedsToExecuteAfterTest = newTest.getDependentTests(true);
            for (TestFunctionStatement negativeDependee : testsThatNeedsToExecuteAfterTest) {
                if (orderedListOfTests.indexOf(negativeDependee) >= 0
                        && orderedListOfTests.indexOf(negativeDependee) < index) {
                    // For all the tests that needs to execute after newTest, make sure that theses tests are currently
                    // scheduled after it. If there is a test that is executing before newTest then change the index we
                    // will
                    // insert newTest to be that test's index
                    index = orderedListOfTests.indexOf(negativeDependee);
                }
            }

            // Get all the tests that needs to execute before newTest
            Set<TestFunctionStatement> testsThatNeedsToExecuteBeforeTest = newTest.getDependentTests(false);
            // Add all tests that needs to come before newTest and have not already been added to the orderedListOfTests
            for (TestFunctionStatement positiveDependee : testsThatNeedsToExecuteBeforeTest) {
                index = sortDT(index, orderedListOfTests, positiveDependee);
            }

            // check again whether recursive call earlier has added newTest already
            if (!orderedListOfTests.contains(newTest)) {
                orderedListOfTests.add(index, newTest);
                index += 1;

                // check whether after adding newTest at the
                // index affected any of its dependencies
                moveTestsBefore(orderedListOfTests, newTest);

                // check whether after adding newTest at the index affected
                // any tests that depends on newTest
                for (TestFunctionStatement tmd : newTest.getObservers()) {
                    moveTests(orderedListOfTests, newTest, tmd);
                }
            }

            for (TestFunctionStatement tmd : testsThatNeedsToExecuteAfterTest) {
                index = sortDT(index, orderedListOfTests, tmd);
            }
        }
        return index;
    }

    private void moveTestsBefore(List<TestFunctionStatement> orderedListOfTests, TestFunctionStatement newTest) {
        // Get all the tests that needs to execute before newTest
        for (TestFunctionStatement testsThatNeedsToExecuteBeforeTest : newTest.getDependentTests(false)) {
            if (orderedListOfTests.indexOf(testsThatNeedsToExecuteBeforeTest) > orderedListOfTests.indexOf(newTest)) {
                orderedListOfTests.remove(testsThatNeedsToExecuteBeforeTest);
                orderedListOfTests.add(orderedListOfTests.indexOf(newTest), testsThatNeedsToExecuteBeforeTest);
                moveTestsBefore(orderedListOfTests, testsThatNeedsToExecuteBeforeTest);
                // check whether after moving newTest elsewhere whether that
                // affected any tests that depends on newTest
                for (TestFunctionStatement testsDependingOntest : testsThatNeedsToExecuteBeforeTest.getObservers()) {
                    moveTests(orderedListOfTests, testsThatNeedsToExecuteBeforeTest, testsDependingOntest);
                }
            }
        }
    }

    private void moveTests(List<TestFunctionStatement> orderedListOfTests, TestFunctionStatement dependent,
            TestFunctionStatement independent) {
        // get the independent test's list of before dependencies and check whether the
        // dependent test is in it
        // Get all the tests that needs to execute after independent
        Set<TestFunctionStatement> testsThatNeedsToExecuteAfterTest = independent.getDependentTests(true);
        if (testsThatNeedsToExecuteAfterTest.contains(dependent)) {
            if (orderedListOfTests.indexOf(independent) > orderedListOfTests.indexOf(dependent)) {
                // move the indep test up to the dep test and check whether that affected
                // any test that depends on the independent test
                orderedListOfTests.remove(independent);
                orderedListOfTests.add(orderedListOfTests.indexOf(dependent), independent);
                moveTestsBefore(orderedListOfTests, independent);
                for (TestFunctionStatement tmd : independent.getObservers()) {
                    moveTests(orderedListOfTests, independent, tmd);
                }
            }
        }
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
