package edu.washington.cs.dt.impact.tools.detectors;

import com.reedoei.eunomia.util.StandardMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DetectorMain extends StandardMain {
    public static void main(final String[] args) throws Exception {
        new DetectorMain(args).run();
    }

    private final List<String> testOrder;
    private final String classpath;
    private final Path outputPath;

    private DetectorMain(final String[] args) throws IOException {
        super(args);

        testOrder = Files.readAllLines(Paths.get(getArgRequired("test-order")));
        classpath = getArg("cp", "classpath").orElse(System.getProperty("java.class.path"));
        outputPath = Paths.get(getArg("output").orElse("output"));
    }

    @Override
    protected void run() throws Exception {
        final DetectMode mode = DetectMode.valueOf(getArg("mode").orElse("random").toUpperCase());
        final int rounds = getArg("rounds").map(Integer::parseInt).orElse(1000);

        switch (mode) {
            case RANDOM:
                new RandomDetector(classpath, testOrder, rounds).writeTo(outputPath);
                break;
            case NONDETERMINISTIC:
                new NondeterministicDetector(classpath, testOrder, rounds).writeTo(outputPath);
                break;
        }
    }

    private enum DetectMode {
        RANDOM,
        NONDETERMINISTIC
    }
}
