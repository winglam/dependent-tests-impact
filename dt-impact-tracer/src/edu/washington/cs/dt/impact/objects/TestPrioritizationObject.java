package edu.washington.cs.dt.impact.objects;

import java.io.File;
import java.util.Collections;

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;

public class TestPrioritizationObject extends TestObject {
    private OrderObject orderObj;

    public TestPrioritizationObject(ORDER order, String outputFilename, File inputTestFolder, COVERAGE coverage) {
        super(inputTestFolder, coverage);

        if (order == ORDER.ABSOLUTE) {
            Collections.sort(methodList);
            orderObj = new StandardOrderObject(outputFilename, methodList);
        } else if (order == ORDER.RELATIVE) {
            Collections.sort(methodList);
            orderObj = new RelativeOrderObject(outputFilename, methodList, allLines);
        } else if (order == ORDER.RANDOM) {
            Collections.shuffle(methodList);
            orderObj = new StandardOrderObject(outputFilename, methodList);
        }
    }

    @Override
    public void printResults() {
        orderObj.printResults();
    }
}
