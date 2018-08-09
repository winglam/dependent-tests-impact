package edu.washington.cs.dt.impact.tools.lifetime;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.io.files.FileUtil;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.tools.EnhancedResultAverager;
import edu.washington.cs.dt.impact.tools.EnhancedResultManager;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrecomputedLifetime extends StandardMain {
    private List<Integer> versionDays = new ArrayList<>();
    private final Path resultPaths;

    private PrecomputedLifetime(final String[] args) {
        super(args);

        resultPaths = Paths.get(getArgRequired("paths"));
    }

    public PrecomputedLifetime(final Path resultPaths) {
        super(new String[0]);

        this.resultPaths = resultPaths;
    }

    public static void main(final String[] args) {
        try {
            new PrecomputedLifetime(args).run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    private static TechniqueValues<Averager<Integer>> combineAveragers(final TechniqueValues<Averager<Integer>> a,
                                                                       final TechniqueValues<Averager<Integer>> b) {
        a.prio().addAll(b.prio().getValues());
        a.sele().addAll(b.sele().getValues());
        a.para().addAll(b.para().getValues());

        return a;
    }

    @Override
    protected void run() throws Exception {
        final TechniqueValues<Averager<Integer>> averaged =
                Files.list(resultPaths)
                        .flatMap(this::lifetimesFromPath)
                        .reduce(new TechniqueValues<>(Averager::new),
                                PrecomputedLifetime::combineAveragers);

        System.out.println("Prio lifetime: " + averaged.prio().mean());
        System.out.println("Sele lifetime: " + averaged.sele().mean());
        System.out.println("Para lifetime: " + averaged.para().mean());

        final Averager<Integer> overall = new Averager<>(averaged.prio().getValues());
        overall.addAll(averaged.sele().getValues());
        overall.addAll(averaged.para().getValues());
        System.out.println("Overall lifetime: " + overall.mean());
    }

    private Stream<TechniqueValues<Averager<Integer>>> lifetimesFromPath(Path path) {
        if (Files.isDirectory(path)) {
            try {
                System.out.println("[INFO] Getting lifetimes from " + path);
                return Stream.of(generateLifetimes(path));
            } catch (IOException ignored) {
            }
        }

        return Stream.empty();
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

    private TechniqueValues<Averager<Integer>> generateLifetimes(final Path resultPaths) throws IOException {
        versionDays = new ArrayList<>();

        final EnhancedResultManager manager = new EnhancedResultManager();

        final Date startDate = Lifetimes.dateFromDir(resultPaths);

        Files.list(resultPaths).forEach(path -> {
            if (Files.isDirectory(path)) {
                versionDays.add(Math.toIntExact(Duration.between(startDate.toInstant(), Lifetimes.dateFromDir(path).toInstant()).toDays()));
                try {
                    manager.add(path.toAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
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

        return new TechniqueValues<>(prioDTNumAverager, seleDTNumAverager, paraDTNumAverager);
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
