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
import java.util.Scanner;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.runners.AbstractTestRunner;
import edu.washington.cs.dt.runners.FixedOrderRunner;

public class DependentTestFinder {

    private static String ORDER_FILE = "/home/winglam/workspace/dependent-tests-impact/experiments/crystal/crystal-auto-order";
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

        Scanner s = null;
        try {
            s = new Scanner(new File(ORDER_FILE));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        List<String> autoOrderList = new LinkedList<String>();
        while (s.hasNextLine()){
            autoOrderList.add(s.nextLine());
        }
        s.close();


        //        while (isOriginalOrder && autoOrderList.indexOf(dependentTestName)
        //                < autoOrderList.indexOf(independentTestName)) {
        //            //TODO look inside current list and find a test between the two that is causing dependentTestName to be dependent
        //            //     if test is suppose to be between the two then do what you do below this
        //            tests = fullTests.subList(fullTests.indexOf(independentTestName), fullTests.indexOf(dependentTestName));
        //        }
        //
        if (!isOriginalOrder && autoOrderList.indexOf(dependentTestName)
                > autoOrderList.indexOf(independentTestName)) {
            boolean currentOrder = !isTestResultDifferent(dependentTestResult, dependentTestName,
                    Arrays.asList(independentTestName, dependentTestName));
            if (!currentOrder) {
                // some test in the original order causes dependentTestName to pass
                tests = parseFileToList(originalOrderFile);
                tests = tests.subList(tests.indexOf(independentTestName),
                        tests.indexOf(dependentTestName) + 1);
                if (isTestResultDifferent(dependentTestResult, dependentTestName, tests)) {
                    // TODO something is weird, ABCD. D is dependent on B but it is A affecting D.
                    throw new RuntimeException("Unable to solve dependency. Please manually"
                            + " observe independent test " + independentTestName
                            + " and dependent test " + dependentTestName);
                } else {
                    tests = tests.subList(tests.indexOf(independentTestName) + 1,
                            tests.indexOf(dependentTestName));
                    independentTestName = dependentTestSolver(tests, independentTestName,
                            dependentTestName, true, dependentTestResult);
                }
            }
            String temp = independentTestName;
            independentTestName = dependentTestName;
            dependentTestName = temp;
        }


        if (isOriginalOrder && autoOrderList.indexOf(dependentTestName)
                < autoOrderList.indexOf(independentTestName)) {
            throw new RuntimeException(independentTestName
                    + " should not come BEFORE " + dependentTestName);
        }

        printDT(dependentTestName, independentTestName, isOriginalOrder);
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
        List<String> tests = new LinkedList<String>();
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

    private static void printDT(String dependentTest,
            String independentTest, boolean isOriginalOrder) {
        File dtFile = new File(DT_FILE);
        FileWriter output = null;
        BufferedWriter writer = null;
        Scanner s = null;
        try {
            s = new Scanner(dtFile);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        List<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();

        try {
            int testIndex = list.indexOf("Test: " + dependentTest);
            if (testIndex != -1) {
                if (isOriginalOrder) {
                    testIndex += 2;
                } else {
                    testIndex += 4;
                }
                String testList = list.get(testIndex);
                char[] buf = testList.toCharArray();

                String tests = testList.substring(22, testList.length() - 1);
                List<String> testsList = Arrays.asList(tests.split(", "));
                if (testsList.contains(independentTest)) {
                    if (isOriginalOrder) {
                        // ABC. C depends on A but B is causing C to fail. Move C instead of B to get ACB.
                        throw new RuntimeException(independentTest + " is already marked"
                                + " as a BEFORE dependent test of " + dependentTest);
                    } else {
                        throw new RuntimeException(independentTest + " is already marked"
                                + " as a AFTER dependent test of " + dependentTest);
                    }
                }

                if (buf.length > 23) {
                    list.set(testIndex, String.valueOf(buf, 0, buf.length - 1)
                            + ", " + independentTest + "]");
                } else {
                    list.set(testIndex, String.valueOf(buf, 0, buf.length - 1)
                            + independentTest + "]");
                }

                output = new FileWriter(dtFile);
                writer = new BufferedWriter(output);

                for (int j = 0; j < list.size(); j++) {
                    writer.write(list.get(j) + "\n");
                }
            } else {
                output = new FileWriter(dtFile, true);
                writer = new BufferedWriter(output);
                writer.write("Test: " + dependentTest + "\n");
                writer.write("Intended behavior: FAILURE\n");
                if (isOriginalOrder) {
                    writer.write("when executed after: [" + independentTest + "]\n");
                } else {
                    writer.write("when executed after: []\n");
                }
                writer.write("The revealed different behavior: PASS\n");
                if (!isOriginalOrder) {
                    writer.write("when executed after: [" + independentTest + "]\n\n");
                } else {
                    writer.write("when executed after: []\n\n");
                }
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