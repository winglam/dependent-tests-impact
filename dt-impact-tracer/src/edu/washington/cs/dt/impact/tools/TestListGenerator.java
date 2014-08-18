/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Generates a regression testing order based on the arguments provided.
 */
package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.technique.Parallelization;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Selection;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;

public class TestListGenerator {

    public static void main(String[] args) {
        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

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
        }

        // get the order
        ORDER order = null;
        int orderIndex = argsList.indexOf("-order");
        if (orderIndex != -1) {
            int coverageNameIndex = orderIndex + 1;
            if (coverageNameIndex >= argsList.size()) {
                System.err
                .println("Order argument is specified but valid order was not."
                        + " Please use the format: -order aOrderName");
                System.exit(0);
            }
            String coverageStr = argsList.get(coverageNameIndex).trim().toLowerCase();
            if (coverageStr.equals("absolute")) {
                order = ORDER.ABSOLUTE;
            } else if (coverageStr.equals("relative")) {
                order = ORDER.RELATIVE;
            } else if (coverageStr.equals("random")) {
                order = ORDER.RANDOM;
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

        // if specified, the test list generated will consider the dependencies in this file
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
        }

        boolean getCoverage = false;
        if (techniqueName == TECHNIQUE.PRIORITIZATION) {
            getCoverage = argsList.indexOf("-getCoverage") != -1;
        }

        File selectionOutput1 = null;
        File selectionOutput2 = null;
        File origOrder = null;
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

            // get file for the original order in which the tests should be ordered
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
                order = ORDER.ORIGINAL;
            }
        }

        int numOfMachines = 1;
        File timeOrder = null;
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

            int timeOrderIndex = argsList.indexOf("-timeOrder");
            int origOrderIndex = argsList.indexOf("-origOrder");
            if (origOrderIndex != -1) {
                // get file for the original order in which the tests should be ordered
                int origOrderNameIndex = origOrderIndex + 1;
                if (origOrderNameIndex >= argsList.size()) {
                    System.err.println("Original order argument is specified but a directory"
                            + " path is not. Please use the format: -origOrder aFilePath");
                    System.exit(0);
                }
                origOrder = new File(argsList.get(origOrderNameIndex));
                if (!origOrder.isFile()) {
                    System.err.println("Original order argument is specified but the file path"
                            + " is invalid. Please check the file path.");
                    System.exit(0);
                }
                order = ORDER.ORIGINAL;
            } else if (timeOrderIndex != -1) {
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
            }
        }

        Test testObj = null;
        if (techniqueName == TECHNIQUE.PRIORITIZATION) {
            testObj = new Prioritization(order, outputFileName, testInputDir, coverage,
                    dependentTestFile, getCoverage);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            testObj = new Selection(order, outputFileName, testInputDir, coverage,
                    selectionOutput1, selectionOutput2, origOrder, dependentTestFile);
        } else if (techniqueName == TECHNIQUE.PARALLELIZATION) {
            testObj = new Parallelization(order, outputFileName, testInputDir, coverage,
                    dependentTestFile, numOfMachines, origOrder, timeOrder);
        }

        testObj.printResults();
    }
}