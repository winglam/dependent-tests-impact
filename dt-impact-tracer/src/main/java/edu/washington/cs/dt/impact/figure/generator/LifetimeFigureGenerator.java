package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.latex.CellType;
import com.reedoei.eunomia.latex.LatexTable;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LifetimeFigureGenerator extends StandardMain {
    private final Path lifetimePaths;

    private LifetimeFigureGenerator(final String[] args) {
        super(args);

        this.lifetimePaths = Paths.get(getArgRequired("lifetime-paths"));
    }

    public static void main(final String[] args) {
        try {
            new LifetimeFigureGenerator(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

    @Override
    protected void run() throws Exception {
        System.out.println(latexString(new LifetimeFigureData(lifetimePaths).get()));
    }

    public String latexString(final LifetimeFigureData lifetimeFigureData) {
        final List<LifetimeFigureData.SubjectLifetimeData> subjectLifetimeData = lifetimeFigureData.subjectLifetimeData();
        final List<String> subjectNames = ListUtil.map(s -> s.property("subject.name"), subjectLifetimeData);
        final List<String> rows = new ArrayList<>();
        // Duplicate three times because we need a copy for each of prio, sele, and para
        rows.addAll(subjectNames);
        rows.addAll(subjectNames);
        rows.addAll(subjectNames);

        final LatexTable table = new LatexTable(ListUtil.fromArray("DTs", "Avg. Speedup"), rows);
        table.setColumnDisplay("DTs", CellType.VALUE_SINGLE_COL);
        table.setColumnDisplay("Avg. Speedup", CellType.JUST_PERCENT);

        table.addLatexRow("\\multicolumn{3}{|l|}{\\textbf{Test prioritization}\\raisebox{5pt}{\\strut}}  \\\\ \\hline");
        addData(table, subjectLifetimeData, "prio", s -> s.averagers().prio());
        table.addLatexRow("\\multicolumn{3}{|l|}{\\textbf{Test selection}\\raisebox{5pt}{\\strut}}  \\\\ \\hline");
        addData(table, subjectLifetimeData, "sele", s -> s.averagers().sele());
        table.addLatexRow("\\multicolumn{3}{|l|}{\\textbf{Test parallelization}\\raisebox{5pt}{\\strut}}  \\\\ \\hline");
        addData(table, subjectLifetimeData, "para", s -> s.averagers().para());

        return table.toString();
    }

    private void addData(final LatexTable table,
                         final List<LifetimeFigureData.SubjectLifetimeData> subjectLifetimeData,
                         final String techniqueName,
                         final Function<LifetimeFigureData.SubjectLifetimeData, Averager<Double>> f) {
        for (final LifetimeFigureData.SubjectLifetimeData subject : subjectLifetimeData) {
            final Map<String, Integer> values = new HashMap<>();
            final Map<String, Integer> totals = new HashMap<>();
            final Integer dtNum = Integer.valueOf(subject.property("subject." + techniqueName + ".orig.dts"));
            values.put("DTs", dtNum);
            totals.put("DTs", dtNum);

            // Speedup will be a number from 0 to 1, so by multiplying by 1000 and dividing by 1000
            // we get a percent with one decimal place.
            final double speedup = f.apply(subject).mean();
            System.out.println(speedup);
            values.put("Avg. Speedup", (int) (speedup * 1000));
            totals.put("Avg. Speedup", 1000);

            table.addRow(values, totals, CellType.DEFAULT);
        }
    }
}
