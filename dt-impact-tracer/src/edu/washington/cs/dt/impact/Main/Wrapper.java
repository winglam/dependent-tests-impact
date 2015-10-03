/**
 * Copyright 2015 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Main class that relies on program arguments to generate a regression testing
 * execution order. The following options are supported:
 * -technique - prioritization, selection, parallelization
 * -coverage - statement, function
 * -order - absolute, relative, random, original, time (if technique is parallelization)
 * -resolveDependences - when specified the output test order will not be affected 
 * by dependent tests
 * -numMachines - integer value (only valid when technique is parallelization
 * -selectionOldVers - path to directory to older version of program's selectionOutput
 * (only valid when technique is selection)
 * -selectionNewVers - path to directory to newer version of program's selectionOutput
 * (only valid when technique is selection)
 * -origOrder - path to file containing the original order the tests are executed in
 * -testInputDir - path to directory to sootTestOutput
 * -dependentTestFile - path to file containing existing known dependent tests
 * -filesToDelete - path to file containing list of files to delete to clean the environment
 * each time the tests are executed
 * -outputFile - path to file to output the regression test order, dependent test list and
 * execution time, if unspecified the output will be sent to System.out
 * -help - display this message
 */

package edu.washington.cs.dt.impact.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.impact.data.TestFunctionStatement;
import edu.washington.cs.dt.impact.technique.Parallelization;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Selection;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.tools.CrossReferencer;
import edu.washington.cs.dt.impact.tools.DependentTestFinder;
import edu.washington.cs.dt.impact.tools.FileTools;
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;
import edu.washington.cs.dt.main.ImpactMain;

