package edu.washington.cs.dt.impact.data;

public abstract class Project {
    protected String name;
    public Project(String projName) {
        name = projName;
    }

    public abstract String getName();
}
