/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.runners.AbstractTestRunner;
import edu.washington.cs.dt.runners.FixedOrderRunner;

public class DependentTestFinder {

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
        tests = fullTests.subList(0, fullTests.indexOf(dependentTestName));


        List<String> beforeTests = new ArrayList<String>();
        List<String> afterTests = new ArrayList<String>();
        dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests, afterTests);

        checkOrder(isOriginalOrder, dependentTestName, beforeTests, afterTests);
    }

    private static void checkOrder(boolean isOriginalOrder, String dependentTestName, List<String> beforeTests, List<String> afterTests) {
        List<String> autoOrderList = ORIGINAL_ORDER_TESTS;

        for (String s : beforeTests) {
            if (autoOrderList.indexOf(dependentTestName) < autoOrderList.indexOf(s)) {
                throw new RuntimeException(s + " should not come BEFORE " + dependentTestName);
            }
        }

        List<String> newAfterTests = new ArrayList<String>(afterTests);
        for (String s : afterTests) {
            if (autoOrderList.indexOf(dependentTestName) > autoOrderList.indexOf(s)) {
                boolean currentOrder = isTestResultDifferent(dependentTestName, Arrays.asList(s, dependentTestName));
                if (currentOrder) {
                    // some test in the original order causes dependentTestName to pass
                    List<String> tests = autoOrderList.subList(autoOrderList.indexOf(s),
                            autoOrderList.indexOf(dependentTestName) + 1);
                    if (isTestResultDifferent(dependentTestName, tests)) {
                        // something is weird, ABCD. D is dependent on B but it is A affecting D.
                        throw new RuntimeException("Unable to solve dependency. Please manually"
                                + " observe independent test " + s
                                + " and dependent test " + dependentTestName);
                    }

                    tests = tests.subList(tests.indexOf(s) + 1,
                            tests.indexOf(dependentTestName));
                    isOriginalOrder = true;
                    newAfterTests.remove(s);
                    beforeTests.add(s);
                    dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests, newAfterTests, beforeTests, newAfterTests, true);
                } else {
                    //                    newAfterTests.clear();
                    //                    newAfterTests.add(dependentTestName);
                    //                    dependentTestName = s;
                    //                    beforeTests.clear();
                    //                    break;
                    newAfterTests.remove(s);
                    continue;
                }
            }
        }
        afterTests = new ArrayList<String>(newAfterTests);
        List<String> allDTList = parseFileToList(DT_FILE);
        for (String s : beforeTests) {
            checkDependentTest(dependentTestName, s, true, allDTList, new ArrayList<String>(beforeTests), afterTests);
        }
        if (!newAfterTests.equals(afterTests)) {
            Iterator<String> it = afterTests.iterator();
            while(it.hasNext()) {
                String next = it.next();
                if (autoOrderList.indexOf(dependentTestName) > autoOrderList.indexOf(next)) {
                    it.remove();
                }
            }
        }
        List<String> beforeTestsCpy = new ArrayList<String>(beforeTests);
        for (String s : afterTests) {
            checkDependentTest(dependentTestName, s, false, allDTList, beforeTests, new ArrayList<String>(afterTests));
        }
        if (!beforeTestsCpy.equals(beforeTests)) {
            checkOrder(isOriginalOrder, dependentTestName, beforeTests, afterTests);
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

    private static String dependentTestSolver(List<String> tests, String dependentTestName,
            boolean isOriginalOrder, List<String> beforeTests, List<String> afterTests) {
        return dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests, afterTests, new ArrayList<String>(), new ArrayList<String>(), false);
    }

    private static String dependentTestSolver(List<String> tests, String dependentTestName,
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

                // if after finding beforeTests the dependentTestName no longer fails when
                // ran in isolation then we don't need to consider the second half
                List<String> orderedTests = new ArrayList<String>(topTests);
                orderedTests.addAll(botTests);
                orderedTests.add(dependentTestName);
                boolean testResult = isTestResultDifferent(dependentTestName, orderedTests);
                if (!((!isOriginalOrder && testResult) || (isOriginalOrder && !testResult))) {
                    dependentTestSolver(newBotList, dependentTestName, isOriginalOrder, beforeTests, afterTests, topTests, botTests, useTopBot);
                }
                return null;
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
            return tests.get(0);
        }
        return null;
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

    private static void checkDependentTest(String dependentTest, String independentTest, boolean isOriginalOrder, List<String> allDTList, List<String> beforeTests, List<String> afterTests) {
        int testIndex = -1;
        int testNameIndex = allDTList.indexOf("Test: " + dependentTest);
        if (testNameIndex != -1) {
            if (isOriginalOrder) {
                testIndex = testNameIndex + 2;
            } else {
                testIndex = testNameIndex + 4;
            }

            String tests = allDTList.get(testIndex).substring(22, allDTList.get(testIndex).length() - 1);
            List<String> testsList = new ArrayList<String>(Arrays.asList(tests.split(", ")));

            if (testsList.contains(independentTest)) {
                if (isOriginalOrder) {
                    // ABC, C depends on A to run before it yet C is still failing.
                    // Something inbetween A and C is making C attain a different result.
                    testsList.remove(independentTest);
                    String otherTestList = allDTList.get(testIndex + 2);
                    if (testsList.size() == 0 && otherTestList.length() == 23) {
                        allDTList.remove(testIndex + 2);
                        allDTList.remove(testIndex + 1);
                        allDTList.remove(testIndex);
                        allDTList.remove(testIndex - 1);
                        allDTList.remove(testIndex - 2);
                    } else {
                        StringBuilder newList = new StringBuilder("when executed after: [");
                        if (testsList.size() > 0) {
                            newList.append(testsList.get(0));
                            for (int i = 1; i < testsList.size(); i++) {
                                if (!testsList.get(i).equals("")) {
                                    newList.append(", " + testsList.get(i));
                                }
                            }
                        }
                        newList.append("]");
                        allDTList.set(testIndex, newList.toString());
                    }


                    beforeTests.clear();
                    afterTests.clear();
                    isOriginalOrder = false;

                    checkDependentTest(independentTest, dependentTest, isOriginalOrder, allDTList, beforeTests, afterTests);
                    return;
                } else {
                    List<String> autoSubList = ORIGINAL_ORDER_TESTS.subList(ORIGINAL_ORDER_TESTS.indexOf(dependentTest),
                            ORIGINAL_ORDER_TESTS.indexOf(independentTest) + 1);
                    if (isTestResultDifferent(independentTest, autoSubList)) {
                        // something is weird, ABCD. D is dependent on B but it is A affecting D.
                        throw new RuntimeException("Unable to solve dependency. Please manually"
                                + " observe independent test " + dependentTest
                                + " and dependent test " + independentTest);
                    } else {
                        //                        autoSubList = autoSubList.subList(autoSubList.indexOf(dependentTest) + 1,
                        //                                autoSubList.indexOf(independentTest));
                        //                        isOriginalOrder = true;
                        //                        beforeTests.clear();
                        //                        afterTests.clear();
                        //                        beforeTests.add(dependentTest);
                        //                        dependentTest = independentTest;
                        //                        independentTest = dependentTestSolver(autoSubList, dependentTest, isOriginalOrder, beforeTests, afterTests);
                        //                        checkOrder(isOriginalOrder, dependentTest, beforeTests, afterTests);
                        return;
                    }
                }
            }
        }
        checkIndependentTest(allDTList, independentTest, dependentTest, isOriginalOrder, beforeTests, afterTests);
    }

    private static void checkIndependentTest(List<String> allDTList, String independentTest, String dependentTest, boolean isOriginalOrder, List<String> beforeTests, List<String> afterTests) {
        int indepTestIndex = -1;
        int indepTestNameIndex = allDTList.indexOf("Test: " + independentTest);
        if (indepTestNameIndex != -1) {
            if (isOriginalOrder) {
                indepTestIndex = indepTestNameIndex + 4;
            } else {
                indepTestIndex = indepTestNameIndex + 2;
            }

            String indepTests = allDTList.get(indepTestIndex).substring(22, allDTList.get(indepTestIndex).length() - 1);
            List<String> indepTestsList = new ArrayList<String>(Arrays.asList(indepTests.split(", ")));
            if (indepTestsList.contains(dependentTest)) {
                if (isOriginalOrder) {
                    // already in independent test's test list, look in current order for test causing dependence
                    List<String> currentOrderTestList = CURRENT_ORDER_TESTS;
                    int currentOrderIndepTestIndex = currentOrderTestList.indexOf(independentTest) + 1;
                    int currentOrderDepTestIndex = currentOrderTestList.indexOf(dependentTest);
                    if (currentOrderDepTestIndex < currentOrderIndepTestIndex) {
                        allDTList.remove(indepTestNameIndex + 4);
                        allDTList.remove(indepTestNameIndex + 3);
                        allDTList.remove(indepTestNameIndex + 2);
                        allDTList.remove(indepTestNameIndex + 1);
                        allDTList.remove(indepTestNameIndex);
                        for (int i = 0; i < allDTList.size(); i++) {
                            if (allDTList.get(i).contains(independentTest)) {
                                String strContainIndepTest = allDTList.get(i).substring(22, allDTList.get(i).length() - 1);
                                List<String> listContainIndepTest = new ArrayList<String>(Arrays.asList(strContainIndepTest.split(", ")));

                                listContainIndepTest.remove(independentTest);
                                StringBuilder newList = new StringBuilder("when executed after: [");
                                if (listContainIndepTest.size() > 0) {
                                    newList.append(listContainIndepTest.get(0));
                                    for (int j = 1; j < listContainIndepTest.size(); j++) {
                                        if (!listContainIndepTest.get(j).equals("")) {
                                            newList.append(", " + listContainIndepTest.get(j));
                                        }
                                    }
                                }
                                newList.append("]");
                                allDTList.set(i, newList.toString());
                            }
                        }
                        printDependenceHelper(allDTList);
                        return;
                    }
                    currentOrderTestList = currentOrderTestList.subList(currentOrderTestList.indexOf(independentTest) + 1,
                            currentOrderTestList.indexOf(dependentTest));
                    if (currentOrderTestList.size() == 0) {
                        currentOrderTestList = CURRENT_ORDER_TESTS.subList(0, CURRENT_ORDER_TESTS.indexOf(independentTest));
                        afterTests.clear();
                        dependentTestSolver(currentOrderTestList, dependentTest, false, new ArrayList<String>(), afterTests, new ArrayList<String>(), Arrays.asList(independentTest), true);
                        return;
                    }
                    isOriginalOrder = false;
                    beforeTests.remove(independentTest);
                    String newIndependentTest = dependentTestSolver(currentOrderTestList, dependentTest, isOriginalOrder, beforeTests, afterTests);
                    if (newIndependentTest == null) {
                        //                        checkOrder(isOriginalOrder, dependentTest, beforeTests, afterTests);
                        return;
                    }

                    int oldIndepTestAutoOrderIndex = ORIGINAL_ORDER_TESTS.indexOf(independentTest);
                    int newIndepTestAutoOrderIndex = ORIGINAL_ORDER_TESTS.indexOf(newIndependentTest);
                    if (newIndepTestAutoOrderIndex < oldIndepTestAutoOrderIndex) {

                        beforeTests.clear();
                        afterTests.clear();
                        dependentTest = independentTest;
                        independentTest = newIndependentTest;
                        isOriginalOrder = true;
                    } else {
                        independentTest = newIndependentTest;
                        if (ORIGINAL_ORDER_TESTS.indexOf(dependentTest) > ORIGINAL_ORDER_TESTS.indexOf(independentTest)) {
                            boolean currentOrder = isTestResultDifferent(dependentTest,
                                    Arrays.asList(independentTest, dependentTest));
                            if (currentOrder) {
                                // ABCD. D needs to run after A. We just found that B needs to run after D, not true. Instead we just need C before D.
                                // some test in the original order causes dependentTestName to pass
                                List<String> autoSubList = ORIGINAL_ORDER_TESTS.subList(ORIGINAL_ORDER_TESTS.indexOf(independentTest),
                                        ORIGINAL_ORDER_TESTS.indexOf(dependentTest) + 1);
                                if (isTestResultDifferent(dependentTest, autoSubList)) {
                                    // something is weird, ABCD. D is dependent on B but it is A affecting D.
                                    throw new RuntimeException("Unable to solve dependency. Please manually"
                                            + " observe independent test " + dependentTest
                                            + " and dependent test " + independentTest);
                                } else {
                                    autoSubList = autoSubList.subList(autoSubList.indexOf(independentTest) + 1,
                                            autoSubList.indexOf(dependentTest));
                                    isOriginalOrder = true;
                                    afterTests.remove(independentTest);
                                    independentTest = dependentTestSolver(autoSubList, dependentTest, isOriginalOrder, beforeTests, afterTests);
                                    if (independentTest == null) {
                                        checkOrder(isOriginalOrder, dependentTest, beforeTests, afterTests);
                                        return;
                                    }
                                }
                            } else {
                                //                                beforeTests.clear();
                                //                                afterTests.clear();
                                //                                afterTests.add(dependentTest);
                                //                                dependentTest = independentTest;
                                return;
                            }
                        }
                    }

                    checkDependentTest(dependentTest, independentTest, isOriginalOrder, allDTList, beforeTests, afterTests);
                    return;
                } else {
                    indepTestsList.remove(dependentTest);
                    String otherTestList = allDTList.get(indepTestIndex + 2);
                    if (indepTestsList.size() == 0 && otherTestList.length() == 23) {
                        allDTList.remove(indepTestIndex + 2);
                        allDTList.remove(indepTestIndex + 1);
                        allDTList.remove(indepTestIndex);
                        allDTList.remove(indepTestIndex - 1);
                        allDTList.remove(indepTestIndex - 2);
                    } else {
                        StringBuilder newList = new StringBuilder("when executed after: [");
                        if (indepTestsList.size() > 0) {
                            newList.append(indepTestsList.get(0));
                            for (int i = 0; i < indepTestsList.size(); i++) {
                                if (!indepTestsList.get(i).equals("")) {
                                    newList.append(", " + indepTestsList.get(i));
                                }
                            }
                        }
                        newList.append("]");
                        allDTList.set(indepTestIndex, newList.toString());
                    }
                }
            }
        }
        printDependence(allDTList, independentTest, dependentTest, isOriginalOrder);
    }

    private static void printDependence(List<String> allDTList, String independentTest, String dependentTest, boolean isOriginalOrder) {
        int testNameIndex = allDTList.indexOf("Test: " + dependentTest);
        if (testNameIndex != -1) {
            int testIndex;
            if (isOriginalOrder) {
                testIndex = testNameIndex + 2;
            } else {
                testIndex = testNameIndex + 4;
            }

            String depTests = allDTList.get(testIndex).substring(22, allDTList.get(testIndex).length() - 1);
            StringBuilder newList = new StringBuilder("when executed after: [");
            List<String> testsList = new ArrayList<String>(Arrays.asList(depTests.split(", ")));

            if (testsList.contains(independentTest)) {
                if (isOriginalOrder) {
                    throw new RuntimeException(independentTest + " is already marked"
                            + " as a BEFORE dependent test of " + dependentTest);
                } else {
                    throw new RuntimeException(independentTest + " is already marked"
                            + " as a AFTER dependent test of " + dependentTest);
                }
            }

            newList.append(independentTest);
            for (int i = 0; i < testsList.size(); i++) {
                if (!testsList.get(i).equals("")) {
                    newList.append(", " + testsList.get(i));
                }
            }
            newList.append("]");
            allDTList.set(testIndex, newList.toString());
        } else {
            allDTList.add("Test: " + dependentTest);
            allDTList.add("Intended behavior: FAILURE");
            if (isOriginalOrder) {
                allDTList.add("when executed after: [" + independentTest + "]");
            } else {
                allDTList.add("when executed after: []");
            }
            allDTList.add("The revealed different behavior: PASS");
            if (!isOriginalOrder) {
                allDTList.add("when executed after: [" + independentTest + "]");
            } else {
                allDTList.add("when executed after: []");
            }
        }
        printDependenceHelper(allDTList);
    }

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

    private static void clearEnv() {
        for (String s : FILES_TO_DELETE) {
            new File(s).delete();
        }
    }
}