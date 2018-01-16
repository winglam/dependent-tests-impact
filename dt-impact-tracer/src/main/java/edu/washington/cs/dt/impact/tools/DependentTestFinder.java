/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 *
 *         Determines and outputs what tests needs to run before and
 *         after a particular test in order for that particular test to
 *         attain the same specified result in a new test execution order.
 */
package edu.washington.cs.dt.impact.tools;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DependentTestFinder {
    // TODO: Set up way to set this via command line
    private static File DT_FILE;

    private class TestOrder {
        private final List<String> testOrder;
        private final Map<String, RESULT> results;

        public TestOrder(final List<String> testOrder, final Map<String, RESULT> results) {
            this.testOrder = testOrder;
            this.results = results;
        }

        public TestOrder(final List<String> testOrder) {
            this.testOrder = testOrder;

            results = runTestOrder(testOrder).getNameToResultsMap();
        }

        public List<String> getTestsBefore(final String testName) {
            return testOrder.subList(0, testOrder.indexOf(testName));
        }
    }

    private static TestExecResult runTestOrder(final List<String> order) {
        return new FixedOrderRunner(order).run().getExecutionRecords().get(0);
    }

    private final String dependentTestName;
    private final RESULT dependentTestResult;
    private final TestOrder originalOrder;
    private final TestOrder newOrder;
    private final TestOrder primeOrder;

    private final List<String> filesToDelete;

    private final Map<String, Set<String>> knownDependencies;

    public DependentTestFinder(final String dependentTestName,
                               final List<String> originalOrder,
                               final List<String> newOrder,
                               final List<String> filesToDelete) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = new TestOrder(originalOrder);
        this.newOrder = new TestOrder(newOrder);

        primeOrder = new TestOrder(generatePrimeOrder(originalOrder, newOrder));

        this.filesToDelete = filesToDelete;
        knownDependencies = new HashMap<>();

        dependentTestResult = this.originalOrder.results.get(dependentTestName);
    }

    public DependentTestFinder(final String dependentTestName,
                               final List<String> originalOrder,
                               final List<String> newOrder,
                               final List<String> filesToDelete,
                               final Map<String, Set<String>> knownDependencies) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = new TestOrder(originalOrder);
        this.newOrder = new TestOrder(newOrder);

        primeOrder = new TestOrder(generatePrimeOrder(originalOrder, newOrder));

        this.filesToDelete = filesToDelete;
        this.knownDependencies = new HashMap<>(knownDependencies);

        dependentTestResult = this.originalOrder.results.get(dependentTestName);
    }

    private DependentTestFinder(final String dependentTestName,
                                final TestOrder originalOrder,
                                final TestOrder newOrder,
                                final TestOrder primeOrder,
                                final List<String> filesToDelete) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = originalOrder;
        this.newOrder = newOrder;
        this.primeOrder = primeOrder;

        this.filesToDelete = filesToDelete;
        knownDependencies = new HashMap<>();

        dependentTestResult = this.originalOrder.results.get(dependentTestName);
    }

    /**
     * Use this to create a new dependent test finder when reusing the same orig/new/prime orders.
     * Normally, the DependentTestFinder will run each order when created to get results, using
     * this method makes that unnecessary (could save a lot of time).
     *
     * Also copies filesToDelete.
     * @param finder The finder that contains the orders/results to use.
     * @param dependentTestName The dependent test that this finder should be trying to find
     *                          dependencies for.
     * @return A new finder that will find dependencies for the dependent test passed in.
     */
    public DependentTestFinder createFromFinder(final DependentTestFinder finder,
                                                final String dependentTestName) {
        return new DependentTestFinder(dependentTestName,
                finder.originalOrder,
                finder.newOrder,
                finder.primeOrder,
                filesToDelete);
    }

    private List<String> generatePrimeOrder(final List<String> originalOrder,
                                            final List<String> newOrder) {
        final List<String> primeOrder = new ArrayList<>(newOrder);

        final int origIndex = originalOrder.indexOf(dependentTestName);
        final int primeIndex = primeOrder.indexOf(dependentTestName);

        // Get all the tests that come before the test in the original order, and put them before
        // the test in the prime list.
        if (origIndex != -1 && primeIndex != -1) {
            primeOrder.addAll(primeIndex, originalOrder.subList(0, origIndex));
        }

        return primeOrder;
    }
}
