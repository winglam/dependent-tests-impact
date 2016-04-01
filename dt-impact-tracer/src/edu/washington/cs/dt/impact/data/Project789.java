class Project789 {
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

    public Project789(String projName) {
        name = projName;
        fig7_human = new int[4];
        fig7_auto = new int[4];
        fig8_human = new int[6];
        fig8_auto = new int[6];
        fig9_human_orig = new int[4];
        fig9_auto_orig = new int[4];
        fig9_human_time = new int[4];
        fig9_auto_time = new int[4];
        uses_fig7 = false;
        uses_fig8 = false;
        uses_fig9 = false;
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

