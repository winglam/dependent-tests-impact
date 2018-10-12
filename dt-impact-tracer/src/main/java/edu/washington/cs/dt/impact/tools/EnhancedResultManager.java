package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.functional.TriConsumer;
import edu.washington.cs.dt.impact.data.TechniqueValues;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class EnhancedResultManager {
    private final TechniqueValues<EnhancedResultAverager> origAveragers =
            new TechniqueValues<>(
                    new EnhancedResultAverager("orig", Constants.TECHNIQUE.PRIORITIZATION),
                    new EnhancedResultAverager("orig", Constants.TECHNIQUE.SELECTION),
                    new EnhancedResultAverager("orig", Constants.TECHNIQUE.PARALLELIZATION));
    private final TechniqueValues<EnhancedResultAverager> autoAveragers =
            new TechniqueValues<>(
                    new EnhancedResultAverager("auto", Constants.TECHNIQUE.PRIORITIZATION),
                    new EnhancedResultAverager("auto", Constants.TECHNIQUE.SELECTION),
                    new EnhancedResultAverager("auto", Constants.TECHNIQUE.PARALLELIZATION));

    public EnhancedResultManager(final Path path) throws IOException {
        this(Files.list(path).collect(Collectors.toList()));
    }

    public EnhancedResultManager(final List<Path> paths) throws IOException {
        this();

        for (final Path path : paths) {
            if (Files.isDirectory(path)) {
                add(path);
            }
        }
    }

    public EnhancedResultManager() {
    }

    private boolean has(final Path p, final String s) throws IOException {
        return Files.list(p).anyMatch(path -> path.getFileName().toString().contains(s));
    }

    /**
     * @param resultDir A directory containing prioritization/selection/parallelization results directories.
     * @return The modified manager, with the new enhanced results files added
     */
    public EnhancedResultManager add(final Path resultDir) throws IOException {
        Files.list(resultDir).forEach(p -> {
            try {
                if (Files.isDirectory(p)) {
                    if (has(p, "-ORIG-")) {
                        origAveragers.technique(EnhancedResults.getTechnique(p)).add(p);
                    }

                    if (has(p, "-AUTO-")) {
                        autoAveragers.technique(EnhancedResults.getTechnique(p)).add(p);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return this;
    }

    public Optional<EnhancedResultAverager> retrieve(final String origOrAuto, final Constants.TECHNIQUE technique) {
        switch (origOrAuto) {
            case "orig":
                return Optional.ofNullable(origAveragers.technique(technique));

            case "auto":
                return Optional.ofNullable(autoAveragers.technique(technique));

            default:
                throw new IllegalArgumentException("Unknown test type: " + origOrAuto);
        }
    }

    public void forEach(final TriConsumer<String, Constants.TECHNIQUE, EnhancedResultAverager> consumer) {
        origAveragers.forEach((technique, averager) -> consumer.accept("orig", technique, averager));
        autoAveragers.forEach((technique, averager) -> consumer.accept("auto", technique, averager));
    }

    public void forEach(final Constants.TECHNIQUE technique, final BiConsumer<String, EnhancedResultAverager> consumer) {
        origAveragers.forEach((t, averager) -> {
            if (t == technique) {
                consumer.accept("orig", averager);
            }
        });

        autoAveragers.forEach((t, averager) -> {
            if (t == technique) {
                consumer.accept("auto", averager);
            }
        });
    }

    public void addAll(final List<Path> paths) throws IOException {
        for (final Path path : paths) {
            add(path);
        }
    }
}
