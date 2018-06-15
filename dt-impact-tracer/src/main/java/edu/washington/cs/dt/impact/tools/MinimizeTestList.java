package edu.washington.cs.dt.impact.tools;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.runners.FixedOrderRunner;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class MinimizeTestList {
    public static void main(final String[] args) throws IOException, MinimizeTestListException {
        final List<String> argsList = new ArrayList<>(Arrays.asList(args));

        String classpath = System.getProperty("java.class.path");
        int cpIndex = argsList.indexOf("-classpath");
        if (cpIndex != -1 && cpIndex + 1 < argsList.size()) {
            classpath = FailedTestRemover.buildClassPath(argsList.get(cpIndex + 1).split(File.pathSeparator));
        }

        int orderIndex = argsList.indexOf("-order");

        if (orderIndex != -1 && orderIndex + 1 < argsList.size()) {
            final List<String> testOrder = FileUtils.readLines(new File(argsList.get(orderIndex + 1)), "UTF-8");

            String dependentTest = testOrder.get(testOrder.size() - 1);
            int dtIndex = argsList.indexOf("-test");
            if (dtIndex != -1 && dtIndex + 1 < argsList.size()) {
                dependentTest = argsList.get(dtIndex + 1);
            }

            final List<String> beforeDeps = new MinimizeTestList(testOrder, classpath, dependentTest).run();
            System.out.println("Dependencies for: " + dependentTest);
            beforeDeps.forEach(System.out::println);
        } else {
            System.out.println("No test order provided! Use -order <filename> to specify a test order.");
        }
    }

    private static TestExecResult runOrder(final String classpath, final List<String> order) {
        return new FixedOrderRunner(classpath, order).run().getExecutionRecords().get(0);
    }

    private final List<String> testOrder;
    private final String classpath;
    private final String dependentTest;
    private final RESULT expected;

    // The key is all tests in the order, and the value is the result of the last test.
    // This is used to discover flaky tests during runs of this tool.
    private final Map<List<String>, RESULT> knownRuns = new HashMap<>();
    private final Set<String> flaky = new HashSet<>();

    private boolean failOnFlakyTests = true;

    public MinimizeTestList(final List<String> testOrder, final String dependentTest)
            throws MinimizeTestListException {
        this(testOrder, System.getProperty("java.class.path"), dependentTest);
    }

    public MinimizeTestList(final List<String> testOrder, final String classpath, final String dependentTest)
            throws MinimizeTestListException {
        this.testOrder = testOrder;
        this.classpath = classpath;
        this.dependentTest = dependentTest;

        // Run in given order to determine what the result should be.
        this.expected = result(testOrder);
    }

    private RESULT result(final List<String> order) throws MinimizeTestListException {
        final List<String> actualOrder = new ArrayList<>(order);

        if (!actualOrder.contains(dependentTest)) {
            actualOrder.add(dependentTest);
        }

        final TestExecResult results = runOrder(classpath, actualOrder);
        updateFlakyTests(order, results);

        return results.getResult(dependentTest).result;
    }

    private static <T> List<T> beforeInc(final List<T> ts, final T t) {
        final int i = ts.indexOf(t);

        if (i != -1) {
            return new ArrayList<>(ts.subList(0, i + 1));
        } else {
            return new ArrayList<>();
        }
    }

    private static <T> Function<List<T>, List<T>> modify(final Consumer<List<T>> f) {
        return base -> {
            f.accept(base);
            return base;
        };
    }

    private static <T> Function<List<T>, List<T>> prependAll(final List<T> toAdd) {
        return modify(base -> base.addAll(0, toAdd));
    }

    private static <T> List<T> prependAll(final List<T> toAdd, final List<T> ts) {
        return prependAll(toAdd).apply(ts);
    }

    private static <T> List<T> topHalf(final List<T> ts) {
        return new ArrayList<>(ts.subList(0, ts.size() / 2));
    }

    private static <T> List<T> botHalf(final List<T> ts) {
        return new ArrayList<>(ts.subList(ts.size() / 2, ts.size()));
    }

    private void updateFlakyTests(final List<String> order, final TestExecResult results)
            throws MinimizeTestListException {
        for (final String testName : results.getAllTests()) {
            final RESULT testResult = results.getResult(testName).result;

            if (flaky.contains(testName)) {
                return;
            }

            final List<String> testsBefore = beforeInc(order, testName);

            if (knownRuns.containsKey(testsBefore) && !knownRuns.get(testsBefore).equals(testResult)) {
                flaky.add(testName);

                if (failOnFlakyTests) {
                    throw new MinimizeTestListException("Found flaky test '" + testName + "'. " +
                            "Result was '" + knownRuns.get(testsBefore) + "' before but is '" +
                            testResult + "' now, when run in the order " + testsBefore);
                }
            } else {
                knownRuns.put(testsBefore, testResult);
            }
        }
    }

    public List<String> run() throws MinimizeTestListException {
        return run(new ArrayList<>(), beforeInc(testOrder, dependentTest));
    }

    private List<String> run(final List<String> deps, List<String> order)
            throws MinimizeTestListException {
        final int origSize = order.size();

        while (order.size() > 1) {
            final RESULT topResult = result(prependAll(deps, topHalf(order)));
            final RESULT botResult = result(prependAll(deps, botHalf(order)));

            if (topResult == expected && botResult != expected) {
                order = topHalf(order);
            } else if (topResult != expected && botResult == expected) {
                order = botHalf(order);
            } else {
                // It's not 100% obvious what to do in this case (could have weird dependencies that are hard to deal with).
                // But sequential will definitely work (except because of flakiness for other reasons).
                return runSequential(deps, order);
            }
        }

        final RESULT orderResult = result(order);
        if (order.size() == 1 || orderResult == expected) {
            return new ArrayList<>(order);
        } else {
            if (order.isEmpty()) {
                throw new MinimizeTestListException("No tests in order that could be dependency " +
                        "(order was originally  " + origSize + "tests long).");
            } else {
                throw new MinimizeTestListException("Could not find dependencies. There is only one " +
                        "test left but the result '" + orderResult +
                        "' does not match expected '" + expected + "'");
            }
        }
    }

    private List<String> runSequential(final List<String> deps, final List<String> testOrder)
            throws MinimizeTestListException {
        final List<String> remainingTests = new ArrayList<>(testOrder);

        while (!remainingTests.isEmpty()) {
            final String current = remainingTests.remove(0);

            final RESULT r = result(remainingTests);

            if (r != expected) {
                deps.add(current);
            }
        }

        return deps;
    }
}
