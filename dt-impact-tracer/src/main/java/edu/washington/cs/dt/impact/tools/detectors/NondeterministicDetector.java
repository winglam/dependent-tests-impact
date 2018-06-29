package edu.washington.cs.dt.impact.tools.detectors;

import com.reedoei.eunomia.collections.MapUtil;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NondeterministicDetector extends Detector {
    public NondeterministicDetector(final String classpath, final List<String> tests, final int rounds) {
        super(classpath, tests, rounds);
    }

    @Override
    public List<String> detectionRound() {
        final List<String> roundOrder = new ArrayList<>(tests);
        Collections.shuffle(roundOrder);

        final TestExecResult firstRun = new FixedOrderRunner(classpath, roundOrder).run().getExecutionRecords().get(0);
        final TestExecResult secondRun = new FixedOrderRunner(classpath, roundOrder).run().getExecutionRecords().get(0);

        return new ArrayList<>(MapUtil.diff(firstRun.getNameToResultsMap(), secondRun.getNameToResultsMap()));
    }
}
