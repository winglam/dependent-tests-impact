package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.latex.Cell;
import com.reedoei.eunomia.latex.CellType;
import com.reedoei.eunomia.latex.LatexTable;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.impact.data.TestTypeValues;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

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
        final List<TestTypeValues<LifetimeFigureData.SubjectLifetimeData>> subjectLifetimeData = lifetimeFigureData.subjectLifetimeData();
        subjectLifetimeData.sort(Comparator.comparing(v -> v.orig().properties().getProperty("subject.name")));

        final LatexTable prioTable =
                createTable("Test prioritization", subjectLifetimeData, "prio", s -> s.averagers().prio());
        final LatexTable seleTable =
                createTable("Test selection", subjectLifetimeData, "sele", s -> s.averagers().sele());
        final LatexTable paraTable =
                createTable("Test parallelization", subjectLifetimeData, "para", s -> s.averagers().para());

        return prioTable.toString() + "\n" +
                seleTable.toString() + "\n" +
                paraTable.toString() + "\n";
    }

    public LatexTable createTable(final String header,
                                  final List<TestTypeValues<LifetimeFigureData.SubjectLifetimeData>> subjectLifetimeData,
                                  final String techniqueName,
                                  final Function<LifetimeFigureData.SubjectLifetimeData, Averager<Double>> f) {
        final List<String> rows = ListUtil.map(s -> s.orig().property("subject.name"), subjectLifetimeData);

        final LatexTable table =
                new LatexTable(ListUtil.fromArray("Orig DTs", "Auto DTs", "Avg. Speedup (Orig)", "Avg. Speedup (Auto)"), rows)
                        .setColumnDisplay("Orig DTs", CellType.VALUE_SINGLE_COL)
                        .setColumnDisplay("Auto DTs", CellType.VALUE_SINGLE_COL)
                        .setColumnDisplay("Avg. Speedup (Orig)", CellType.JUST_PERCENT)
                        .setColumnDisplay("Avg. Speedup (Auto)", CellType.JUST_PERCENT);

        table.addLatexRow("\\multicolumn{5}{|l|}{\\textbf{" + header + "}\\raisebox{5pt}{\\strut}}  \\\\ \\hline");

        final Pair<List<Integer>, List<Integer>> dtNumbers = addData(table, subjectLifetimeData, techniqueName, f);
        final IntSummaryStatistics origDtNumbers = dtNumbers.getLeft().stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        final IntSummaryStatistics autoDtNumbers = dtNumbers.getRight().stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        final NumberFormat ratio = NumberFormat.getNumberInstance();
        ratio.setMinimumFractionDigits(1);
        ratio.setMaximumFractionDigits(1);

//        table.addTotalRow("Average", CellType.DEFAULT, true)
//             .setupCell("Orig DTs", "Average", ratio.format(origDtNumbers.getAverage()))
//             .setupCell("Orig DTs", "Average", CellType.VALUE) // For some reason, must do this to get the show override to work
//             .setupCell("Auto DTs", "Average", ratio.format(autoDtNumbers.getAverage()))
//             .setupCell("Auto DTs", "Average", CellType.VALUE); // For some reason, must do this to get the show override to work

        return table;
    }

    private Pair<List<Integer>, List<Integer>> addData(final LatexTable table,
                                                       final List<TestTypeValues<LifetimeFigureData.SubjectLifetimeData>> subjectLifetimeData,
                                                       final String techniqueName,
                                                       final Function<LifetimeFigureData.SubjectLifetimeData, Averager<Double>> f) {
        final Pair<List<Integer>, List<Integer>> dtNumbers = ImmutablePair.of(new ArrayList<>(), new ArrayList<>());

        for (final TestTypeValues<LifetimeFigureData.SubjectLifetimeData> subject : subjectLifetimeData) {
            final Map<String, Integer> values = new HashMap<>();
            final Map<String, Integer> totals = new HashMap<>();

            final Integer origDtNum = Integer.valueOf(subject.orig().property("subject." + techniqueName + ".orig.dts"));
            values.put("Orig DTs", origDtNum);
            totals.put("Orig DTs", origDtNum);

            dtNumbers.getLeft().add(origDtNum);

            final Integer autoDtNum = Integer.valueOf(subject.orig().property("subject." + techniqueName + ".auto.dts"));
            values.put("Auto DTs", origDtNum);
            totals.put("Auto DTs", origDtNum);

            dtNumbers.getRight().add(autoDtNum);

            // Speedup will be a number from 0 to 1, so by multiplying by 1000 and dividing by 1000
            // we get a percent with one decimal place.
            final double origSpeedup = f.apply(subject.orig()).mean();
            values.put("Avg. Speedup (Orig)", (int) (origSpeedup * 1000));
            totals.put("Avg. Speedup (Orig)", 1000);

            final double autoSpeedup = f.apply(subject.auto()).mean();
            values.put("Avg. Speedup (Auto)", (int) (autoSpeedup * 1000));
            totals.put("Avg. Speedup (Auto)", 1000);

            table.addRow(values, totals, CellType.DEFAULT);
        }

        return dtNumbers;
    }
}
