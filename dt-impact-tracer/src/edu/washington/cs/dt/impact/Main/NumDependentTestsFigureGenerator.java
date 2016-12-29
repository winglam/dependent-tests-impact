
package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.data.ProjectNumDependentTests;
import edu.washington.cs.dt.impact.tools.FileTools;
import edu.washington.cs.dt.impact.util.Constants;

public class NumDependentTestsFigureGenerator extends FigureGenerator {
	private static final int NUM_PROJECTS = 5;

	/*
	 * a private method to generate a line of LaTeX needed for figure 7
	 *
	 */
	private static String generate7(String projectName, List<String>[] dts, int[] total,
			IntegerWrapper numConfigWithDT) {
		String result = projectName;
		for (int i = 0; i < dts.length; i++) {
			total[i] += dts[i].size();
			int val = dts[i].size();
			result += " & " + val;
			if (val > 0) {
				numConfigWithDT.numConfigWithDT += 1;
			}
		}
		result += " \\\\"; // "\\"
		return result;
	}

	/*
	 * a private method to generate a line of LaTeX needed for figure 8
	 *
	 */
	private static String generate8(String projectName, List<String>[] dts, int[] total,
			IntegerWrapper numConfigWithDT) {
		String result = projectName;
		for (int i = 0; i < dts.length; i++) {
			total[i] += dts[i].size();
			int val = dts[i].size();
			result += " & " + val;
			if (val > 0) {
				numConfigWithDT.numConfigWithDT += 1;
			}
		}
		result += " \\\\"; // "\\"
		return result;
	}

	/*
	 * a private method that generates Figure 9
	 */
	private static String generate9(String projectName, List<String>[] orig_order, List<String>[] time, int[] total,
			IntegerWrapper numConfigWithDT) {
		String result = projectName;
		for (int i = 0; i < orig_order.length; i++) {
			total[i] += orig_order[i].size();
			int val = orig_order[i].size();
			result += " & " + val;
			if (val > 0) {
				numConfigWithDT.numConfigWithDT += 1;
			}
		}
		for (int i = 0; i < time.length; i++) {
			total[i + 4] += time[i].size();
			int val = time[i].size();
			result += " & " + val;
			if (val > 0) {
				numConfigWithDT.numConfigWithDT += 1;
			}
		}
		result += " \\\\"; // "\\"
		return result;
	}

	private static class IntegerWrapper {
		public int numConfigWithDT;
		public int numConfig;

		public IntegerWrapper() {
			numConfigWithDT = 0;
			numConfig = 0;
		}
	}

