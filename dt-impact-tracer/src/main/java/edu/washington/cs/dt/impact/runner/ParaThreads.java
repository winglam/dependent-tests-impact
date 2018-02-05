package edu.washington.cs.dt.impact.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.*;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

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

import javax.print.DocFlavor;

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
	// list of variables
	static Set<String> changedTests;
	static Map<String, RESULT> nameToOrigResultsListHen;
	static List<String> currentOrderTestListHen;
	static List<String> origOrderTestListHen;
	static List<String> filesToDeleteHen;
	static List<String> allDTListHen;
    private static Map<String, RESULT> nameToNewResults;
    ArrayList<Thread> threadList = new ArrayList<Thread>(); // arraylist of
															// threads
	int threads; // number of threads to use
	// q (below) is a shared queue between threads, each thread pops a test off
	// of the queue and calls runDTF on it
	ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
	// classpaths (below) is a queue of the thread number (as a string) to
	// append to tmp files generated
	ConcurrentLinkedQueue<String> classpaths = new ConcurrentLinkedQueue<String>();
	ConcurrentHashMap<String, Set<TestData>> knownDepMap = new ConcurrentHashMap<>();

	// constructor sets number of threads
	public ParaThreads(int threads) {
		this.threads = threads;
	}

	public void setParaVars(Set<String> changedTests, Map<String, RESULT> nameToOrigResultsHen,
                            Map<String, RESULT> nameToNewResults, List<String> currentOrderTestListHen, List<String> origOrderTestListHen, List<String> filesToDeleteHen,
                            List<String> allDTListHen) {
		ParaThreads.changedTests = changedTests;
		ParaThreads.nameToOrigResultsListHen = nameToOrigResultsHen;
		ParaThreads.nameToNewResults = nameToNewResults;
		ParaThreads.currentOrderTestListHen = currentOrderTestListHen;
		ParaThreads.origOrderTestListHen = origOrderTestListHen;
		ParaThreads.filesToDeleteHen = filesToDeleteHen;
		ParaThreads.allDTListHen = allDTListHen;
	}

	private List<String> generateDTList(final Map<String, Set<TestData>> knownDependencies) {
	    final List<String> result = new ArrayList<>();

        for (Map.Entry<String, Set<TestData>> entry : knownDependencies.entrySet()) {
            Set<TestData> testdataset = entry.getValue();
            for (TestData td : testdataset) {
                String beforeString = td.beforeTests.toString();
                String afterString = td.afterTests.toString();

                if (beforeString.equals("[]")) {
                    result.add("Test: " + afterString.replace("[", "").replace("]", ""));
                    result.add("Intended behavior: " + RESULT.FAILURE);
                    result.add("when executed after: [" + td.dependentTest + "]");
                    result.add("The revealed different behavior: " + RESULT.PASS);
                    result.add("when executed after: []");
                } else {
                    result.add("Test: " + td.dependentTest);
                    result.add("Intended behavior: " + RESULT.FAILURE);
                    result.add("when executed after: " + beforeString);
                    result.add("The revealed different behavior: " + RESULT.PASS);
                    result.add("when executed after: []");
                }
            }
        }

        return result;
    }

	// runs threads and returns a list of strings that represent allDTList
	public List<String> runThreads() {
		// add dependent tests to q
		for (String i : changedTests) {
			System.out.printf("\nThe test added is: %s\n", i);
			q.add(i);
		}

		// create new threads as specified
		for (int j = 0; j < threads; j++) {
			threadList.add(new Thread(new Runnable() {
				// each thread's run method defined here
				public void run() {
					try {
						System.out.printf("\nthread is running!\n");

						Map<String, Set<TestData>> knownDependencies = new HashMap<>();
						ParallelDependentTestFinder dtFinder = null;

						while (q.peek() != null) {
							String test = q.poll();

							if (dtFinder == null) {
								dtFinder = new ParallelDependentTestFinder(test,
                                        origOrderTestListHen, nameToOrigResultsListHen,
										currentOrderTestListHen, nameToNewResults,
                                        filesToDeleteHen, knownDepMap);
								knownDependencies = dtFinder.runDTF();
							} else {
								dtFinder = dtFinder.createFinderFor(test);
								knownDependencies = dtFinder.runDTF();
							}
						}

						knownDependencies.forEach((testName, dependencies) ->
							knownDepMap.merge(testName, dependencies, (dep1, dep2) -> {
								dep2.addAll(dep1);
								return dep2;
							}));

                        System.out.println(generateDTList(knownDependencies));

						System.out.printf("\nthread is done!\n");
					} catch (Exception e) {
						System.out.println("\nEncountered an error: " + e + "\n");
					}
				}
			}));
			classpaths.add(Integer.toString(j));
			threadList.get(j).start();
		}
		// wait for threads to finish
		for (Thread t : threadList) {
			try {
				t.join();
			} catch (Exception a) {
			}
		}
		threadList.clear(); // clear list since threads cannot be restarted once
							// stopped
		// need deep copy of allDTSynchList since rejoining to main thread
		List<String> allDTSynchListReturn = generateDTList(knownDepMap);
		classpaths.clear();
		return allDTSynchListReturn;
	}
}
