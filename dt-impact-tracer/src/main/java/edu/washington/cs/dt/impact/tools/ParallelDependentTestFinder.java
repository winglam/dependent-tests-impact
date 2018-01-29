/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam, Reed Oei
 *
 *         Determines and outputs what tests needs to run before and
 *         after a particular test in order for that particular test to
 *         attain the same specified result in a new test execution order.
 */
package edu.washington.cs.dt.impact.tools;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.impact.data.TestData;
import edu.washington.cs.dt.runners.FixedOrderRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Usages:
 * Get ALL_DT_LIST for just one test:
 * <pre>
 * {@code
 * ParallelDependentTestFinder dtFinder = new ParallelDependentTestFinder(dependentTestName, origOrder, newOrder, filesToDelete);
 *
 * Map<String, Set<String>> knownDependencies = dtFinder.runDTF();
 *
 * }
 * </pre>
 *
 * Get known dependencies for multiple tests, using same orig/new/prime order:
 * <pre>
 * {@code
 * List<DependentTestFinder> dtFinders = new ArrayList<>();
 *
 * For first test:
 * ParallelDependentTestFinder dtFinder = new ParallelDependentTestFinder(dependentTestName, origOrder, newOrder, filesToDelete);
 *
 * Map<String, Set<String>> knownDependencies = dtFinder.runDTF();
 *
 * For second, etc.:
 * ParallelDependentTestFinder dtFinder2 = dtFinder.createFinderFor(nextDependentTestName);
 *
 * Map<String, Set<String>> knownDependencies2 = dtFinder.runDTF();
 *
 * // merge known dependencies into one map if desired.
 *
 * }
 *
 * </pre>
 */
public class ParallelDependentTestFinder {
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

        public RESULT getResult(final String testName) {
            return results.get(testName);
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

    private final Map<String, Set<TestData>> knownDependencies;

    public ParallelDependentTestFinder(final String dependentTestName,
                                       final List<String> originalOrder,
                                       final List<String> newOrder,
                                       final List<String> filesToDelete) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = new TestOrder(originalOrder);
        this.newOrder = new TestOrder(newOrder);

        primeOrder = new TestOrder(generatePrimeOrder(this.originalOrder, this.newOrder));

        this.filesToDelete = filesToDelete;
        knownDependencies = new HashMap<>();

        dependentTestResult = this.originalOrder.getResult(dependentTestName);
    }

    public ParallelDependentTestFinder(final String dependentTestName,
                                       final List<String> originalOrder,
                                       final List<String> newOrder,
                                       final List<String> filesToDelete,
                                       final Map<String, Set<TestData>> knownDependencies) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = new TestOrder(originalOrder);
        this.newOrder = new TestOrder(newOrder);

        primeOrder = new TestOrder(generatePrimeOrder(this.originalOrder, this.newOrder));

        this.filesToDelete = filesToDelete;
        this.knownDependencies = knownDependencies;

