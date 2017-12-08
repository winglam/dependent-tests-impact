package edu.washington.cs.dt.impact.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.data.WrapperTestList;
import edu.washington.cs.dt.impact.runner.OneConfigurationRunner;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.tools.CrossReferencer;
import edu.washington.cs.dt.impact.tools.DependentTestFinder;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.main.ImpactMain;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GetDTList {
	
	/*
	 * TODO
	 * 
	 * This method should call the OneConfigurationRunner to get a list of the tests that had different results
	 * in the new order. It should also invoke the directoryCopy method in this class to get a list of cloned repo
	 * paths. Each cloned repo path should be assigned to each core to be used and invoke the ParaThreads class
	 * to parallelize finding precomputed dependecies
	 * 
	 * The main method needs to be changed to take in the name of project, the path of the project, the technique 
	 * being used, the number of cores to be used.
	 *
	 *
	 *Currently can call the OneConfigurationRunner and to generate prioritization-statement-absolute results
	 *for Crystal. Also can call ParaThreads class to print some test statements in parallel
	 *
	 * 
	 */
	
	
	public static void main(String[] args){
		//String[] arr = {"-technique prioritization -coverage statement -order original -origOrder /home/user/dependent-tests-impact/experiments/crystalvc/crystal-orig-order -testInputDir /home/user/dependent-tests-impact/experiments/crystalvc/sootTestOutput-orig -filesToDelete /home/user/dependent-tests-impact/experiments/crystalvc/crystal-env-files -project \"Crystal\" -testType orig -outputDir /home/user/dependent-tests-impact/experiments/crystalvc/prioritization-results -timesToRun 1 -getCoverage"};
		
		String[] b = new String[]{"-technique","prioritization","-coverage","statement","-order","absolute","-origOrder","/home/user/dependent-tests-impact/experiments/crystalvc/crystal-orig-order","-testInputDir","/home/user/dependent-tests-impact/experiments/crystalvc/sootTestOutput-orig","-filesToDelete","/home/user/dependent-tests-impact/experiments/crystalvc/crystal-env-files","-project","Crystal","-testType","orig","-outputDir","/home/user/dependent-tests-impact/experiments/prioritization-results","-timesToRun","1","-getCoverage"};

		OneConfigurationRunner o_obj = new OneConfigurationRunner();
		o_obj.main(b);
		
		//get changedTests variable from oneconfigurationrunner
		//Set<String> cTests = o_obj.changedTests;
		//System.out.println(o_obj.hen[0]);
		
		
		Thread t1 = new Thread(new ParaThreads("one", 10));
		Thread t2 = new Thread(new ParaThreads("two", 4));
		Thread t3 = new Thread(new ParaThreads("three", 15));
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	    
	
	/*	
	 * TODO 
	 * This method needs to be edited to take in the number of cores to use and the original repository path
	 * and create the number of repository paths specified by the number of cores and return those paths
	 * 
	 * Currently works to clone 1 path in a hard-coded directory location 
	*/
	public void directoryCopy (String[] args) {
	        //
	        // An existing directory to copy.
	        //
	        String source = "/home/usr/dependent-test-impact/experiments/crystal";
	        File srcDir = new File(source);

	        //
	        // The destination directory to copy to. This directory
	        // doesn't exists and will be created during the copy
	        // directory process.
	        //
	        String destination = "/home/usr/dependent-test-impact/experiments/crystal5";
	        File destDir = new File(destination);

	        try {
	            //
	            // Copy source directory into destination directory
	            // including its child directories and files. When
	            // the destination directory is not exists it will
	            // be created. This copy process also preserve the
	            // date information of the file.
	            //
	            FileUtils.copyDirectory(srcDir, destDir);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
