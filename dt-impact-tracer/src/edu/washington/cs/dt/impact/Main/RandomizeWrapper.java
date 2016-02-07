/**
 * Copyright 2015 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 *         Main class that relies on program arguments to generate a regression testing
 *         execution order. The following options are supported:
 *         -technique - prioritization, selection, parallelization
 *         -coverage - statement, function
 *         -order - absolute, relative, random, original, time (if technique is parallelization)
 *         -resolveDependences - when specified the output test order will not be affected
 *         by dependent tests
 *         -numMachines - integer value (only valid when technique is parallelization
 *         -selectionOldVers - path to directory to older version of program's selectionOutput
 *         (only valid when technique is selection)
 *         -selectionNewVers - path to directory to newer version of program's selectionOutput
 *         (only valid when technique is selection)
 *         -origOrder - path to file containing the original order the tests are executed in
 *         -testInputDir - path to directory to sootTestOutput
 *         -dependentTestFile - path to file containing existing known dependent tests
 *         -filesToDelete - path to file containing list of files to delete to clean the environment
 *         each time the tests are executed
 *         -outputFile - path to file to output the regression test order, dependent test list and
 *         execution time, if unspecified the output will be sent to System.out
 *         -help - display this message
 */

package edu.washington.cs.dt.impact.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.impact.data.TestFunctionStatement;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.tools.CrossReferencer;
import edu.washington.cs.dt.impact.tools.DependentTestFinder;
import edu.washington.cs.dt.impact.tools.FileTools;
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.main.ImpactMain;

public class RandomizeWrapper {

    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        if (argsList.contains("-help")) {
            System.out.println("Main class that relies on program arguments to generate a regression testing "
                    + "execution order. The following options are supported:\n"
                    + "-technique - prioritization, selection, parallelization\n" + "-coverage - statement, function\n"
                    + "-order - absolute, relative, random, original, time (if technique is parallelization)\n"
                    + "-resolveDependences - when specified the output will not be affected " + "by dependent tests\n"
                    + "-numMachines - integer value (only valid when technique is parallelization\n"
                    + "-selectionOldVers - path to directory to older version of program's selectionOutput "
                    + "(only valid when technique is selection)\n"
                    + "-selectionNewVers - path to directory to newer version of program's selectionOutput "
                    + "(only valid when technique is selection)\n"
                    + "-origOrder - path to file containing the original order the tests are executed in\n"
                    + "-testInputDir - path to directory to sootTestOutput\n"
                    + "-dependentTestFile - path to file containing existing known dependent tests\n"
                    + "-filesToDelete - path to file containing list of files to delete to clean the environment "
                    + "each time the tests are executed\n"
                    + "-outputFile - path to file to output the regression test order, dependent test list and "
                    + "execution time, if unspecified the output will be sent to System.out\n"
                    + "-help - display this message\n");
            System.exit(0);
        }

        // get the order
        ORDER order = null;
        int orderIndex = argsList.indexOf("-order");
        if (orderIndex != -1) {
            int orderNameIndex = orderIndex + 1;
            if (orderNameIndex >= argsList.size()) {
                System.err.println("Order argument is specified but valid order was not."
                        + " Please use the format: -order aOrderName");
                System.exit(0);
            }
            String orderStr = argsList.get(orderNameIndex).trim().toLowerCase();
            if (orderStr.equals("random")) {
                order = ORDER.RANDOM;
            } else if (orderStr.equals("original")) {
                order = ORDER.ORIGINAL;
            }
        } else {
            System.err.println("No order argument is specified." + " Please use the format: -order aOrderName");
            System.exit(0);
        }

        // get directory for the input of test files, the default is sootTestOutput
        int testInputDirIndex = argsList.indexOf("-testInputDir");
        File testInputDir = new File(Constants.DEFAULT_TEST_DIR);
        if (testInputDirIndex != -1) {
            int testInputDirNameIndex = testInputDirIndex + 1;
            if (testInputDirNameIndex >= argsList.size()) {
                System.err.println("Test input directory argument is specified but a directory name is not."
                        + " Please use the format: -testInputDir aDirName");
                System.exit(0);
            }
            testInputDir = new File(argsList.get(testInputDirNameIndex));
        } else {
            System.err.println("No test input directory argument is specified."
                    + " Please use the format: -testInputDir aDirectoryPath");
            System.exit(0);
        }

