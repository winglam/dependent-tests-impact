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
 * does not make use of multiple directory paths, sometimes extra dts are found 
 * after running runDTF as opposed to running OneConfigurationRunner normally (without
 * this class)
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
	ArrayList<Thread> threadList = new ArrayList<Thread>(); //arraylist of threads
	int threads; //number of threads to use
	ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
	//q is a shared queue between threads, each thread pops a test off of the queue and
	//calls runDTF on it
	 List<String> allDTSynchList = Collections.synchronizedList(new ArrayList<String>()); //all runDTFoutputs generated stored here 
	
	//variables not being used
	//List<TestData> done_q = Collections.synchronizedList(new ArrayList<TestData>()); //synch list of parsed strings from allDTList, represented as a TestData object
	//ArrayList<String> paths; //was used to hold directory paths for each thread
	
	//constructor sets number of threads
	public ParaThreads(int threads){
		this.threads = threads;
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
		
		//create new threads as specified
		for(int j = 0; j < threads; j++)
		{
			threadList.add(new Thread(new Runnable()
			{
				//each thread's run method defined here
				public void run()
				{
					try {
						System.out.printf("\nthread is running!\n");
						while(q.peek() != null)
						{
							String test = q.poll();
							DependentTestFinder.runDTF(test, nameToOrigResultsListHen.get(test), currentOrderTestListHen, origOrderTestListHen, filesToDeleteHen, allDTListHen);
							runDTFOutput = DependentTestFinder.getAllDTs();
							/*
							//this section is for parsed runDTF output
							//get specified parsed values from DependenTestFinder
							TestData runDTFData = new TestData(DependentTestFinder.getBefore(), DependentTestFinder.getIntended(), DependentTestFinder.getAfter(), DependentTestFinder.getRevealed());
							//put contents of allDTList (as a TestData object) into shared List (aka done_q)
							synchronized (done_q)
							{
								if(done_q.isEmpty())
								{
									done_q.add(runDTFData);
								}
								else{
								for(TestData x: done_q)
								{
									if(!(TestData.isEqual(runDTFData, x)))
									{
										done_q.add(runDTFData);
									}
								}
								}
							}
							*/	
							//for now adding runDTFOutput as a List of strings
							/*
							//not being used currently as it adds the same dts twice
							synchronized (allDTSynchList)
							{
								allDTSynchList.addAll(runDTFOutput);
							}
							*/
						}
						System.out.printf("\nthread is done!\n");
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
		threadList.clear(); //clear list as threads cannot be restarted once stopped
		
		return runDTFOutput;
		//return ParaThreads.getListDone(done_q); //if using runDTFData
	}
	
	/*
	 * This method will convert the TestData class into a List<String> to send back to the
	 * OneConfigurationRunner. It is not being used currently as this class still runs with
	 * the DependenTestFinder, which returns a List<String> from the getAllDTs
	public static List<String> getListDone(List<TestData> allDT)
	{
		List<String> listString = new ArrayList<String>();
		for(TestData d: allDT)
		{
			listString.add("Test: " + d.depTest);
			listString.add("Intended behavior: FAILURE");
			listString.add("when executed after: [" + d.indTest + "]");
			listString.add("The revealed different behavior: PASS");
			listString.add("when executed after: []");
		}
		for(String s: listString)
		{
			System.out.println("listSTring contains: "+s);
		}
		return listString;
	}
	*/
}
