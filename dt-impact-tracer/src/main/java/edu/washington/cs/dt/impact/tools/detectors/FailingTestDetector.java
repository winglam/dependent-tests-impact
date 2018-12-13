package edu.washington.cs.dt.impact.tools.detectors;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.main.ImpactMain;
import edu.washington.cs.dt.runners.FixedOrderRunner;

public class FailingTestDetector extends StandardMain {
    private final String classpath;
    private Path testList = null;
    private List<String> tests;
    private Path outputPath = null;

    public FailingTestDetector(final String[] args) throws IOException {
        super(args);

        this.classpath = getClasspathArg();
        this.testList = Paths.get(getArgRequired("tests"));
        this.tests = Files.readAllLines(testList, Charset.defaultCharset());

        this.outputPath = Paths.get(getArgRequired("output"));
    }

    public static void main(final String[] args) {
        try {
            new FailingTestDetector(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

    @Override
    protected void run() throws Exception {
        output(notPassingTests());
    }

    private void output(final Set<String> tests) throws IOException {
        final Set<String> allOutput = new HashSet<>(tests);

        // Read the lines so we don't get rid of any tests
        // but don't just append to the file, use a set to keep track so there are no duplicates.
        if (Files.exists(outputPath)) {
            allOutput.addAll(Files.readAllLines(outputPath, Charset.defaultCharset()));
        }

        Files.write(outputPath, String.join(System.lineSeparator(), allOutput).getBytes());
    }

    public FailingTestDetector(String classpath, List<String> tests) {
        super(new String[0]);
        this.classpath = classpath;
        this.tests = tests;
    }

    public void setTestList(List<String> tests) {
        this.tests = tests;
    }

    public Set<String> notPassingTests() throws IOException {
        final Set<String> notPassingTests = new HashSet<>();

        ImpactMain.skipMissingTests = true;

        while (true) {
            if (tests.isEmpty()) {
                break;
            }
            final TestExecResult result = new FixedOrderRunner(classpath, tests).run().getExecutionRecords().get(0);

            final int beforeSize = tests.size();
            notPassingTests.addAll(tests.stream().filter(t -> !result.getResult(t).result.equals(RESULT.PASS)).collect(Collectors.toList()));

            tests.removeAll(notPassingTests);
            final int afterSize = tests.size();

            if (beforeSize == afterSize) {
                break;
            }
        }
        System.out.println();

        return notPassingTests;
    }
}
