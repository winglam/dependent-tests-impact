/** 
 * Get list/number of unique DTs listed in ORIG_MIN_DTs.txt and 
 * AUTO_MIN_DTs.txt. The input can be a folder containing the 
 * precomputed dependences of a subject or it can be the results
 * of that subject from the OneConfigurationRunner.
*/ 

package edu.washington.cs.dt.impact.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import edu.washington.cs.dt.impact.util.Constants;

public class GetAllUniqueDTs {
	private static final Pattern REGEX_HIDDEN_FILES = Pattern.compile("^\\.\\w*$");
	   
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        File currentOrder = null;
        int currentOrderFile = argsList.indexOf("-currentOrder");
        if (currentOrderFile != -1) {
            int currentOrderFileNameIndex = currentOrderFile + 1;
            if (currentOrderFileNameIndex >= argsList.size()) {
                System.err.println("Current order argument is specified but a file name is not."
                        + " Please use the format: -currentOrder aFileName");
                System.exit(0);
            }
            currentOrder = new File(argsList.get(currentOrderFileNameIndex));
        }
        
        File directory = null;
        int directoryFile = argsList.indexOf("-directory");
        if (directoryFile != -1) {
            int directoryFileNameIndex = directoryFile + 1;
            if (directoryFileNameIndex >= argsList.size()) {
                System.err.println("Directory argument is specified but a file name is not."
                        + " Please use the format: -directory aFileName");
                System.exit(0);
            }
            directory = new File(argsList.get(directoryFileNameIndex));
        } else {
            System.err.println("No directory file specified."
                    + " Please use the format: -directory aFileName");
            System.exit(0);
        }

        boolean oneConfigOutput = argsList.contains("-oneConfigOutput");
        
        File[] files = directory.listFiles();
        
        Set<String> tests = new HashSet<String>();
        for (File f : files) {
            if (REGEX_HIDDEN_FILES.matcher((f.getName())).find() || f.getName().contains("dt-list.txt")) {
                continue;
            }
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(f));
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.length() == 0) {
                        continue;
                    }
                    if (!oneConfigOutput) {
                        String testName = line.split(Constants.TEST_LINE)[1];
                        
                        tests.add(testName);

                        // intended behavior line
                        br.readLine();

                        // tests reveal dependence when executed after testName
                        br.readLine();

                        // revealed behavior line
                        br.readLine();

                        // tests reveal dependence when executed before testName
                        br.readLine();
                    } else {
                    	if (line.contains("DTs not fixed are:")) {
                    		String testList = br.readLine();
                    		String[] testsArr = testList.substring(1, testList.length() - 1).split(",");
                    		for (String test : testsArr) {
                    			tests.add(test.trim());
                    		}
                    	}
                    }                
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        FileTools.printListToFile(tests, new File(directory.getAbsolutePath() + "/dt-list.txt"));
        
        if (currentOrder != null) {
        	List<String> currentOrderList = FileTools.parseFileToList(currentOrder);
        	currentOrderList.removeAll(tests);
        	FileTools.printListToFile(currentOrderList, currentOrder);
        }
    }
}
