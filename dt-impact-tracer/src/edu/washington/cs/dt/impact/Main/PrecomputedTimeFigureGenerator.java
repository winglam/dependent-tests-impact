package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.data.Project;

public class PrecomputedTimeFigureGenerator extends FigureGenerator {

	public static void main(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));

		// name of directory where files should be outputted
		String outputDirectoryName = mustGetArgName(argsList, "-outputDirectory");

		String priorDirectoryName = mustGetArgName(argsList, "-prioDirectory");
		String seleDirectoryName = mustGetArgName(argsList, "-seleDirectory");
		String paraDirectoryName = mustGetArgName(argsList, "-paraDirectory");
		
        File[] prioDirList = new File(priorDirectoryName).listFiles();
        File[] seleDirList = new File(seleDirectoryName).listFiles();
        File[] paraDirList = new File(paraDirectoryName).listFiles();

        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<Project>();
        List<Project> proj_auto_arrayList = new ArrayList<Project>();
		
        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(prioDirList, new PrecomputedTimeFigureGenerator(), false, proj_orig_arrayList, proj_auto_arrayList);
        parseFiles(seleDirList, new PrecomputedTimeFigureGenerator(), false, proj_orig_arrayList, proj_auto_arrayList);
        parseFiles(paraDirList, new PrecomputedTimeFigureGenerator(), false, proj_orig_arrayList, proj_auto_arrayList);
	}

	@Override
	public void doParaCalculations() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doPrioCalculations() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSeleCalculations() {
		// TODO Auto-generated method stub
	}
}
