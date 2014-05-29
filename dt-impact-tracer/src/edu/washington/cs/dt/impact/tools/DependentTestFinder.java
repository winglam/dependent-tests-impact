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
import java.util.LinkedList;
import java.util.List;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.runners.AbstractTestRunner;
import edu.washington.cs.dt.runners.FixedOrderRunner;

public class DependentTestFinder {

    private static String DT_FILE = "/home/winglam/workspace/dependent-tests-impact/experiments/crystal/crystal-auto-dt";

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

        RESULT dependentTestResult = null;
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
                dependentTestResult = RESULT.PASS;
            } else if (dependentTestResultString.equals("error")) {
                dependentTestResult = RESULT.ERROR;
            } else if (dependentTestResultString.equals("fail")) {
                dependentTestResult = RESULT.FAILURE;
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


        boolean isOriginalOrder = isTestResultDifferent(dependentTestResult,
                dependentTestName, Arrays.asList(dependentTestName));
        List<String> fullTests;
        if (isOriginalOrder) {
            fullTests = parseFileToList(originalOrderFile);
        } else {
            fullTests = parseFileToList(currentOrderFile);
        }

        List<String> tests = new LinkedList<String>(fullTests);
        if(tests == null || !tests.contains(dependentTestName)) {
            throw new RuntimeException("Dependent tests missing from test order.");
        }
        tests = fullTests.subList(0, fullTests.indexOf(dependentTestName));

        String independentTestName = dependentTestSolver(tests, null,
                dependentTestName, isOriginalOrder, dependentTestResult);

        checkOrder(originalOrderFile, isOriginalOrder, dependentTestName, independentTestName, dependentTestResult, currentOrderFile);
    }

    private static void checkOrder(File originalOrderFile, boolean isOriginalOrder, String dependentTestName, String independentTestName, RESULT dependentTestResult, File currentOrderFile) {
        List<String> autoOrderList = parseFileToList(originalOrderFile);

        if (isOriginalOrder && autoOrderList.indexOf(dependentTestName)
                < autoOrderList.indexOf(independentTestName)) {
            throw new RuntimeException(independentTestName
                    + " should not come BEFORE " + dependentTestName);
        }

        if (!isOriginalOrder && autoOrderList.indexOf(dependentTestName)
                > autoOrderList.indexOf(independentTestName)) {
            boolean currentOrder = isTestResultDifferent(dependentTestResult, dependentTestName,
                    Arrays.asList(independentTestName, dependentTestName));
            if (currentOrder) {
                // some test in the original order causes dependentTestName to pass
                List<String> tests = autoOrderList.subList(autoOrderList.indexOf(independentTestName),
                        autoOrderList.indexOf(dependentTestName) + 1);
                if (isTestResultDifferent(dependentTestResult, dependentTestName, tests)) {
                    // something is weird, ABCD. D is dependent on B but it is A affecting D.
                    throw new RuntimeException("Unable to solve dependency. Please manually"
                            + " observe independent test " + independentTestName
                            + " and dependent test " + dependentTestName);
                }

                tests = tests.subList(tests.indexOf(independentTestName) + 1,
                        tests.indexOf(dependentTestName));
                isOriginalOrder = true;
                independentTestName = dependentTestSolver(tests, independentTestName,
                        dependentTestName, isOriginalOrder, dependentTestResult);
            } else {
                String temp = independentTestName;
                independentTestName = dependentTestName;
                dependentTestName = temp;
            }
        }
        List<String> allDTList = parseFileToList(new File(DT_FILE));
        printDT(dependentTestName, currentOrderFile, dependentTestResult, originalOrderFile, independentTestName, isOriginalOrder, allDTList);
    }

    private static boolean isTestResultDifferent(RESULT expectedTestResult,
            String dependentTestName, List<String> orderedTests) {
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

        return !dtIsolateResult.equals(expectedTestResult);
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

    private static String dependentTestSolver(List<String> tests, String beforeTest,
            String dependentTestName, boolean isOriginalOrder, RESULT dependentTestResult) {
        List<String> topList = new LinkedList<String>(tests.subList(0, tests.size() / 2));
        List<String> botList = new LinkedList<String>(tests.subList(tests.size() / 2, tests.size()));

        while(tests.size() > 1) {
            clearEnv();
            topList.add(dependentTestName);
            botList.add(dependentTestName);
            if (beforeTest != null) {
                topList.add(0, beforeTest);
                botList.add(0, beforeTest);
            }

            AbstractTestRunner runner = new FixedOrderRunner(topList);
            TestExecResult topResults = runner.run().getExecutionRecords().get(0);


            if (isOriginalOrder) {
                if (dependentTestResult.equals(RESULT.PASS)) {
                    if (topResults.isTestPassed(dependentTestName)) {
                        tests = topList;
                    } else {
                        tests = botList;
                    }
                } else if (dependentTestResult.equals(RESULT.ERROR)) {
                    if (topResults.isTestError(dependentTestName)) {
                        tests = topList;
                    } else {
                        tests = botList;
                    }
                } else {
                    if (topResults.isTestFailed(dependentTestName)) {
                        tests = topList;
                    } else {
                        tests = botList;
                    }
                }
            } else {
                if (dependentTestResult.equals(RESULT.PASS)) {
                    if (!topResults.isTestPassed(dependentTestName)) {
                        tests = topList;
                    } else {
                        tests = botList;
                    }
                } else if (dependentTestResult.equals(RESULT.ERROR)) {
                    if (!topResults.isTestError(dependentTestName)) {
                        tests = topList;
                    } else {
                        tests = botList;
                    }
                } else {
                    if (!topResults.isTestFailed(dependentTestName)) {
                        tests = topList;
                    } else {
                        tests = botList;
                    }
                }
            }

            if (beforeTest != null) {
                tests.remove(0);
            }
            tests.remove(tests.size() - 1);
            topList = new LinkedList<String>(tests.subList(0, tests.size() / 2));
            botList = new LinkedList<String>(tests.subList(tests.size() / 2, tests.size()));
        }

        return tests.get(0);
    }

    private static void printDT(String dependentTest, File currentOrderFile, RESULT dependentTestResult, File originalOrderFile,
            String independentTest, boolean isOriginalOrder, List<String> allDTList) {
        List<String> autoOrderList = parseFileToList(originalOrderFile);

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

                    String temp = independentTest;
                    independentTest = dependentTest;
                    dependentTest = temp;
                    isOriginalOrder = false;

                    printDT(dependentTest, currentOrderFile, dependentTestResult, originalOrderFile, independentTest, isOriginalOrder, allDTList);
                    return;
                } else {
                    // should never happen. ABC, B depends on C to run after it
                    // yet B is still failing even though C is after it.
                    throw new RuntimeException(independentTest + " is already marked"
                            + " as a AFTER dependent test of " + dependentTest);
                }
            }
        }
        checkDTAlreadyExist(allDTList, independentTest, dependentTest, isOriginalOrder, currentOrderFile, autoOrderList, dependentTestResult, testIndex, new File(DT_FILE), originalOrderFile);
    }

    private static void checkDTAlreadyExist(List<String> allDTList, String independentTest, String dependentTest, boolean isOriginalOrder, File currentOrderFile, List<String> autoOrderList, RESULT dependentTestResult, int testIndex, File dtFile, File originalOrderFile) {
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
                    List<String> currentOrderTestList = parseFileToList(currentOrderFile);
                    int currentOrderIndepTestIndex = currentOrderTestList.indexOf(independentTest) + 1;
                    int currentOrderDepTestIndex = currentOrderTestList.indexOf(dependentTest);
                    if (currentOrderDepTestIndex < currentOrderIndepTestIndex) {
                        // TODO just delete the dependent test from existance in the DT list
                        throw new RuntimeException(independentTest + " is marked to come AFTER " + dependentTest + " but is currently coming before it.");
                    }
                    currentOrderTestList = currentOrderTestList.subList(currentOrderTestList.indexOf(independentTest) + 1,
                            currentOrderTestList.indexOf(dependentTest));
                    if (currentOrderTestList.size() == 0) {
                        throw new RuntimeException("There are no more tests inbetween " + independentTest + " and " + dependentTest + " in the current order list.");
                    }
                    isOriginalOrder = false;
                    independentTest = dependentTestSolver(currentOrderTestList, independentTest, dependentTest, isOriginalOrder, dependentTestResult);

                    if (autoOrderList.indexOf(dependentTest) > autoOrderList.indexOf(independentTest)) {
                        boolean currentOrder = isTestResultDifferent(dependentTestResult, dependentTest,
                                Arrays.asList(independentTest, dependentTest));
                        if (currentOrder) {
                            // ABCD. D needs to run after A. We just found that B needs to run after D, not true. Instead we just need C before D.
                            // some test in the original order causes dependentTestName to pass
                            List<String> autoSubList = autoOrderList.subList(autoOrderList.indexOf(independentTest),
                                    autoOrderList.indexOf(dependentTest) + 1);
                            if (isTestResultDifferent(dependentTestResult, dependentTest, autoSubList)) {
                                // something is weird, ABCD. D is dependent on B but it is A affecting D.
                                throw new RuntimeException("Unable to solve dependency. Please manually"
                                        + " observe independent test " + dependentTest
                                        + " and dependent test " + independentTest);
                            } else {
                                autoSubList = autoSubList.subList(autoSubList.indexOf(independentTest) + 1,
                                        autoSubList.indexOf(dependentTest));
                                isOriginalOrder = true;
                                independentTest = dependentTestSolver(autoSubList, independentTest,
                                        dependentTest, isOriginalOrder, dependentTestResult);
                            }
                        } else {
                            String temp = independentTest;
                            independentTest = dependentTest;
                            dependentTest = temp;
                        }
                    }
                    printDT(dependentTest, currentOrderFile, dependentTestResult, originalOrderFile, independentTest, isOriginalOrder, allDTList);
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
        indepCheckHelper(allDTList, dtFile, independentTest, dependentTest, isOriginalOrder);
    }

    private static void indepCheckHelper(List<String> allDTList, File dtFile, String independentTest, String dependentTest, boolean isOriginalOrder) {
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

        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter(dtFile);
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
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/2013-08-28T20-44-41.156-0700").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/hi!").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/-1 ms").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/0 ms").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/1 ms").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/10 ms").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/100 ms").delete();
        new File("/home/winglam/workspace/dependent-tests-impact/experiments/crystal/382707 hours 44 min").delete();
    }
}