/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * WORK IN PROGRESS
 * Determines and outputs what tests needs to run before and
 * after a particular test in order for that particular test to
 * attain the same specified result in a new test execution order.
 */
package edu.washington.cs.dt.impact.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.runners.AbstractTestRunner;
import edu.washington.cs.dt.runners.FixedOrderRunner;

public class DependentTestFinder {

    private static final String TEST_STR = "Test: ";
    private static File DT_FILE;
    private static List<String> FILES_TO_DELETE;
    private static List<String> ORIGINAL_ORDER_TESTS;
    private static List<String> CURRENT_ORDER_TESTS;
    private static RESULT DEPENDENT_TEST_RESULT;

    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        String dependentTestName = null;
        int dependentTestIndex = argsList.indexOf("-dependentTestName");
        if (dependentTestIndex != -1) {
            // get index of output file
            int dependentTestNameIndex = dependentTestIndex + 1;
            if (dependentTestNameIndex >= argsList.size()) {
                System.err
                .println("Dependent test name argument is specified but a test name is not."
                        + " Please use the format: -dependentTestName aTestName");
                System.exit(0);
            }
            dependentTestName = argsList.get(dependentTestNameIndex);
        } else {
            System.err.println("No dependent test name argument is specified."
                    + " Please use the format: -dependentTestName aTestName");
            System.exit(0);
        }

        int dependentTestResultIndex = argsList.indexOf("-dependentTestResult");
        if (dependentTestResultIndex != -1) {
            // get index of output file
            int dependentTestNameIndex = dependentTestResultIndex + 1;
            if (dependentTestNameIndex >= argsList.size()) {
                System.err
                .println("Dependent test result argument is specified but a test name is not."
                        + " Please use the format: -dependentTestResult aTestResult");
                System.exit(0);
            }
            String dependentTestResultString = argsList.get(dependentTestNameIndex);
            dependentTestResultString = dependentTestResultString.toLowerCase();

            if (dependentTestResultString.equals("pass")) {
                DEPENDENT_TEST_RESULT = RESULT.PASS;
            } else if (dependentTestResultString.equals("error")) {
                DEPENDENT_TEST_RESULT = RESULT.ERROR;
            } else if (dependentTestResultString.equals("fail")) {
                DEPENDENT_TEST_RESULT = RESULT.FAILURE;
            } else {
                System.err.println("No such test result argument exist."
                        + " Possible options are: pass, error and fail.");
                System.exit(0);
            }
        } else {
            System.err.println("No dependent test result argument is specified."
                    + " Please use the format: -dependentTestResult aTestResult");
            System.exit(0);
        }

        File currentOrderFile = null;
        int currentOrderIndex = argsList.indexOf("-currentOrderFile");
        if (currentOrderIndex != -1) {
            // get index of output file
            int currentOrderFileIndex = currentOrderIndex + 1;
            if (currentOrderFileIndex >= argsList.size()) {
                System.err
                .println("Current order file argument is specified but a file name is not."
                        + " Please use the format: -currentOrderFile aFileName");
                System.exit(0);
            }
            currentOrderFile = new File(argsList.get(currentOrderFileIndex));
        } else {
            System.err.println("No current order file argument is specified."
                    + " Please use the format: -currentOrderFile aFileName");
            System.exit(0);
        }
        CURRENT_ORDER_TESTS = parseFileToList(currentOrderFile);

        File originalOrderFile = null;
        int originalOrderIndex = argsList.indexOf("-originalOrderFile");
        if (originalOrderIndex != -1) {
            // get index of output file
            int originalOrderFileIndex = originalOrderIndex + 1;
            if (originalOrderFileIndex >= argsList.size()) {
                System.err
                .println("Original order file argument is specified but a file name is not."
                        + " Please use the format: -originalOrderFile aFileName");
                System.exit(0);
            }
            originalOrderFile = new File(argsList.get(originalOrderFileIndex));
        } else {
            System.err.println("No original order file argument is specified."
                    + " Please use the format: -originalOrderFile aFileName");
            System.exit(0);
        }
        ORIGINAL_ORDER_TESTS = parseFileToList(originalOrderFile);

        File filesToDelete = null;
        int filesToDeleteIndex = argsList.indexOf("-filesToDelete");
        if (filesToDeleteIndex != -1) {
            // get index of output file
            int filesToDeleteFileIndex = filesToDeleteIndex + 1;
            if (filesToDeleteFileIndex >= argsList.size()) {
                System.err
                .println("Files to delete argument is specified but a file name is not."
                        + " Please use the format: -filesToDelete aFileName");
                System.exit(0);
            }
            filesToDelete = new File(argsList.get(filesToDeleteFileIndex));
        } else {
            System.err.println("No files to delete argument is specified."
                    + " Please use the format: -filesToDelete aFileName");
            System.exit(0);
        }
        FILES_TO_DELETE = parseFileToList(filesToDelete);

