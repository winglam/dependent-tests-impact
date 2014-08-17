/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * Creates a list of tests that is ordered with test prioritization based on the parameters
 * specified to the constructor.
 */

package edu.washington.cs.dt.impact.technique;

import java.io.File;
import java.util.Collections;

import edu.washington.cs.dt.impact.order.Relative;
import edu.washington.cs.dt.impact.order.Standard;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;

public class Prioritization extends Test {

    /**
     * 
     * @param order the order in which to order the tests with
     * @param outputFileName the name of the output file
     * @param inputTestFolder folder containing all test cases
     * @param coverage the coverage to consider when processing the test cases
     * @param dependentTestsFile the file containing the information
     *  regarding which test depends on which
     * @param getCoverage if true the coverage percentage of each test is printed
     *  if false, the execution result will be printed
     */
    public Prioritization(ORDER order, String outputFilename, File inputTestFolder,
            COVERAGE coverage, File dependentTestsFile, boolean getCoverage) {
        super(inputTestFolder, coverage, dependentTestsFile);

        if (order == ORDER.ABSOLUTE || order == ORDER.RELATIVE) {
            Collections.sort(methodList);
            if (order == ORDER.RELATIVE) {
                methodList = new Relative(outputFilename, methodList, allLines).getMethodList();
            }
            orderObj = new Standard(outputFilename, methodList, getCoverage, allLines);
        } else if (order == ORDER.RANDOM) {
            Collections.shuffle(methodList);
            orderObj = new Standard(outputFilename, methodList);
        } else {
            System.err.println("Test prioritization is specified with an incompatible order."
                    + " Compatible orders are: absolute, relative and random.");
            System.exit(0);
        }
    }
}
