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
 * does not make use of multiple directory paths
 * 
 * 
 * Right now this class now calls runDTF in DependentTestFinder class in parallelized manner
 * This class needs the list of paths, number of threads, changed test list, hashmap of
 * each test's original result and name, current order test list, original order test list,
 * files to delete, all dt test list (invoked by OneConfigurationRunner)
 * 
 * TestData implementation still needs to be worked on if DependenTestFinder will be changed
 * to data objects instead of Strings
 * 
*/

public class ParaThreads {
	
	//list of variables
	static Set<String> changedTests;
	static Map<String, RESULT> nameToOrigResultsListHen;
	static List<String> currentOrderTestListHen;
	static List<String> origOrderTestListHen;
	static List<String> filesToDeleteHen;
	static List<String> allDTListHen;
	List<String> runDTFOutput; //output after calling runDTF
	static boolean started; //flag to indicate if a thread has been started
	ArrayList<Thread> threadList = new ArrayList<Thread>(); //arraylist of threads
	int threads; //number of threads to use
	ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
	//q is a shared queue between threads, each thread pops a test off of the queue and
	//calls runDTF on it
	List<String> allDTSynchList = Collections.synchronizedList(new ArrayList<String>()); //all runDTFoutputs generated stored here 
	
	//variables not being used
	//List<TestData> done_q = Collections.synchronizedList(new ArrayList<TestData>()); //synch list of parsed strings from allDTList, represented as a TestData object
	//ArrayList<String> paths; //was used to hold directory paths for each thread
	
	//constructor sets number of threads and creates them
	public ParaThreads(int threads){
		this.threads = threads;
		started = false;
		//create new threads as specified
		for(int j = 0; j < threads; j++)
		{
			threadList.add(new Thread(new Runnable()
			{
				//each thread's run method defined here
				public void run()
				{
					System.out.println("\nThread is running!\n");
					try {
						while(q.peek() != null)
						{
							String test = q.poll();
							System.out.println("popped off of q: "+test+"\n");
							DependentTestFinder.runDTF(test, nameToOrigResultsListHen.get(test), currentOrderTestListHen, origOrderTestListHen, filesToDeleteHen, allDTListHen);
							runDTFOutput = DependentTestFinder.getAllDTs();
							
							/*this section is for parsed runDTF output
							 *get specified parsed values from DependenTestFinder
							TestData runDTFData = new TestData(DependentTestFinder.getBefore(), DependentTestFinder.getIntended(), DependentTestFinder.getAfter(), DependentTestFinder.getRevealed());
							//put contents of allDTList (as a TestData object) into shared List (aka done_q)
							synchronized (done_q)
							{
								done_q.add(runDTFData);
							}
							*/
							
							//for now adding runDTFOutput as a List of strings
							synchronized (allDTSynchList)
							{
								allDTSynchList.addAll(runDTFOutput);
							}
						}
					} 
					catch (Exception e) {}
				}
			}));
		}
	}
	
	public void setParaVars(Set<String> changedTests, Map<String, RESULT> nameToOrigResultsHen, List<String> currentOrderTestListHen,  List<String> origOrderTestListHen, List<String> filesToDeleteHen, List<String> allDTListHen)
	{
		ParaThreads.changedTests = changedTests;
		ParaThreads.nameToOrigResultsListHen = nameToOrigResultsHen;
		ParaThreads.currentOrderTestListHen = currentOrderTestListHen;
		ParaThreads.origOrderTestListHen = origOrderTestListHen;
		ParaThreads.filesToDeleteHen = filesToDeleteHen;
		ParaThreads.allDTListHen = allDTListHen;
	}
	
	//runs threads and returns a list of strings that represent allDTList
	public List<String> runThreads(){
		
		//add dependent tests to q
		for(String i : changedTests)
		{
			System.out.printf("\nThe test added is: %s\n", i);
			q.add(i);
		}
		
		for(int j = 0; j < threads; j++)
		{
			//get illegal thread exception error if a thread is started more than once
			if(!started)
			{
				threadList.get(j).start();
			}
			else
			{
				threadList.get(j).run();
			}
		}
		
		//wait for threads to finish
		for(Thread t: threadList)
		{
			try {
				t.join();
			}
			catch (Exception a) {}
		}
		started = true; //flag to switch to use .run() instead of .start()
		
		return allDTSynchList;
	}
	
}
