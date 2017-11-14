/**
 * Generates a file called subjects-info.tex used in the DT-impact paper
 * to describe the subjects used in our evaluation.
 * 
 * Usage: edu.washington.cs.dt.impact.figure.generator.SubjectProgramsInfoFigureGenerator -subjectInfo /Users/winglam/GoogleDrive/research/dt-impact/tools/experiments/data/subject-data.csv \
 * -expDir /Users/winglam/GoogleDrive/research/dt-impact/tools/experiments -origDTFile /Users/winglam/GoogleDrive/research/dt-impact/tools/experiments/ORIG_MIN_DTs.txt \
 * -autoDTFile /Users/winglam/GoogleDrive/research/dt-impact/tools/experiments/AUTO_MIN_DTs.txt -clocFile /usr/local/bin/cloc
 */
package edu.washington.cs.dt.impact.figure.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import edu.washington.cs.dt.impact.data.ProjectSubjectProgramInfo;
import edu.washington.cs.dt.impact.tools.FileTools;

public class SubjectProgramsInfoFigureGenerator {
	private static final String OUTPUT_FILE = "subjects-info.tex";

	public static void main(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		String subjectInfoFile = FigureGenerator.mustGetArgName(argsList, "-subjectInfo");
		String experimentsDir = FigureGenerator.mustGetArgName(argsList, "-expDir");
		String origDTFile = FigureGenerator.mustGetArgName(argsList, "-origDTFile");
		String autoDTFile = FigureGenerator.mustGetArgName(argsList, "-autoDTFile");
		String clocFile = FigureGenerator.mustGetArgName(argsList, "-clocFile");
		Map<String, Integer> origProjectToDT = FigureGenerator.parseDTFile(origDTFile);
		Map<String, Integer> autoProjectToDT = FigureGenerator.parseDTFile(autoDTFile);

		DecimalFormat df = new DecimalFormat("0.0");
		df.setRoundingMode(RoundingMode.CEILING);

		List<ProjectSubjectProgramInfo> subjects = new ArrayList<>();
		List<String> subjectInfoList = FileTools.parseFileToList(new File(subjectInfoFile));
		for (String subjectInfo : subjectInfoList) {
			String normalizedStr = subjectInfo.trim();
			if (normalizedStr.charAt(0) == '#') {
				continue;
			} else {
				// formal name of subject, informal name of subject, directory
				// containing src,
				// directory containing test, directory containing bin or
				// classes, first revision,
				// second revision, directory containing src of new version,
				// directory containing test of new version
				String[] splitComma = normalizedStr.split(",");
				if (splitComma.length != 9) {
					System.err.println("Malformed subject info string " + normalizedStr);
					continue;
				}

				ProjectSubjectProgramInfo project = new ProjectSubjectProgramInfo(splitComma[0]);
				for (int i = 1; i < splitComma.length; i++) {
					switch (i) {
					case 1:
						project.setInformalName(splitComma[1]);
						break;
					case 2:
						String[] splitDashSrc = splitComma[2].split("\\|");
						for (int j = 0; j < splitDashSrc.length; j++) {
							File srcDir = new File(experimentsDir + File.separator + splitDashSrc[j]);
							project.addSrcDir(srcDir);
						}
						break;
					case 3:
						String[] splitDashTest = splitComma[3].split("\\|");
						for (int j = 0; j < splitDashTest.length; j++) {
							File testDir = new File(experimentsDir + File.separator + splitDashTest[j]);
							project.addTestDir(testDir);
						}
						break;
					case 4:
						File rootDir = new File(experimentsDir + File.separator + splitComma[4]);
						project.setRootDir(rootDir);
						break;
					case 5:
						project.setFirstRev(splitComma[5]);
						break;
					case 6:
						project.setSecondRev(splitComma[6]);
						break;
					case 7:
						String[] splitDashNewSrc = splitComma[7].split("\\|");
						for (int j = 0; j < splitDashNewSrc.length; j++) {
							File newSrcDir = new File(experimentsDir + File.separator + splitDashNewSrc[j]);
							project.addNewSrcDir(newSrcDir);
						}
						break;
					case 8:
						String[] splitDashNewTest = splitComma[8].split("\\|");
						for (int j = 0; j < splitDashNewTest.length; j++) {
							File newTestDir = new File(experimentsDir + File.separator + splitDashNewTest[j]);
							project.addNewTestDir(newTestDir);
						}
						break;
					}
				}
				subjects.add(project);
			}
		}

		Collections.sort(subjects);

		for (ProjectSubjectProgramInfo subject : subjects) {
			List<File> srcDirs = subject.getSrcDir();
			List<File> newSrcDirs = subject.getNewSrcDir();
			List<File> testDirs = subject.getTestDir();
			List<File> newTestDirs = subject.getNewTestDir();
			if (srcDirs.size() != newSrcDirs.size()) {
				System.err.println("Number of source and new source directories do not match for " + subject.getName());
				continue;
			}
			if (testDirs.size() != newTestDirs.size()) {
				System.err.println("Number of test and new test directories do not match for" + subject.getName());
				continue;
			}
			for (int i = 0; i < srcDirs.size(); i++) {
				if (!srcDirs.get(i).isDirectory()) {
					System.err.println("Unable to locate source directory for " + subject.getName());
					continue;
				}
				if (!newSrcDirs.get(i).isDirectory()) {
					System.err.println("Unable to locate new source directory for " + subject.getName());
					continue;
				}
				subject.addSrcLOC(getLOC(experimentsDir, srcDirs.get(i), clocFile));
				subject.addSrcDiff(getDiff(experimentsDir, srcDirs.get(i), newSrcDirs.get(i), clocFile));
			}
			for (int i = 0; i < testDirs.size(); i++) {
				if (!testDirs.get(i).isDirectory()) {
					System.err.println("Unable to locate test directory for " + subject.getName());
					continue;
				}
				if (!newTestDirs.get(i).isDirectory()) {
					System.err.println("Unable to locate new test directory for " + subject.getName());
					continue;
				}
				subject.addTestLOC(getLOC(experimentsDir, testDirs.get(i), clocFile));
				subject.addTestDiff(getDiff(experimentsDir, testDirs.get(i), newTestDirs.get(i), clocFile));
			}

			if (!subject.getRootDir().isDirectory()) {
				System.err.println("Unable to locate root directory for " + subject.getName());
				continue;
			}

			if (!origProjectToDT.containsKey(subject.getName())) {
				System.err.println("Orig min DT file missing subject. Subject missing: " + subject.getName());
				continue;
			}
			if (!autoProjectToDT.containsKey(subject.getName())) {
				System.err.println("Auto min DT file missing subject. Subject missing: " + subject.getName());
				continue;
			}

			subject.addAutoTests(FileTools
					.parseFileToList(
							new File(subject.getRootDir() + File.separator + subject.getInformalName() + "-auto-order"))
					.size());
			subject.addOrigTests(FileTools
					.parseFileToList(
							new File(subject.getRootDir() + File.separator + subject.getInformalName() + "-orig-order"))
					.size());
			subject.addAutoDTs(autoProjectToDT.get(subject.getName()));
			subject.addOrigDTs(origProjectToDT.get(subject.getName()));
		}

		ProjectSubjectProgramInfo total = new ProjectSubjectProgramInfo("Total");
		StringBuilder sb = new StringBuilder();
		for (ProjectSubjectProgramInfo subject : subjects) {
			total.addSrcLOC(subject.getSrcLOC());
			total.addTestLOC(subject.getTestLOC());
			total.addOrigTests(subject.getOrigTests());
			total.addAutoTests(subject.getAutoTests());
			total.addOrigDTs(subject.getOrigDTs());
			total.addAutoDTs(subject.getAutoDTs());

			sb.append(subject.getName());
			sb.append(" & ");
			sb.append(subject.getSrcLOC());
			sb.append(" & ");
			sb.append(subject.getTestLOC());
			sb.append(" & ");
			sb.append(subject.getOrigTests());
			sb.append(" & ");
			sb.append(subject.getAutoTests());
			sb.append("\n");

			sb.append(" & ");
			sb.append(subject.getOrigDTs());
			sb.append(" & ");
			double percOfOrigDTs = ((1.0 * subject.getOrigDTs()) / subject.getOrigTests()) * 100;
			sb.append("(" + df.format(percOfOrigDTs) + "\\%)");
			sb.append(" & ");
			sb.append(subject.getAutoDTs());
			sb.append(" & ");
			double percOfAutoDTs = ((1.0 * subject.getAutoDTs()) / subject.getAutoTests()) * 100;
			sb.append("(" + df.format(percOfAutoDTs) + "\\%)");
			sb.append("\n");

			sb.append(" & ");
			sb.append(subject.getFirstRev());
			sb.append(" & ");
			sb.append(subject.getSecondRev());
			sb.append("\n");

			sb.append(" & ");
			sb.append(subject.getSrcDiff());
			sb.append(" & ");
			double percOfSrcDiff = ((1.0 * subject.getSrcDiff()) / subject.getSrcLOC()) * 100;
			sb.append("(" + df.format(percOfSrcDiff) + "\\%)");
			sb.append(" & ");
			sb.append(subject.getTestDiff());
			sb.append(" & ");
			double percOfTestDiff = ((1.0 * subject.getTestDiff()) / subject.getTestLOC()) * 100;
			sb.append("(" + df.format(percOfTestDiff) + "\\%)");
			sb.append("\\\\");
			sb.append("\n");
		}
		sb.append("\\hline");
		sb.append("\n");
		sb.append("\\textbf{" + total.getName() + "}");
		sb.append(" & ");
		sb.append(total.getSrcLOC());
		sb.append(" & ");
		sb.append(total.getTestLOC());
		sb.append(" & ");
		sb.append(total.getOrigTests());
		sb.append(" & ");
		sb.append(total.getAutoTests());
		sb.append(" & ");
		sb.append(total.getOrigDTs());
		sb.append(" & ");
		double percOfOrigDTs = ((1.0 * total.getOrigDTs()) / total.getOrigTests()) * 100;
		sb.append("(" + df.format(percOfOrigDTs) + "\\%)");
		sb.append(" & ");
		sb.append(total.getAutoDTs());
		sb.append(" & ");
		double percOfAutoDTs = ((1.0 * total.getAutoDTs()) / total.getAutoTests()) * 100;
		sb.append("(" + df.format(percOfAutoDTs) + "\\%)");
		sb.append("\\\\");

		FileTools.printStringToFile(sb.toString(), new File(OUTPUT_FILE), false);
	}

