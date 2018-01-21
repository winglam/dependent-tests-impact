package edu.washington.cs.dt.impact.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
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
import edu.washington.cs.dt.impact.tools.ParallelDependentTestFinder;
import edu.washington.cs.dt.impact.data.TestData;

/*
 * TODO 
 * 
 * Right now this class now calls runDTF in DependentTestFinder class in parallelized manner
 * 
 * Constructor needs:
 * number of threads (which is used to append to the names of the temporary files generated (e.g. LOCK_FILE)
 * 
 * When using this class, need to call setParaVars first, which needs:
 * changed test list, 
 * hashmap of each test's original result and name, 
 * current order test list, 
 * original order test list,
 * files to delete, 
 * all dt test list (invoked by OneConfigurationRunner)
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
	ArrayList<Thread> threadList = new ArrayList<Thread>(); //arraylist of threads
	int threads; //number of threads to use
	//q (below) is a shared queue between threads, each thread pops a test off of the queue and calls runDTF on it
	ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
	//allDTSynchList (below) stores allDTList from each thread (thread-safe)
	List<String> allDTSynchList = Collections.synchronizedList(new ArrayList<String>());
	//classpaths (below) is a queue of the thread number (as a string) to append to tmp files generated
	ConcurrentLinkedQueue<String> classpaths = new ConcurrentLinkedQueue<String>();
	//variables not being used
	//done_q (below) is a synch list of parsed strings from allDTList, represented as a TestData object
	//List<TestData> done_q = Collections.synchronizedList(new ArrayList<TestData>());
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
						String path = classpaths.poll();
						System.out.printf("\nthread is running!\n");
						System.out.println("\n\nHIHIHIHIH "+q.toString());
						while(q.peek() != null)
						{
							String test = q.poll();
							ParallelDependentTestFinder dtFinder = new ParallelDependentTestFinder(test, origOrderTestListHen, currentOrderTestListHen, filesToDeleteHen);
							Map<String, Set<TestData>> knownDependencies = dtFinder.runDTF();
							System.out.println("\n\nINSIDE WHILTE LOOP ");
							//for (String key : knownDependencies.keySet()) {
							    //System.out.println("\n\nHERE IS SOME TUFF!!\n\n"+key + " " + knownDependencies.get(key)+"\n");
							//}
							//DependentTestFinder dtf = new DependentTestFinder();
							//dtf.runDTF(test, nameToOrigResultsListHen.get(test), currentOrderTestListHen, origOrderTestListHen, filesToDeleteHen, allDTListHen, path);
							//List<String> runDTFOutput = dtf.getAllDTs();
							//for now adding runDTFOutput as a List of strings
							synchronized (allDTSynchList)
							{
								//allDTSynchList.addAll(runDTFOutput);
							}
							
						}
						System.out.printf("\nthread is done!\n");
					} 
					catch (Exception e) {}
				}
			}));
			classpaths.add(Integer.toString(j));
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
		threadList.clear(); //clear list since threads cannot be restarted once stopped
		//need deep copy of allDTSynchList since rejoining to main thread
		List<String> allDTSynchListReturn = new ArrayList<String>();
		for(String s : allDTSynchList)
		{
			allDTSynchListReturn.add(s);
		}
		classpaths.clear();
		allDTSynchList.clear();
		return allDTSynchListReturn;
		//return ParaThreads.getListDone(done_q); //if using runDTFData
	}
}
