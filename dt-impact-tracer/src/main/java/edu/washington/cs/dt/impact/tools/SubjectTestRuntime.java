package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.collections.StreamUtil;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.impact.util.Constants;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Collectors;

public class SubjectTestRuntime extends StandardMain {
    private final Path paths;

    private SubjectTestRuntime(final String[] args) {
        super(args);

        this.paths = Paths.get(getArgRequired("paths")).toAbsolutePath();
    }

    public static void main(final String[] args) {
        try {
            new SubjectTestRuntime(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

    private static Optional<Pair<Double, Double>> calculateAvgRuntime(final Path path) {
        if (Files.isDirectory(path)) {
            try {
                final EnhancedResultManager manager = new EnhancedResultManager(path);

                final Averager<Double> origRuntimes = new Averager<>();
                final Averager<Double> autoRuntimes = new Averager<>();

                manager.forEach((origOrAuto, technique, averager) -> {
                    final int figNum = Constants.TECHNIQUE_FIGNUMS.technique(technique);

                    if (origOrAuto.equals("orig")) {
                        origRuntimes.addAll(
                                averager.enhancedResults().stream()
                                        .flatMap(e -> e.runtimes(figNum, origOrAuto))
                                        .collect(Collectors.toList()));
                    } else {
                        autoRuntimes.addAll(
                                averager.enhancedResults().stream()
                                        .flatMap(e -> e.runtimes(figNum, origOrAuto))
                                        .collect(Collectors.toList()));
                    }
                });

                System.out.println(path);
                System.out.println("Average original runtime: " + origRuntimes.mean());
                System.out.println("Average auto runtime: " + autoRuntimes.mean());

                return Optional.of(ImmutablePair.of(origRuntimes.mean(), autoRuntimes.mean()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return Optional.empty();
    }

    @Override
    protected void run() throws Exception {
        final Averager<Double> origRuntimes = new Averager<>();
        final Averager<Double> autoRuntimes = new Averager<>();

        StreamUtil.removeEmpty(Files.list(paths)
                                    .map(SubjectTestRuntime::calculateAvgRuntime))
                .forEach(p -> {
                    origRuntimes.add(p.getLeft());
                    autoRuntimes.add(p.getRight());
                });

        System.out.println("Overall average original runtime: " + origRuntimes.mean());
        System.out.println("Overall average auto runtime: " + autoRuntimes.mean());
    }
}
