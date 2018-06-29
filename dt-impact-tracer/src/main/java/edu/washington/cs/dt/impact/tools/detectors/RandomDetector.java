package edu.washington.cs.dt.impact.tools.detectors;

import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.TestExecResultsDelta;
import edu.washington.cs.dt.TestExecResultsDifferentior;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomDetector extends Detector {
    private final TestExecResult origResults;

    public RandomDetector(final String classpath, final List<String> tests, final int rounds) {
        super(classpath, tests, rounds);

        origResults = new FixedOrderRunner(classpath, tests).run().getExecutionRecords().get(0);
    }

    @Override
    public List<TestExecResultsDelta> detectionRound() {
        final List<String> roundOrder = new ArrayList<>(tests);
        Collections.shuffle(roundOrder);

        final TestExecResults result = new FixedOrderRunner(classpath, roundOrder).run();

        return new TestExecResultsDifferentior(origResults, result).diffResults();
    }
}