        // if specified, the output is saved to the file name instead of printed to console
        String outputFileName = null;
        int outputFile = argsList.indexOf("-outputFile");
        if (outputFile != -1) {
            // get index of output file
            int outputFileNameIndex = outputFile + 1;
            if (outputFileNameIndex >= argsList.size()) {
                System.err.println("Output file argument is specified but a file name is not."
                        + " Please use the format: -outputFile aFileName");
                System.exit(0);
            }
            outputFileName = argsList.get(outputFileNameIndex);
        }

        // get file for the original order in which the tests should be ordered
        File origOrder = null;
        int origOrderIndex = argsList.indexOf("-origOrder");
        if (origOrderIndex != -1) {
            int origOrderNameIndex = origOrderIndex + 1;
            if (origOrderNameIndex >= argsList.size()) {
                System.err.println("Original order argument is specified but a directory"
                        + " path is not. Please use the format: -origOrder aFilePath");
                System.exit(0);
            }
            origOrder = new File(argsList.get(origOrderNameIndex));
            if (!origOrder.isFile()) {
                System.err.println("Original order argument is specified but the file"
                        + " path is invalid. Please check the file path. Path is: " + argsList.get(origOrderNameIndex));
                System.exit(0);
            }
        } else {
            System.err.println("No original order argument is specified."
                    + " Please use the format: -origOrder aFileName");
            System.exit(0);
        }

        // if specified, the test list generated will consider the dependencies in this file
        List<String> allDTList;
        File dependentTestFile = null;
        int dependentFile = argsList.indexOf("-dependentTestFile");
        if (dependentFile != -1) {
            // get index of output file
            int dependentFileNameIndex = dependentFile + 1;
            if (dependentFileNameIndex >= argsList.size()) {
                System.err.println("Dependent test file argument is specified but a file name is not."
                        + " Please use the format: -dependentTestFile aFileName");
                System.exit(0);
            }
            dependentTestFile = new File(argsList.get(dependentFileNameIndex));
            allDTList = FileTools.parseFileToList(dependentTestFile);
        } else {
            allDTList = null;
        }

        boolean resolveDependences = argsList.contains("-resolveDependences");

        // file containing list of files that should be deleted before the test suite is executed
        // again
        String filesToDeleteStr = null;
        int filesToDeleteIndex = argsList.indexOf("-filesToDelete");
        if (filesToDeleteIndex != -1) {
            int filesToDeleteFileIndex = filesToDeleteIndex + 1;
            if (filesToDeleteFileIndex >= argsList.size()) {
                System.err.println("Files to delete argument is specified but a file name is not."
                        + " Please use the format: -filesToDelete aFileName");
                System.exit(0);
            }
            filesToDeleteStr = argsList.get(filesToDeleteFileIndex);
        }

        int randomTimes = 1;
        int randomTimesIndex = argsList.indexOf("-randomTimes");
        if (randomTimesIndex != -1) {
            int randomTimesIntIndex = randomTimesIndex + 1;
            if (randomTimesIntIndex >= argsList.size()) {
                System.err.println("Number of random times argument is specified but a integer"
                        + " is not. Please use the format: -randomTimes aInteger");
                System.exit(0);
            }
            randomTimes = Integer.parseInt(argsList.get(randomTimesIntIndex));
            if (randomTimes < 1) {
                System.err.println("Number of random times argument is specified but the integer"
                        + " value provided is invalid. Please check the integer value.");
                System.exit(0);
            }
        }

        // TODO handle the case for getting coverage information on tests
        // and how to output to a file.
        boolean getCoverage = false;

        List<String> filesToDelete = FileTools.parseFileToList(new File(filesToDeleteStr));
        List<String> origOrderTestList = FileTools.parseFileToList(origOrder);
        Map<String, RESULT> nameToOrigResults = getCurrentOrderTestListResults(origOrderTestList, filesToDelete);

        // capture start time
        long start = System.nanoTime();
        long TLGTime = System.nanoTime() - start;

        Map<List<String>, String> testListToDTList = new HashMap<>();
        Map<List<String>, Integer> testListToNotFixedDT = new HashMap<>();
        Map<List<String>, Integer> testListToFixedDT = new HashMap<>();
        Map<List<String>, Long> testListToTime = new HashMap<>();
        List<List<String>> testListSorted = new ArrayList<>();
        start = System.nanoTime();

