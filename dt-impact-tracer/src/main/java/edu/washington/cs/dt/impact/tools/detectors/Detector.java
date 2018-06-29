package edu.washington.cs.dt.impact.tools.detectors;

import com.reedoei.eunomia.functional.Func;
import com.reedoei.eunomia.io.CaptureOutStream;
import com.reedoei.eunomia.io.CapturedOutput;
import edu.washington.cs.dt.TestExecResultsDelta;

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

    public abstract List<TestExecResultsDelta> detectionRound();

    public List<String> newTests(final List<TestExecResultsDelta> roundResult) {
//        for (final TestExecResultsDelta delta : roundResult) {
//            tests.remove(delta.testName);
//        }

        return tests;
    }

    public List<TestExecResultsDelta> detect() {
        final List<TestExecResultsDelta> result = new ArrayList<>();

        int i = 0;
        while (i < rounds) {
            final CapturedOutput<List<TestExecResultsDelta>> run = new CaptureOutStream<>(this::detectionRound).run();

            if (run.hadError()) {
                System.out.printf("Run %d had an error. Full log is shown below:\n", i);
                System.out.println(run.stringOutput());
            } else {
                final List<TestExecResultsDelta> currentRoundResult = run.valueRequired();
                // Make sure we don't get duplicates.
                for (final TestExecResultsDelta delta : result) {
                    currentRoundResult.removeIf(curDelta -> delta.testName.equals(curDelta.testName));
                }

                System.out.printf("[INFO] Found %d tests in round %d of %d\n", currentRoundResult.size(), i, rounds);

                if (!currentRoundResult.isEmpty()) {
                    result.addAll(currentRoundResult);
                    i = 0;
                } else {
                    i++;
                }

                tests = newTests(currentRoundResult);
            }
        }

        return result;
    }

    public void writeTo(final Path path) throws IOException {
        Files.write(path, String.join(System.lineSeparator(), Func.map(TestExecResultsDelta::toString, detect())).getBytes());
    }
}
