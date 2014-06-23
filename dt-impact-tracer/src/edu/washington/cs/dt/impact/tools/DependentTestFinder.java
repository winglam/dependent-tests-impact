/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
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

        boolean isOriginalOrder = isTestResultDifferent(dependentTestName,
                Arrays.asList(dependentTestName));
        List<String> fullTests;
        if (isOriginalOrder) {
            fullTests = ORIGINAL_ORDER_TESTS;
        } else {
            fullTests = CURRENT_ORDER_TESTS;
        }

        List<String> tests = new LinkedList<String>(fullTests);
        if(tests == null || !tests.contains(dependentTestName)) {
            throw new RuntimeException("Dependent test missing from test order.");
        }

        List<String> allDTList = parseFileToList(DT_FILE);
        List<String> beforeTests = new ArrayList<String>();
        List<String> afterTests = new ArrayList<String>();
        int testNameIndex = allDTList.indexOf("Test: " + dependentTestName);
        if (testNameIndex != -1) {
            isOriginalOrder = determineSubLists(fullTests, allDTList, testNameIndex,
                    dependentTestName, isOriginalOrder, tests, beforeTests, afterTests);
        } else {
            tests = fullTests.subList(0, fullTests.indexOf(dependentTestName));
            dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests,
                    afterTests, new ArrayList<String>(), new ArrayList<String>(), false);
        }

        checkOrder(isOriginalOrder, dependentTestName, beforeTests, afterTests);
    }

    // determines a sublist to look for the test(s) dependentTest depends on
    // returns true if the sublist is part of ORIGINAL_ORDER_TESTS,
    // false if the sublist is part of CURRENT_ORDER_TESTS
    private static boolean determineSubLists(List<String> fullTests, List<String> allDTList,
            int testNameIndex, String dependentTestName, boolean isOriginalOrder,
            List<String> tests, List<String> beforeTests, List<String> afterTests) {
        // go up dependentTest's chain and use either a portion of the original order tests
        // or a portion of current order tests to get dependent test to pass
        List<String> botTests = new ArrayList<String>();
        String currentTest = allDTList.get(testNameIndex + 2).substring(22,
                allDTList.get(testNameIndex + 2).length() - 1);
        botTests.add(currentTest);
        int startIndex = fullTests.indexOf(currentTest) + 1;
        int independentTestIndex = allDTList.indexOf(TEST_STR + currentTest);

        // get all the tests that dependentTestName depends on to come before it
        while (independentTestIndex != -1) {
            currentTest = allDTList.get(independentTestIndex + 2).substring(22,
                    allDTList.get(independentTestIndex + 2).length() - 1);
            botTests.add(currentTest);
            independentTestIndex = allDTList.indexOf(TEST_STR + currentTest);
        }

        // add dependentTestName to the list of tests that must
        // come before it and sort it in ascending order
        botTests.add(dependentTestName);
        List<String> descendingOrder = sortTestsDescendingOrder(botTests);
        botTests.clear();
        for (int i = descendingOrder.size() - 1; i >= 0; i--) {
            botTests.add(descendingOrder.get(i));
        }

        int endIndex = -1;
        List<String> topTests = new ArrayList<String>();
        boolean useTopBot = false;
        boolean chainTestResult = isTestResultDifferent(dependentTestName, botTests);

        // run just dependentTestName and the tests that must come before it
        if (chainTestResult) {
            // just the chain causes dependentTestName to attain a different result
            // look inside the original order for what it is missing
            fullTests = ORIGINAL_ORDER_TESTS;
            isOriginalOrder = true;
            endIndex = fullTests.indexOf(dependentTestName);
            int i = botTests.size() - 2;
            List<String> fullSubTests = fullTests.subList(fullTests.indexOf(botTests.get(i)),
                    fullTests.indexOf(dependentTestName) + 1);
            List<String> chainSubTests = botTests.subList(i, botTests.size());
            chainTestResult = isTestResultDifferent(dependentTestName, chainSubTests);
            boolean fullTestResult = isTestResultDifferent(dependentTestName, fullSubTests);

            // go up the chain and determine between what test in the chain
            // and dependentTestName is the missing test at
            while (chainTestResult == fullTestResult && i >= 0) {
                i -= 1;
                if (i == -1) {
                    break;
                }
                fullSubTests = fullTests.subList(fullTests.indexOf(botTests.get(i)),
                        fullTests.indexOf(dependentTestName) + 1);
                chainSubTests = botTests.subList(i, botTests.size());
                chainTestResult = isTestResultDifferent(dependentTestName, chainSubTests);
                fullTestResult = isTestResultDifferent(dependentTestName, fullSubTests);
            }

            if (i == -1) {
                // the missing test is outside of the dependence chain,
                // use the entire original order
                startIndex = 0;
            } else {
                // TODO original order finds test that is already part of the chain
                // the missing test is between botTests.get(i) and dependentTestName
                // in the original order
                useTopBot = true;
                topTests.add(botTests.get(i));
                startIndex = fullTests.indexOf(botTests.get(i)) + 1;
            }
            botTests.clear();
        } else {
            // the chain does not cause dependentTestName to attain a different result
            // but something between the chain or before it is causing it to
            fullTests = CURRENT_ORDER_TESTS;
            isOriginalOrder = false;
            int i = botTests.size() - 2;
            List<String> fullSubTests = fullTests.subList(fullTests.indexOf(botTests.get(i)),
                    fullTests.indexOf(dependentTestName) + 1);
            List<String> chainSubTests = botTests.subList(i, botTests.size());
            chainTestResult = isTestResultDifferent(dependentTestName, chainSubTests);
            boolean fullTestResult = isTestResultDifferent(dependentTestName, fullSubTests);

            // go up the chain and determine between what test in the chain
            // and dependentTestName is the missing test at
            while (chainTestResult == fullTestResult && i >= 0) {
                i -= 1;
                if (i == -1) {
                    break;
                }
                fullSubTests = fullTests.subList(fullTests.indexOf(botTests.get(i)),
                        fullTests.indexOf(dependentTestName) + 1);
                chainSubTests = botTests.subList(i, botTests.size());
                chainTestResult = isTestResultDifferent(dependentTestName, chainSubTests);
                fullTestResult = isTestResultDifferent(dependentTestName, fullSubTests);
            }

            useTopBot = true;
            if (i == -1) {
                // the missing test is outside of the dependence chain,
                // use the entire current order to the start of the chain
                startIndex = 0;
                endIndex = fullTests.indexOf(botTests.get(0));
            } else {
                // the missing test is between botTests.get(i) and dependentTestName
                // in the current order
                startIndex = fullTests.indexOf(botTests.get(i)) + 1;
                endIndex = fullTests.indexOf(dependentTestName);
                topTests.add(botTests.get(i));
                botTests.clear();
            }
            botTests.remove(dependentTestName);
        }

        if (startIndex > fullTests.indexOf(dependentTestName)) {
            throw new RuntimeException(currentTest + " is marked to come before "
                    + dependentTestName + " but is currently coming after it.");
        }

        tests = fullTests.subList(startIndex, endIndex);
        dependentTestSolver(tests, dependentTestName, isOriginalOrder, beforeTests,
                afterTests, topTests, botTests, useTopBot);
        return isOriginalOrder;
    }

    // recursive method that adds a test to beforeTests or afterTests each call. The test
    // that is added is deemed to be depended on by dependentTestName
    private static void dependentTestSolver(List<String> tests, String dependentTestName,
            boolean isOriginalOrder, List<String> beforeTests, List<String> afterTests,
            List<String> topAddOnTests, List<String> botAddOnTests, boolean useAddOnTests) {
        tests.removeAll(topAddOnTests);
        tests.removeAll(botAddOnTests);
        List<String> topHalf = new LinkedList<String>(tests.subList(0, tests.size() / 2));
        List<String> botHalf = new LinkedList<String>(
                tests.subList(tests.size() / 2, tests.size()));

        while(tests.size() > 1) {

            if (useAddOnTests) {
                topHalf.addAll(0, topAddOnTests);
                botHalf.addAll(0, topAddOnTests);

                topHalf.addAll(topHalf.size(), botAddOnTests);
                botHalf.addAll(botHalf.size(), botAddOnTests);
            }

            topHalf.add(dependentTestName);
            botHalf.add(dependentTestName);

            clearEnv();
            AbstractTestRunner runner = new FixedOrderRunner(topHalf);
            boolean topResults = checkTestMatch(isOriginalOrder,
                    runner.run().getExecutionRecords().get(0), dependentTestName);

            clearEnv();
            runner = new FixedOrderRunner(botHalf);
            boolean botResults = checkTestMatch(isOriginalOrder,
                    runner.run().getExecutionRecords().get(0), dependentTestName);

            // dependent test depends on more than one test in tests
            if (topResults == botResults) {

                // if splitting the tests no longer reveals the dependent test behavior,
                // then use both sides in the recursive call
                useAddOnTests = !topResults || useAddOnTests;

                List<String> newBeforeTests = new ArrayList<String>(beforeTests);
                List<String> newAfterTests = new ArrayList<String>(afterTests);
                List<String> newTopList = new ArrayList<String>(topHalf);
                List<String> newBotList = new ArrayList<String>(botHalf);

                // find the test in the bottom half of our current list
                newTopList.removeAll(topAddOnTests);
                newTopList.removeAll(botAddOnTests);
                newTopList.remove(newTopList.size() - 1);
                newBotList.removeAll(topAddOnTests);
                newBotList.remove(newBotList.size() - 1);
                if (topResults) {
                    dependentTestSolver(newTopList, dependentTestName, isOriginalOrder,
                            beforeTests, afterTests, topAddOnTests, botAddOnTests, useAddOnTests);
                } else {
                    dependentTestSolver(newTopList, dependentTestName, isOriginalOrder,
                            beforeTests, afterTests, topAddOnTests, newBotList, useAddOnTests);
                }

                if (!beforeTests.equals(newBeforeTests)) {
                    List<String> tempBeforeTests = new ArrayList<String>(beforeTests);
                    beforeTests.removeAll(newBeforeTests);
                    if (!topAddOnTests.containsAll(beforeTests)) {
                        beforeTests.removeAll(topAddOnTests);
                        topAddOnTests.addAll(beforeTests);
                    }
                    beforeTests.clear();
                    beforeTests.addAll(tempBeforeTests);
                }

                if (!afterTests.equals(newAfterTests)) {
                    List<String> tempAfterTests = new ArrayList<String>(afterTests);
                    afterTests.removeAll(newAfterTests);
                    if (!topAddOnTests.containsAll(afterTests)) {
                        afterTests.removeAll(topAddOnTests);
                        topAddOnTests.addAll(afterTests);
                    }
                    afterTests.clear();
                    afterTests.addAll(tempAfterTests);
                }

                List<String> orderedTests = new ArrayList<String>(topAddOnTests);
                orderedTests.addAll(botAddOnTests);
                orderedTests.add(dependentTestName);
                boolean testResult = isTestResultDifferent(dependentTestName, orderedTests);
                if (!((!isOriginalOrder && testResult) || (isOriginalOrder && !testResult))) {
                    // case of A and B needs to come before C or B and C need to come after A
                    dependentTestSolver(newBotList, dependentTestName, isOriginalOrder,
                            beforeTests, afterTests, topAddOnTests, botAddOnTests, useAddOnTests);
                } else if (testResult && isOriginalOrder) {
                    dependentTestSolver(newBotList, dependentTestName, isOriginalOrder,
                            beforeTests, afterTests, topAddOnTests, botAddOnTests, false);
                }
                return;
            }

            if (topResults) {
                tests = topHalf;
            } else {
                tests = botHalf;
            }

            if (useAddOnTests) {
                tests.removeAll(topAddOnTests);
                tests.removeAll(botAddOnTests);
            }
            tests.remove(tests.size() - 1);
            topHalf = new LinkedList<String>(tests.subList(0, tests.size() / 2));
            botHalf = new LinkedList<String>(tests.subList(tests.size() / 2, tests.size()));
        }

        if (!beforeTests.contains(tests.get(0)) && !afterTests.contains(tests.get(0))) {
            if (isOriginalOrder) {
                beforeTests.add(tests.get(0));
            } else {
                afterTests.add(tests.get(0));
            }
        }
    }

    // check whether the before and after tests that dependentTestName depends on are
    // come before or after it (respectively)
    private static void checkOrder(boolean isOriginalOrder, String dependentTestName,
            List<String> beforeTests, List<String> afterTests) {
        List<String> allDTList = parseFileToList(DT_FILE);
        beforeTests = sortTestsDescendingOrder(beforeTests);
        afterTests = sortTestsDescendingOrder(afterTests);

        if (beforeTests.size() != 0) {
            // there is a test that comes after dependentTestName in beforeTests
            // change that test to be the dependentTestName instead
            if (ORIGINAL_ORDER_TESTS.indexOf(beforeTests.get(0))
                    > ORIGINAL_ORDER_TESTS.indexOf(dependentTestName)) {
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
            // there is a test that comes before dependentTestName in afterTests
            // change that test to be the dependentTestName instead
            if (ORIGINAL_ORDER_TESTS.indexOf(afterTests.get(afterTests.size() - 1))
                    < ORIGINAL_ORDER_TESTS.indexOf(dependentTestName)) {
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

    // checks whether the dependentTest and the independentTest is valid to print
    // if not tests in the allDTList is rearranged before printing
    private static void checkDependentTest(String dependentTest,
            String independentTest, List<String> allDTList) {
        int dependentTestIndex = -1;
        int testNameIndex = allDTList.indexOf("Test: " + dependentTest);
        if (testNameIndex != -1) {
            dependentTestIndex = testNameIndex + 2;
            String tests = allDTList.get(dependentTestIndex).substring(22,
                    allDTList.get(dependentTestIndex).length() - 1);

            if (ORIGINAL_ORDER_TESTS.indexOf(tests)
                    < ORIGINAL_ORDER_TESTS.indexOf(independentTest)) {
                int independentTestIndex = allDTList.indexOf("when executed after: ["
                        + independentTest + "]");
                if (independentTestIndex == -1) {
                    allDTList.remove(dependentTestIndex);
                    allDTList.add(dependentTestIndex, "when executed after: ["
                            + independentTest + "]");
                } else {
                    // independentTest is already declared. find a test that is after it
                    // that no other test needs to come after it
                    mergeChains(allDTList, independentTest, dependentTest);
                }
                checkDependentTest(independentTest, tests, allDTList);
                printDependenceHelper(allDTList);
            } else if (ORIGINAL_ORDER_TESTS.indexOf(tests)
                    > ORIGINAL_ORDER_TESTS.indexOf(independentTest)) {
                checkDependentTest(tests, independentTest, allDTList);
            }
        } else {
            printDependence(allDTList, independentTest, dependentTest);
        }
    }

    // checks whether the independentTest is already declared to come before a test in allDTList
    // if it is declared then a merge is necessary.
    // if not then proceed to output the dependentTest and independentTest
    private static void printDependence(List<String> allDTList,
            String independentTest, String dependentTest) {
        int independentTestIndex = allDTList.indexOf("when executed after: ["
                + independentTest + "]");
        if (independentTestIndex != -1) {
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

    // sorts tests based on the opposite order as they would appear on the original order list
    // C -> B -> A if original order was ABC
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

    // traverses the allDTList to determine what independentTest dependentTest can depend on
    // to come before it so that independentTest is guaranteed to come before it
    private static void mergeChains(List<String> allDTList, String independentTest,
            String dependentTest) {
        int independentTestIndex = allDTList.indexOf("when executed after: ["
                + independentTest + "]");
        if (independentTestIndex == -1) {
            throw new RuntimeException(independentTest
                    + " does not currently exist in the DT list.");
        }
        String newIndependentTest = allDTList.get(independentTestIndex - 2)
                .substring(TEST_STR.length());

        // find the test with the highest index in the original order where the test is
        // in between independentTest and dependentTest and is part of independentTest's chain
        while (ORIGINAL_ORDER_TESTS.indexOf(dependentTest)
                > ORIGINAL_ORDER_TESTS.indexOf(newIndependentTest)) {
            independentTest = newIndependentTest;
            independentTestIndex = allDTList.indexOf("when executed after: ["
                    + newIndependentTest + "]");
            if (independentTestIndex == -1) {
                break;
            }
            newIndependentTest = allDTList.get(independentTestIndex - 2)
                    .substring(TEST_STR.length());
        }

        // if dependentTestName isn't already in the allDTList, add it
        // fixes the bottom half of a chain when injecting dependentTest
        int testNameIndex = allDTList.indexOf(TEST_STR + dependentTest);
        if (testNameIndex == -1) {
            allDTList.add(TEST_STR + dependentTest);
            allDTList.add("Intended behavior: FAILURE");
            allDTList.add("when executed after: [" + independentTest + "]");
            allDTList.add("The revealed different behavior: PASS");
            allDTList.add("when executed after: []");
        }


        // if independentTest already exists in allDTList then delete it
        // fixes the top half of a chain when injecting dependentTest to the chain
        if (independentTestIndex != -1) {
            int dependentTestIndex = allDTList.indexOf("when executed after: ["
                    + dependentTest + "]");
            allDTList.remove(independentTestIndex);
            allDTList.add(independentTestIndex, "when executed after: [" + dependentTest + "]");

            // now that we injected dependentTest into another chain,
            // check whether we ruined dependentTest's chain or not
            while (dependentTestIndex != -1) {
                independentTest = dependentTest;
                dependentTest = allDTList.get(dependentTestIndex - 2)
                        .substring(TEST_STR.length());
                while (ORIGINAL_ORDER_TESTS.indexOf(dependentTest)
                        > ORIGINAL_ORDER_TESTS.indexOf(newIndependentTest)) {
                    independentTest = newIndependentTest;
                    independentTestIndex = allDTList.indexOf("when executed after: ["
                            + newIndependentTest + "]");
                    if (independentTestIndex == -1) {
                        break;
                    }
                    newIndependentTest = allDTList.get(independentTestIndex - 2)
                            .substring(TEST_STR.length());
                }

                if (independentTestIndex != -1) {
                    allDTList.remove(dependentTestIndex);
                    allDTList.add(dependentTestIndex, "when executed after: ["
                            + independentTest + "]");
                    dependentTestIndex = allDTList.indexOf("when executed after: ["
                            + dependentTest + "]");
                    allDTList.remove(independentTestIndex);
                    allDTList.add(independentTestIndex, "when executed after: ["
                            + dependentTest + "]");
                } else {
                    allDTList.remove(dependentTestIndex);
                    allDTList.add(dependentTestIndex, "when executed after: ["
                            + independentTest + "]");
                    break;
                }
            }
        }
    }

    // outputs the allDTList to DT_FILE. With every 5 lines, a line break is inserted
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

    // runs orderedTests and determine whether dependentTestName
    // in the orderTests matches DEPEDENT_TEST_RESULT
    // returns true if dependentTestName's result in orderedTest
    // does not match DEPENDENT_TEST_RESULT, false otherwise
    private static boolean isTestResultDifferent(String dependentTestName,
            List<String> orderedTests) {
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

    // returns true if dependentTestName's result in results is the same as
    // DEPENDENT_TEST_RESULT and if it is original order, false otherwise
    private static boolean checkTestMatch(boolean isOriginalOrder, TestExecResult results,
            String dependentTestName) {
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


    // deletes the files in FILES_TO_DELETE.
    // used to clear the environment of any temp files created by tests
    private static void clearEnv() {
        for (String s : FILES_TO_DELETE) {
            new File(s).delete();
        }
    }

    // returns a list of Strings where each String is a line of the file
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