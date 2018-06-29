package edu.washington.cs.dt.impact.tools.detectors;

import com.reedoei.eunomia.io.CaptureOutStream;
import com.reedoei.eunomia.io.CapturedOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class Detector {
    protected final String classpath;
    protected List<String> tests;

    private int rounds;

    public Detector(final String classpath, final List<String> tests, final int rounds) {
        this.classpath = classpath;
        this.tests = tests;
        this.rounds = rounds;
    }

    public abstract List<String> detectionRound();

    public List<String> newTests(final List<String> roundResult) {
        tests.removeAll(roundResult);
        return tests;
    }

    public List<String> detect() {
        final List<String> result = new ArrayList<>();

        int i = 0;
        while (i < rounds) {
            final CapturedOutput<List<String>> run = new CaptureOutStream<>(this::detectionRound).run();

            if (run.hadError()) {
                System.out.printf("Run %d had an error. Full log is shown below:\n", i);
                System.out.println(run.stringOutput());
            } else {
                final List<String> currentRoundResult = run.valueRequired();

                System.out.printf("[INFO] Found %d tests in round %d of %d\n", currentRoundResult.size(), i, rounds);

                if (!currentRoundResult.isEmpty()) {
                    i = 0;
                } else {
                    result.addAll(currentRoundResult);
                    i++;
                }

                tests = newTests(currentRoundResult);
            }
        }

        return result;
    }

    public void writeTo(final Path path) throws IOException {
        Files.write(path, String.join(System.lineSeparator(), detect()).getBytes());
    }
}
