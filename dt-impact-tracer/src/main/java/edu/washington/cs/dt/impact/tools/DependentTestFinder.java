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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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

    /**
     * Generates a test order containing all the tests in order, with the dependent test coming at
     * the end, respecting all dependencies.
     * @param order The order of tests to run before the dependent test. Not modified.
     * @return The results from running the tests in that order.
     */
    private TestExecResult makeAndRunTestOrder(final List<String> order) {
        List<String> newOrder = new ArrayList<>(order);
        newOrder.add(dependentTestName);

        newOrder = TestOrderGenerator.generateTestOrder(newOrder, knownDependencies);

        return runTestOrder(newOrder);
    }

    private void addDependency(final String testName, final String dependency) {
        knownDependencies.compute(testName, (t, dependencies) -> {
            if (dependencies == null) {
                dependencies = new HashSet<>();
            }

            dependencies.add(dependency);
            return dependencies;
        });
    }

    public Map<String, Set<String>> getKnownDependencies() {
        return knownDependencies;
    }

    /**
     * Takes a list of dtFinders and merges the dependency information from all of them into one map.
     */
    public static Map<String, Set<String>> mergeDependencies(final List<DependentTestFinder> dtFinders) {
        return dtFinders.stream()
                .map(DependentTestFinder::getKnownDependencies)
                .reduce(new HashMap<>(), DependentTestFinder::mergeDependencies);
    }

    /**
     * Takes two maps of dependencies and combines them. If both maps contain the same key, the sets
     * of dependencies will be merged.
     *
     * Does not modify either of the original maps.
     * @param a The first map of dependencies.
     * @param b The second map of dependencies.
     * @return A map contains all of the dependencies.
     */
    public static Map<String, Set<String>> mergeDependencies(final Map<String, Set<String>> a,
                                                             final Map<String, Set<String>> b) {
        final Map<String, Set<String>> result = new HashMap<>(a);

        b.forEach((testName, dependencies) ->
                // If any key is in both maps, then merge the sets using this function.
                result.merge(testName, dependencies, (aDependencies, bDependencies) -> {
                    aDependencies.addAll(bDependencies);

                    return aDependencies;
                }));

        return result;
    }

    // runs orderedTests and determine whether dependentTestName
    // in the orderTests matches DEPEDENT_TEST_RESULT
    // returns true if dependentTestName's result in orderedTest
    // does not match DEPENDENT_TEST_RESULT, false otherwise
    private boolean isTestResultDifferent(List<String> orderedTests) {
        FileTools.clearEnv(filesToDelete);
        TestExecResult result = makeAndRunTestOrder(orderedTests);

        RESULT dtIsolateResult = null;
        if (result.isTestPassed(dependentTestName)) {
            dtIsolateResult = RESULT.PASS;
        } else if (result.isTestError(dependentTestName)) {
            dtIsolateResult = RESULT.ERROR;
        } else {
            dtIsolateResult = RESULT.FAILURE;
        }

        return !dtIsolateResult.equals(dependentTestResult);
    }

    // returns true if dependentTestName's result in results is the same as
    // DEPENDENT_TEST_RESULT and if it is original order, false otherwise
    private boolean checkTestMatch(boolean isOriginalOrder, TestExecResult results) {
        boolean testResult;
        if (dependentTestResult.equals(RESULT.PASS)) {
            testResult = results.isTestPassed(dependentTestName);
        } else if (dependentTestResult.equals(RESULT.ERROR)) {
            testResult = results.isTestError(dependentTestName);
        } else {
            testResult = results.isTestFailed(dependentTestName);
        }

        return testResult == isOriginalOrder;
    }

    /**
     * Finds all the dependencies for the test that this class was initialized with.
     * @return The new map of dependencies.
     */
    public DependentTestFinder runDTF() {
        // If the result is the same, then the dependencies must be some of the tests in the original order
        // that came before this test.
        if (originalOrder.results.get(dependentTestName) == primeOrder.results.get(dependentTestName)) {
            dependentTestSolver(originalOrder.getTestsBefore(dependentTestName), true, new ArrayList<>());
        } else {
            // Run the test in isolation
            final Map<String, RESULT> results =
                    runTestOrder(Collections.singletonList(dependentTestName)).getNameToResultsMap();

            // If the result is the same with no tests before it, then we don't need any of the original
            // tests, we just need to move some of the new tests to after
            // come before in the original order.
            if (results.get(dependentTestName) == originalOrder.results.get(dependentTestName)) {
                dependentTestSolver(newOrder.getTestsBefore(dependentTestName), false, new ArrayList<>());
            } else {
                // If the result is still different from the original order, then we must need both
                // some/all tests from the original order to come before and some/all tests from the
                // order to come after.

                dependentTestSolver(newOrder.getTestsBefore(dependentTestName), false, new ArrayList<>());
                dependentTestSolver(originalOrder.getTestsBefore(dependentTestName), true, new ArrayList<>());
            }
        }

        return this;
    }

    private void dependentTestSolver(List<String> tests, boolean isOriginalOrder,
                                     List<String> addOnTests) {
        tests.removeAll(addOnTests);
        List<String> topHalf = new LinkedList<>(tests.subList(0, tests.size() / 2));
        List<String> botHalf = new LinkedList<>(tests.subList(tests.size() / 2, tests.size()));

        while (tests.size() > 1) {
            topHalf.addAll(addOnTests);
            topHalf.add(dependentTestName);

            botHalf.addAll(addOnTests);
            botHalf.add(dependentTestName);

            FileTools.clearEnv(filesToDelete);
            TestExecResult topResults = makeAndRunTestOrder(topHalf);
            boolean topResultsMatch = checkTestMatch(isOriginalOrder, topResults);

            FileTools.clearEnv(filesToDelete);
            TestExecResult botResults = makeAndRunTestOrder(botHalf);
            boolean botResultsMatch = checkTestMatch(isOriginalOrder, botResults);

            // dependent test depends on more than one test in tests
            if (topResultsMatch == botResultsMatch) {
                /* Part of TODO below.
                List<String> newBeforeTests = new ArrayList<>(beforeTests);
                List<String> newAfterTests = new ArrayList<>(afterTests);
                */
                List<String> newTopList = new ArrayList<>(tests.subList(0, tests.size() / 2));
                List<String> newBotList = new ArrayList<>(tests.subList(tests.size() / 2, tests.size()));

                // First, find the dependent tests in the top half.
                // We can skip finding exactly which tests are the dependent tests in the bottom half
                // for now by simply running all of them.
                dependentTestSolver(newTopList, isOriginalOrder, newBotList);

                /* TODO: Verify this is unnecessary. I think it is because it just seems to handle dependencies.
                if (!beforeTests.equals(newBeforeTests)) {
                    List<String> tempBeforeTests = new ArrayList<>(beforeTests);
                    beforeTests.removeAll(newBeforeTests);
                    if (!topAddOnTests.containsAll(beforeTests)) {
                        beforeTests.removeAll(topAddOnTests);
                        topAddOnTests.addAll(beforeTests);
                    }
                    beforeTests.clear();
                    beforeTests.addAll(tempBeforeTests);
                }

                if (!afterTests.equals(newAfterTests)) {
                    List<String> tempAfterTests = new ArrayList<>(afterTests);
                    afterTests.removeAll(newAfterTests);
                    if (!topAddOnTests.containsAll(afterTests)) {
                        afterTests.removeAll(topAddOnTests);
                        topAddOnTests.addAll(afterTests);
                    }
                    afterTests.clear();
                    afterTests.addAll(tempAfterTests);
                }
                */

                // Now that we know the dependent tests in the top half, those dependencies should
                // be handled by the knownDependencies variable.
                List<String> orderedTests = new ArrayList<>(addOnTests);
                orderedTests.add(dependentTestName);
                boolean testResult = isTestResultDifferent(orderedTests);
                if (!((!isOriginalOrder && testResult) || (isOriginalOrder && !testResult))) {
                    // case of A and B needs to come before C
                    dependentTestSolver(newBotList, isOriginalOrder, addOnTests);
                }

                return;
            }

            // If only one half contains dependent tests, ignore all tests not in that half.
            if (topResultsMatch) {
                tests = topHalf;
            } else {
                tests = botHalf;
            }

            tests.removeAll(addOnTests);
            tests.remove(tests.size() - 1);

            topHalf = new LinkedList<>(tests.subList(0, tests.size() / 2));
            botHalf = new LinkedList<>(tests.subList(tests.size() / 2, tests.size()));
        }

        if (!tests.isEmpty()) {
            if (isOriginalOrder) {
                addDependency(dependentTestName, tests.get(0));
            } else {
                addDependency(tests.get(0), dependentTestName);
            }
        }
    }
}
