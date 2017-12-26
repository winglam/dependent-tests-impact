package edu.washington.cs.dt.impact.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;
import java.util.Collection;
import java.util.Collections;

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
 * 
 * need to merge results together
 * did not make use of multiple directory paths
 * 
 * 
 * Right now this class now calls runDTF in DependentTestFinder class in parallelized manner
 * This class needs the list of paths, number of threads, changed test list, hashmap of
 * each test's original result and name, current order test list, original order test list,
 * files to delete, all dt test list
 * 
*/

public class ParaThreads extends Runner {
	
	//list of variables
	Set<String> changedTests;
	Map<String, RESULT> nameToOrigResultsListHen;
	List<String> currentOrderTestListHen;
	List<String> origOrderTestListHen;
	List<String> filesToDeleteHen;
	List<String> allDTListHen;
	List<String> runDTFOutput;
	
	ArrayList<String> paths;
	ArrayList<Thread> threadList = new ArrayList<Thread>();
	int threads;

	//q is a shared queue between threads, each thread pops a test off of the queue and
	//calls runDTF on it
	ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
	//done_q is a shared list between threads that holds elements of allDTList
	List<String> done_q = Collections.synchronizedList(new ArrayList<String>());
	
	//constructor
	public ParaThreads(Set<String> changedTests, ArrayList<String> paths, int threads, Map<String, RESULT> nameToOrigResultsHen, List<String> currentOrderTestListHen,  List<String> origOrderTestListHen, List<String> filesToDeleteHen, List<String> allDTListHen) {
		this.paths = paths;
		this.threads = threads;
		this.changedTests = changedTests;
		this.nameToOrigResultsListHen = nameToOrigResultsHen;
		this.currentOrderTestListHen = currentOrderTestListHen;
		this.origOrderTestListHen = origOrderTestListHen;
		this.filesToDeleteHen = filesToDeleteHen;
		this.allDTListHen = allDTListHen;
	}
	
	//parellelization method, will parallelize each changedtest to each core in a queue manner
	//each thread takes from the same queue, and locking is done through ConcurrentLinkedQueue
	//implementation
	public void runThreads(){
		
		for(String i : changedTests)
		{
			System.out.printf("\nThe test added is: %s\n", i);
			q.add(i);
		}
		
		for(int j = 0; j < threads; j++)
		{
			//create new thread
			System.out.printf("\ninside for loop, j is %d\n", j);
			threadList.add(new Thread(new Runnable()
			{
				//each thread's method that is run
				public void run()
				{
					System.out.println("\nThread is running!\n");
					try {
						while(q.peek() != null)
						{
							String test = q.poll();
							DependentTestFinder.runDTF(test, nameToOrigResultsListHen.get(test), currentOrderTestListHen, origOrderTestListHen, filesToDeleteHen, allDTListHen);
							runDTFOutput = DependentTestFinder.getAllDTs();
							//put contents of allDTList into shared List
							synchronized (done_q)
							{
								done_q.addAll(runDTFOutput);
							}
						}
						//checking contents of done_q
						for(String s: done_q)
						{
							System.out.printf("\nAdded: %s\n", s);
						}
					} 
					catch (Exception e) {}
				}
			}));
			
			threadList.get(j).start();
		}
		
		//wait for threads to finish
		for(Thread t: threadList)
		{
			try {
				t.join();
			}
			catch (Exception a) {}
		}
		
		//call TestListGenerator
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
		testObj.resetDTList(allDTList);
        currentOrderTestListHen = getCurrentTestList(testObj, threads);
        
        // ImpactMain
        Map<String, RESULT> nameToTestResults = getCurrentOrderTestListResults(currentOrderTestListHen, filesToDelete);
        
        // Cross Referencer
        changedTests = CrossReferencer.compareResults(nameToOrigResultsListHen, nameToTestResults, false);
        
        /* need to feed changedTests back to queue
        dtToFix.clear();
        for (String test : changedTests) {
            if (currentOrderTestListHen.contains(test)) {
                dtToFix.add(test);
            }
        }
        */
	}
	
}