public class Wrapper {

    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        if (argsList.contains("-help")) {
            System.out.println(
                    "Main class that relies on program arguments to generate a regression testing "
                    + "execution order. The following options are supported:\n"
                    + "-technique - prioritization, selection, parallelization\n"
                    + "-coverage - statement, function\n"
                    + "-order - absolute, relative, random, original, time (if technique is parallelization)\n"
                    + "-resolveDependences - when specified the output will not be affected "
                    + "by dependent tests\n"
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

        // get the technique
        TECHNIQUE techniqueName = null;
        int techniqueIndex = argsList.indexOf("-technique");
        if (techniqueIndex != -1) {
            // get index of technique name
            int techniqueNameIndex = techniqueIndex + 1;
            if (techniqueNameIndex >= argsList.size()) {
                System.err
                .println("Technique argument is specified but technique name is not."
                        + " Please use the format: -technique aTechniqueName");
                System.exit(0);
            }

            String techniqueStr = argsList.get(techniqueNameIndex).toLowerCase().trim();
            if (techniqueStr.equals("prioritization")) {
                techniqueName = TECHNIQUE.PRIORITIZATION;
            } else if (techniqueStr.equals("selection")) {
                techniqueName = TECHNIQUE.SELECTION;
            } else if (techniqueStr.equals("parallelization")) {
                techniqueName = TECHNIQUE.PARALLELIZATION;
            } else {
                System.err
                .println("Technique name is invalid. Try \"prioritization\","
                        + " \"selection\" or \"parallelization\".");
                System.exit(0);
            }
        } else {
            System.err.println("No technique argument is specified."
                    + " Please use the format: -technique aTechniqueName");
            System.exit(0);
        }

        // get the coverage
        COVERAGE coverage= null;
        int coverageIndex = argsList.indexOf("-coverage");
        if (coverageIndex != -1) {
            int coverageNameIndex = coverageIndex + 1;
            if (coverageNameIndex >= argsList.size()) {
                System.err
                .println("Coverage argument is specified but valid coverage was not."
                        + " Please use the format: -coverage aCoverageName");
                System.exit(0);
            }
            String coverageStr = argsList.get(coverageNameIndex).trim().toLowerCase();
            if (coverageStr.equals("statement")) {
                coverage = COVERAGE.STATEMENT;
            } else if (coverageStr.equals("function")) {
                coverage = COVERAGE.FUNCTION;
            } else {
                System.err
                .println("Coverage is invalid. Try \"statement\", \"branch\" or \"function\".");
                System.exit(0);
            }
        }else {
            System.err.println("No coverage argument is specified."
                    + " Please use the format: -coverage aCoverageName");
            System.exit(0);
        }

        // get the order
        File timeOrder = null;
        ORDER order = null;
        int orderIndex = argsList.indexOf("-order");
        if (orderIndex != -1) {
            int orderNameIndex = orderIndex + 1;
            if (orderNameIndex >= argsList.size()) {
                System.err
                .println("Order argument is specified but valid order was not."
                        + " Please use the format: -order aOrderName");
                System.exit(0);
            }
            String orderStr = argsList.get(orderNameIndex).trim().toLowerCase();
            if (orderStr.equals("absolute")) {
                order = ORDER.ABSOLUTE;
            } else if (orderStr.equals("relative")) {
                order = ORDER.RELATIVE;
            } else if (orderStr.equals("random")) {
                order = ORDER.RANDOM;
            } else if (orderStr.equals("original")) {
                order = ORDER.ORIGINAL;
            } else if (orderStr.equals("time") && techniqueName == TECHNIQUE.PARALLELIZATION) {
                int timeOrderIndex = argsList.indexOf("-timeOrder");
                if (timeOrderIndex != -1) {
                    // get file for the time each test took
                    int timeOrderNameIndex = timeOrderIndex + 1;
                    if (timeOrderNameIndex >= argsList.size()) {
                        System.err.println("Time order argument is specified but a directory path"
                                + " is not. Please use the format: -timeOrder aFilePath");
                        System.exit(0);
                    }
                    timeOrder = new File(argsList.get(timeOrderNameIndex));
                    if (!timeOrder.isFile()) {
                        System.err.println("Time order argument is specified but the file path"
                                + " is invalid. Please check the file path.");
                        System.exit(0);
                    }
                    order = ORDER.TIME;
                } else {
                    System.err.println("Time is specified as the order but no -timeOrder is "
                            + " supplied. Please add -timeOrder aFilePath argument.");
                    System.exit(0);
                }
            } else {
                System.err.println("Order is invalid. Please input a valid order.\n"
                        + "Try \"absolute\", \"relative\", \"random\", or \"original\".\n"
                        + "If your technique is parallelization then \"time\" is also valid.");
                System.exit(0);
            }
        } else {
            System.err.println("No order argument is specified."
                    + " Please use the format: -order aOrderName");
            System.exit(0);
        }

        // get directory for the input of test files, the default is sootTestOutput
        int testInputDirIndex = argsList.indexOf("-testInputDir");
        File testInputDir = new File(Constants.DEFAULT_TEST_DIR);
        if (testInputDirIndex != -1) {
            int testInputDirNameIndex = testInputDirIndex + 1;
            if (testInputDirNameIndex >= argsList.size()) {
                System.err
                .println("Test input directory argument is specified but a directory name is not."
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
                System.err
                .println("Output file argument is specified but a file name is not."
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
                        + " path is invalid. Please check the file path.");
                System.exit(0);
            }
        } else {
            System.err.println("No original order argument is specified."
                    + " Please use the format: -origOrder aFileName");
            System.exit(0);
        }

        File selectionOutput1 = null;
        File selectionOutput2 = null;
        if (techniqueName == TECHNIQUE.SELECTION) {
            // get directory of old version's selection output
            int oldVersCFGIndex = argsList.indexOf("-oldVersCFG");
            if (oldVersCFGIndex != -1) {
                int oldVersCFGNameIndex = oldVersCFGIndex + 1;
                if (oldVersCFGNameIndex >= argsList.size()) {
                    System.err.println("Old version CFG argument is specified but a directory"
                            + " path is not. Please use the format: -oldVersCFG aDirPath");
                    System.exit(0);
                }
                selectionOutput1 = new File(argsList.get(oldVersCFGNameIndex));
                if (!selectionOutput1.isDirectory()) {
                    System.err.println("Old version CFG argument is specified but the directory"
                            + " path is invalid. Please check the directory path.");
                    System.exit(0);
                }
            } else {
                System.err.println("No old version CFG argument is specified."
                        + " Please use the format: -oldVersCFG aDirPath");
                System.exit(0);
            }

            // get directory of new version's selection output
            int newVersCFGIndex = argsList.indexOf("-newVersCFG");
            if (newVersCFGIndex != -1) {
                int newVersCFGNameIndex = newVersCFGIndex + 1;
                if (newVersCFGNameIndex >= argsList.size()) {
                    System.err.println("New version CFG argument is specified but a directory"
                            + " path is not. Please use the format: -newVersCFG aDirPath");
                    System.exit(0);
                }
                selectionOutput2 = new File(argsList.get(newVersCFGNameIndex));
                if (!selectionOutput2.isDirectory()) {
                    System.err.println("New version CFG argument is specified but the directory"
                            + " path is invalid. Please check the directory path.");
                    System.exit(0);
                }
            } else {
                System.err.println("No new version CFG argument is specified."
                        + " Please use the format: -newVersCFG aDirPath");
                System.exit(0);
            }
        }

        int numOfMachines = 1;
        if (techniqueName == TECHNIQUE.PARALLELIZATION) {
            int numOfMachinesIndex = argsList.indexOf("-numOfMachines");
            if (numOfMachinesIndex != -1) {
                int numOfMachinesIntIndex = numOfMachinesIndex + 1;
                if (numOfMachinesIntIndex >= argsList.size()) {
                    System.err.println("Number of machines argument is specified but a integer"
                            + " is not. Please use the format: -numOfMachines aInteger");
                    System.exit(0);
                }
                numOfMachines = Integer.parseInt(argsList.get(numOfMachinesIntIndex));
                if (numOfMachines < 1) {
                    System.err.println("Number of machines argument is specified but the integer"
                            + " value provided is invalid. Please check the integer value.");
                    System.exit(0);
                }
            }
        }

        // if specified, the test list generated will consider the dependencies in this file
        List<String> allDTList;
        File dependentTestFile = null;
        int dependentFile = argsList.indexOf("-dependentTestFile");
        if (dependentFile != -1) {
            // get index of output file
            int dependentFileNameIndex = dependentFile + 1;
            if (dependentFileNameIndex >= argsList.size()) {
                System.err
                .println("Dependent test file argument is specified but a file name is not."
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
                System.err
                .println("Files to delete argument is specified but a file name is not."
                        + " Please use the format: -filesToDelete aFileName");
                System.exit(0);
            }
            filesToDeleteStr = argsList.get(filesToDeleteFileIndex);
        }

        // TODO handle the case for getting coverage information on tests
        // and how to output to a file.
        boolean getCoverage = false;

        List<String> origOrderTestList = FileTools.parseFileToList(origOrder);
        TestExecResults origResults = ImpactMain.getResults(origOrderTestList);
        Map<String, RESULT> nameToOrigResults = origResults.getExecutionRecords().get(0)
                .getNameToResultsMap();
        List<String> filesToDelete = FileTools.parseFileToList(new File(filesToDeleteStr));
        FileTools.clearEnv(filesToDelete);

        // capture start time
        long start = System.nanoTime();

        // TestListGenerator
        Test testObj = null;
        if (techniqueName == TECHNIQUE.PRIORITIZATION) {
            testObj = new Prioritization(order, outputFileName, testInputDir, coverage,
                    dependentTestFile, getCoverage, origOrder);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            testObj = new Selection(order, outputFileName, testInputDir, coverage, selectionOutput1,
                    selectionOutput2, origOrder, dependentTestFile);
        } else if (techniqueName == TECHNIQUE.PARALLELIZATION) {
            testObj = new Parallelization(order, outputFileName, testInputDir, coverage,
                    dependentTestFile, numOfMachines, origOrder, timeOrder);
        } else {
            System.err.println(
                    "The regression testing technique selected is invalid. Please restart the"
                            + " program and try again.");
            System.exit(0);
        }
        List<String> currentOrderTestList = getCurrentTestList(testObj);
        // ImpactMain
        Map<String, RESULT> nameToTestResults = getCurrentOrderTestListResults(
                currentOrderTestList);
        // CrossReferencer
        Set<String> changedTests = CrossReferencer.compareResults(nameToOrigResults,
                nameToTestResults, !resolveDependences);

        if (resolveDependences) {
            int counter = 0;
            while (!changedTests.isEmpty()) {
                System.out.println("iteration number: " + counter);
                counter += 1;
                String testName = changedTests.iterator().next();
                // DependentTestFinder
                DependentTestFinder.runDTF(testName, nameToOrigResults.get(testName),
                        currentOrderTestList, origOrderTestList, filesToDelete, allDTList);
                allDTList = DependentTestFinder.getAllDTs();
                // TestListGenerator
                testObj.resetDTList(allDTList);
                currentOrderTestList = getCurrentTestList(testObj);
                // ImpactMain
                nameToTestResults = getCurrentOrderTestListResults(currentOrderTestList);
                // Cross Referencer
                changedTests = CrossReferencer.compareResults(nameToOrigResults, nameToTestResults,
                        !resolveDependences);
            }
        }

        // capture end time
        long total = System.nanoTime() - start;

        FileTools.clearEnv(filesToDelete);
        if (outputFileName == null) {
            System.out.println("Execution time: " + total);
            System.out.println("Test order list:");
            System.out.println(currentOrderTestList.toString());
            if (allDTList != null) {
                System.out.println("\nDependent test list:");
                System.out.println(allDTList.toString());
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(outputFileName);
                writer = new BufferedWriter(output);
                writer.write("Execution time: " + total + "\n");
                writer.write("Test order list:\n");
                writer.write(currentOrderTestList.toString() + "\n");
                if (allDTList != null) {
                    writer.write("\nDependent test list:\n");
                    writer.write(allDTList.toString() + "\n");
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

        // Inputs:
        // ClearEnv list of files
        // $experiment $experimentCP $testType $dependentFree

        // start timer

        // need to generate test order with TestListGenerator
        // clearEnv
        // Run ImpactMain
        // CrossReferencer

        // if $dependentFree is true
        // while there are dependent tests
        // DTFinder
        // TestListGenerator
        // ImpactMain
        // CrossReferencer
        // end timer
        // output file with all DT chains
        // output results

        // end timer
        // output results
    }

    private static Map<String, RESULT> getCurrentOrderTestListResults(
            List<String> currentOrderTestList) {
        // ImpactMain
        TestExecResults results = ImpactMain.getResults(currentOrderTestList);
        return results.getExecutionRecords().get(0).getNameToResultsMap();
    }

    private static List<String> getCurrentTestList(Test testObj) {
        // TestListGenerator
        List<String> currentOrderTestList = new LinkedList<String>();
        for (TestFunctionStatement tfs : testObj.getResults()) {
            currentOrderTestList.add(tfs.getName());
        }
        return currentOrderTestList;
    }
}
