package edu.washington.cs.dt.impact.data;

public class ProjectNumDependentTests extends Project {
    private String name;

    private int[] fig7_human;

    private int[] fig7_auto;

    private int[] fig8_human;

    private int[] fig8_auto;

    private int[] fig9_human_orig;

    private int[] fig9_auto_orig;

    private int[] fig9_human_time;

    private int[] fig9_auto_time;

    private boolean uses_fig7;
    private boolean uses_fig8;
    private boolean uses_fig9;

    public ProjectNumDependentTests(String projName) {
        name = projName;
        fig7_human = initIntArray(4);
        fig7_auto = initIntArray(4);
        fig8_human = initIntArray(6);
        fig8_auto = initIntArray(6);
        fig9_human_orig = initIntArray(4);
        fig9_auto_orig = initIntArray(4);
        fig9_human_time = initIntArray(4);
        fig9_auto_time = initIntArray(4);
        uses_fig7 = false;
        uses_fig8 = false;
        uses_fig9 = false;
    }

    private int[] initIntArray(int size) {
        int[] intArr = new int[size];
        for (int i = 0; i < size; i++) {
            intArr[i] = -1;
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

    public int[] get_fig7_human() {
        return fig7_human;
    }

    public int[] get_fig7_auto() {
        return fig7_auto;
    }

    public int[] get_fig8_human() {
        return fig8_human;
    }

    public int[] get_fig8_auto() {
        return fig8_auto;
    }

    public int[] get_fig9_human_orig() {
        return fig9_human_orig;
    }

    public int[] get_fig9_auto_orig() {
        return fig9_auto_orig;
    }

    public int[] get_fig9_human_time() {
        return fig9_human_time;
    }

    public int[] get_fig9_auto_time() {
        return fig9_auto_time;
    }
}
