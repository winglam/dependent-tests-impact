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

package edu.washington.cs.dt.impact.runner;

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
	
	public static Set<String> changedTestSet = new HashSet<String>();
	public static Map<String, RESULT> nameToOrigResultsHen;
	public static List<String> currentOrderTestListHen;
	
	public static void setStringAr (Set<String> a)
	{
		for(String test : a)
		{
			changedTestSet.add(test);
		}
	}
	
	public static Set<String> getStringAr()
	{
		return changedTestSet;
	}
	
	public static Map<String, RESULT> getOrigMap()
	{
		nameToOrigResultsHen = getCurrentOrderTestListResults(origOrderTestList, filesToDelete);
		return nameToOrigResultsHen;
	}
	
	public static List<String> getOrigOrderTestList()
	{
		return origOrderTestList;
	}
	
	public static List<String> getFilesToDelete()
	{
		return filesToDelete;
	}
	
	public static List<String> getAllDTList()
	{
		return allDTList;
	}
	
	public static List<String> getCurrentOrder()
	{
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
	        
		for (int i = 0; i < numOfMachines.getValue(); i++) {
			currentOrderTestListHen = getCurrentTestList(testObj, i);
		}
		
		return currentOrderTestListHen;
	}
	

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
            
            //use setter method
            setStringAr(changedTests);
        }
        output(false);
    }
}
