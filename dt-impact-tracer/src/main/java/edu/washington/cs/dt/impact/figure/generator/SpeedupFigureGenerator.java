package edu.washington.cs.dt.impact.figure.generator;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.latex.CellType;
import com.reedoei.eunomia.latex.LatexTable;
import com.reedoei.eunomia.latex.RationalCell;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpeedupFigureGenerator extends StandardMain {
    private final Path path;

    public SpeedupFigureGenerator(final String[] args) {
        super(args);

        this.path = Paths.get(getArgRequired("path"));
    }

    public static void main(final String[] args) {
        try {
            new SpeedupFigureGenerator(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

    @Override
    protected void run() throws Exception {
        tableSubjectByCaseTechnique(cases());
    }

    private void tableSubjectByCaseTechnique(final List<Case> cases) {
        final List<String> subjects =
                cases.stream()
                        .map(Case::subjectName)
                        .distinct().sorted()
                        .collect(Collectors.toList());

        final LatexTable table = new LatexTable(
                ListUtil.fromArray("prio-orig", "prio-auto", "sele-orig", "sele-auto", "para-orig", "para-auto"),
                subjects);

        final Map<String, List<Case>> groupedCases =
                cases.stream()
                     .collect(Collectors.toMap(Case::subjectName,
                                               ListUtil::fromArray,
                                               ListUtil::concat));

        for (final String subject : subjects) {
            addSubject(table, groupedCases.get(subject));
        }

        table.addTotalRow("\\textbf{Average}", CellType.JUST_PERCENT, true);
        final List<RationalCell> cells = rowCells(table, "\\textbf{Average}",
                ListUtil.fromArray("prio-orig", "prio-auto", "sele-orig", "sele-auto", "para-orig", "para-auto"));

        cells.forEach(c -> c.isBold = true);

        System.out.println(table.toString());

        final double nSum = cells.stream().mapToDouble(c -> c.value).sum();
        final double dSum = cells.stream().mapToDouble(c -> c.total).sum();
        System.out.printf("\\newcommand{\\avgSpeedup}{%.1f\\%%\\xspace}\n", nSum / dSum * 100);
    }

    private List<RationalCell> rowCells(final LatexTable table, final String row, final List<String> columns) {
        return columns.stream().map(c -> table.getCell(c, row)).collect(Collectors.toList());
    }

    private void addSubject(final LatexTable table, final List<Case> cases) {
        final Map<String, Integer> tableRow = new HashMap<>();
        final Map<String, Integer> totalRow = new HashMap<>();
        for (final String s : ListUtil.fromArray("prio-orig", "prio-auto", "sele-orig", "sele-auto", "para-orig", "para-auto")) {
            tableRow.put(s, 0);
            totalRow.put(s, 0);
        }

        cases.stream()
            .collect(Collectors.toMap(Case::rowName, ListUtil::fromArray, ListUtil::concat))
            .forEach((rowName, rowCases) -> {
                final double averageSpeedup = new Averager<>(ListUtil.map(Case::speedup, rowCases)).mean();

                final int num = (int) (averageSpeedup * 1000);

                tableRow.put(rowName, num);
                totalRow.put(rowName, 1000);
            });

        table.addRow(tableRow, totalRow, CellType.JUST_PERCENT);
    }

    private List<Case> cases() throws IOException {
        return Files.walk(path).flatMap(p -> {
                    // If it's a text file, then it's a result file and we can load it
                    if (Files.isRegularFile(p) && p.toString().endsWith(".txt")) {
                        // Remove the last part (OMITTED_TD or GIVEN_TD) so that we can find the two files that
                        // share this common prefix
                        return Stream.of(p.toAbsolutePath().toString()
                                .replace("GIVEN_TD", "~")
                                .replace("OMITTED_TD", "~"));
                    } else {
                        return Stream.empty();
                    }
                }).distinct()
                .map(ConfigurationData::new)
                .filter(ConfigurationData::load)
                .filter(ConfigurationData::enhancedOrderDifferent)
                .map(Case::new)
                .collect(Collectors.toList());
    }

    private class Case {
        private final String caseName;
        private final String technique;
        private final String testType;
        private final String subjectName;
        private final double speedup;

        public Case(final ConfigurationData data) {
            this(data.enhancedOrderDifferent() ? "different" : "same",
                 data.technique(),
                 data.testType(),
                 data.subjectName(),
                 data.speedup());
        }

        private Case(final String caseName, final Constants.TECHNIQUE technique, final String testType,
                     final String subjectName, final double speedup) {
            this.caseName = caseName;
            this.testType = testType;
            this.subjectName = subjectName;
            this.speedup = speedup;

            if (technique == Constants.TECHNIQUE.PRIORITIZATION) {
                this.technique = "prio";
            } else if (technique == Constants.TECHNIQUE.SELECTION) {
                this.technique = "sele";
            } else {
                this.technique = "para";
            }
        }

        public String caseName() {
            return caseName;
        }

        public String technique() {
            return technique;
        }

        public String testType() {
            return testType;
        }

        public String subjectName() {
            return subjectName;
        }

        public double speedup() {
            return speedup;
        }

        public String rowName() {
            return technique() + "-" + testType();
        }
    }
}
