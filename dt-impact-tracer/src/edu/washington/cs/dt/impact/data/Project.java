class Project {
    private String name;

    /*
     * fig**[i] corresponds to orig value
     * fig**[i+1] corresponds to new value
     * where i=0, i+=2
     * so when doing calculations, do data = fig**[i] - fig**[i+1]
     */
    // corresponds to T3, T4, T5, and T7 respectively
    private double[] fig17_values;
    // corresponds to S1, S2, S3, S4, S5, and S6 respectively
    private double[] fig18_values;
    // corresponds to S1--S3 and S4--S6
    private double[] fig18_percents;

    /*
     * fig19[i] is the original test suite data value
     * fig19[i+1] is the speedup for the dependence-aware algorithm
     * where i =0, i+=2
     */
    // corresponds to P1(Original Order)
    private double[] fig19_orig;
    // corresponds to P2(Time-Minimized)
    private double[] fig19_time;

    private boolean uses_fig17;
    private boolean uses_fig18;
    private boolean uses_fig19;

    public Project(String projName) {
        name = projName;
        fig17_values = new double[4 * 2];
        fig18_values = new double[6 * 2];
        fig18_percents = new double[2 * 2];
        // TODO: fix fig19_percents array size
        fig19_orig = new double[2 * 4];
        fig19_time = new double[2 * 4];
        uses_fig17 = false;
        uses_fig18 = false;
        uses_fig19 = false;
    }

    public boolean isFig17() {
        return uses_fig17;
    }

    public boolean isFig18() {
        return uses_fig18;
    }

    public boolean isFig19() {
        return uses_fig19;
    }

    public void useFig17() {
        uses_fig17 = true;
    }

    public void useFig18() {
        uses_fig18 = true;
    }

    public void useFig19() {
        uses_fig19 = true;
    }

    public String getName() {
        return name;
    }

    public double[] get_fig17_values() {
        return fig17_values;
    }

    public double[] get_fig18_values() {
        return fig18_values;
    }

    public double[] get_fig18_percents() {
        return fig18_percents;
    }

    public double[] get_fig19_orig() {
        return fig19_orig;
    }

    public double[] get_fig19_time() {
        return fig19_time;
    }
}

