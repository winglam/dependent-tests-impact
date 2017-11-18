package edu.washington.cs.dt.impact.data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProjectSubjectProgramInfo extends Project implements Comparable<ProjectSubjectProgramInfo> {
	private String informalName;
	private List<File> srcDir;
	private List<File> testDir;
	private File rootDir;
	private String firstRev;
	private String secondRev;
	private List<File> newSrcDir;
	private List<File> newTestDir;
	private int srcLOC;
	private int testLOC;
	private int srcDiff;
	private int testDiff;
	private int origTests;
	private int autoTests;
	private int origDTs;
	private int autoDTs;

	public ProjectSubjectProgramInfo(String projName) {
		super(projName);
		srcLOC = 0;
		testLOC = 0;
		origTests = 0;
		autoTests = 0;
		origDTs = 0;
		autoDTs = 0;
		srcDir = new ArrayList<>();
		testDir = new ArrayList<>();
		newSrcDir = new ArrayList<>();
		newTestDir = new ArrayList<>();
		srcDiff = 0;
		testDiff = 0;
	}

	@Override
	public String getName() {
		return super.name;
	}

	public int getSrcLOC() {
		return srcLOC;
	}

	public void addSrcLOC(int srcLOC) {
		this.srcLOC += srcLOC;
	}

	public int getTestLOC() {
		return testLOC;
	}

	public void addTestLOC(int testLOC) {
		this.testLOC += testLOC;
	}

	public int getSrcDiff() {
		return srcDiff;
	}

	public void addSrcDiff(int srcDiff) {
		this.srcDiff += srcDiff;
	}

	public int getTestDiff() {
		return testDiff;
	}

	public void addTestDiff(int testDiff) {
		this.testDiff += testDiff;
	}

	public int getOrigTests() {
		return origTests;
	}

	public void addOrigTests(int origTests) {
		this.origTests += origTests;
	}

	public int getAutoTests() {
		return autoTests;
	}

	public void addAutoTests(int autoTests) {
		this.autoTests += autoTests;
	}

	public int getOrigDTs() {
		return origDTs;
	}

	public void addOrigDTs(int origDTs) {
		this.origDTs += origDTs;
	}

	public int getAutoDTs() {
		return autoDTs;
	}

	public void addAutoDTs(int autoDTs) {
		this.autoDTs += autoDTs;
	}

	public String getInformalName() {
		return informalName;
	}

	public void setInformalName(String informalName) {
		this.informalName = informalName;
	}

	public List<File> getSrcDir() {
		return srcDir;
	}

	public void addSrcDir(File srcDir) {
		this.srcDir.add(srcDir);
	}

	public List<File> getTestDir() {
		return testDir;
	}

	public void addTestDir(File testDir) {
		this.testDir.add(testDir);
	}

	public File getRootDir() {
		return rootDir;
	}

	public void setRootDir(File rootDir) {
		this.rootDir = rootDir;
	}

	public String getFirstRev() {
		return firstRev;
	}

	public void setFirstRev(String firstRev) {
		this.firstRev = firstRev;
	}

	public String getSecondRev() {
		return secondRev;
	}

	public void setSecondRev(String secondRev) {
		this.secondRev = secondRev;
	}

	public List<File> getNewSrcDir() {
		return newSrcDir;
	}

	public void addNewSrcDir(File newSrcDir) {
		this.newSrcDir.add(newSrcDir);
	}

	public List<File> getNewTestDir() {
		return newTestDir;
	}

	public void addNewTestDir(File newTestDir) {
		this.newTestDir.add(newTestDir);
	}

	@Override
	public int compareTo(ProjectSubjectProgramInfo o) {
		return this.getName().compareTo(o.getName());
	}
}