	private static int getLOC(String experimentsDir, File dir, String clocFile) {
		int loc = 0;
		try {
			ProcessBuilder pb = new ProcessBuilder(clocFile, dir.getCanonicalPath(), "--csv");
			pb.directory(new File(experimentsDir));
			pb.redirectErrorStream(true);
			BufferedReader br = new BufferedReader(new InputStreamReader(pb.start().getInputStream()));

			boolean startSavingOutput = false;
			List<String> outputs = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				if (startSavingOutput) {
					outputs.add(line);
				} else if (line.contains("files,language,blank,comment,code")) {
					startSavingOutput = true;
				}
			}

			for (String s : outputs) {
				String[] splitComma = s.split(",");
				if (splitComma.length == 5) {
					if (splitComma[1].equals("Java")) {
						loc = Integer.parseInt(splitComma[4].trim());
					}
				} else {
					System.err.println("Malformed line from CLOC. Line: " + s);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loc;
	}

	private static int getDiff(String experimentsDir, File dir, File newDir, String clocFile) {
		int loc = 0;
		try {
			ProcessBuilder pb = new ProcessBuilder(clocFile, "--diff", dir.getCanonicalPath(),
					newDir.getCanonicalPath(), "--csv");
			pb.directory(new File(experimentsDir));
			pb.redirectErrorStream(true);
			BufferedReader br = new BufferedReader(new InputStreamReader(pb.start().getInputStream()));

			boolean startSavingOutput = false;
			List<String> outputs = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				if (startSavingOutput) {
					outputs.add(line);
				} else if (line.contains("Language, == files, != files, + files, - files, == blank, != blank, + blank,"
						+ " - blank, == comment, != comment, + comment, - comment, == code, != code, + code, - code")) {
					startSavingOutput = true;
				}
			}

			for (String s : outputs) {
				String[] splitComma = s.split(",");
				if (splitComma.length == 18) {
					if (splitComma[0].equals("Java")) {
						loc += Integer.parseInt(splitComma[14].trim());
						loc += Math.max(Integer.parseInt(splitComma[15].trim()),
								Integer.parseInt(splitComma[16].trim()));
					}
				} else {
					System.err.println("Malformed line from CLOC. Line: " + s);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loc;
	}
}