        dependentTestResult = this.originalOrder.getResult(dependentTestName);
    }

    public ParallelDependentTestFinder(final String dependentTestName,
                                       final List<String> originalOrder,
                                       final Map<String, RESULT> originalResults,
                                       final List<String> newOrder,
                                       final Map<String, RESULT> newResults,
                                       final List<String> filesToDelete) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = new TestOrder(originalOrder, originalResults);
        this.newOrder = new TestOrder(newOrder, newResults);

        primeOrder = new TestOrder(generatePrimeOrder(this.originalOrder, this.newOrder));

        this.filesToDelete = filesToDelete;
        knownDependencies = new HashMap<>();

        dependentTestResult = this.originalOrder.getResult(dependentTestName);
    }

    public ParallelDependentTestFinder(final String dependentTestName,
                                       final List<String> originalOrder,
                                       final Map<String, RESULT> originalResults,
                                       final List<String> newOrder,
                                       final Map<String, RESULT> newResults,
                                       final List<String> filesToDelete,
                                       final Map<String, Set<TestData>> knownDependencies) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = new TestOrder(originalOrder, originalResults);
        this.newOrder = new TestOrder(newOrder, newResults);

        primeOrder = new TestOrder(generatePrimeOrder(this.originalOrder, this.newOrder), originalResults);

        this.filesToDelete = filesToDelete;
        this.knownDependencies = knownDependencies;

        dependentTestResult = this.originalOrder.getResult(dependentTestName);
    }

    private ParallelDependentTestFinder(final String dependentTestName,
                                        final TestOrder originalOrder,
                                        final TestOrder newOrder,
                                        final TestOrder primeOrder,
                                        final List<String> filesToDelete,
                                        final Map<String, Set<TestData>> knownDependencies) {
        this.dependentTestName = dependentTestName;

        this.originalOrder = originalOrder;
        this.newOrder = newOrder;
        this.primeOrder = primeOrder;

        this.filesToDelete = filesToDelete;
        dependentTestResult = this.originalOrder.results.get(dependentTestName);

        this.knownDependencies = knownDependencies;
    }

    /**
     * Use this to create a new dependent test finder when reusing the same orig/new/prime orders.
     * Normally, the DependentTestFinder will run each order when created to get results, using
     * this method makes that unnecessary (could save a lot of time).
     *
     * Also copies filesToDelete.
     * @param dependentTestName The dependent test that this finder should be trying to find
     *                          dependencies for.
     * @return A new finder that will find dependencies for the dependent test passed in.
     */
    public ParallelDependentTestFinder createFinderFor(final String dependentTestName) {
        return new ParallelDependentTestFinder(dependentTestName,
                originalOrder,
                newOrder,
                primeOrder,
                filesToDelete,
                knownDependencies);
    }

    private List<String> generatePrimeOrder(final TestOrder originalOrder,
                                            final TestOrder newOrder) {
        final List<String> primeOrder = new ArrayList<>(newOrder.testOrder);

        final int primeIndex = primeOrder.indexOf(dependentTestName);

        // Get all the tests that come before the test in the original order, and put them before
        // the test in the prime list.
        if (primeIndex != -1) {
            final List<String> insertTests = originalOrder.getTestsBefore(dependentTestName);

            // Make sure no tests appear twice.
            primeOrder.removeIf(insertTests::contains);
            primeOrder.addAll(primeIndex, insertTests);
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

        knownDependencies.forEach((key, dependencies) ->
                dependencies.forEach(dependency -> dependency.fixOrder(newOrder)));

        return runTestOrder(newOrder);
    }

    /**
     * Adds a dependency to the known dependencies for the current dependent test.
     * @param dependency The new dependency
     * @param result The result of running the test without this dependency in it's proper location.
     */
    private void addDependency(final String dependency,
                               final RESULT result,
                               final List<String> testOrder,
                               final boolean isBefore) {
        knownDependencies.compute(dependentTestName, (testName, dependencies) -> {
            if (dependencies == null) {
                dependencies = new HashSet<>();
            }

            if (isBefore) {
                dependencies.add(new TestData(dependentTestName,
                        dependentTestResult,
                        new HashSet<>(Collections.singletonList(dependency)),
                        new HashSet<>(),
                        result,
                        testOrder));
            } else {
                dependencies.add(new TestData(dependentTestName,
                        dependentTestResult,
                        new HashSet<>(),
                        new HashSet<>(Collections.singletonList(dependency)),
                        result,
                        testOrder));
            }

            return dependencies;
        });
    }

    public Map<String, Set<TestData>> getKnownDependencies() {
        return knownDependencies;
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
     *         (i.e., the test still has a different result than it did in the original order).
     */
    public Map<String, Set<TestData>> runDTF() throws DependencyVerificationException {
        // If the dt is already in the knownDependencies list, we must have tried the below method
        // to find dependencies and not found all of them.
        if (knownDependencies.containsKey(dependentTestName)) {
            findDependencyInChains();
        } else {
            // If the result is the same, then the dependencies must be some of the tests in the original order
            // that came before this test.
            if (dependentTestResult == primeOrder.getResult(dependentTestName)) {
                dependentTestSolver(originalOrder.getTestsBefore(dependentTestName),
                        true,
                        new ArrayList<>(),
                        newOrder.getResult(dependentTestName),
                        newOrder.testOrder);
            } else {
                // Run the test in isolation
                final Map<String, RESULT> results =
                        runTestOrder(Collections.singletonList(dependentTestName)).getNameToResultsMap();

                // If the result is the same with no tests before it, then we don't need any of the original
                // tests, we just need to move some of the new tests to after
                // come before in the original order.
                if (results.get(dependentTestName) == dependentTestResult) {
                    dependentTestSolver(newOrder.getTestsBefore(dependentTestName),
                            false,
                            new ArrayList<>(),
                            newOrder.getResult(dependentTestName),
                            newOrder.testOrder);
                } else {
                    // If the result is still different from the original order, then we must need both
                    // some/all tests from the original order to come before and some/all tests from the
                    // order to come after.

                    dependentTestSolver(newOrder.getTestsBefore(dependentTestName),
                            false,
                            new ArrayList<>(),
                            newOrder.getResult(dependentTestName),
                            newOrder.testOrder);
                    dependentTestSolver(originalOrder.getTestsBefore(dependentTestName),
                            true,
                            new ArrayList<>(),
                            newOrder.getResult(dependentTestName),
                            newOrder.testOrder);
                }
            }
        }

        return knownDependencies;
    }

    /**
     * A dependency chain is a list of tests that comes either between two known dependencies, before
     * all known dependencies, or after all known dependencies. This is useful because we can determine
     * which lists of tests to perform delta debugging on, given that we did not find all possible
     * dependent tests the first time.
     *
     * Ex. A, B are before dependencies of C.
     * The test order is F, A, K, J, B, L, C.
     * The dependency chains are: [F], [K,J], [L]
     */
    public List<List<String>> getDependencyChains(final List<String> testOrder) {
        final List<Integer> indices =
                knownDependencies.getOrDefault(dependentTestName, Collections.emptySet()).stream()
                        .flatMap(testData -> testData.getIndices(testOrder))
                        .sorted()
                        .collect(Collectors.toList());

        // Add this so that we get all tests that come before other dependencies.
        indices.add(0, -1);

        final List<List<String>> chains = new ArrayList<>();

        for (int i = 0; i < indices.size(); i++) {
            int lo = indices.get(i);

            // The last test should be the dependent test, so don't include it.
            int hi = testOrder.size() - 1;

            if (i + 1 < indices.size()) {
                hi = indices.get(i + 1);
            }

            if (lo < hi) {
                chains.add(new ArrayList<>(testOrder.subList(lo + 1, hi)));
            }
        }

        return chains;
    }

    private Stream<List<String>> getAllDependencyChains() {
        return getAllDependencyChains(getDependencyChains(newOrder.getTestsBefore(dependentTestName)));
    }

    public static <T> List<List<T>> tails(final List<T> list) {
        final List<List<T>> result = new ArrayList<>();
        final LinkedList<T> current = new LinkedList<>(list);

        while (!current.isEmpty()) {
            result.add(new ArrayList<>(current));
            current.removeFirst();
        }

        return result;
    }

    /**
     * Takes each individual dependency chain, and generate all possible subsequences of them, merging
     * chains together to form single test lists.
     * Generates all single element chains first (so if there are no cross-chain dependencies,
     * we don't waste much extra time).
     *
     * Returns a stream so that we don't have to generate them all at once (lazy evaluation).
     *
     * Ex. Take [1,2,3] and generate [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]
     */
    public Stream<List<String>> getAllDependencyChains(final List<List<String>> dependencyChains) {
        return Stream.concat(
                // Add all the single item subsequences.
                dependencyChains.stream(),

                // Generate the rest of them.
                tails(dependencyChains).stream()
                .flatMap(chains ->
                    getAllDependencyChains(chains.subList(1, chains.size())).map(chain -> {
                        final List<String> newChain = new ArrayList<>(chains.get(0));
                        newChain.addAll(chain);
                        return newChain;
                    }))
        );
    }

    private void findDependencyInChains() throws DependencyVerificationException {
        final Iterator<List<String>> dependencyChains = getAllDependencyChains().iterator();
        while (dependencyChains.hasNext()) {
            final List<String> chain = dependencyChains.next();

            dependentTestSolver(chain,
                    false,
                    new ArrayList<>(),
                    newOrder.getResult(dependentTestName),
                    newOrder.testOrder);

            // Check that we've found all the dependencies, and break out if we have.
            if (!isTestResultDifferent(Collections.singletonList(dependentTestName)) &&
                    !isTestResultDifferent(newOrder.testOrder)) {
                return;
            }
        }

        // If we don't find all the dependencies in any of the chains (or any combination of them)
        throw new DependencyVerificationException(dependentTestName);
    }

    private void dependentTestSolver(List<String> tests, boolean isOriginalOrder,
                                     List<String> addOnTests, RESULT revealed,
                                     List<String> revealingOrder) {
        tests.removeAll(addOnTests);
        List<String> topHalf = new LinkedList<>(tests.subList(0, tests.size() / 2));
        List<String> botHalf = new LinkedList<>(tests.subList(tests.size() / 2, tests.size()));

        while (tests.size() > 1) {
            topHalf.addAll(addOnTests);
            topHalf.add(dependentTestName);

            botHalf.addAll(addOnTests);
            botHalf.add(dependentTestName);

            FileTools.clearEnv(filesToDelete);
            final TestExecResult topResults = makeAndRunTestOrder(topHalf);
            boolean topResultsMatch = checkTestMatch(isOriginalOrder, topResults);

            FileTools.clearEnv(filesToDelete);
            final TestExecResult botResults = makeAndRunTestOrder(botHalf);
            boolean botResultsMatch = checkTestMatch(isOriginalOrder, botResults);

            // dependent test depends on more than one test in tests
            if (topResultsMatch == botResultsMatch) {
                List<String> newTopList = new ArrayList<>(tests.subList(0, tests.size() / 2));
                List<String> newBotList = new ArrayList<>(tests.subList(tests.size() / 2, tests.size()));

                // First, find the dependent tests in the top half.
                // We can skip finding exactly which tests are the dependent tests in the bottom half
                // for now by simply running all of them.
                dependentTestSolver(newTopList, isOriginalOrder, newBotList,
                        topResults.getResult(dependentTestName).result,
                        topHalf);

                // Now that we know the dependent tests in the top half, those dependencies should
                // be handled by the knownDependencies variable.
                List<String> orderedTests = new ArrayList<>(addOnTests);
                orderedTests.add(dependentTestName);
                boolean resultDifferent = isTestResultDifferent(orderedTests);
                // Original if: if (!((!isOriginalOrder && resultDifferent) || (isOriginalOrder && !resultDifferent))) {
                if (isOriginalOrder == resultDifferent) {
                    dependentTestSolver(newBotList, isOriginalOrder, addOnTests, botResults.getResult(dependentTestName).result, botHalf);
                } else {
                    dependentTestSolver(newBotList, isOriginalOrder, new ArrayList<>(), botResults.getResult(dependentTestName).result, botHalf);
                }

                return;
            }

            // If only one half contains dependent tests, ignore all tests not in that half.
            // If the top results match and we're looking for the before tests, then we want the top half.
            // If the top results don't match, and we're looking for the after tests, we still want the top half.
            if (topResultsMatch == isOriginalOrder) {
                tests = topHalf;
                revealed = topResults.getResult(dependentTestName).result;
                revealingOrder = topHalf;
            } else {
                tests = botHalf;
                revealed = botResults.getResult(dependentTestName).result;
                revealingOrder = botHalf;
            }

            tests.removeAll(addOnTests);
            tests.remove(tests.size() - 1);

            topHalf = new LinkedList<>(tests.subList(0, tests.size() / 2));
            botHalf = new LinkedList<>(tests.subList(tests.size() / 2, tests.size()));
        }

        if (!tests.isEmpty()) {
            // Verify this is a dependency
            final boolean isDifferentWithout = isTestResultDifferent(Collections.singletonList(dependentTestName));
            final boolean isDifferentWith = isTestResultDifferent(Arrays.asList(tests.get(0), dependentTestName));

            if (isDifferentWith != isDifferentWithout) {
                if (isOriginalOrder) {
                    addDependency(tests.get(0), revealed, revealingOrder, true);
                } else {
                    addDependency(tests.get(0), revealed, revealingOrder, false);
                }
            }
        }
    }
}
