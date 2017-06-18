package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.Constants.TD_SETTING;

public class GeometricMeanData {

    private String project;
    private int k;
    private double value;
    private Constants.TD_SETTING tdSetting;
    private Constants.ORDER order;
    private Constants.COVERAGE coverage;

    public GeometricMeanData(int k, double value, TD_SETTING tdSetting, ORDER order, COVERAGE coverage) {
        super();
        this.k = k;
        this.value = value;
        this.tdSetting = tdSetting;
        this.order = order;
        this.coverage = coverage;
    }

    public Constants.ORDER getOrder() {
        return order;
    }

    public void setOrder(Constants.ORDER order) {
        this.order = order;
    }

    public Constants.TD_SETTING getTdSetting() {
        return tdSetting;
    }

    public void setTdSetting(Constants.TD_SETTING tdSetting) {
        this.tdSetting = tdSetting;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public Constants.COVERAGE getCoverage() {
    	return coverage;
    }
    
    public void setCoverage(Constants.COVERAGE coverage) {
    	this.coverage = coverage;
    }
}
