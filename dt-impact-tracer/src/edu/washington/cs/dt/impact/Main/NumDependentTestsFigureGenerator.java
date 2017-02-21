
package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.text.DecimalFormat;
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
	private static final int NUM_PROJECTS = 6;
	private static final String FIGURE_GENERATOR_COMMAND_FILE = "figureGeneratorCommands.tex";

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
		public double origTotalNumDTsInAllAlgorithms;
		public double autoTotalNumDTsInAllAlgorithms;
		public double[] origParaTotalNumDTInAllAlgorithms;
		public double[] autoParaTotalNumDTInAllAlgorithms;

		public IntegerWrapper() {
			numConfigWithDT = 0;
			numConfig = 0;
			origTotalNumDTsInAllAlgorithms = 0.0;
			autoTotalNumDTsInAllAlgorithms = 0.0;
			origParaTotalNumDTInAllAlgorithms = new double[4];
			autoParaTotalNumDTInAllAlgorithms = new double[4];
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
		sortList(projList);
		int[] total;
		if (((ProjectNumDependentTests) projList.get(0)).isFig9()) {
			total = new int[NUM_PARA_TECHNIQUES];
		} else if (((ProjectNumDependentTests) projList.get(0)).isFig8()) {
			total = new int[NUM_SELE_TECHNIQUES];
		} else {
			total = new int[NUM_PRIOR_TECHNIQUES];
		}

		boolean isFig9 = false;
		for (Project temp2 : projList) {
			ProjectNumDependentTests temp = (ProjectNumDependentTests) temp2;
			if (temp.isFig9()) {
				isFig9 = true;
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
		int sum = 0;
		for (int i = 0; i < total.length; i++) {
			latexString += " & ";
			latexString += total[i];
			sum += total[i];
		}
		latexString += "\\\\";

		latexString += "\r\n";
		latexString += "\\hline";

		numConfigWithDT.numConfig += total.length * projList.size();
		if (type.equals("orig")) {
			numConfigWithDT.origTotalNumDTsInAllAlgorithms = ((double) sum) / total.length;
		} else {
			numConfigWithDT.autoTotalNumDTsInAllAlgorithms = ((double) sum) / total.length;
		}

		if (isFig9) {
			for (int i = 0; i < total.length; i++) {
				int index = i;
				if (index > 3) {
					index -= 4;
				}
				if (type.equals("orig")) {
					numConfigWithDT.origParaTotalNumDTInAllAlgorithms[index] += total[i];
				} else {
					numConfigWithDT.autoParaTotalNumDTInAllAlgorithms[index] += total[i];
				}
			}
		}

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

		int maxOrigDT = sumProjectToDT(origProjectToDT);
		int maxAutoDT = sumProjectToDT(autoProjectToDT);

		boolean outputPrecomputedDependencesTime = argsList.contains("-getPrecomputedDependencesTime");
		boolean getDTLists = argsList.contains("-getDTLists");

		List<List<Project>> proj_orig_arrayList = new ArrayList<List<Project>>();
		List<List<Project>> proj_auto_arrayList = new ArrayList<List<Project>>();

		// delete existing figureGeneratorCommand.tex
		writeToLatexFile("", FIGURE_GENERATOR_COMMAND_FILE, false);

		if (priorDirectoryName != null) {
			// create a list of project Objects that each have a diff project
			// name
			List<Project> prior_proj_orig_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			List<Project> prior_proj_auto_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			setProjectLists(argsList, priorDirectoryName, prior_proj_orig_arrayList, prior_proj_auto_arrayList, getDTLists);
			generateLatexFile(outputDirectoryName, prior_proj_orig_arrayList, prior_proj_auto_arrayList, maxOrigDT, maxAutoDT);
			proj_orig_arrayList.add(prior_proj_orig_arrayList);
			proj_auto_arrayList.add(prior_proj_auto_arrayList);
		}
		if (seleDirectoryName != null) {
			// create a list of project Objects that each have a diff
			// project
			// name
			List<Project> sele_proj_orig_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			List<Project> sele_proj_auto_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			setProjectLists(argsList, seleDirectoryName, sele_proj_orig_arrayList, sele_proj_auto_arrayList, getDTLists);
			generateLatexFile(outputDirectoryName, sele_proj_orig_arrayList, sele_proj_auto_arrayList, maxOrigDT, maxAutoDT);
			proj_orig_arrayList.add(sele_proj_orig_arrayList);
			proj_auto_arrayList.add(sele_proj_auto_arrayList);
		}
		if (paraDirectoryName != null) {
			// create a list of project Objects that each have a diff
			// project
			// name
			List<Project> para_proj_orig_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			List<Project> para_proj_auto_arrayList = new ArrayList<Project>(NUM_PROJECTS);
			setProjectLists(argsList, paraDirectoryName, para_proj_orig_arrayList, para_proj_auto_arrayList, getDTLists);
			generateLatexFile(outputDirectoryName, para_proj_orig_arrayList, para_proj_auto_arrayList, maxOrigDT, maxAutoDT);
			proj_orig_arrayList.add(para_proj_orig_arrayList);
			proj_auto_arrayList.add(para_proj_auto_arrayList);
		}

		checkProjectLists(proj_orig_arrayList, true);
		checkProjectLists(proj_auto_arrayList, false);

		if (proj_orig_arrayList.size() != proj_orig_arrayList.size()) {
			throw new RuntimeException(
					"Auto and Orig number of techniques and test suites given is not the same (prior-orig, prior-auto, ...)");
		}

		Map<String, List<String>> projectToStr = new TreeMap<String, List<String>>();
		Map<String, List<String>> projectToPrecomputedDepValues = new TreeMap<String, List<String>>();

		Map<String, List<List<Set<String>>>> typeToTechnique = new HashMap<String, List<List<Set<String>>>>();
		typeToTechnique.put("orig", initDTsExposedPerAlgoArray());
		typeToTechnique.put("auto", initDTsExposedPerAlgoArray());

		for (int i = 0; i < proj_orig_arrayList.size(); i++) {
			List<Project> origList = proj_orig_arrayList.get(i);
			List<Project> autoList = proj_auto_arrayList.get(i);

			sortList(origList);
			sortList(autoList);

			for (int j = 0; j < origList.size(); j++) {
				ProjectNumDependentTests origProj = (ProjectNumDependentTests) origList.get(j);
				ProjectNumDependentTests autoProj = (ProjectNumDependentTests) autoList.get(j);

				if (!origProj.getName().equals(autoProj.getName())) {
					throw new RuntimeException("Orig and Auto project names do not match.");
				}

				List<String> preDepSb = projectToPrecomputedDepValues.get(origProj.getName());
				if (preDepSb == null) {
					preDepSb = new ArrayList<String>();
					projectToPrecomputedDepValues.put(origProj.getName(), preDepSb);
				}

				List<String> sb = projectToStr.get(origProj.getName());
				if (sb == null) {
					sb = new ArrayList<String>();
					projectToStr.put(origProj.getName(), sb);
				}

				Set<String> origDTs = new HashSet<String>();
				Set<String> autoDTs = new HashSet<String>();

				double avgPreDepOrigTime = 0.0;
				double avgPreDepAutoTime = 0.0;

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

					// If we want parallelization information for just k=16
					//					origDTs.addAll(origProj.get_fig9_human_orig()[3]);
					//					typeToTechnique.get("orig").get(2).get(0).addAll(origProj.get_fig9_human_orig()[3]);
					//
					//					origDTs.addAll(origProj.get_fig9_human_time()[3]);
					//					typeToTechnique.get("orig").get(2).get(1).addAll(origProj.get_fig9_human_time()[3]);
					//
					//					autoDTs.addAll(autoProj.get_fig9_auto_orig()[3]);
					//					typeToTechnique.get("auto").get(2).get(0).addAll(autoProj.get_fig9_auto_orig()[3]);
					//
					//					autoDTs.addAll(autoProj.get_fig9_auto_time()[3]);
					//					typeToTechnique.get("auto").get(2).get(1).addAll(autoProj.get_fig9_auto_time()[3]);

					avgPreDepOrigTime = computeAverageTimeInArray(origProj.getFig9_human_fixed_time());
					avgPreDepAutoTime = computeAverageTimeInArray(autoProj.getFig9_auto_fixed_time());
				} else if (origProj.isFig8()) {
					for (int k = 0; k < origProj.get_fig8_human().length; k++) {
						origDTs.addAll(origProj.get_fig8_human()[k]);
						typeToTechnique.get("orig").get(1).get(k).addAll(origProj.get_fig8_human()[k]);
					}
					for (int k = 0; k < autoProj.get_fig8_auto().length; k++) {
						autoDTs.addAll(autoProj.get_fig8_auto()[k]);
						typeToTechnique.get("auto").get(1).get(k).addAll(autoProj.get_fig8_auto()[k]);
					}
					avgPreDepOrigTime = computeAverageTimeInArray(origProj.getFig8_human_fixed_time());
					avgPreDepAutoTime = computeAverageTimeInArray(autoProj.getFig8_auto_fixed_time());
				} else if (origProj.isFig7()) {
					for (int k = 0; k < origProj.get_fig7_human().length; k++) {
						origDTs.addAll(origProj.get_fig7_human()[k]);
						typeToTechnique.get("orig").get(0).get(k).addAll(origProj.get_fig7_human()[k]);
					}
					for (int k = 0; k < autoProj.get_fig7_auto().length; k++) {
						autoDTs.addAll(autoProj.get_fig7_auto()[k]);
						typeToTechnique.get("auto").get(0).get(k).addAll(autoProj.get_fig7_auto()[k]);
					}
					avgPreDepOrigTime = computeAverageTimeInArray(origProj.getFig7_human_fixed_time());
					avgPreDepAutoTime = computeAverageTimeInArray(autoProj.getFig7_auto_fixed_time());
				}
				double origPercent = (double) origDTs.size() / origProjectToDT.get(origProj.getName());
				sb.add(formatPercent(origPercent, false));
				double autoPercent = (double) autoDTs.size() / autoProjectToDT.get(autoProj.getName());
				sb.add(formatPercent(autoPercent, false));

				preDepSb.add(formatTimeToString(avgPreDepOrigTime));
				preDepSb.add(formatTimeToString(avgPreDepAutoTime));
			}
		}

		if (outputPrecomputedDependencesTime) {
			String precomputedDepTimeOutputFilename = outputDirectoryName + System.getProperty("file.separator")
				+ "precomputed-dependences-time-per-program.tex";
			writeToLatexFile(addPhantomZerosToString(projectToPrecomputedDepValues), precomputedDepTimeOutputFilename, false);
		}

		String perProgramOutputFilename = outputDirectoryName + System.getProperty("file.separator")
				+ "dts-per-program.tex";
		writeToLatexFile(addPhantomZerosToString(projectToStr), perProgramOutputFilename, false);

		Map<String, List<String>> perAlgoMap = new HashMap<String, List<String>>();
		List<String> perAlgoProgList = new ArrayList<String>();
		List<String> perAlgoAutoList = new ArrayList<String>();
		perAlgoMap.put("Prog", perAlgoProgList);
		perAlgoMap.put("Auto", perAlgoAutoList);

		buildPerAlgoString(perAlgoProgList, typeToTechnique, maxOrigDT, "orig");
		buildPerAlgoString(perAlgoAutoList, typeToTechnique, maxAutoDT, "auto");

		String perAlgoOutputFilename = outputDirectoryName + System.getProperty("file.separator")
		+ "dts-per-algorithm.tex";
		writeToLatexFile(addPhantomZerosToString(perAlgoMap), perAlgoOutputFilename, false);
	}

	private static String addPhantomZerosToString(Map<String, List<String>> projectToStr) {
		StringBuilder perProgramString = new StringBuilder();

		int size = projectToStr.values().iterator().next().size();
		int[] maxSizes = new int[size];
		for (int k = 0; k < size; k++) {
			for (String key : projectToStr.keySet()) {
				List<String> values = projectToStr.get(key);
				int valueSize = values.get(k).length();
				if (maxSizes[k] < valueSize) {
					maxSizes[k] = valueSize;
				}
			}
		}

		for (String key : projectToStr.keySet()) {
			List<String> values = projectToStr.get(key);
			perProgramString.append(key);
			for (int k = 0; k < values.size(); k++) {
				perProgramString.append(" & ");
				int valueSize = values.get(k).length();
				while (valueSize < maxSizes[k]) {
					perProgramString.append("\\z");
					valueSize += 1;
				}
				perProgramString.append(values.get(k));
			}
			perProgramString.append(" \\\\\r\n");
		}
		return perProgramString.toString();
	}

	private static String formatTimeToString(double time) {
		int intTime = (int) time;

	    final int MINUTES_IN_AN_HOUR = 60;
	    final int SECONDS_IN_A_MINUTE = 60;

	    int minutes = intTime / SECONDS_IN_A_MINUTE;
	    intTime -= minutes * SECONDS_IN_A_MINUTE;

	    int hours = minutes / MINUTES_IN_AN_HOUR;
	    minutes -= hours * MINUTES_IN_AN_HOUR;
		
	    // return in seconds
		double retTime = hours * 60.0 * 60.0;
		retTime += minutes * 60.0;
		retTime += intTime;
		
		DecimalFormat f = new DecimalFormat("#0");
		return f.format(retTime);
	}
	
	private static int sumProjectToDT(Map<String, Integer> projectToDT) {
		int sum = 0;
		for (String key : projectToDT.keySet()) {
			sum += projectToDT.get(key);
		}
		return sum;
	}

	private static double computeAverageTimeInArray(double[] timeArr) {
		int count = 0;
		double sum = 0.0;
		for (double d : timeArr) {
			if (d != 0.0) {
				count += 1;
				sum += d;
			}
		}
		return sum / count;
	}

	private static void buildPerAlgoString(List<String> perAlgoString,
			Map<String, List<List<Set<String>>>> typeToTechnique, int lowerBound, String testType) {
		for (int i = 0; i < typeToTechnique.get(testType).size(); i++) {
			for (int j = 0; j < typeToTechnique.get(testType).get(i).size(); j++) {
				double origPercent = (double) typeToTechnique.get(testType).get(i).get(j).size() / lowerBound;
				perAlgoString.add(formatPercent(origPercent, false));
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
			String[] sArr = s.split("\\|");
			projectToDT.put(sArr[0], Integer.parseInt(sArr[1]));
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

	private static String convertIToK(int i) {
		if (i == 0) {
			return "Two";
		} else if (i == 1) {
			return "Four";
		} else if (i == 2) {
			return "Eight";
		} else if (i == 3) {
			return "Sixteen";
		}
		return "Zero";
	}

	public static void generateLatexFile(String outputDirectoryName, List<Project> proj_orig_arrayList,
			List<Project> proj_auto_arrayList, int maxOrigDT, int maxAutoDT) {
		IntegerWrapper numConfigWithDT = new IntegerWrapper();
		StringBuilder sb = new StringBuilder();

		// generate LaTeX for the human-written and automatic test suites
		String origLatexString = generateLatexString(proj_orig_arrayList, "orig", numConfigWithDT);
		String autoLatexString = generateLatexString(proj_auto_arrayList, "auto", numConfigWithDT);
		origLatexString += "\n%Number of configurations with DT (including orig and auto): "
				+ numConfigWithDT.numConfigWithDT;
		origLatexString += "\n%Number of configurations (including orig and auto): " + numConfigWithDT.numConfig;
		autoLatexString += "\n%Number of configurations with DT (including orig and auto): "
				+ numConfigWithDT.numConfigWithDT;
		autoLatexString += "\n%Number of configurations (including orig and auto): " + numConfigWithDT.numConfig;

		String avgOrigTests = formatPercent(numConfigWithDT.origTotalNumDTsInAllAlgorithms / maxOrigDT, false) + "\\xspace}";
		String avgAutoTests = formatPercent(numConfigWithDT.autoTotalNumDTsInAllAlgorithms / maxAutoDT, false) + "\\xspace}";

		String origOutputFilename = outputDirectoryName + System.getProperty("file.separator");
		String autoOutputFilename = outputDirectoryName + System.getProperty("file.separator");
		if ((!proj_orig_arrayList.isEmpty() && ((ProjectNumDependentTests) proj_orig_arrayList.get(0)).isFig9())
				|| (!proj_auto_arrayList.isEmpty()
						&& ((ProjectNumDependentTests) proj_auto_arrayList.get(0)).isFig9())) {
			origOutputFilename += "figure9-orig-results.tex";
			autoOutputFilename += "figure9-auto-results.tex";

			sb.append("\\newcommand{\\avgOrigParaTestsAllK}{" + avgOrigTests + "\n");
			sb.append("\\newcommand{\\avgAutoParaTestsAllK}{" + avgAutoTests + "\n");

			for (int i = 0; i < numConfigWithDT.origParaTotalNumDTInAllAlgorithms.length; i++) {
				String avgParaTests = formatPercent((numConfigWithDT.origParaTotalNumDTInAllAlgorithms[i] / 2) / maxOrigDT, false) + "\\xspace}";
				sb.append("\\newcommand{\\avgOrigParaTestsK" + convertIToK(i) +"}{" + avgParaTests + "\n");
			}

			for (int i = 0; i < numConfigWithDT.autoParaTotalNumDTInAllAlgorithms.length; i++) {
				String avgParaTests = formatPercent((numConfigWithDT.autoParaTotalNumDTInAllAlgorithms[i] / 2) / maxAutoDT, false) + "\\xspace}";
				sb.append("\\newcommand{\\avgAutoParaTestsK" + convertIToK(i) +"}{" + avgParaTests + "\n");
			}
		} else if ((!proj_orig_arrayList.isEmpty() && ((ProjectNumDependentTests) proj_orig_arrayList.get(0)).isFig8())
				|| (!proj_auto_arrayList.isEmpty()
						&& ((ProjectNumDependentTests) proj_auto_arrayList.get(0)).isFig8())) {
			origOutputFilename += "figure8-orig-results.tex";
			autoOutputFilename += "figure8-auto-results.tex";

			sb.append("\\newcommand{\\avgOrigSeleTests}{" + avgOrigTests + "\n");
			sb.append("\\newcommand{\\avgAutoSeleTests}{" + avgAutoTests + "\n");
		} else { // fig 7
			origOutputFilename += "figure7-orig-results.tex";
			autoOutputFilename += "figure7-auto-results.tex";
			sb.append("\\newcommand{\\avgOrigPriorTests}{" + avgOrigTests + "\n");
			sb.append("\\newcommand{\\avgAutoPriorTests}{" + avgAutoTests + "\n");
		}

		writeToLatexFile(origLatexString, origOutputFilename, false);
		writeToLatexFile(autoLatexString, autoOutputFilename, false);
		writeToLatexFile(sb.toString(), FIGURE_GENERATOR_COMMAND_FILE, true);
	}

	public static void setProjectLists(List<String> argsList, String directoryName, List<Project> proj_orig_arrayList,
			List<Project> proj_auto_arrayList, boolean getDTLists) {

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
				String projectName = flagsList.get(index + 1);

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
				List<String> numTotal = parseFileForDTs(file, Constants.NOT_FIXED_DTS, false);

				if (getDTLists) {
					StringBuilder fileName = new StringBuilder();
					fileName.append(techniqueName);
					fileName.append("-");
					fileName.append(projectName);
					fileName.append("-");
					fileName.append(testType);
					fileName.append("-");
					if (techniqueName.equals("parallelization")) {
						index = flagsList.indexOf("-numOfMachines");
						String numMachines_string = flagsList.get(index + 1);
						int numMachines = Integer.parseInt(numMachines_string);
						fileName.append(numMachines);
					} else {
						fileName.append(coverageName);
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

	                writeToLatexFile(fileContents.toString(), fileName.toString(), false);
				}

				int numOfFixedDTs = parseFileForNumOfDTs(file, Constants.FIXED_DTS);
				double timeInFile = parseFileForMaxTime(file, Constants.TIME_INCL_DTF);

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
					int timeFixedDTs = 0;
					if (orderName.equals("original")) {
						curr_fig9_human = currProj.get_fig9_human_orig();
						curr_fig9_auto = currProj.get_fig9_auto_orig();
					} else if (orderName.equals("time")) { // orderName == time
						curr_fig9_human = currProj.get_fig9_human_time();
						curr_fig9_auto = currProj.get_fig9_auto_time();
						timeFixedDTs = 4;
					} else {
						exitWithError("Unexpected order: " + orderName);
						curr_fig9_human = null;
						curr_fig9_auto = null;
					}

					if (testType.equals("orig")) { // human
						if (numMachines == 2) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_human_fixed_time()[timeFixedDTs] = timeInFile;
							}
							curr_fig9_human[0] = numTotal;
						} else if (numMachines == 4) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_human_fixed_time()[timeFixedDTs + 1] = timeInFile;
							}
							curr_fig9_human[1] = numTotal;
						} else if (numMachines == 8) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_human_fixed_time()[timeFixedDTs + 2] = timeInFile;
							}
							curr_fig9_human[2] = numTotal;
						} else if (numMachines == 16) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_human_fixed_time()[timeFixedDTs + 3] = timeInFile;
							}
							curr_fig9_human[3] = numTotal;
						} else {
							exitWithError("Unexpected numMachines: " + numMachines);
						}
					} else if (testType.equals("auto")) // auto
					{
						if (numMachines == 2) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_auto_fixed_time()[timeFixedDTs] = timeInFile;
							}
							curr_fig9_auto[0] = numTotal;
						} else if (numMachines == 4) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_auto_fixed_time()[timeFixedDTs + 1] = timeInFile;
							}
							curr_fig9_auto[1] = numTotal;
						} else if (numMachines == 8) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_auto_fixed_time()[timeFixedDTs + 2] = timeInFile;
							}
							curr_fig9_auto[2] = numTotal;
						} else if (numMachines == 16) {
							if (numOfFixedDTs != 0) {
								currProj.getFig9_auto_fixed_time()[timeFixedDTs + 3] = timeInFile;
							}
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
								if (numOfFixedDTs != 0) {
									currProj.getFig8_human_fixed_time()[0] = timeInFile;
								}
							} else if (orderName.equals("absolute")) {
								// S2
								fig8_human[1] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_human_fixed_time()[1] = timeInFile;
								}
							} else if (orderName.equals("relative")) {
								// S3
								fig8_human[2] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_human_fixed_time()[2] = timeInFile;
								}
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("original")) {
								// S4
								fig8_human[3] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_human_fixed_time()[3] = timeInFile;
								}
							} else if (orderName.equals("absolute")) {
								// S5
								fig8_human[4] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_human_fixed_time()[4] = timeInFile;
								}
							} else if (orderName.equals("relative")) {
								// S6
								fig8_human[5] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_human_fixed_time()[5] = timeInFile;
								}
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
								if (numOfFixedDTs != 0) {
									currProj.getFig8_auto_fixed_time()[0] = timeInFile;
								}
							} else if (orderName.equals("absolute")) {
								// S2
								fig8_auto[1] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_auto_fixed_time()[1] = timeInFile;
								}
							} else if (orderName.equals("relative")) {
								// S3
								fig8_auto[2] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_auto_fixed_time()[2] = timeInFile;
								}
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("original")) {
								// S4
								fig8_auto[3] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_auto_fixed_time()[3] = timeInFile;
								}
							} else if (orderName.equals("absolute")) {
								// S5
								fig8_auto[4] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_auto_fixed_time()[4] = timeInFile;
								}
							} else if (orderName.equals("relative")) {
								// S6
								fig8_auto[5] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig8_auto_fixed_time()[5] = timeInFile;
								}
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
								if (numOfFixedDTs != 0) {
									currProj.getFig7_human_fixed_time()[0] = timeInFile;
								}
							} else if (orderName.equals("relative")) { // relative
								// T4
								fig7_human[1] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig7_human_fixed_time()[1] = timeInFile;
								}
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("absolute")) {
								// T5
								fig7_human[2] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig7_human_fixed_time()[2] = timeInFile;
								}
							} else if (orderName.equals("relative")) { // relative
								// T7
								fig7_human[3] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig7_human_fixed_time()[3] = timeInFile;
								}
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
								if (numOfFixedDTs != 0) {
									currProj.getFig7_auto_fixed_time()[0] = timeInFile;
								}
							} else if (orderName.equals("relative")) {
								// T4
								fig7_auto[1] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig7_auto_fixed_time()[1] = timeInFile;
								}
							} else {
								exitWithError("Unexpected order: " + orderName);
							}
						} else if (coverageName.equals("function")) {
							if (orderName.equals("absolute")) {
								// T5
								fig7_auto[2] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig7_auto_fixed_time()[2] = timeInFile;
								}
							} else if (orderName.equals("relative")) {
								// T7
								fig7_auto[3] = numTotal;
								if (numOfFixedDTs != 0) {
									currProj.getFig7_auto_fixed_time()[3] = timeInFile;
								}
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
