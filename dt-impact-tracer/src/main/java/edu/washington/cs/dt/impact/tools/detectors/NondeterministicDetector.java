package edu.washington.cs.dt.impact.tools.detectors;

import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.TestExecResultsDelta;
import edu.washington.cs.dt.TestExecResultsDifferentior;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NondeterministicDetector extends Detector {
    private final TestExecResult firstRun;

    public NondeterministicDetector(final String classpath, final List<String> tests, final int rounds) {
        super(classpath, tests, rounds);

        firstRun = new FixedOrderRunner(classpath, tests).run().getExecutionRecords().get(0);
    }

    @Override
    public List<TestExecResultsDelta> detectionRound() {
        final TestExecResults secondRun = new FixedOrderRunner(classpath, tests).run();

        return new TestExecResultsDifferentior(firstRun, secondRun).diffResults();
    }
}
