package edu.washington.cs.dt.impact.tools.detectors;

import com.reedoei.eunomia.collections.MapUtil;
import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RandomDetector extends Detector {
    private final Map<String, RESULT> origResults;

    public RandomDetector(final String classpath, final List<String> tests, final int rounds) {
        super(classpath, tests, rounds);

        origResults = new FixedOrderRunner(classpath, tests).run().getExecutionRecords().get(0).getNameToResultsMap();
    }

    @Override
    public List<String> detectionRound() {
        final List<String> roundOrder = new ArrayList<>(tests);
        Collections.shuffle(roundOrder);

        final TestExecResult result = new FixedOrderRunner(classpath, roundOrder).run().getExecutionRecords().get(0);

        return new ArrayList<>(MapUtil.diff(origResults, result.getNameToResultsMap()));
    }
}
