package edu.washington.cs.dt.impact.figure.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.data.ProjectPrecomputedDependencesTime;

public class PrecomputedTimeFigureGenerator extends FigureGenerator {

	public static void main(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));

		// name of directory where files should be outputted
		String outputDirectoryName = mustGetArgName(argsList, "-outputDirectory");

		String priorDirectoryName = mustGetArgName(argsList, "-prioDirectory");
		String paraDirectoryName = mustGetArgName(argsList, "-paraDirectory");
		
        File[] prioDirList = new File(priorDirectoryName).listFiles();
        File[] paraDirList = new File(paraDirectoryName).listFiles();

        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<Project>();
        List<Project> proj_auto_arrayList = new ArrayList<Project>();
		
        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(prioDirList, new PrecomputedTimeFigureGenerator(), false, proj_orig_arrayList, proj_auto_arrayList);
        parseFiles(paraDirList, new PrecomputedTimeFigureGenerator(), false, proj_orig_arrayList, proj_auto_arrayList);

        sortList(proj_orig_arrayList);
        sortList(proj_auto_arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < proj_orig_arrayList.size(); i++) {
        	ProjectPrecomputedDependencesTime origProj = (ProjectPrecomputedDependencesTime) proj_orig_arrayList.get(i);
        	ProjectPrecomputedDependencesTime autoProj = (ProjectPrecomputedDependencesTime) proj_auto_arrayList.get(i);
        	sb.append(origProj.getName());
        	sb.append(" & ");
        	sb.append(origProj.getSuiteAvgTime());
        	sb.append(" & ");
        	sb.append(autoProj.getSuiteAvgTime());
        	sb.append(" & ");
        	sb.append(origProj.getPrioAvgTime());
        	sb.append(" & ");
        	sb.append(autoProj.getPrioAvgTime());
        	sb.append(" & ");
        	sb.append(origProj.getSeleAvgTime());
        	sb.append(" & ");
        	sb.append(autoProj.getSeleAvgTime());
        	sb.append(" & ");
        	sb.append(origProj.getParaAvgTime());
        	sb.append(" & ");
        	sb.append(autoProj.getParaAvgTime());
        	sb.append(" \\\\\r\n");
        }
        writeToLatexFile(sb.toString(), outputDirectoryName + File.separator + "precomputed-dependences-time-per-program.tex", false);
	}

	@Override
	public void doParaCalculations() {
		ProjectPrecomputedDependencesTime currProj = (ProjectPrecomputedDependencesTime) FigureGenerator.currProj;
		currProj.setParaTime(avgDepFindTime);

		int index = flagsList.indexOf("-numOfMachines");
		String numMachines_string = flagsList.get(index + 1);
		int numMachines = Integer.parseInt(numMachines_string);

		if (numMachines == 16 && orderName.equals("original")) {
			currProj.setSeleTime(avgDepFindTime);
		}
	}

	@Override
	public void doPrioCalculations() {
		ProjectPrecomputedDependencesTime currProj = (ProjectPrecomputedDependencesTime) FigureGenerator.currProj;
		if (orderName.equals("original")) {
			currProj.setSuiteTime(avgDepFindTime);
		} else {
			currProj.setPrioTime(avgDepFindTime);
			currProj.setSeleTime(avgDepFindTime);
		}
	}

	@Override
	public void doSeleCalculations() {
		// doNothing
	}
}