        int dtListIndex = argsList.indexOf("-dtFile");
        if (dtListIndex != -1) {
            // get index of output file
            int dtListFileIndex = dtListIndex + 1;
            if (dtListFileIndex >= argsList.size()) {
                System.err
                .println("DT file argument is specified but a file name is not."
                        + " Please use the format: -dtFile aFileName");
                System.exit(0);
            }
            DT_FILE = new File(argsList.get(dtListFileIndex));
        } else {
            System.err.println("No DT file argument is specified."
                    + " Please use the format: -dtFile aFileName");
            System.exit(0);
        }

        boolean isOriginalOrder = isTestResultDifferent(dependentTestName, Arrays.asList(dependentTestName));
        List<String> fullTests;
        if (isOriginalOrder) {
            fullTests = ORIGINAL_ORDER_TESTS;
        } else {
            fullTests = CURRENT_ORDER_TESTS;
        }

        List<String> tests = new LinkedList<String>(fullTests);
        if(tests == null || !tests.contains(dependentTestName)) {
            throw new RuntimeException("Dependent tests missing from test order.");
        }

        List<String> beforeTests = new ArrayList<String>();
        List<String> afterTests = new ArrayList<String>();
        List<String> allDTList = parseFileToList(DT_FILE);
        int testNameIndex = allDTList.indexOf("Test: " + dependentTestName);
        if (testNameIndex != -1) {
            // something in the current order is getting in the way
            fullTests = CURRENT_ORDER_TESTS;
            isOriginalOrder = false;
            String currentTest = allDTList.get(testNameIndex + 2).substring(22, allDTList.get(testNameIndex + 2).length() - 1);
            int currentTestIndex = fullTests.indexOf(currentTest) + 1;
            List<String> topTests = new ArrayList<String>();
            topTests.add(currentTest);
            beforeTests.add(currentTest);
            boolean useTopTest = true;

            if (currentTestIndex > fullTests.indexOf(dependentTestName)) {
                throw new RuntimeException(currentTest + " is marked to come before " + dependentTestName + " but is currently coming after it.");
            }

            // dependentTestName needs something from the original order to get the same result
            if (currentTestIndex == fullTests.indexOf(dependentTestName)) {
                fullTests = ORIGINAL_ORDER_TESTS;
                isOriginalOrder = true;
                currentTestIndex = fullTests.indexOf(currentTest) + 1;

                // go up dependentTest's chain and use the top test in its chain in original order
                if (currentTestIndex == fullTests.indexOf(dependentTestName)) {
                    throw new RuntimeException("When the before tests of dependent test is already right before it.");
                    //                                    int independentTestIndex = allDTList.indexOf(TEST_STR + currentTest);
                    //                                    while (independentTestIndex != -1) {
                    //                                        currentTest = allDTList.get(independentTestIndex + 2).substring(22, allDTList.get(testNameIndex + 2).length() - 1);
                    //                                        independentTestIndex = allDTList.indexOf(TEST_STR + currentTest);
                    //                                    }
                    //
                    //                                    currentTestIndex = 0;
                    //                                    topTests.remove(currentTest);
                    //                                    beforeTests.remove(currentTest);
                    //                                    useTopTest = false;
                }
            }

            tests = fullTests.subList(currentTestIndex, fullTests.indexOf(dependentTestName));
            dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests, afterTests, topTests, new ArrayList<String>(), useTopTest);
        } else {
            tests = fullTests.subList(0, fullTests.indexOf(dependentTestName));
            dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests, afterTests, new ArrayList<String>(), new ArrayList<String>(), false);
        }

        checkOrder(isOriginalOrder, dependentTestName, beforeTests, afterTests);
    }

    private static void checkOrder(boolean isOriginalOrder, String dependentTestName, List<String> beforeTests, List<String> afterTests) {
        List<String> allDTList = parseFileToList(DT_FILE);
        beforeTests = sortTestsDescendingOrder(beforeTests);
        afterTests = sortTestsDescendingOrder(afterTests);

        if (beforeTests.size() != 0) {
            if (ORIGINAL_ORDER_TESTS.indexOf(beforeTests.get(0)) > ORIGINAL_ORDER_TESTS.indexOf(dependentTestName)) {
                beforeTests.add(dependentTestName);
                dependentTestName = beforeTests.get(0);
                beforeTests.remove(0);
                beforeTests = sortTestsDescendingOrder(beforeTests);
            }

            String highestIndexTest = beforeTests.get(0);
            checkDependentTest(dependentTestName, highestIndexTest, allDTList);

            for (int i = 1; i < beforeTests.size(); i++) {
                checkDependentTest(highestIndexTest, beforeTests.get(i), allDTList);
                highestIndexTest = beforeTests.get(i);
            }
        }

        if (afterTests.size() != 0) {
            if (ORIGINAL_ORDER_TESTS.indexOf(afterTests.get(afterTests.size() - 1)) < ORIGINAL_ORDER_TESTS.indexOf(dependentTestName)) {
                afterTests.add(dependentTestName);
                dependentTestName = afterTests.get(afterTests.size() - 2);
                afterTests.remove(afterTests.size() - 2);
                afterTests = sortTestsDescendingOrder(afterTests);
            }

            String highestIndexTest = afterTests.get(0);
            for (int i = 1; i < afterTests.size(); i++) {
                checkDependentTest(highestIndexTest, afterTests.get(i), allDTList);
                highestIndexTest = afterTests.get(i);
            }
            checkDependentTest(highestIndexTest, dependentTestName, allDTList);
        }
    }

    // sorts tests based on the order they appeared on the original order list
    private static List<String> sortTestsDescendingOrder(List<String> tests) {
        if (tests == null) {
            throw new RuntimeException("Unable to sort empty test list.");
        }

        List<String> sortedTests = new ArrayList<String>();
        while (tests.size() != 0) {
            int testListIndex = 0;
            int orderListIndex = ORIGINAL_ORDER_TESTS.indexOf(tests.get(0));

            for (int i = 1; i < tests.size(); i++) {
                int currentTestIndex = ORIGINAL_ORDER_TESTS.indexOf(tests.get(i));
                if (currentTestIndex > orderListIndex) {
                    orderListIndex = currentTestIndex;
                    testListIndex = i;
                }
            }
            sortedTests.add(tests.get(testListIndex));
            tests.remove(testListIndex);
        }
        return sortedTests;
    }

    private static void checkDependentTest(String dependentTest, String independentTest, List<String> allDTList) {
        int testIndex = -1;
        int testNameIndex = allDTList.indexOf("Test: " + dependentTest);
        if (testNameIndex != -1) {
            testIndex = testNameIndex + 2;
            String tests = allDTList.get(testIndex).substring(22, allDTList.get(testIndex).length() - 1);

            if (ORIGINAL_ORDER_TESTS.indexOf(tests) < ORIGINAL_ORDER_TESTS.indexOf(independentTest)) {
                allDTList.remove(testIndex);
                allDTList.add(testIndex, "when executed after: [" + independentTest + "]");
                checkDependentTest(independentTest, tests, allDTList);
                printDependenceHelper(allDTList);
            } else if (ORIGINAL_ORDER_TESTS.indexOf(tests) > ORIGINAL_ORDER_TESTS.indexOf(independentTest)) {
                checkDependentTest(tests, independentTest, allDTList);
            }
        } else {
            printDependence(allDTList, independentTest, dependentTest);
        }
    }


    private static void dependentTestSolver(List<String> tests, String dependentTestName,
            boolean isOriginalOrder, List<String> beforeTests, List<String> afterTests,
            List<String> topTests, List<String> botTests, boolean useTopBot) {
        tests.removeAll(topTests);
        tests.removeAll(botTests);
        List<String> topList = new LinkedList<String>(tests.subList(0, tests.size() / 2));
        List<String> botList = new LinkedList<String>(tests.subList(tests.size() / 2, tests.size()));

        while(tests.size() > 1) {

            if (useTopBot) {
                topList.addAll(0, topTests);
                botList.addAll(0, topTests);

                topList.addAll(topList.size(), botTests);
                botList.addAll(botList.size(), botTests);
            }

            topList.add(dependentTestName);
            botList.add(dependentTestName);

            clearEnv();
            AbstractTestRunner runner = new FixedOrderRunner(topList);
            boolean topResults = checkTestMatch(isOriginalOrder, runner.run().getExecutionRecords().get(0), dependentTestName);

            clearEnv();
            runner = new FixedOrderRunner(botList);
            boolean botResults = checkTestMatch(isOriginalOrder, runner.run().getExecutionRecords().get(0), dependentTestName);

            // dependent test depends on more than one test in tests
            if (topResults == botResults) {

                // if splitting the tests no longer reveals the dependent test behavior, then use both sides in the recursive call
                useTopBot = !topResults || useTopBot;

                List<String> newBeforeTests = new ArrayList<String>(beforeTests);
                List<String> newAfterTests = new ArrayList<String>(afterTests);
                List<String> newTopList = new ArrayList<String>(topList);
                List<String> newBotList = new ArrayList<String>(botList);

                // find the test in the bottom half of our current list
                newTopList.removeAll(topTests);
                newTopList.removeAll(botTests);
                newTopList.remove(newTopList.size() - 1);
                newBotList.removeAll(topTests);
                newBotList.remove(newBotList.size() - 1);
                if (topResults) {
                    dependentTestSolver(newTopList, dependentTestName, isOriginalOrder, beforeTests, afterTests, topTests, botTests, useTopBot);
                } else {
                    dependentTestSolver(newTopList, dependentTestName, isOriginalOrder, beforeTests, afterTests, topTests, newBotList, useTopBot);
                }

                if (!beforeTests.equals(newBeforeTests)) {
                    List<String> tempBeforeTests = new ArrayList<String>(beforeTests);
                    beforeTests.removeAll(newBeforeTests);
                    if (!topTests.containsAll(beforeTests)) {
                        beforeTests.removeAll(topTests);
                        topTests.addAll(beforeTests);
                    }
                    beforeTests.clear();
                    beforeTests.addAll(tempBeforeTests);
                }

                if (!afterTests.equals(newAfterTests)) {
                    List<String> tempAfterTests = new ArrayList<String>(afterTests);
                    afterTests.removeAll(newAfterTests);
                    if (!topTests.containsAll(afterTests)) {
                        afterTests.removeAll(topTests);
                        topTests.addAll(afterTests);
                    }
                    afterTests.clear();
                    afterTests.addAll(tempAfterTests);
                }

                List<String> orderedTests = new ArrayList<String>(topTests);
                orderedTests.addAll(botTests);
                orderedTests.add(dependentTestName);
                boolean testResult = isTestResultDifferent(dependentTestName, orderedTests);
                if (!((!isOriginalOrder && testResult) || (isOriginalOrder && !testResult))) {
                    // case of A and B needs to come before C or B and C need to come after A
                    dependentTestSolver(newBotList, dependentTestName, isOriginalOrder, beforeTests, afterTests, topTests, botTests, useTopBot);
                } else if (testResult && isOriginalOrder) {
                    dependentTestSolver(newBotList, dependentTestName, isOriginalOrder, beforeTests, afterTests, topTests, botTests, false);
                }
                return;
            }

            if (topResults) {
                tests = topList;
            } else {
                tests = botList;
            }

            if (useTopBot) {
                tests.removeAll(topTests);
                tests.removeAll(botTests);
            }
            tests.remove(tests.size() - 1);
            topList = new LinkedList<String>(tests.subList(0, tests.size() / 2));
            botList = new LinkedList<String>(tests.subList(tests.size() / 2, tests.size()));
        }

        if (!beforeTests.contains(tests.get(0)) && !afterTests.contains(tests.get(0))) {
            //            throw new RuntimeException("Test " + tests.get(0) + " is already marked as a dependent test for " + dependentTestName);
            if (isOriginalOrder) {
                beforeTests.add(tests.get(0));
            } else {
                afterTests.add(tests.get(0));
            }
        }
    }

    private static boolean isTestResultDifferent(String dependentTestName, List<String> orderedTests) {
        clearEnv();
        AbstractTestRunner runner = new FixedOrderRunner(orderedTests);
        TestExecResults results = runner.run();

        RESULT dtIsolateResult = null;
        TestExecResult result = results.getExecutionRecords().get(0);
        if (result.isTestPassed(dependentTestName)) {
            dtIsolateResult = RESULT.PASS;
        } else if (result.isTestError(dependentTestName)) {
            dtIsolateResult = RESULT.ERROR;
        } else {
            dtIsolateResult = RESULT.FAILURE;
        }

        return !dtIsolateResult.equals(DEPENDENT_TEST_RESULT);
    }

    private static boolean checkTestMatch(boolean isOriginalOrder, TestExecResult results, String dependentTestName) {
        boolean testResult;
        if (DEPENDENT_TEST_RESULT.equals(RESULT.PASS)) {
            testResult = results.isTestPassed(dependentTestName);
        } else if (DEPENDENT_TEST_RESULT.equals(RESULT.ERROR)) {
            testResult = results.isTestError(dependentTestName);
        } else {
            testResult = results.isTestFailed(dependentTestName);
        }

        return testResult == isOriginalOrder;
    }

    private static void mergeChains(List<String> allDTList, String independentTest, String dependentTest) {
        int independentTestIndex = allDTList.indexOf("when executed after: [" + independentTest + "]");
        String newIndependentTest = allDTList.get(independentTestIndex - 2).substring(TEST_STR.length());

        while (ORIGINAL_ORDER_TESTS.indexOf(dependentTest) > ORIGINAL_ORDER_TESTS.indexOf(newIndependentTest)) {
            independentTest = newIndependentTest;
            independentTestIndex = allDTList.indexOf("when executed after: [" + newIndependentTest + "]");
            if (independentTestIndex == -1) {
                break;
            }
            newIndependentTest = allDTList.get(independentTestIndex - 2).substring(TEST_STR.length());
        }

        int testNameIndex = allDTList.indexOf(TEST_STR + dependentTest);
        if (testNameIndex == -1) {
            allDTList.add(TEST_STR + dependentTest);
            allDTList.add("Intended behavior: FAILURE");
            allDTList.add("when executed after: [" + independentTest + "]");
            allDTList.add("The revealed different behavior: PASS");
            allDTList.add("when executed after: []");
        }

        if (independentTestIndex != -1) {
            int dependentTestIndex = allDTList.indexOf("when executed after: [" + dependentTest + "]");
            allDTList.remove(independentTestIndex);
            allDTList.add(independentTestIndex, "when executed after: [" + dependentTest + "]");

            while (dependentTestIndex != -1) {
                independentTest = dependentTest;
                dependentTest = allDTList.get(dependentTestIndex - 2).substring(TEST_STR.length());
                while (ORIGINAL_ORDER_TESTS.indexOf(dependentTest) > ORIGINAL_ORDER_TESTS.indexOf(newIndependentTest)) {
                    independentTest = newIndependentTest;
                    independentTestIndex = allDTList.indexOf("when executed after: [" + newIndependentTest + "]");
                    if (independentTestIndex == -1) {
                        break;
                    }
                    newIndependentTest = allDTList.get(independentTestIndex - 2).substring(TEST_STR.length());
                }

                if (independentTestIndex != -1) {
                    allDTList.remove(dependentTestIndex);
                    allDTList.add(dependentTestIndex, "when executed after: [" + independentTest + "]");
                    dependentTestIndex = allDTList.indexOf("when executed after: [" + dependentTest + "]");
                    allDTList.remove(independentTestIndex);
                    allDTList.add(independentTestIndex, "when executed after: [" + dependentTest + "]");
                } else {
                    allDTList.remove(dependentTestIndex);
                    allDTList.add(dependentTestIndex, "when executed after: [" + independentTest + "]");
                    break;
                }
            }
        }
    }


    private static void printDependence(List<String> allDTList, String independentTest, String dependentTest) {
        int independentTestIndex = allDTList.indexOf("when executed after: [" + independentTest + "]");
        if (independentTestIndex != -1) {
            //            throw new RuntimeException("blahhhhhh");
            mergeChains(allDTList, independentTest, dependentTest);
        } else {
            int testNameIndex = allDTList.indexOf(TEST_STR + dependentTest);
            if (testNameIndex == -1) {
                allDTList.add(TEST_STR + dependentTest);
                allDTList.add("Intended behavior: FAILURE");
                allDTList.add("when executed after: [" + independentTest + "]");
                allDTList.add("The revealed different behavior: PASS");
                allDTList.add("when executed after: []");
            }
        }
        printDependenceHelper(allDTList);
    }

    // outputs the allDTList to DT_FILE. Every 5 lines a line break is inserted
    private static void printDependenceHelper(List<String> allDTList) {
        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter(DT_FILE);
            writer = new BufferedWriter(output);

            for (int j = 0; j < allDTList.size(); ) {
                for (int i = 0; i < 5; j++) {
                    writer.write(allDTList.get(j) + "\n");
                    i++;
                }

                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
            }
        }
    }


    // deletes the files indicated FILES_TO_DELETE
    // used to clear the environment of any temp files created by tests
    private static void clearEnv() {
        for (String s : FILES_TO_DELETE) {
            new File(s).delete();
        }
    }

    // returns a list of strings where each string is a line of the file
    private static List<String> parseFileToList(File orderFile) {
        List<String> tests = new ArrayList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(orderFile));
            String line = br.readLine();

            while (line != null) {
                if (!line.equals("")) {
                    tests.add(line);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tests;
    }
}