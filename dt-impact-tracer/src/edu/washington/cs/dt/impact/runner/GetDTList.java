package edu.washington.cs.dt.impact.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.data.WrapperTestList;
import edu.washington.cs.dt.impact.runner.OneConfigurationRunner;
import edu.washington.cs.dt.impact.technique.Parallelization;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.technique.Selection;
import edu.washington.cs.dt.impact.technique.Test;
import edu.washington.cs.dt.impact.tools.CrossReferencer;
import edu.washington.cs.dt.impact.tools.DependentTestFinder;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;
import edu.washington.cs.dt.main.ImpactMain;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GetDTList{
	
	/*
	 * TODO
	 * 
	 * As of now this class just calls the OneConfigurationRunner with hard-coded arguments.
	 * This class can still clone directories, but this functionality is commented out and not being used 
	 * for parallelization.
	 * 
	 * This method should call the OneConfigurationRunner to get a list of the tests that had different results
	 * in the new order. It should also invoke the directoryCopy method in this class to get a list of cloned repo
	 * paths. Each cloned repo path should be assigned to each core to be used and invoke the ParaThreads class
	 * to parallelize finding precomputed dependecies
	 * 
	 * The main method needs to be changed to take in the name of project, the path of the project, the technique 
	 * being used, the number of cores to be used.
	 *
	 *Currently can call the OneConfigurationRunner and to generate prioritization-statement-absolute results
	 *for Crystal, ActivemqCamel, and Jfreechart
	 *
	 * 
	 */
	
	
	public static void main(String[] args){
		//initialize variables, method should take these as arguments
		//crystal
		String[] b = new String[]{"-technique","prioritization","-coverage","statement","-order","absolute","-origOrder","/home/user/dependent-tests-impact/experiments/crystalvc/crystal-orig-order","-testInputDir","/home/user/dependent-tests-impact/experiments/crystalvc/sootTestOutput-orig","-filesToDelete","/home/user/dependent-tests-impact/experiments/crystalvc/crystal-env-files","-project","Crystal","-testType","orig","-outputDir","/home/user/dependent-tests-impact/experiments/prioritization-results","-timesToRun","1","-getCoverage", "-resolveDependences", "/home/user/dependent-tests-impact/experiments/prioritization-dt-list/aasdf.txt"};
		//activemqCamel
		//String[] b = new String[]{"-technique","prioritization","-coverage","statement","-order","absolute","-origOrder","/home/user/dependent-tests-impact/experiments/activemq-old/activemq-camel/target/activemqCamel-orig-order","-testInputDir","/home/user/dependent-tests-impact/experiments/activemq-old/activemq-camel/target/sootTestOutput-orig","-filesToDelete","/home/user/dependent-tests-impact/experiments/activemq-old/activemq-camel/target/activemqCamel-env-files","-project","ActivemqCamel","-testType","orig","-outputDir","/home/user/dependent-tests-impact/experiments/prioritization-results","-timesToRun","1","-getCoverage", "-resolveDependences","/home/user/dependent-tests-impact/experiments/prioritization-dt-list/prioritization-activemqCamel.txt"};
		//jfreechart
		//String[] b = new String[]{"-technique","prioritization","-coverage","statement","-order","absolute","-origOrder","/home/user/dependent-tests-impact/experiments/jfreechart-1.0.15/jfreechart-orig-order","-testInputDir","/home/user/dependent-tests-impact/experiments/jfreechart-1.0.15/sootTestOutput-orig","-filesToDelete","/home/user/dependent-tests-impact/experiments/jfreechart-1.0.15/jfreechart-env-files","-project","jfreechart","-testType","orig","-outputDir","/home/user/dependent-tests-impact/experiments/prioritization-results","-timesToRun","1","-getCoverage","-resolveDependences","/home/user/dependent-tests-impact/experiments/prioritization-dt-list/prioritization-JFREECHART-statement-absolute-.txt"};
		
		
		//start OneConfigurationRunner
		OneConfigurationRunner.main(b);
		
		/*
		//call directoryCopy method
		int numThreadsToUse = 1;
		ArrayList<String> list_of_dir = GetDTList.directoryCopy("/home/user/dependent-tests-impact/experiments/jfreechart-1.0.15", numThreadsToUse);
		for(String k : list_of_dir)
		{
			System.out.println(k);
		}
		*/
	}
	    
	
	/*	
	 * Takes String of original source directory path and number of threads as an int
	 * Returns ArrayList of directory paths and clones number of directories as specified by the
	 * number of threads to use
	*/
	public static ArrayList<String> directoryCopy (String sourceString, int numOfThreads) {
			ArrayList<String> listOfDir = new ArrayList<String>();
	        // get existing directory to copy.
	        String source = sourceString;
	        File srcDir = new File(source);

	        /*
	         * for each thread, create a new directory path and copy from the source directory 
	         * to the new path
	        */
	        for(int i = 0; i < numOfThreads; i++)
	        {
	        	String destination = sourceString+i;
		        File destDir = new File(destination);	        
		        
		        try {
		            /*
		             * Copy source directory into destination directory
		             * all subdirectories are copied as well
		            */
		            FileUtils.copyDirectory(srcDir, destDir);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        //add path to arraylist to return
		        listOfDir.add(destination);
	        }
	        return listOfDir;
	    }
}
