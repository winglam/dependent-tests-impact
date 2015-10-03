/**
 * Copyright 2015 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Main class that relies on user inputs to generate a regression testing
 * execution order. The following options are supported:
 * Technique - prioritization, selection, parallelization
 * Coverage - statement, function
 * Order - absolute, relative, random, original
 * Whether the test order generated will be dependent test free or not - yes, no
 */
package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;
import edu.washington.cs.dt.main.ImpactMain;

public class UserInputWrapper {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // get the technique
        System.out.println("What regression testing technique would you like to evaluate?");
        String techniqueStr = reader.nextLine().toLowerCase().trim();
        TECHNIQUE techniqueName = null;
        while (techniqueName == null) {
            if (techniqueStr.equals("prioritization")) {
                techniqueName = TECHNIQUE.PRIORITIZATION;
            } else if (techniqueStr.equals("selection")) {
                techniqueName = TECHNIQUE.SELECTION;
            } else if (techniqueStr.equals("parallelization")) {
                techniqueName = TECHNIQUE.PARALLELIZATION;
            } else {
                System.err.println(
                        "Technique name is invalid. Please input a valid regression testing technique.\n"
                                + "Try \"prioritization\", \"selection\" or \"parallelization\".");
                techniqueStr = reader.nextLine().toLowerCase().trim();
            }
        }

        int numOfMachines = 0;
        if (techniqueName == TECHNIQUE.PARALLELIZATION) {
            System.out.println("Since you've selected parallelization as your technique,\n"
                    + "how many machines would you like the tests to be partitioned to?");
            numOfMachines = reader.nextInt();
            while (numOfMachines < 0) {
                System.err.println("The number of machines is invalid. Please"
                        + " input a number greater than 0.");
                numOfMachines = reader.nextInt();
            }
        }

        File selectionOutput1 = null;
        File selectionOutput2 = null;
        if (techniqueName == TECHNIQUE.SELECTION) {
            // get directory of old version's selection output
            System.out.println("Since you've selected selection as your technique,\n"
                    + "where is the old version's selection output?");
            String selectionOutput1Str = reader.nextLine().toLowerCase().trim();
            while (selectionOutput1 == null || !selectionOutput1.isDirectory()) {
                selectionOutput1 = new File(selectionOutput1Str);
                if (!selectionOutput1.isDirectory()) {
                    System.err.println("The path for the old version's selection output"
                            + " is invalid. Please check the file path.");
                    selectionOutput1Str = reader.nextLine().toLowerCase().trim();
                }
            }

            // get directory of old version's selection output
            System.out.println("Since you've selected selection as your technique,\n"
                    + "where is the new version's selection output?");
            String selectionOutput2Str = reader.nextLine().toLowerCase().trim();
            while (selectionOutput2 == null || !selectionOutput2.isDirectory()) {
                selectionOutput2 = new File(selectionOutput2Str);
                if (!selectionOutput2.isDirectory()) {
                    System.err.println("The path for the new version's selection output"
                            + " is invalid. Please check the file path.");
                    selectionOutput2Str = reader.nextLine().toLowerCase().trim();
                }
            }
        }

        // get the coverage
        System.out.println("What coverage would you like?");
        String coverageStr = reader.nextLine().toLowerCase().trim();
        COVERAGE coverage = null;
        while (coverage == null) {
            if (coverageStr.equals("statement")) {
                coverage = COVERAGE.STATEMENT;
            } else if (coverageStr.equals("function")) {
                coverage = COVERAGE.FUNCTION;
            } else {
                System.err.println("Coverage is invalid. Please input a valid coverage.\n"
                        + "Try \"statement\" or \"function\".");
                coverageStr = reader.nextLine().toLowerCase().trim();
            }
        }

