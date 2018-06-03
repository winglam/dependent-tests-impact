package edu.washington.cs.dt.impact.tools;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.runners.FixedOrderRunner;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimizeTestList {
    public static void main(final String[] args) throws IOException {
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

    public MinimizeTestList(final List<String> testOrder, final String classpath, final String dependentTest) {
        this.testOrder = testOrder;
        this.classpath = classpath;
        this.dependentTest = dependentTest;

        // Run in given order to determine what the result should be.
        this.expected = result(testOrder);
    }

    private RESULT result(final List<String> order) {
        if (!order.contains(dependentTest)) {
            order.add(dependentTest);
        }
        return runOrder(classpath, order).getResult(dependentTest).result;
    }

    private List<String> run() {
        final List<String> order = new ArrayList<>(testOrder.subList(0, testOrder.indexOf(dependentTest)));
        return run(new ArrayList<>(), order);
    }

    private List<String> run(final List<String> deps, List<String> order) {
        while (true) {
            final List<String> topHalf = new ArrayList<>(order.subList(0, order.size() / 2));
            topHalf.addAll(0, deps);

            final List<String> botHalf = new ArrayList<>(order.subList(order.size() / 2, order.size()));
            botHalf.addAll(0, deps);

            final RESULT topResult = result(topHalf);
            final RESULT botResult = result(botHalf);

            if (topResult == expected && botResult != expected) {
                order = topHalf;
            } else if (topResult != expected &&  botResult == expected) {
                order = botHalf;
            } else {
                // It's not 100% obvious what to do in this case (could have weird dependencies that are hard to deal with).
                // But sequential will definitely work (barring flakiness for other reasons).
                return runSequential(deps, order);
            }
        }
    }

    private List<String> runSequential(final List<String> deps, final List<String> testOrder) {
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
