package edu.washington.cs.dt.impact.tools;

import com.google.common.base.Preconditions;
import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.TestExecResult;
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.runners.FixedOrderRunner;
import org.apache.commons.io.FileUtils;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinimizeTestList {

    public static void main(final String[] args) throws IOException, MinimizeTestListException {
        final List<String> argsList = new ArrayList<>(Arrays.asList(args));

        if (argsList.contains("-dtFile")) {
            runDependentTestFile(argsList);
        } else {
            runDefault(argsList);
        }
    }

    private static void runDependentTestFile(final List<String> argsList) {
        String classpath = System.getProperty("java.class.path");
        int cpIndex = argsList.indexOf("-classpath");
        if (cpIndex != -1 && cpIndex + 1 < argsList.size()) {
            classpath = FailedTestRemover.buildClassPath(argsList.get(cpIndex + 1).split(File.pathSeparator));
        }

        final int outputPathIndex = argsList.indexOf("-outputDir");
        Optional<Path> outputPath = Optional.empty();
        if (outputPathIndex != -1 && outputPathIndex + 1 < argsList.size()) {
            outputPath = Optional.ofNullable(Paths.get(argsList.get(outputPathIndex + 1)));
        }

        final int dtFileIndex = argsList.indexOf("-dtFile");
        if (dtFileIndex != -1 && dtFileIndex + 1 < argsList.size()) {
            final Optional<Path> finalOutputPath = outputPath;
            fromDtList(Paths.get(argsList.get(dtFileIndex + 1)), classpath)
                    .forEach(minimizer -> {
                        try {
                            final MinimizeTestsResult result = minimizer.run();

                            if (finalOutputPath.isPresent()) {
                                final List<String> dependencies = result.getDeps();
                                final Path outputFile = finalOutputPath.get().resolve(minimizer.dependentTest + "-dependencies");

                                    try {
                                        Files.write(outputFile, String.join("\n", dependencies).getBytes());
                                    } catch (IOException e) {
                                        e.printStackTrace();

                                        System.out.println(result);
                                    }
                            } else {
                                System.out.println(result);
                            }
                        } catch (MinimizeTestListException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }

    private static void runDefault(final List<String> argsList) throws IOException, MinimizeTestListException {
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

            final List<String> beforeDeps = new MinimizeTestList(testOrder, classpath, dependentTest).run().getDeps();
            System.out.println("Dependencies for: " + dependentTest);
            beforeDeps.forEach(System.out::println);
        } else {
            System.out.println("No test order provided! Use -order <filename> to specify a test order.");
        }
    }

    public static Set<MinimizeTestList> fromDtList(final Path path) {
        return fromDtList(path, System.getProperty("java.class.path"));
    }

    public static Set<MinimizeTestList> fromDtList(final Path path, final String classpath) {
        final Set<MinimizeTestList> result = new HashSet<>();

        final List<String> lines = FileTools.parseFileToList(path.toFile());

        while (!lines.isEmpty()) {
            if (lines.get(0).isEmpty()) {
                lines.remove(0);
                continue;
            }

            // Verify there are enough lines to contain all the information we need.
            Preconditions.checkArgument(lines.size() >= 5);

            final String testLine = lines.remove(0);
            final String intendedLine = lines.remove(0);
            final String originalOrderLine = lines.remove(0);
            final String revealedLine = lines.remove(0);
            final String modifiedOrderLine = lines.remove(0);

            // Make sure the lines look correct (i.e., start with the right text)
            Preconditions.checkArgument(testLine.startsWith(Constants.TEST_LINE));
            Preconditions.checkArgument(intendedLine.startsWith("Intended behavior: "));
            Preconditions.checkArgument(originalOrderLine.startsWith(Constants.EXECUTE_AFTER));
            Preconditions.checkArgument(revealedLine.startsWith("The revealed different behavior: "));
            Preconditions.checkArgument(modifiedOrderLine.startsWith(Constants.EXECUTE_AFTER));

            final String test = testLine.replace(Constants.TEST_LINE, "");
//            final List<String> originalOrder =
//                    readList(originalOrderLine.replace(Constants.EXECUTE_AFTER, ""), Function.identity());
            final List<String> modifiedOrder =
                    readList(modifiedOrderLine.replace(Constants.EXECUTE_AFTER, ""), Function.identity());

            try {
                result.add(new MinimizeTestList(modifiedOrder, classpath, test));
            } catch (MinimizeTestListException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    private static <T> List<T> readList(final String s, final Function<String, T> constructor) {
        return Arrays.stream(s
                .replace("[", "")
                .replace("]", "")
                .split(","))
                .map(String::trim)
                .map(constructor)
                .collect(Collectors.toList());
    }

    private static TestExecResult runOrder(final String classpath, final List<String> order) {
        return new FixedOrderRunner(classpath, order).run().getExecutionRecords().get(0);
    }

    // TODO: Test the above mechanism to make sure that it works.

    private final List<String> testOrder;
    private final String classpath;
    private final String dependentTest;
    private final RESULT expected;

    @Nullable
    private MinimizeTestsResult minimizedResult = null;

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

    public MinimizeTestsResult run() throws MinimizeTestListException {
        if (minimizedResult == null) {
            minimizedResult = new MinimizeTestsResult(dependentTest, run(beforeInc(testOrder, dependentTest)));
        }

        return minimizedResult;
    }

    private List<String> run(List<String> order)
            throws MinimizeTestListException {
        final List<String> deps = new ArrayList<>();

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
            deps.addAll(order);
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

        return deps;
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
