/**
 * Updates the current subject constants file with a new subject's information.
 * 
 * Usage: edu.washington.cs.dt.impact.tools.UpdateScriptSubjectInfo \
 * -subjConstFile '/Users/winglam/GoogleDrive/research/dt-impact/tools/experiments/scripts/subj-constants.sh' \
 * -expCP '${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:' \
 * -expName 'zeppelin-server' \
 * -expDirectories 'zeppelin/zeppelin-server/target' \
 * -expNameFormal 'Zeppelin-Server'
 */

package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.figure.generator.FigureGenerator;

public class UpdateScriptSubjectInfo {

	public static void main(String[] args) {
		//expName=(ambari-server zeppelin-zengine zeppelin-server)
		//expDirectories=(ambari/ambari-server/target zeppelin/zeppelin-zengine/target zeppelin/zeppelin-server/target)
		//expCP=(${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:...)
		//expNameFormal=(Ambari-Server Zeppelin-Zengine Zeppelin-Server)
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		System.out.println("[DEBUG] Arguments are " + argsList);

		String subjConstFileName = FigureGenerator.mustGetArgName(argsList, "-subjConstFile");
		String expName = FigureGenerator.mustGetArgName(argsList, "-expName");
		String expDirectories = FigureGenerator.mustGetArgName(argsList, "-expDirectories");
		String expNameFormal = FigureGenerator.mustGetArgName(argsList, "-expNameFormal");
		String expCP = FigureGenerator.mustGetArgName(argsList, "-expCP");
		String newExpDirectories = FigureGenerator.mustGetArgName(argsList, "-newExpDirectories");
		String newExpCP = FigureGenerator.mustGetArgName(argsList, "-newExpCP");

		File subjConstFile = new File(subjConstFileName);
		List<String> subjConsts = FileTools.parseFileToList(subjConstFile);
		List<String> newSubjConsts = new ArrayList<>();
		String errorStr = null;
		for (int i = 0; i < subjConsts.size(); i++) {
			String s = subjConsts.get(i);
			String noSpaceS = s.trim();
			int closeIndex = getCloseIndex(i, subjConsts);
			if (closeIndex == -1) {
				errorStr = "Current: " + noSpaceS + "\nUnable to find closing parentheses.";
				break;
			}

			if (noSpaceS.startsWith("nextExpDirectories")) {
				s = updateString(subjConsts.subList(i + 1, closeIndex), newExpDirectories, false, false);
				if (s == null) {
					errorStr = "Current: " + noSpaceS + "\nTrying to add: " + newExpDirectories;
					break;
				}
				i = closeIndex;
				newSubjConsts.add(noSpaceS);
				newSubjConsts.add(s);
				newSubjConsts.add(")");
			} else if (noSpaceS.startsWith("expNameFormal")) {
				s = updateString(subjConsts.subList(i + 1, closeIndex), expNameFormal, true, false);
				if (s == null) {
					errorStr = "Current: " + noSpaceS + "\nTrying to add: " + expNameFormal;
					break;
				}
				i = closeIndex;
				newSubjConsts.add(noSpaceS);
				newSubjConsts.add(s);
				newSubjConsts.add(")");
			} else if (noSpaceS.startsWith("nextExpCP")) {
				s = updateString(subjConsts.subList(i + 1, closeIndex), newExpCP, false, true);
				if (s == null) {
					errorStr = "Current: " + noSpaceS + "\nTrying to add: " + newExpCP;
					break;
				}
				i = closeIndex;
				newSubjConsts.add(noSpaceS);
				newSubjConsts.add(s);
				newSubjConsts.add(")");
			} else if (noSpaceS.startsWith("expDirectories")) {
				s = updateString(subjConsts.subList(i + 1, closeIndex), expDirectories, false, false);
				if (s == null) {
					errorStr = "Current: " + noSpaceS + "\nTrying to add: " + expDirectories;
					break;
				}
				i = closeIndex;
				newSubjConsts.add(noSpaceS);
				newSubjConsts.add(s);
				newSubjConsts.add(")");
			} else if (noSpaceS.startsWith("expName")) {
				s = updateString(subjConsts.subList(i + 1, closeIndex), expName, false, false);
				if (s == null) {
					errorStr = "Current: " + noSpaceS + "\nTrying to add: " + expName;
					break;
				}
				i = closeIndex;
				newSubjConsts.add(noSpaceS);
				newSubjConsts.add(s);
				newSubjConsts.add(")");
			} else if (noSpaceS.startsWith("expCP")) {
				s = updateString(subjConsts.subList(i + 1, closeIndex), expCP, false, true);
				if (s == null) {
					errorStr = "Current: " + noSpaceS + "\nTrying to add: " + expCP;
					break;
				}
				i = closeIndex;
				newSubjConsts.add(noSpaceS);
				newSubjConsts.add(s);
				newSubjConsts.add(")");
			} else {
				newSubjConsts.add(s);
			}
		}

		if (errorStr != null) {
			throw new RuntimeException("Error adding.\n" + errorStr);
		} else {
			FileTools.printListToFile(newSubjConsts, subjConstFile);
		}
	}

	private static int getCloseIndex(int openIndex, List<String> subjContents) {
		for (int i = openIndex; i < subjContents.size(); i++) {
			if (subjContents.get(i).trim().equals(")")) {
				return i;
			}
		}
		return -1;
	}

	private static String updateString(List<String> contents, String update, boolean addQuotes, boolean allowDuplicates) {
		//expName=(ambari-server zeppelin-zengine zeppelin-server)
		List<String> newContents = new ArrayList<String>(contents);
		String updateWithQuotes = update;
		if (addQuotes) {
			updateWithQuotes = "\"" + updateWithQuotes + "\"";
		}
		if (allowDuplicates || !newContents.contains(updateWithQuotes)) {
			newContents.add(updateWithQuotes);
		} else if (!allowDuplicates && newContents.contains(updateWithQuotes)) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("  ");
		sb.append(newContents.get(0).trim());
		for (int i = 1; i < newContents.size(); i++) {
			sb.append("\n  ");
			sb.append(newContents.get(i).trim());
		}
		return sb.toString();
	}
}
