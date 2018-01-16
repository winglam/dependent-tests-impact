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

/*
 * TODO 
 * This class should take a repo path and a dependent test and call DependentTestFinder path
 * 
 * Currently only prints random statements
*/

public class ParaThreads implements Runnable {
	//TODO this class 
	
	public int time;
	public String name;
	
	public ParaThreads(String n, int x) {
		name = n;
		time = x;
	}
	
	public void run()
	{
		try{
			System.out.printf("T%s is sleeping for %d seconds\n", name, time);
			Thread.sleep(time);
			System.out.printf("T%s just woke up after %d seconds\n", name, time);
		}catch (Exception e){}
	}
}
