/** 
* Get list/number of unique DTs listed in ORIG_MIN_DTs.txt and 
 * AUTO_MIN_DTs.txt. The input can be a folder containing the 
 * results of that subject from the OneConfigurationRunner
 * with DTs not given to it.
*/ 

package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.figure.generator.FigureGenerator;

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

        File origDTFile = new File(origMinDTFileName);
        TreeMap<String, Integer> origExistingMap = parseExistingDTFile(FileTools.parseFileToList(origDTFile));
        mergeMaps(origExistingMap, origTestNames);

        StringBuilder sb = new StringBuilder();
        for (String key : origExistingMap.keySet()) {
        	sb.append(key);
        	sb.append("|");
        	sb.append(origExistingMap.get(key));
        	sb.append("\n");
        }
        FileTools.printStringToFile(sb.toString(), origDTFile, false);

        File autoDTFile = new File(autoMinDTFileName);
        TreeMap<String, Integer> autoExistingMap = parseExistingDTFile(FileTools.parseFileToList(autoDTFile));
        mergeMaps(autoExistingMap, autoTestNames);

        StringBuilder autoSb = new StringBuilder();
        for (String key : autoExistingMap.keySet()) {
        	autoSb.append(key);
        	autoSb.append("|");
        	autoSb.append(autoExistingMap.get(key));
        	autoSb.append("\n");
        }
        FileTools.printStringToFile(autoSb.toString(), autoDTFile, false);

        for (String key : origTestNames.keySet()) {
        	System.out.println(key + ": " + origTestNames.get(key));
        	System.out.println();
        }

        System.out.println("------------------------------------------------------");

        for (String key : autoTestNames.keySet()) {
        	System.out.println(key + ": " + autoTestNames.get(key));
        	System.out.println();
        }
    }

    private static void mergeMaps(TreeMap<String, Integer> existingMap, Map<String, HashSet<String>> newMap) {
        for (String key : newMap.keySet()) {
        	int value = newMap.get(key).size();
        	if (existingMap.containsKey(key)) {
    			System.out.println("Duplicate key detected in one of the files. Key: " + key);
    			int currVal = existingMap.get(key);
    			if (currVal > value) {
    				value = currVal; 
    			}
        	}
        	existingMap.put(key, value);
        }
    }

    private static TreeMap<String, Integer> parseExistingDTFile(List<String> contents) {
    	TreeMap<String, Integer> newMap = new TreeMap<>();
    	for (String s : contents) {
    		String noSpaceS = s.trim();
    		String[] splitDash = noSpaceS.split("\\|");
    		String key = splitDash[0];
    		int value = Integer.parseInt(splitDash[1]);
    		if (newMap.containsKey(key)) {
    			System.out.println("Duplicate key detected in one of the files. Key: " + key);
    			int currVal = newMap.get(key);
    			if (currVal > value) {
    				value = currVal; 
    			}
    		}
    		newMap.put(key, value);
    	}
    	return newMap;
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
