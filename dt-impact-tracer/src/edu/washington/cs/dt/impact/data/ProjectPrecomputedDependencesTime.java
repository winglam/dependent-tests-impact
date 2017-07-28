package edu.washington.cs.dt.impact.data;

public class ProjectPrecomputedDependencesTime extends Project {

	private double prioTime = 0;
	private double seleTime = 0;
	private double paraTime = 0;
	private double suiteTime = 0;

	private int prioSetCount = 0;
	private int seleSetCount = 0;
	private int paraSetCount = 0;
	private int suiteSetCount = 0;

	public int getPrioAvgTime() {
		return (int) (prioTime / prioSetCount);
	}

	public void setPrioTime(double prioTime) {
		this.prioTime += prioTime;
		prioSetCount += 1;
	}

	public int getSeleAvgTime() {
		return (int) (seleTime / seleSetCount);
	}

	public void setSeleTime(double seleTime) {
		this.seleTime += seleTime;
		seleSetCount += 1;
	}

	public int getParaAvgTime() {
		return (int) (paraTime / paraSetCount);
	}

	public void setParaTime(double paraTime) {
		this.paraTime += paraTime;
		paraSetCount += 1;
	}

	public int getSuiteAvgTime() {
		return (int) (suiteTime / suiteSetCount);
	}

	public void setSuiteTime(double suiteTime) {
		this.suiteTime += suiteTime;
		suiteSetCount += 1;
	}

	public ProjectPrecomputedDependencesTime(String projName) {
		super(projName);
	}

	@Override
	public String getName() {
		return super.name;
	}
}
