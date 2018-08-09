package edu.washington.cs.dt.impact.tools.lifetime;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.math.Averager;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.figure.generator.LifetimeFigureData;
import edu.washington.cs.dt.impact.tools.EnhancedResultManager;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class LifetimeDataGenerator {
    public static TechniqueValues<Double> cutoffs() {
        final Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("dt-impact.properties"));
        } catch (IOException e) {
            return new TechniqueValues<>(0.0, 0.0, 0.0);
        }

        return new TechniqueValues<>(
                Double.parseDouble(properties.getProperty("dt.impact.lifetime.prio")),
                Double.parseDouble(properties.getProperty("dt.impact.lifetime.sele")),
                Double.parseDouble(properties.getProperty("dt.impact.lifetime.para")));
    }

    public static double cutoff() {
        final Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("dt-impact.properties"));
        } catch (IOException e) {
            return 0.0;
        }

        return Double.parseDouble(properties.getProperty("dt.impact.lifetime.all"));
    }

    private final Path resultPaths;
    private final Properties properties;
    private final Date startDate;

    public LifetimeDataGenerator(final Path resultPaths) throws IOException, ParseException {
        this.resultPaths = resultPaths;
        this.properties = LifetimeFigureData.subjectProperties(resultPaths);

        if (properties.getProperty("subject.start_date") == null) {
            throw new IllegalArgumentException("The properties file located at " + resultPaths.resolve("subject.properties") + " does not contain subject.start_date");
        }

        this.startDate = new SimpleDateFormat("yyyy-MM-dd").parse(properties.getProperty("subject.start_date"));
    }

    private TechniqueValues<List<Path>> selectPaths(final Date startDate) throws IOException {
        final List<Path> paths = Files.list(resultPaths)
                .filter(path -> {
                    if (Files.isDirectory(path)) {
//                        final Constants.TECHNIQUE technique = EnhancedResults.getTechnique(path);
                        final long days = Duration.between(startDate.toInstant(), Lifetimes.dateFromDir(path).toInstant()).toDays();
                        return days < 7; // one week // cutoff(); // technique(technique);
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

    public TechniqueValues<Averager<Double>> calculateResults(final boolean orig) throws IOException {
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

        return calculateResults(orig, selectPaths(startDate));
    }

    private TechniqueValues<Averager<Double>> calculateResults(final boolean orig, final TechniqueValues<List<Path>> techniquePaths) {
        final TechniqueValues<Averager<Double>> resultAveragers = new TechniqueValues<>(Averager::new);

        final EnhancedResultManager manager = new EnhancedResultManager();

        techniquePaths.forEach((technique, paths) -> {
            try {
                manager.addAll(paths);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        manager.forEach((testType, technique, averager) -> {
            if (orig && testType.equals("orig")) {
                final List<Double> allValues =
                        averager.averagers().stream()
                                .flatMap(a -> a.getValues().stream())
                                .collect(Collectors.toList());

                resultAveragers.technique(technique).addAll(allValues);
            } else if (!orig && testType.equals("auto")) {
                final List<Double> allValues =
                        averager.averagers().stream()
                                .flatMap(a -> a.getValues().stream())
                                .collect(Collectors.toList());

                resultAveragers.technique(technique).addAll(allValues);
            }
//                System.out.printf("%s (%s): %s\n", technique, testType, averager.latexString());
        });

        return resultAveragers;
    }
}
