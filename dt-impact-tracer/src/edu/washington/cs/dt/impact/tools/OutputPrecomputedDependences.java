/**
 * This class takes as input the prioritization-results and 
 * the parallelization-results directory from executing the 
 * OneConfigurationRunner on a subject with the -resolveDependences
 * flag (to generate the precomputed dependences). The purpose
 * of this class is to parse those results and output the 
 * precomputed dependences to the appropriate locations.
 */

package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.Main.FigureGenerator;
import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.util.Constants;

public class OutputPrecomputedDependences extends FigureGenerator {

	private static String priorOutputDirectoryName = null;
	private static String seleOutputDirectoryName = null;
	private static String paraOutputDirectoryName = null;

	public static void main(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));

		// name of directory where files should be outputted
		priorOutputDirectoryName = mustGetArgName(argsList, "-prioOutputDirectory");
		seleOutputDirectoryName = mustGetArgName(argsList, "-seleOutputDirectory");
		paraOutputDirectoryName = mustGetArgName(argsList, "-paraOutputDirectory");

		String priorDirectoryName = mustGetArgName(argsList, "-prioDirectory");
		String paraDirectoryName = mustGetArgName(argsList, "-paraDirectory");

        File[] prioDirList = new File(priorDirectoryName).listFiles();
        File[] paraDirList = new File(paraDirectoryName).listFiles();

        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<Project>();
        List<Project> proj_auto_arrayList = new ArrayList<Project>();

        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(prioDirList, new OutputPrecomputedDependences(), false, proj_orig_arrayList, proj_auto_arrayList);
        parseFiles(paraDirList, new OutputPrecomputedDependences(), false, proj_orig_arrayList, proj_auto_arrayList);
	}

	@Override
	public void doParaCalculations() {
		int index = flagsList.indexOf("-numOfMachines");
		String numMachines_string = flagsList.get(index + 1);
		int numMachines = Integer.parseInt(numMachines_string);

		outputDependences(techniqueName, numMachines, null, paraOutputDirectoryName);
		if (numMachines == 16 && orderName.equals("original")) {
			outputDependences("selection", numMachines, "function", seleOutputDirectoryName);
			outputDependences("selection", numMachines, "statement", seleOutputDirectoryName);
		}
	}

	@Override
	public void doPrioCalculations() {
		outputDependences(techniqueName, -1, null, priorOutputDirectoryName);
		outputDependences("selection", -1, null, seleOutputDirectoryName);
	}

	private void outputDependences(String techniqueName, int numMachines, String customCoverage, String outputDirStr) {		
		StringBuilder fileName = new StringBuilder();
		fileName.append(techniqueName);
		fileName.append("-");
		fileName.append(projectName);
		fileName.append("-");
		fileName.append(testType);
		fileName.append("-");
		if (techniqueName.equals("parallelization")) {
			fileName.append(numMachines);
		} else {
			if (customCoverage == null) {				
				fileName.append(coverageName);
			} else {
				fileName.append(customCoverage);
			}
		}
		fileName.append("-");
		fileName.append(orderName);
		fileName.append(".txt");

		StringBuilder fileContents = new StringBuilder();
		List<String> dtList = parseFileForDTs(file, Constants.DT_LIST, true);
        for (int j = 0; j < dtList.size();) {
            for (int i = 0; i < 5; j++) {
            	fileContents.append(dtList.get(j) + "\n");
                i++;
            }
            fileContents.append("\n");
        }

        writeToLatexFile(fileContents.toString(), outputDirStr + File.separator + fileName.toString(), false);
	}

	@Override
	public void doSeleCalculations() {
		// doNothing
	}
}