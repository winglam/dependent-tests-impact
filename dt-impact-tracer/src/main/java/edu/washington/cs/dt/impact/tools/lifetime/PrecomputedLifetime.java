package edu.washington.cs.dt.impact.tools.lifetime;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.io.files.FileUtil;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.tools.EnhancedResultAverager;
import edu.washington.cs.dt.impact.tools.EnhancedResultManager;
import edu.washington.cs.dt.impact.util.Constants;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PrecomputedLifetime extends StandardMain {
    private final Date startDate;
    private List<Integer> versionDays = new ArrayList<>();
    private final Path resultPaths;

    private PrecomputedLifetime(final String[] args) throws ParseException {
        super(args);

        resultPaths = Paths.get(getArgRequired("paths"));
        startDate = new SimpleDateFormat("yyyy-MM-dd").parse(getArgRequired("start-date"));
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
        final Path outputPath = resultPaths.resolve("results-paths");

        if (!Files.exists(outputPath)) {
            System.out.println("[INFO] Generating cutoffs");

            final TechniqueValues<List<Path>> values =
                    generateLifetimes()
                            .splitAtCutoff(resultPaths)
                            .fmap(p -> Util.appendAll(p.getLeft(), p.getRight()));

            writeValues(outputPath, values);
        }

        calculateResults(readValues(outputPath));
    }

    private void writeValues(final Path outputPath, final TechniqueValues<List<Path>> values) throws IOException {
        Files.createDirectories(outputPath);

        Files.write(outputPath.resolve("prio.txt"), values.prio().toString().getBytes());
        Files.write(outputPath.resolve("sele.txt"), values.sele().toString().getBytes());
        Files.write(outputPath.resolve("para.txt"), values.para().toString().getBytes());
    }

    private TechniqueValues<List<Path>> readValues(final Path outputPath) throws IOException {
        final List<Path> prio = ListUtil.read(FileUtil.readFile(outputPath.resolve("prio.txt")), Paths::get);
        final List<Path> sele = ListUtil.read(FileUtil.readFile(outputPath.resolve("sele.txt")), Paths::get);
        final List<Path> para = ListUtil.read(FileUtil.readFile(outputPath.resolve("para.txt")), Paths::get);

        return new TechniqueValues<>(prio, sele, para);
    }

    private void calculateResults(final TechniqueValues<List<Path>> values) {
        final EnhancedResultManager manager = new EnhancedResultManager();

        values.forEach((technique, paths) -> {
            try {
                manager.addAll(paths);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        manager.forEach((testType, technique, averager) -> {
            try {
                System.out.printf("%s (%s): %s\n", technique, testType, averager.latexString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
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

        System.out.println();
        System.out.println("Prioritization cutoff: " + (int)prioAverager.mean());
        System.out.println("Selection cutoff: " + (int)seleAverager.mean());
        System.out.println("Parallelization cutoff: " + (int)paraAverager.mean());

        return new Lifetimes(startDate, prioAverager, seleAverager, paraAverager);
    }

    /**
     * The lifetime is the number of days until a version with the enhanced technique becomes worse than the unenhanced.
     * This is calculated individually for each test technique, that is, prio-function-relative and prio-function-absolute
     * are both calculated independently and then averaged later.
     */
    private List<Integer> lifetimes(final EnhancedResultAverager e) {
        return e.getAveragers().stream()
                    .map(Averager::getValues)
                    // Get the number of values until it's less than 0. -1 because it's an index.
                    .map(values -> ListUtil.takeWhile(v -> v > 0, values).size() - 1)
                    .map(i -> i < 0 ? 0 : versionDays.get(i))
                    .collect(Collectors.toList());
    }
}
