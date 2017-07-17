/** 
 * Get list/number of unique DTs listed in ORIG_MIN_DTs.txt and 
 * AUTO_MIN_DTs.txt. The input can be a folder containing the 
 * precomputed dependences of a subject or it can be the results
 * of that subject from the OneConfigurationRunner.
*/ 

package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import edu.washington.cs.dt.impact.Main.FigureGenerator;
import edu.washington.cs.dt.impact.data.Project;

public class GetAllUniqueDTs extends FigureGenerator {
	private static Map<String, HashSet<String>> autoTestNames;
	private static Map<String, HashSet<String>> origTestNames;

    public static void main(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));

		String priorDirectoryName = mustGetArgName(argsList, "-prioDirectory");
		String seleDirectoryName = mustGetArgName(argsList, "-seleDirectory");
		String paraDirectoryName = mustGetArgName(argsList, "-paraDirectory");

		String origMinDTFileName = mustGetArgName(argsList, "-minBoundOrigDTFile"); 
		String autoMinDTFileName = mustGetArgName(argsList, "-minBoundAutoDTFile"); 

        File[] prioDirList = new File(priorDirectoryName).listFiles();
        File[] seleDirList = new File(seleDirectoryName).listFiles();
        File[] paraDirList = new File(paraDirectoryName).listFiles();

        autoTestNames = new TreeMap<String, HashSet<String>>();
        origTestNames = new TreeMap<String, HashSet<String>>();

        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<Project>();
        List<Project> proj_auto_arrayList = new ArrayList<Project>();

        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(prioDirList, new GetAllUniqueDTs(), false, proj_orig_arrayList, proj_auto_arrayList);
        parseFiles(seleDirList, new GetAllUniqueDTs(), false, proj_orig_arrayList, proj_auto_arrayList);
        parseFiles(paraDirList, new GetAllUniqueDTs(), false, proj_orig_arrayList, proj_auto_arrayList);

        for (String key : origTestNames.keySet()) {
        	FileTools.printStringToFile(key + "|" + origTestNames.get(key).size(), new File(origMinDTFileName), true);
        	System.out.println(key + ": " + origTestNames.get(key));
        	System.out.println();
        }

        System.out.println("------------------------------------------------------");

        for (String key : autoTestNames.keySet()) {
        	FileTools.printStringToFile(key + "|" + autoTestNames.get(key).size(), new File(autoMinDTFileName), true);
        	System.out.println(key + ": " + autoTestNames.get(key));
        	System.out.println();
        }
    }

	@Override
	public void doParaCalculations() {
		addDTs();
	}

	@Override
	public void doPrioCalculations() {
		addDTs();
	}

	@Override
	public void doSeleCalculations() {
		addDTs();
	}

	private void addDTs() {
		HashSet<String> currDTList = null;
		if (testType.equals("orig")) {
			currDTList = origTestNames.get(projectName);
		} else if (testType.equals("auto")) {
			currDTList = autoTestNames.get(projectName);
		}
		if (currDTList == null) {
			currDTList = new HashSet<String>();
		}
		currDTList.addAll(totalDTs);
		if (testType.equals("orig")) {
			origTestNames.put(projectName, currDTList);
		} else if (testType.equals("auto")) {
			autoTestNames.put(projectName, currDTList);
		}
	}
}