        Random rand = new Random();
        for (int i = 0; i < randomTimes; i++) {
            System.out.println("Iteration: " + i + " / " + randomTimes);
            List<String> origOrderCopy = new ArrayList<>();
            for (String s : origOrderTestList) {
                origOrderCopy.add(s.toString());
            }
            int randomNumToRemove = rand.nextInt(origOrderCopy.size() - 1) + 1;
            for (int j = 0; j < randomNumToRemove; j++) {
                int randomNumSelected = rand.nextInt(origOrderCopy.size());
                origOrderCopy.remove(randomNumSelected);
            }

            Test testObj = new Prioritization(order, outputFileName, COVERAGE.STATEMENT, allDTList, getCoverage,
                    origOrderCopy, testInputDir, true);
            List<String> currentOrderTestList = getCurrentTestList(testObj, 0);

            // ImpactMain
            Map<String, RESULT> nameToTestResults = getCurrentOrderTestListResults(currentOrderTestList, filesToDelete);
            // CrossReferencer
            Set<String> changedTests = CrossReferencer.compareResults(nameToOrigResults, nameToTestResults, false);

            Set<String> fixedDT = new HashSet<>();
            if (resolveDependences) {
                int counter = 0;
                while (!changedTests.isEmpty()) {
                    System.out.println("iteration number: " + counter);
                    counter += 1;
                    String testName = changedTests.iterator().next();
                    fixedDT.add(testName);
                    // DependentTestFinder
                    DependentTestFinder.runDTF(testName, nameToOrigResults.get(testName), currentOrderTestList,
                            origOrderTestList, filesToDelete, allDTList);
                    allDTList = DependentTestFinder.getAllDTs();
                    // TestListGenerator
                    testObj.resetDTList(allDTList);
                    currentOrderTestList = getCurrentTestList(testObj, 0);
                    // ImpactMain
                    nameToTestResults = getCurrentOrderTestListResults(currentOrderTestList, filesToDelete);
                    // Cross Referencer
                    changedTests = CrossReferencer.compareResults(nameToOrigResults, nameToTestResults, false);
                }
            }

            // capture end time
            long runTotal = System.nanoTime() - start;
            testListToTime.put(currentOrderTestList, runTotal);
            testListToNotFixedDT.put(currentOrderTestList, changedTests.size());
            testListToFixedDT.put(currentOrderTestList, fixedDT.size());
            if (allDTList != null) {
                testListToDTList.put(currentOrderTestList, allDTList.toString());
            }
            testListSorted.add(currentOrderTestList);
        }

        FileTools.clearEnv(filesToDelete);
        // TODO add a line depicting the configurations used (technique, number of machines, etc)
        long totalTime = TLGTime;
        long maxTime = Long.MIN_VALUE;
        long testListTime;
        List<String> outputArr = new ArrayList<>();
        for (List<String> testList : testListSorted) {
            testListTime = testListToTime.get(testList);
            totalTime += testListTime;
            maxTime = Math.max(maxTime, testListTime);
            outputArr.add("Execution time (of 1 machine and its iterations): " + testListTime + "\n");
            outputArr.add("Number of tests selected out of total in original order: " + testList.size() + " / "
                    + origOrderTestList.size() + "\n");
            outputArr.add("Number of DTs not fixed: " + testListToNotFixedDT.get(testList) + "\n");
            outputArr.add("Number of DTs fixed: " + testListToFixedDT.get(testList) + "\n");
            outputArr.add("Test order list:\n");
            outputArr.add(testList.toString() + "\n");
            if (testListToDTList.get(testList) != null) {
                outputArr.add("\nDependent test list:\n");
                outputArr.add(testListToDTList.get(testList) + "\n");
            }
            outputArr.add("--------------------------\n");
        }
        outputArr.add("Total time (of all machines and iterations plus initial TestListGenerator): " + totalTime);

        if (outputFileName == null) {
            for (String line : outputArr) {
                System.out.print(line);
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(outputFileName);
                writer = new BufferedWriter(output);
                for (String line : outputArr) {
                    writer.write(line);
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
    }

    private static Map<String, RESULT> getCurrentOrderTestListResults(List<String> currentOrderTestList,
            List<String> filesToDelete) {
        // ImpactMain
        FileTools.clearEnv(filesToDelete);
        TestExecResults results = ImpactMain.getResults(currentOrderTestList);
        return results.getExecutionRecords().get(0).getNameToResultsMap();
    }

    private static List<String> getCurrentTestList(Test testObj, int numOfMachines) {
        // TestListGenerator
        List<String> currentOrderTestList = new LinkedList<String>();
        for (TestFunctionStatement tfs : testObj.getResults(numOfMachines)) {
            currentOrderTestList.add(tfs.getName());
        }
        return currentOrderTestList;
    }
}