        // get the order
        System.out.println("What order would you like?");
        String orderStr = reader.nextLine().toLowerCase().trim();
        ORDER order = null;
        File timeOrder = null;
        File origOrder = null;
        while (order == null) {
            if (orderStr.equals("absolute")) {
                order = ORDER.ABSOLUTE;
            } else if (orderStr.equals("relative")) {
                order = ORDER.RELATIVE;
            } else if (orderStr.equals("random")) {
                order = ORDER.RANDOM;
            } else if (orderStr.equals("original")) {
                order = ORDER.ORIGINAL;

                // get file for the original order in which the tests should be ordered
                System.out.println(
                        "Since you've selected original order, where is the original order file located?");
                String origOrderStr = reader.nextLine().toLowerCase().trim();
                while (origOrder == null || !origOrder.isFile() || !origOrder.exists()) {
                    origOrder = new File(origOrderStr);
                    if (!origOrder.isFile() || !origOrder.exists()) {
                        System.err.println("Original order was specified but the file"
                                + " path is invalid. Please check the file path.");
                        origOrderStr = reader.nextLine().toLowerCase().trim();
                    }
                }
            } else if (orderStr.equals("time") && techniqueName == TECHNIQUE.PARALLELIZATION) {
                order = ORDER.TIME;

                // get file for the time each test took to run
                System.out.println(
                        "Since you've selected time order, where is the file containing the time each test took to execute?");
                String timeOrderStr = reader.nextLine().toLowerCase().trim();
                while (timeOrder == null || !timeOrder.isFile() || !timeOrder.exists()) {
                    timeOrder = new File(timeOrderStr);
                    if (!timeOrder.isFile() || !timeOrder.exists()) {
                        System.err.println("Time order was specified but the time order file"
                                + " path is invalid. Please check the file path.");
                        timeOrderStr = reader.nextLine().toLowerCase().trim();
                    }
                }
            } else {
                System.err.println("Order is invalid. Please input a valid order.\n"
                        + "Try \"absolute\", \"relative\", \"random\", or \"original\".\n"
                        + "If your technique is parallelization then \"time\" is also valid.");
                orderStr = reader.nextLine().toLowerCase().trim();
            }
        }

        if (origOrder == null) {
            // get file for the original order
            System.out.println("What is the path to the original order file?");
            String origOrderStr = reader.nextLine().toLowerCase().trim();
            while (origOrder == null || !origOrder.isFile() || !origOrder.exists()) {
                origOrder = new File(origOrderStr);
                if (!origOrder.isFile() || !origOrder.exists()) {
                    System.err.println("The path for the original order file"
                            + " is invalid. Please check the file path.");
                    origOrderStr = reader.nextLine().toLowerCase().trim();
                }
            }
        }

        System.out.println("What is the path to the test input directory (sootTestOutput)?");
        String testInputDirStr = reader.nextLine().toLowerCase().trim();
        File testInputDir = null;
        while (testInputDir == null || !testInputDir.isDirectory()) {
            testInputDir = new File(testInputDirStr);
            if (!testInputDir.isDirectory()) {
                System.err.println("The path for the test input directory"
                        + " is invalid. Please check the file path.");
                testInputDirStr = reader.nextLine().toLowerCase().trim();
            }
        }

        // if specified, the test list generated will consider the dependencies in this file
        System.out.println("What is the path to the file containing known dependent tests?\n"
                + "If you would like to omit providing such file, please type \"none\".");
        String dependentTestFileStr = reader.nextLine().toLowerCase().trim();
        File dependentTestFile = null;
        while ((dependentTestFile == null || !dependentTestFile.isFile() || !dependentTestFile.exists())
                && !dependentTestFileStr.toLowerCase().trim().equals("none")) {
            dependentTestFile = new File(dependentTestFileStr);
            if (!dependentTestFile.isFile() || !dependentTestFile.exists()) {
                System.err.println("The path for the dependent test file"
                        + " is invalid.\nPlease check the file path"
                        + " or type \"none\" to proceed without providing one.");
                dependentTestFileStr = reader.nextLine().toLowerCase().trim();
            }
        }
        List<String> allDTList;
        if (!dependentTestFileStr.toLowerCase().trim().equals("none")) {
            allDTList = FileTools.parseFileToList(dependentTestFile);
        } else {
            allDTList = null;
        }

