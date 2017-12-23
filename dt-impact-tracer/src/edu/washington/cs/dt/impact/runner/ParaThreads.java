package edu.washington.cs.dt.impact.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

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
 * Right this class now calls runDTF in DependentTestFinder class in parallelized manner
 * This class needs the list of paths, number of threads, changed test list, hashmap of
 * each test's original result and name, current order test list, original order test list,
 * files to delete, all dt test list
 * 
*/

public class ParaThreads {
	
	//list of variables
	Set<String> changedTests;
	Map<String, RESULT> nameToOrigResultsList;
	List<String> currentOrderTestListHen;
	List<String> origOrderTestListHen;
	List<String> filesToDeleteHen;
	List<String> allDTListHen;
	
	ArrayList<String> paths;
	ArrayList<Thread> threadList = new ArrayList<Thread>();
	int threads;

	ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
	
	//constructor
	public ParaThreads(Set<String> changedTests, ArrayList<String> paths, int threads, Map<String, RESULT> nameToOrigResultsHen, List<String> currentOrderTestListHen,  List<String> origOrderTestListHen, List<String> filesToDeleteHen, List<String> allDTListHen) {
		this.paths = paths;
		this.threads = threads;
		this.changedTests = changedTests;
		this.nameToOrigResultsList = nameToOrigResultsHen;
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
							DependentTestFinder.runDTF(test, nameToOrigResultsList.get(test), currentOrderTestListHen, origOrderTestListHen, filesToDeleteHen, allDTListHen);
							//allDTListHen = DependentTestFinder.getAllDTs();
						}
					} 
					catch (Exception e) {}
				}
			}));
			
			threadList.get(j).start();
		}
	}
	
}
