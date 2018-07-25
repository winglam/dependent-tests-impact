package edu.washington.cs.dt.impact.tools.lifetime;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.io.files.FileUtil;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.tools.EnhancedResultAverager;
import edu.washington.cs.dt.impact.tools.EnhancedResultManager;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PrecomputedLifetime extends StandardMain {
    private final Date startDate;
    private List<Integer> versionDays = new ArrayList<>();
    private final Path resultPaths;

    private final Path outputPath;

    private PrecomputedLifetime(final String[] args) throws ParseException {
        super(args);

        resultPaths = Paths.get(getArgRequired("paths"));
        startDate = new SimpleDateFormat("yyyy-MM-dd").parse(getArgRequired("start-date"));
        outputPath = resultPaths.resolve("results-paths");
    }

    private static String formatDate(final Instant instant) {
        return String.format("%s-%s-%s",
                instant.get(ChronoField.YEAR),
                instant.get(ChronoField.MONTH_OF_YEAR),
                instant.get(ChronoField.DAY_OF_MONTH));
    }

    public PrecomputedLifetime(final Date startDate, final Path resultPaths) {
        super(new String[0]);

        this.startDate = startDate;
        this.resultPaths = resultPaths;
        this.outputPath = resultPaths.resolve("results-paths");
    }

    public static void main(final String[] args) {
        try {
            new PrecomputedLifetime(args).run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    @Override
    protected void run() throws Exception {
        calculateResults();
    }

    private void writeValues(final Path outputPath, final TechniqueValues<List<Path>> values) throws IOException {
        Files.createDirectories(outputPath);

        Files.write(outputPath.resolve("prio.txt"), values.prio().toString().getBytes());
        Files.write(outputPath.resolve("sele.txt"), values.sele().toString().getBytes());
        Files.write(outputPath.resolve("para.txt"), values.para().toString().getBytes());
    }

    private TechniqueValues<List<Path>> readValues(final Path outputPath) throws IOException {
        final List<Path> prio = ListUtil.read(Paths::get, FileUtil.readFile(outputPath.resolve("prio.txt")));
        final List<Path> sele = ListUtil.read(Paths::get, FileUtil.readFile(outputPath.resolve("sele.txt")));
        final List<Path> para = ListUtil.read(Paths::get, FileUtil.readFile(outputPath.resolve("para.txt")));

        return new TechniqueValues<>(prio, sele, para);
    }

    public TechniqueValues<Averager<Double>> calculateResults() throws IOException {
//        if (!Files.exists(outputPath)) {
//            System.out.println("[INFO] Generating cutoffs");
//
//            final TechniqueValues<List<Path>> values =
//                    generateLifetimes()
//                            .splitAtCutoff(resultPaths)
//                            .fmap(p -> Util.appendAll(p.getLeft(), p.getRight()));
//
//            writeValues(outputPath, values);
//        }

        return calculateResults(selectPaths());
    }

    private TechniqueValues<List<Path>> selectPaths() throws IOException {
        final List<Path> paths = Files.list(resultPaths)
                .filter(path -> {
                    if (Files.isDirectory(path)) {
                        final long days = Duration.between(startDate.toInstant(), Lifetimes.dateFromDir(path).toInstant()).toDays();
                        return days < 30; // Within a month
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());

        return new TechniqueValues<>(
                ListUtil.filter(p -> EnhancedResults.getTechnique(p) == Constants.TECHNIQUE.PRIORITIZATION, paths),
                ListUtil.filter(p -> EnhancedResults.getTechnique(p) == Constants.TECHNIQUE.SELECTION, paths),
                ListUtil.filter(p -> EnhancedResults.getTechnique(p) == Constants.TECHNIQUE.PARALLELIZATION, paths));
    }

    private TechniqueValues<Averager<Double>> calculateResults(final TechniqueValues<List<Path>> values) {
        final TechniqueValues<Averager<Double>> resultAveragers = new TechniqueValues<>(Averager::new);

        final EnhancedResultManager manager = new EnhancedResultManager();

        values.forEach((technique, paths) -> {
            try {
                manager.addAll(paths);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        manager.forEach((testType, technique, averager) -> {
            final List<Double> allValues =
                    averager.averagers().stream()
                            .flatMap(a -> a.getValues().stream())
                            .collect(Collectors.toList());

            resultAveragers.technique(technique).addAll(allValues);
//                System.out.printf("%s (%s): %s\n", technique, testType, averager.latexString());
        });

        return resultAveragers;
    }

    private Lifetimes generateLifetimes() throws IOException {
        versionDays = new ArrayList<>();

        final EnhancedResultManager manager = new EnhancedResultManager();

        Files.list(resultPaths).forEach(path -> {
            versionDays.add(Math.toIntExact(Duration.between(startDate.toInstant(), Lifetimes.dateFromDir(path).toInstant()).toDays()));
            try {
                manager.add(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        System.out.println("[INFO] Averaging values");

        final Averager<Integer> prioAverager = new Averager<>();
        final Averager<Integer> seleAverager = new Averager<>();
        final Averager<Integer> paraAverager = new Averager<>();

        manager.forEach(Constants.TECHNIQUE.PRIORITIZATION, (testType, a) -> prioAverager.addAll(lifetimes(a)));
        manager.forEach(Constants.TECHNIQUE.SELECTION, (testType, a) -> seleAverager.addAll(lifetimes(a)));
        manager.forEach(Constants.TECHNIQUE.PARALLELIZATION, (testType, a) -> paraAverager.addAll(lifetimes(a)));

        final Averager<Integer> prioDTNumAverager = new Averager<>();
        final Averager<Integer> seleDTNumAverager = new Averager<>();
        final Averager<Integer> paraDTNumAverager = new Averager<>();

        manager.forEach(Constants.TECHNIQUE.PRIORITIZATION, (testType, a) -> prioDTNumAverager.add(dtNumLifetimes(a)));
        manager.forEach(Constants.TECHNIQUE.SELECTION, (testType, a) -> seleDTNumAverager.add(dtNumLifetimes(a)));
        manager.forEach(Constants.TECHNIQUE.PARALLELIZATION, (testType, a) -> paraDTNumAverager.add(dtNumLifetimes(a)));

        System.out.println("Prioritization DT Num cutoff(min): " + prioDTNumAverager.getValues().stream().min(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Selection DT Num cutoff(min): " + seleAverager.getValues().stream().min(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Parallelization DT Num cutoff(min): " + paraDTNumAverager.getValues().stream().min(Comparator.comparingInt(Integer::intValue)));

        System.out.println("Prioritization DT Num cutoff: " + (int)prioDTNumAverager.mean());
        System.out.println("Selection DT Num cutoff: " + (int)seleDTNumAverager.mean());
        System.out.println("Parallelization DT Num cutoff: " + (int)paraDTNumAverager.mean());

        System.out.println("Prioritization cutoff(min): " + prioAverager.getValues().stream().min(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Selection cutoff(min): " + seleAverager.getValues().stream().min(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Parallelization cutoff(min): " + paraAverager.getValues().stream().min(Comparator.comparingInt(Integer::intValue)));

        System.out.println("Prioritization cutoff: " + (int)prioAverager.mean());
        System.out.println("Selection cutoff: " + (int)seleAverager.mean());
        System.out.println("Parallelization cutoff: " + (int)paraAverager.mean());

        return new Lifetimes(startDate, prioAverager, seleAverager, paraAverager);
    }

    private Integer dtNumLifetimes(final EnhancedResultAverager e) {
        final int i = ListUtil.takeWhile(res -> !res.containsDTs(false), e.enhancedResults()).size() - 1;

        return i < 0 ? 0 : versionDays.get(i);
    }

    /**
     * The lifetime is the number of days until a version with the enhanced technique becomes worse than the unenhanced.
     * This is calculated individually for each test technique, that is, prio-function-relative and prio-function-absolute
     * are both calculated independently and then averaged later.
     */
    private List<Integer> lifetimes(final EnhancedResultAverager e) {
        return e.averagers().stream()
                    .map(Averager::getValues)
                    // Get the number of values until it's less than 0. -1 because it's an index.
                    .map(values -> ListUtil.takeWhile(v -> v > 0, values).size() - 1)
                    .map(i -> i < 0 ? 0 : versionDays.get(i))
                    .collect(Collectors.toList());
    }
}
