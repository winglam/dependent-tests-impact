package edu.washington.cs.dt.impact.data;

import java.util.ArrayList;
import java.util.List;

public class ProjectNumDependentTests extends Project {
    private String name;

    private List<String>[] fig7_human;

    private List<String>[] fig7_auto;

    private List<String>[] fig8_human;

    private List<String>[] fig8_auto;

    private List<String>[] fig9_human_orig;

    private List<String>[] fig9_auto_orig;

    private List<String>[] fig9_human_time;

    private List<String>[] fig9_auto_time;

    private boolean uses_fig7;
    private boolean uses_fig8;
    private boolean uses_fig9;

    public ProjectNumDependentTests(String projName) {
        name = projName;
        fig7_human = initListArray(4);
        fig7_auto = initListArray(4);
        fig8_human = initListArray(6);
        fig8_auto = initListArray(6);
        fig9_human_orig = initListArray(4);
        fig9_auto_orig = initListArray(4);
        fig9_human_time = initListArray(4);
        fig9_auto_time = initListArray(4);
        uses_fig7 = false;
        uses_fig8 = false;
        uses_fig9 = false;
    }

    private List<String>[] initListArray(int size) {
    	@SuppressWarnings("unchecked")
		List<String>[] intArr = new List[size];
        for (int i = 0; i < size; i++) {
            intArr[i] = new ArrayList<String>();
        }
        return intArr;
    }

    public boolean isFig7() {
        return uses_fig7;
    }

    public boolean isFig8() {
        return uses_fig8;
    }

    public boolean isFig9() {
        return uses_fig9;
    }

    public void useFig7() {
        uses_fig7 = true;
    }

    public void useFig8() {
        uses_fig8 = true;
    }

    public void useFig9() {
        uses_fig9 = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public List<String>[] get_fig7_human() {
        return fig7_human;
    }

    public List<String>[] get_fig7_auto() {
        return fig7_auto;
    }

    public List<String>[] get_fig8_human() {
        return fig8_human;
    }

    public List<String>[] get_fig8_auto() {
        return fig8_auto;
    }

    public List<String>[] get_fig9_human_orig() {
        return fig9_human_orig;
    }

    public List<String>[] get_fig9_auto_orig() {
        return fig9_auto_orig;
    }

    public List<String>[] get_fig9_human_time() {
        return fig9_human_time;
    }

    public List<String>[] get_fig9_auto_time() {
        return fig9_auto_time;
    }
    
    @Override
    public String toString() {
    	return getName() + " 7:" + uses_fig7 + " 8:" + uses_fig8 + " 9:" + uses_fig9;
    }
}