	/*
	 * a private method to generate the LaTeX format of the data of each Project
	 * in projList
	 *
	 * @param projList a list of Projects that each contain data
	 */
	private static String generateLatexString(List<Project> projList, String type, IntegerWrapper numConfigWithDT) {
		String latexString = "";
		List<Project> sortedList = new ArrayList<Project>();
		sortList(projList, sortedList);
		int[] total;
		if (((ProjectNumDependentTests) sortedList.get(0)).isFig9()) {
			total = new int[NUM_PARA_TECHNIQUES];
		} else if (((ProjectNumDependentTests) sortedList.get(0)).isFig8()) {
			total = new int[NUM_SELE_TECHNIQUES];
		} else {
			total = new int[NUM_PRIOR_TECHNIQUES];
		}

		for (Project temp2 : sortedList) {
			ProjectNumDependentTests temp = (ProjectNumDependentTests) temp2;
			if (temp.isFig9()) {
				if (type.equals("orig")) {
					latexString += generate9(temp.getName(), temp.get_fig9_human_orig(), temp.get_fig9_human_time(),
							total, numConfigWithDT);
				} else {
					latexString += generate9(temp.getName(), temp.get_fig9_auto_orig(), temp.get_fig9_auto_time(),
							total, numConfigWithDT);
				}
				latexString += "\r\n";
			} else if (temp.isFig8()) {
				if (type.equals("orig")) {
					latexString += generate8(temp.getName(), temp.get_fig8_human(), total, numConfigWithDT);
				} else {
					latexString += generate8(temp.getName(), temp.get_fig8_auto(), total, numConfigWithDT);
				}
				latexString += "\r\n";
			} else if (temp.isFig7()) {
				if (type.equals("orig")) {
					latexString += generate7(temp.getName(), temp.get_fig7_human(), total, numConfigWithDT);
				} else {
					latexString += generate7(temp.getName(), temp.get_fig7_auto(), total, numConfigWithDT);
				}
				latexString += "\r\n";
			}
		}

		latexString += "\r\n";
		latexString += "\\hline";
		latexString += "\r\n";
		latexString += "\\textbf{Total}";
		for (int i = 0; i < total.length; i++) {
			latexString += " & ";
			latexString += total[i];
		}
		latexString += "\\\\";

		latexString += "\r\n";
		latexString += "\\hline";

		numConfigWithDT.numConfig += total.length * sortedList.size();

		// take off the "\r\n" from the last line
		return latexString;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));

		// name of directory where files should be outputted
		String outputDirectoryName = mustGetArgName(argsList, "-outputDirectory");

		String priorDirectoryName = getArgName(argsList, "-priorDirectory");
		String seleDirectoryName = getArgName(argsList, "-seleDirectory");
		String paraDirectoryName = getArgName(argsList, "-paraDirectory");

		String minBoundOrigDTFile = getArgName(argsList, "-minBoundOrigDTFile");
		Map<String, Integer> origProjectToDT = parseDTFile(minBoundOrigDTFile);
		String minBoundAutoDTFile = getArgName(argsList, "-minBoundAutoDTFile");
		Map<String, Integer> autoProjectToDT = parseDTFile(minBoundAutoDTFile);

		boolean combineResults = argsList.contains("-combineResults");
		List<List<Project>> proj_orig_arrayList = new ArrayList<List<Project>>();
		List<List<Project>> proj_auto_arrayList = new ArrayList<List<Project>>();

		if (priorDirectoryName != null) {
			// create a list of project Objects that each have a diff project
			// name
			List<Project> prior_proj_orig_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			List<Project> prior_proj_auto_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			setProjectLists(argsList, priorDirectoryName, prior_proj_orig_arrayList, prior_proj_auto_arrayList);
			if (!combineResults) {
				generateLatexFile(outputDirectoryName, prior_proj_orig_arrayList, prior_proj_auto_arrayList);
				proj_orig_arrayList.add(prior_proj_orig_arrayList);
				proj_auto_arrayList.add(prior_proj_auto_arrayList);
		}
		if (seleDirectoryName != null) {
			// create a list of project Objects that each have a diff project
			// name
			List<Project> sele_proj_orig_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			List<Project> sele_proj_auto_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			setProjectLists(argsList, seleDirectoryName, sele_proj_orig_arrayList, sele_proj_auto_arrayList);
			generateLatexFile(outputDirectoryName, sele_proj_orig_arrayList, sele_proj_auto_arrayList);
			proj_orig_arrayList.add(sele_proj_orig_arrayList);
			proj_auto_arrayList.add(sele_proj_auto_arrayList);
		}
		if (paraDirectoryName != null) {
			// create a list of project Objects that each have a diff project
			// name
			List<Project> para_proj_orig_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			List<Project> para_proj_auto_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			setProjectLists(argsList, paraDirectoryName, para_proj_orig_arrayList, para_proj_auto_arrayList);
			generateLatexFile(outputDirectoryName, para_proj_orig_arrayList, para_proj_auto_arrayList);
			proj_orig_arrayList.add(para_proj_orig_arrayList);
			proj_auto_arrayList.add(para_proj_auto_arrayList);
		}

		checkProjectLists(proj_orig_arrayList, true);
		checkProjectLists(proj_auto_arrayList, false);

		if (proj_orig_arrayList.size() != proj_orig_arrayList.size()) {
			throw new RuntimeException(
					"Auto and Orig number of techniques and test suites given is not the same (prior-orig, prior-auto, ...)");
		}

		Map<String, StringBuilder> projectToStr = new TreeMap<String, StringBuilder>();

		Map<String, List<List<Set<String>>>> typeToTechnique = new HashMap<String, List<List<Set<String>>>>();
		typeToTechnique.put("orig", initDTsExposedPerAlgoArray());
		typeToTechnique.put("auto", initDTsExposedPerAlgoArray());

		for (int i = 0; i < proj_orig_arrayList.size(); i++) {
			List<Project> origList = new ArrayList<Project>();
			List<Project> autoList = new ArrayList<Project>();

			sortList(proj_orig_arrayList.get(i), origList);
			sortList(proj_auto_arrayList.get(i), autoList);

			for (int j = 0; j < origList.size(); j++) {
				ProjectNumDependentTests origProj = (ProjectNumDependentTests) origList.get(j);
				ProjectNumDependentTests autoProj = (ProjectNumDependentTests) autoList.get(j);

				if (!origProj.getName().equals(autoProj.getName())) {
					throw new RuntimeException("Orig and Auto project names do not match.");
				}

				StringBuilder sb = projectToStr.get(origProj.getName());
				if (sb == null) {
					sb = new StringBuilder();
					sb.append(origProj.getName());
					sb.append(" &");
					projectToStr.put(origProj.getName(), sb);
				}

				Set<String> origDTs = new HashSet<String>();
				Set<String> autoDTs = new HashSet<String>();

				if (origProj.isFig9()) {
					// typeToTechnique.get("orig").get(2) gets list of
					// parallelization techniques
					// typeToTechnique.get("orig").get(2).get(0) gets set of
					// DTs for a specific parallelization technique
					for (List<String> DTs : origProj.get_fig9_human_orig()) {
						origDTs.addAll(DTs);
						typeToTechnique.get("orig").get(2).get(0).addAll(DTs);
					}
					for (List<String> DTs : origProj.get_fig9_human_time()) {
						origDTs.addAll(DTs);
						typeToTechnique.get("orig").get(2).get(1).addAll(DTs);
					}
					for (List<String> DTs : autoProj.get_fig9_auto_orig()) {
						autoDTs.addAll(DTs);
						typeToTechnique.get("auto").get(2).get(0).addAll(DTs);
					}
					for (List<String> DTs : autoProj.get_fig9_auto_time()) {
						autoDTs.addAll(DTs);
						typeToTechnique.get("auto").get(2).get(1).addAll(DTs);
					}
				} else if (origProj.isFig8()) {
					for (int k = 0; k < origProj.get_fig8_human().length; k++) {
						origDTs.addAll(origProj.get_fig8_human()[k]);
						typeToTechnique.get("orig").get(1).get(k).addAll(origProj.get_fig8_human()[k]);
					}
					for (int k = 0; k < autoProj.get_fig8_auto().length; k++) {
						autoDTs.addAll(autoProj.get_fig8_auto()[k]);
						typeToTechnique.get("auto").get(1).get(k).addAll(autoProj.get_fig8_auto()[k]);
					}
				} else if (origProj.isFig7()) {
					for (int k = 0; k < origProj.get_fig7_human().length; k++) {
						origDTs.addAll(origProj.get_fig7_human()[k]);
						typeToTechnique.get("orig").get(0).get(k).addAll(origProj.get_fig7_human()[k]);
					}
					for (int k = 0; k < autoProj.get_fig7_auto().length; k++) {
						autoDTs.addAll(autoProj.get_fig7_auto()[k]);
						typeToTechnique.get("auto").get(0).get(k).addAll(autoProj.get_fig7_auto()[k]);
					}
				}
				sb.append(" ");
				double origPercent = (double) origDTs.size() / origProjectToDT.get(origProj.getName());
				sb.append(formatPercent(origPercent));
				sb.append(" & ");
				double autoPercent = (double) autoDTs.size() / autoProjectToDT.get(autoProj.getName());
				sb.append(formatPercent(autoPercent));
			}
		}

		String perProgramOutputFilename = outputDirectoryName + System.getProperty("file.separator")
				+ "dts-per-program.tex";
		StringBuilder perProgramString = new StringBuilder();
		for (String key : projectToStr.keySet()) {
			perProgramString.append(projectToStr.get(key));
			perProgramString.append(" \\\\\r\n");
		}
		writeToLatexFile(perProgramString.toString(), perProgramOutputFilename, false);

		// Get total number of minimum lower bound of DTs
		int origLowerBoundSum = 0, autoLowerBoundSum = 0;
		for (String key : origProjectToDT.keySet()) {
			origLowerBoundSum += origProjectToDT.get(key);
		}
		for (String key : autoProjectToDT.keySet()) {
			autoLowerBoundSum += autoProjectToDT.get(key);
		}

		String perAlgoOutputFilename = outputDirectoryName + System.getProperty("file.separator")
				+ "dts-per-algorithm.tex";
		StringBuilder perAlgoString = new StringBuilder();
		perAlgoString.append("Prog");
		buildPerAlgoString(perAlgoString, typeToTechnique, origLowerBoundSum, "orig");
		perAlgoString.append(" \\\\\r\n");
		perAlgoString.append("Auto");
		buildPerAlgoString(perAlgoString, typeToTechnique, autoLowerBoundSum, "auto");
		perAlgoString.append(" \\\\\r\n");
		writeToLatexFile(perAlgoString.toString(), perAlgoOutputFilename, false);
		}
	}

	private static void buildPerAlgoString(StringBuilder perAlgoString,
			Map<String, List<List<Set<String>>>> typeToTechnique, int lowerBound, String testType) {
		for (int i = 0; i < typeToTechnique.get(testType).size(); i++) {
			for (int j = 0; j < typeToTechnique.get(testType).get(i).size(); j++) {
				double origPercent = (double) typeToTechnique.get(testType).get(i).get(j).size() / lowerBound;
				perAlgoString.append(" & ");
				perAlgoString.append(formatPercent(origPercent));
			}
		}
	}

	private static List<List<Set<String>>> initDTsExposedPerAlgoArray() {
		List<List<Set<String>>> retArr = new ArrayList<List<Set<String>>>();

		// prioritization
		List<Set<String>> priorArr = new ArrayList<Set<String>>();
		for (int i = 0; i < NUM_PRIOR_TECHNIQUES; i++) {
			priorArr.add(new HashSet<String>());
		}
		retArr.add(priorArr);

		// selection
		List<Set<String>> seleArr = new ArrayList<Set<String>>();
		for (int i = 0; i < NUM_SELE_TECHNIQUES; i++) {
			seleArr.add(new HashSet<String>());
		}
		retArr.add(seleArr);

		// parallelization
		List<Set<String>> paraArr = new ArrayList<Set<String>>();
		for (int i = 0; i < NUM_PARA_NO_K_TECHNIQUES; i++) {
			paraArr.add(new HashSet<String>());
		}
		retArr.add(paraArr);

		return retArr;
	}

	public static Map<String, Integer> parseDTFile(String fileName) {
		List<String> dtFile = FileTools.parseFileToList(new File(fileName));
		Map<String, Integer> projectToDT = new HashMap<String, Integer>();
		for (String s : dtFile) {
			String[] sArr = s.split(" ");
			projectToDT.put(mapNameToProjectName(sArr[0]), Integer.parseInt(sArr[1]));
		}
		return projectToDT;
	}

	public static void checkProjectLists(List<List<Project>> proj_arrayList, boolean isOrig) {
		for (int i = 0; i < proj_arrayList.size(); i++) {
			for (int j = i; j < proj_arrayList.size(); j++) {
				if (proj_arrayList.get(i).size() != proj_arrayList.get(j).size()) {
					if (isOrig) {
						throw new RuntimeException("Two lists in orig order have different number of projects.");
					} else {
						throw new RuntimeException("Two lists in auto order have different number of projects.");
					}
				}
			}
		}
	}

	public static void generateLatexFile(String outputDirectoryName, List<Project> proj_orig_arrayList,
			List<Project> proj_auto_arrayList) {
		IntegerWrapper numConfigWithDT = new IntegerWrapper();

		// generate LaTeX for the human-written and automatic test suites
		String origLatexString = generateLatexString(proj_orig_arrayList, "orig", numConfigWithDT);
		String autoLatexString = generateLatexString(proj_auto_arrayList, "auto", numConfigWithDT);
		origLatexString += "\n%Number of configurations with DT (including orig and auto): "
				+ numConfigWithDT.numConfigWithDT;
		origLatexString += "\n%Number of configurations (including orig and auto): " + numConfigWithDT.numConfig;
		autoLatexString += "\n%Number of configurations with DT (including orig and auto): "
				+ numConfigWithDT.numConfigWithDT;
		autoLatexString += "\n%Number of configurations (including orig and auto): " + numConfigWithDT.numConfig;

		String origOutputFilename = outputDirectoryName + System.getProperty("file.separator");
		String autoOutputFilename = outputDirectoryName + System.getProperty("file.separator");
		if ((!proj_orig_arrayList.isEmpty() && ((ProjectNumDependentTests) proj_orig_arrayList.get(0)).isFig9())
				|| (!proj_auto_arrayList.isEmpty()
						&& ((ProjectNumDependentTests) proj_auto_arrayList.get(0)).isFig9())) {
			origOutputFilename += "figure9-orig-results.tex";
			autoOutputFilename += "figure9-auto-results.tex";
		} else if ((!proj_orig_arrayList.isEmpty() && ((ProjectNumDependentTests) proj_orig_arrayList.get(0)).isFig8())
				|| (!proj_auto_arrayList.isEmpty()
						&& ((ProjectNumDependentTests) proj_auto_arrayList.get(0)).isFig8())) {
			origOutputFilename += "figure8-orig-results.tex";
			autoOutputFilename += "figure8-auto-results.tex";
		} else { // fig 7
			origOutputFilename += "figure7-orig-results.tex";
			autoOutputFilename += "figure7-auto-results.tex";
		}

		writeToLatexFile(origLatexString, origOutputFilename, false);
		writeToLatexFile(autoLatexString, autoOutputFilename, false);
	}

	public static void setProjectLists(List<String> argsList, String directoryName, List<Project> proj_orig_arrayList,
			List<Project> proj_auto_arrayList) {

		// String minBoundDependencesOrig = getArgName(argsList,
		// "-minBoundDependencesOrig");
		// String minBoundDependencesAuto = getArgName(argsList,
		// "-minBoundDependencesAuto");

		/*
		 * 7: prioritization 8: selection 9: parallelizaiton
		 */

		File directory = new File(directoryName);
		File[] fList = directory.listFiles();

		for (File file : fList) {
			if (file.isFile()) {

				// String containing all the flags
				String flagsInFile = getFlagsLine(file, Constants.ARGUMENT_STRING);
				if (flagsInFile == null) {
					continue;
				}
				// get rid of square brackets
				flagsInFile = flagsInFile.substring(1, flagsInFile.length() - 1);
				String[] flags = flagsInFile.split(",");
				List<String> flagsList = Arrays.asList(flags);
				// get rid of whitespaces
				for (int i = 0; i < flagsList.size(); i++) {
					flagsList.set(i, flagsList.get(i).trim());
				}
				int index = flagsList.indexOf("-technique");
				// index + 1 because want arg after the index of flag
				String techniqueName = flagsList.get(index + 1);

				index = flagsList.indexOf("-coverage");
				String coverageName = flagsList.get(index + 1);

				index = flagsList.indexOf("-order");
				String orderName = flagsList.get(index + 1);

				index = flagsList.indexOf("-project");
				String projectName = mapNameToProjectName(flagsList.get(index + 1));

				index = flagsList.indexOf("-testType");
				String testType = flagsList.get(index + 1);

				index = flagsList.indexOf("-dependentTestFile");
				if (index != -1) { // only count files without dependentTestFile
					continue;
				}
				// see if List needs to orig or auto generated one
				List<Project> currProjList = null;
				if (testType.equals("auto")) {
					currProjList = proj_auto_arrayList;
				} else if (testType.equals("orig")) {
					currProjList = proj_orig_arrayList;
				}

				// index of this project in the arrayList, might be -1 if not
				// found
				int indexOfProj = indexOfByName(currProjList, projectName);

				// Project Object that corresponds to the current project name
				// in this file
				Project currProj2 = null;

				if (indexOfProj != -1) {
					currProj2 = currProjList.get(indexOfProj);
				} else {// projectName not seen before
					currProj2 = new ProjectNumDependentTests(projectName);
					currProjList.add(currProj2);
				}
				ProjectNumDependentTests currProj = (ProjectNumDependentTests) currProj2;

				// get the number of dts
				List<String> numTotal = parseFileForDTs(file, Constants.NOT_FIXED_DTS);

				// parallelization technique, figure 9
				if (techniqueName.equals("parallelization")) {
					// order will be time or original
					// k = 2, 4, 8, 16 is the number of machines
					index = flagsList.indexOf("-numOfMachines");
					String numMachines_string = flagsList.get(index + 1);
					int numMachines = Integer.parseInt(numMachines_string);

					currProj.useFig9();
					// this array will correspond to P1 or P2
					List<String>[] curr_fig9_human, curr_fig9_auto;
					if (orderName.equals("original")) {
						curr_fig9_human = currProj.get_fig9_human_orig();
						curr_fig9_auto = currProj.get_fig9_auto_orig();
					} else if (orderName.equals("time")) { // orderName == time
						curr_fig9_human = currProj.get_fig9_human_time();
						curr_fig9_auto = currProj.get_fig9_auto_time();
					} else {
						exitWithError("Unexpected order: " + orderName);
						curr_fig9_human = null;
						curr_fig9_auto = null;
					}

					if (testType.equals("orig")) { // human
						if (numMachines == 2) {
							curr_fig9_human[0] = numTotal;
						} else if (numMachines == 4) {
							curr_fig9_human[1] = numTotal;
						} else if (numMachines == 8) {
							curr_fig9_human[2] = numTotal;
						} else if (numMachines == 16) {
							curr_fig9_human[3] = numTotal;
						} else {
							exitWithError("Unexpected numMachines: " + numMachines);
						}
					} else if (testType.equals("auto")) // auto
					{
						if (numMachines == 2) {
							curr_fig9_auto[0] = numTotal;
						} else if (numMachines == 4) {
							curr_fig9_auto[1] = numTotal;
						} else if (numMachines == 8) {
							curr_fig9_auto[2] = numTotal;
						} else if (numMachines == 16) {
							curr_fig9_auto[3] = numTotal;
						} else {
							exitWithError("Unexpected numMachines: " + numMachines);
						}
					} else {
						exitWithError("Unexpected testType: " + testType);
					}

				} // selection technique, figure 8
				else if (techniqueName.equals("selection")) {
					currProj.useFig8();
					List<String>[] fig8_human = currProj.get_fig8_human();
					List<String>[] fig8_auto = currProj.get_fig8_auto();
					if (testType.equals("orig")) { // human

						if (coverageName.equals("statement")) {
							if (orderName.equals("original")) {
								// S1
								fig8_human[0] = numTotal;
							} else if (orderName.equals("absolute")) {
								// S2
								fig8_human[1] = numTotal;
							} else if (orderName.equals("relative")) {
								// S3
								fig8_human[2] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("original")) {
								// S4
								fig8_human[3] = numTotal;
							} else if (orderName.equals("absolute")) {
								// S5
								fig8_human[4] = numTotal;
							} else if (orderName.equals("relative")) {
								// S6
								fig8_human[5] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else {
							exitWithError("Unexpected coverageName: " + coverageName);
						}
					} else if (testType.equals("auto")) { // auto
						if (coverageName.equals("statement")) {
							if (orderName.equals("original")) {
								// S1
								fig8_auto[0] = numTotal;
							} else if (orderName.equals("absolute")) {
								// S2
								fig8_auto[1] = numTotal;
							} else if (orderName.equals("relative")) {
								// S3
								fig8_auto[2] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("original")) {
								// S4
								fig8_auto[3] = numTotal;
							} else if (orderName.equals("absolute")) {
								// S5
								fig8_auto[4] = numTotal;
							} else if (orderName.equals("relative")) {
								// S6
								fig8_auto[5] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else {
							exitWithError("Unexpected coverageName: " + coverageName);
						}
					} else {
						exitWithError("Unexpected testType: " + testType);
					}
				} // prioritization techinque, figure 7
				else if (techniqueName.equals("prioritization")) {
					currProj.useFig7();
					if (orderName.equals("original")) {
						continue;
					}
					List<String>[] fig7_human = currProj.get_fig7_human();
					List<String>[] fig7_auto = currProj.get_fig7_auto();
					if (testType.equals("orig")) { // human
						if (coverageName.equals("statement")) {
							if (orderName.equals("absolute")) {
								// T3
								fig7_human[0] = numTotal;
							} else if (orderName.equals("relative")) { // relative
								// T4
								fig7_human[1] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("absolute")) {
								// T5
								fig7_human[2] = numTotal;
							} else if (orderName.equals("relative")) { // relative
								// T7
								fig7_human[3] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else {
							exitWithError("Unexpected coverageName: " + coverageName);
						}
					} else if (testType.equals("auto")) { // auto
						if (coverageName.equals("statement")) {
							if (orderName.equals("absolute")) {
								// T3
								fig7_auto[0] = numTotal;
							} else if (orderName.equals("relative")) {
								// T4
								fig7_auto[1] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("absolute")) {
								// T5
								fig7_auto[2] = numTotal;
							} else if (orderName.equals("relative")) {
								// T7
								fig7_auto[3] = numTotal;
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else {
							exitWithError("Unexpected coverageName: " + coverageName);
						}
					} else {
						exitWithError("Unexpected testType: " + testType);
					}
				} else {
					exitWithError("Unexpected techniqueName: " + techniqueName);
				}
			}
		}
	}
}