        System.out.println("Would you like us to resolve any test dependences that may arise\n"
                + "from using regression testing? (y/n)");
        String resolveDependencesStr = reader.nextLine().toLowerCase().trim();
        boolean resolveDependences = false;
        while ((!resolveDependencesStr.equals("y") || !resolveDependencesStr.equals("n")) && !resolveDependences) {
            if (resolveDependencesStr.equals("y")) {
                resolveDependences = true;
            } else if (resolveDependencesStr.equals("n")) {
                resolveDependences = false;
            } else {
                System.err.println("The response is invalid. Please enter \"y\" or \"n\".");
                resolveDependencesStr = reader.nextLine().toLowerCase().trim();
            }
        }

        // file containing list of files that should be deleted before the test suite is executed
        // again
        System.out.println("What is the path to the file containing the list of files to delete before"
                + " executing the test suite again?");
        String filesToDeleteStr = reader.nextLine().toLowerCase().trim();
        File filesToDeleteFile = null;
        while (filesToDeleteFile == null || !filesToDeleteFile.isFile() || !filesToDeleteFile.exists()) {
            filesToDeleteFile = new File(filesToDeleteStr);
            if (!filesToDeleteFile.isFile() || !filesToDeleteFile.exists()) {
                System.err.println("The path for the list of files to delete"
                        + " is invalid.\nPlease check the file path.");
                filesToDeleteStr = reader.nextLine().toLowerCase().trim();
            }
        }

        reader.close();

        // TODO handle the case for getting coverage information on tests
        // and how to output to a file.
        String outputFileName = null;
        boolean getCoverage = false;
        // boolean getCoverage = false;
        // if (techniqueName == TECHNIQUE.PRIORITIZATION) {
        // getCoverage = argsList.indexOf("-getCoverage") != -1;
        // }
        //
        // // if specified, the output is saved to the file name instead of printed to console
        // String outputFileName = null;
        // int outputFile = argsList.indexOf("-outputFile");
        // if (outputFile != -1) {
        // // get index of output file
        // int outputFileNameIndex = outputFile + 1;
        // if (outputFileNameIndex >= argsList.size()) {
        // System.err.println("Output file argument is specified but a file name is not."
        // + " Please use the format: -outputFile aFileName");
        // System.exit(0);
        // }
        // outputFileName = argsList.get(outputFileNameIndex);
        // }
        //

        List<String> origOrderTestList = FileTools.parseFileToList(origOrder);
        TestExecResults origResults = ImpactMain.getResults(origOrderTestList);
        Map<String, RESULT> nameToOrigResults = origResults.getExecutionRecords().get(0)
                .getNameToResultsMap();

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
            List<String> filesToDelete = FileTools.parseFileToList(filesToDeleteFile);
            int counter = 0;
            while (!changedTests.isEmpty()) {
                System.out.println("iteration number: " + counter);
                String testName = changedTests.iterator().next();
                DependentTestFinder.runDTF(testName, nameToOrigResults.get(testName),
                        currentOrderTestList, origOrderTestList, filesToDelete, allDTList);
                allDTList = DependentTestFinder.getAllDTs();
                testObj.resetDTList(allDTList);
                currentOrderTestList = getCurrentTestList(testObj);
                nameToTestResults = getCurrentOrderTestListResults(currentOrderTestList);
                changedTests = CrossReferencer.compareResults(nameToOrigResults, nameToTestResults,
                        !resolveDependences);
                counter += 1;
            }
            System.out.println("Test order list:");
            System.out.println(currentOrderTestList.toString());
            System.out.println("\nDependent test list:");
            System.out.println(allDTList.toString());
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
