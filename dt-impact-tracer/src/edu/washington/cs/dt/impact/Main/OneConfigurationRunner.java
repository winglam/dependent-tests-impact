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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.data.WrapperTestList;
import edu.washington.cs.dt.impact.technique.Parallelization;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Selection;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.tools.CrossReferencer;
import edu.washington.cs.dt.impact.tools.DependentTestFinder;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;

public class OneConfigurationRunner extends Runner {

    public static void main(String[] args) {
        parseArgs(args);

        Map<String, RESULT> nameToOrigResults = getCurrentOrderTestListResults(origOrderTestList, filesToDelete);

        // capture start time
        double start = System.nanoTime();

        // TestListGenerator
        Test testObj = null;
        if (techniqueName == TECHNIQUE.PRIORITIZATION) {
            testObj = new Prioritization(order, outputFileName, testInputDir, coverage, dependentTestFile, false,
                    origOrder);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            testObj = new Selection(order, outputFileName, testInputDir, coverage, selectionOutput1, selectionOutput2,
                    origOrder, dependentTestFile, getCoverage);
        } else if (techniqueName == TECHNIQUE.PARALLELIZATION) {
            testObj = new Parallelization(order, outputFileName, testInputDir, coverage, dependentTestFile,
                    numOfMachines.getValue(), origOrder, timeOrder, getCoverage, origOrderTestList);
        } else {
            System.err.println("The regression testing technique selected is invalid. Please restart the"
                    + " program and try again.");
            System.exit(0);
        }

        TLGTime = System.nanoTime() - start;

        listTestList = new ArrayList<>();
        for (int i = 0; i < numOfMachines.getValue(); i++) {
            start = System.nanoTime();

            WrapperTestList testList = new WrapperTestList();
            List<String> currentOrderTestList = getCurrentTestList(testObj, i);
            // ImpactMain
            Map<String, RESULT> nameToTestResults = getCurrentOrderTestListResults(currentOrderTestList, filesToDelete);
            // CrossReferencer
            Set<String> changedTests = CrossReferencer.compareResults(nameToOrigResults, nameToTestResults, false);

            Set<String> fixedDT = new HashSet<>();
            if (resolveDependences) {
                int counter = 0;
                while (!changedTests.isEmpty()) {
                    String testName = changedTests.iterator().next();
                    while (!currentOrderTestList.contains(testName)) {
                        testName = changedTests.iterator().next();
                    }

                    System.out.println("Nullifying DTs iteration number / possible iterations left: " + counter + " / "
                            + changedTests.size());
                    counter += 1;

                    fixedDT.add(testName);
                    // DependentTestFinder
                    DependentTestFinder.runDTF(testName, nameToOrigResults.get(testName), currentOrderTestList,
                            origOrderTestList, filesToDelete, allDTList);
                    allDTList = DependentTestFinder.getAllDTs();
                    // TestListGenerator
                    testObj.resetDTList(allDTList);
                    currentOrderTestList = getCurrentTestList(testObj, i);
                    // ImpactMain
                    nameToTestResults = getCurrentOrderTestListResults(currentOrderTestList, filesToDelete);
                    // Cross Referencer
                    changedTests = CrossReferencer.compareResults(nameToOrigResults, nameToTestResults, false);
                }
            }

            // capture end time
            double runTotal = System.nanoTime() - start;
            testList.setNullifyDTTime(runTotal);
            testList.setNumNotFixedDT(changedTests);
            testList.setNumFixedDT(fixedDT.size());
            testList.setTestList(currentOrderTestList);
            Map<Double, List<Double>> totalTimeToCumulTime =
                    setTestListMedianTime(timesToRun, filesToDelete, currentOrderTestList, testList);
            if (allDTList != null) {
                testList.setDtList(new ArrayList<String>(allDTList));
            }

            if (getCoverage) {
                // Get coverage each test achieved
                List<String> coverageEachTest = getCurrentCoverage(testObj, i);
                testList.setCoverage(coverageEachTest);
                List<Double> cumulCoverage = getCumulList(coverageEachTest);
                testList.setAPFD(getAPFD(totalTimeToCumulTime.get(testList.getNewOrderTime()), cumulCoverage));
            }
            listTestList.add(testList);
        }

        output(false);
    }
}
