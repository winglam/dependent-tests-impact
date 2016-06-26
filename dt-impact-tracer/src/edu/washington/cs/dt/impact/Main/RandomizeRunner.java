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
import java.util.Random;
import java.util.Set;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.data.WrapperTestList;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.tools.CrossReferencer;
import edu.washington.cs.dt.impact.tools.DependentTestFinder;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;

public class RandomizeRunner extends Runner {

    public static void main(String[] args) {
        // Parse the input arguments
        parseArgs(args);

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
        Map<String, RESULT> nameToOrigResults = getCurrentOrderTestListResults(origOrderTestList, filesToDelete);

        // capture start time
        double start = System.nanoTime();
        TLGTime = System.nanoTime() - start;

        listTestList = new ArrayList<>();
        start = System.nanoTime();

        Random rand = new Random();
        for (int i = 1; i <= randomTimes; i++) {
            WrapperTestList testList = new WrapperTestList();

            System.out.println("Randomization iteration number: " + i + " / " + randomTimes);
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
                    System.out.println("Nullifying DTs iteration number / possible iterations left: " + counter + " / "
                            + changedTests.size());
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
            double runTotal = System.nanoTime() - start;

            testList.setNullifyDTTime(runTotal);
            testList.setNumNotFixedDT(changedTests);
            testList.setNumFixedDT(fixedDT.size());
            testList.setTestList(currentOrderTestList);
            setTestListMedianTime(timesToRun, filesToDelete, currentOrderTestList, testList);

            if (allDTList != null) {
                testList.setDtList(new ArrayList<String>(allDTList));
            }

            listTestList.add(testList);
        }

        // Output the results
        output(true);
    }
}
