package edu.washington.cs.dt.impact.figure.generator;

import com.google.common.base.Preconditions;
import edu.washington.cs.dt.impact.data.GeometricMeanData;
import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.data.ProjectEnhancedResults;
import edu.washington.cs.dt.impact.data.TestFunctionStatement;
import edu.washington.cs.dt.impact.data.TestInfo;
import edu.washington.cs.dt.impact.runner.Runner;
import edu.washington.cs.dt.impact.technique.Prioritization;
import edu.washington.cs.dt.impact.util.Constants;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// TODO: add something to generate and output results to a csv or json or something for a bunch of folders.
public class EnhancedResultsFigureGenerator extends FigureGenerator {
    /*
     * a private method to generate a line of LaTeX needed for figure 17
     *
     * @param projectName the name of the Project
     *
     * @param values the ordered values that need to be written
     *
     *
     * format: Crystal & 0.026 & 0.001 & 0.000 & 0.000 \\
     */
    private static String generate17(ProjectEnhancedResults project, List<GeometricMeanData> fig17Data) {
        final List<Double> values = generate17Values(project);
        return generate17WithValues(project, fig17Data, values);
    }

    public static String formatValue(final double value) {
        return formatValue(value, useCoverage);
    }

    private static String formatValue(double value, boolean useCoverage) {
        final StringBuilder result = new StringBuilder();

        if (useCoverage) {
            String output = apfdFormat.format(value);
            if (output.equals("-.00")) {
                output = ".00";
            }
            result.append(" & ");
            if (value >= 0.0 || output.equals(".00")) {
                result.append("\\pMinus");// + output;
            }
            result.append(output);
        } else {
            value *= 100;
            if (!allowNegatives && value < 0.0) {
                value = 0.0;
            }
            result.append(" & ");
            String output = percentFormat.format(value);
            if (output.equals("-0")) {
                output = "0";
            }
            result.append(output).append("\\%"); // "\%"
        }

        return result.toString();
    }

    public static String generate17WithValues(ProjectEnhancedResults project,
                                              List<GeometricMeanData> fig17Data,
                                              List<Double> valuesList) {
        final Iterator<Double> valuesIt = valuesList.iterator();

        double[] values = project.get_fig_values(17);
        StringBuilder result = new StringBuilder(project.getName());

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val = valuesIt.next();

            if (i == 0) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.STATEMENT));
            } else if (i == 2) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.STATEMENT));
            } else if (i == 4) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.FUNCTION));
            } else if (i == 6) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.FUNCTION));
            }

            result.append(formatValue(val));
        }
        result.append(" \\\\"); // "\\"
        return result.toString();
    }

    public static List<Double> generate17Values(ProjectEnhancedResults project) {
        double[] values = project.get_fig_values(17);

        final List<Double> result = new ArrayList<>();

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val;

            if (!project.containsDT(true, i, 17)) {
                // Case A
                // Enhanced - unenhanced
                val = calculate(values[i + 1], values[i]);
            } else if (project.containsDT(true, i, 17) && project.containsDT(false, i, 17)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // Shift_by_enhanced’s_time(orig) - shift_by_unsound’s_time(orig)
                val = calculate(shift_by_time(project, false, i, 17), shift_by_time(project, true, i, 17));
            } else {
                // Case C
                // Enhanced - shift_by_unsound’s_time(orig)
                val = calculate(values[i + 1], shift_by_time(project, true, i, 17));
            }
            if (!allowNegatives && val < 0.0) {
                val = 0.0;
            }

            result.add(val);
        }

        return result;
    }

    /*
     * For selection and parallelization, you don't
     * have to run all of T_orig, just enough to cover all the selected tests.
     * This method finds the highest index of the tests in testList that are also in origTestList.
     */
    private static int getHighestIndexInOrigTestList(String[] testList, List<String> origTestList) {
        int highestIndex = -1;
        for (String test : testList) {
            int index = origTestList.indexOf(test);
            if (index > highestIndex) {
                highestIndex = index;
            }
        }
        // Expected to be used with .sublist which excludes the last index so we add 1 to include the highestIndex
        return highestIndex + 1;
    }

    private static double listToTime(List<Double> timeList) {
        double value = 0;
        for (double time : timeList) {
            value += time;
        }

        return value / 1E9;
    }

    /*
     * a private method to generate a line of LaTeX needed for figure 18
     *
     * @param projectName the name of the project
     *
     * @param percentages ordered percentages needed
     *
     * @param values the ordered values that need to be written
     *
     * @param orig_value the run time for running the entire original test suite unordered
     *
     * format: Crystal & 5.4\%\pa & 1.3\%\pa & 0.000 & 0.000 & 0.008 & 0.015 & 0.036 & 0.000 \\
     */
    private static String generate18(ProjectEnhancedResults project, double orig_time_value,
            List<GeometricMeanData> fig18apfd, List<GeometricMeanData> fig18percent,
            PercentWrapper percentComparedToUnenhanced, String type) {
        final List<Double> values = generate18Values(project);

        return generate18WithValues(project, orig_time_value, fig18apfd, fig18percent, percentComparedToUnenhanced, type, values);
    }

    public static String generate18WithValues(ProjectEnhancedResults project,
                                              double orig_time_value,
                                              List<GeometricMeanData> fig18apfd,
                                              List<GeometricMeanData> fig18percent,
                                              PercentWrapper percentComparedToUnenhanced,
                                              String type,
                                              final List<Double> valueList) {
        double[] time = project.get_fig18_time();
        double[] values = project.get_fig_values(18);
        StringBuilder result = new StringBuilder(project.getName() + "       ");

        final Iterator<Double> valuesIt = valueList.iterator();

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < time.length; i += 2) {
            // enhancedParaSpeedup,2,3 correspond to either S1,S2,S3 or S4,S5,S6
            // enhanced - unenhanced
            /*
             * double enhancedParaSpeedup = (percentages[i + 1] - percentages[i]) / orig_value * 100;
             * double unenhancedPara = (percentages[i + 3] - percentages[i + 2]) / orig_value * 100;
             * double diffBetweenEnhancedUnenhanced = (percentages[i + 5] - percentages[i + 4]) / orig_value * 100;
             * // the max. of these 3 values
             * double percent = Math.max(enhancedParaSpeedup, Math.max(unenhancedPara, diffBetweenEnhancedUnenhanced));
             */

            // For case B and C
            // List<String> unenTest = Arrays.asList(project.getFig18_unenhanced_tests()[i]);
            // int highestIndex = -1;
            // for (String test : unenTest) {
            // highestIndex = Math.max(origTest.indexOf(test), highestIndex);
            // }

            double percent = valuesIt.next();

            if (i == 0) {
                fig18percent.add(new GeometricMeanData(i, percent, null, Constants.ORDER.ORIGINAL, Constants.COVERAGE.STATEMENT));
            } else if (i == 2) {
                fig18percent.add(new GeometricMeanData(i, percent, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.STATEMENT));
            } else if (i == 4) {
                fig18percent.add(new GeometricMeanData(i, percent, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.STATEMENT));
            } else if (i == 6) {
                fig18percent.add(new GeometricMeanData(i, percent, null, Constants.ORDER.ORIGINAL, Constants.COVERAGE.FUNCTION));
            } else if (i == 8) {
                fig18percent.add(new GeometricMeanData(i, percent, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.FUNCTION));
            } else if (i == 10) {
                fig18percent.add(new GeometricMeanData(i, percent, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.FUNCTION));
            }

            // Increase in runtime of enhanced compared to unenhanced
            percentComparedToUnenhanced.percent += (time[i + 1] - time[i]) / orig_time_value;
            percentComparedToUnenhanced.numPercents += 1;
            // if (percent >= 0.0 || output.equals("0")) {
            // result += "\\pMinus";
            // if (output.length() == 1) // single digit number, #\%
            // {
            // result += "\\z";
            // }
            // } else { // negative
            // if (output.length() == 2) {// single digit number, #\%
            // result += "\\z";
            // }
            // }

            result.append(formatValue(percent, false));
        }
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val = valuesIt.next();

            if (i == 0) {
                fig18apfd.add(new GeometricMeanData(i, val, null, Constants.ORDER.ORIGINAL, Constants.COVERAGE.STATEMENT));
            } else if (i == 2) {
                fig18apfd.add(new GeometricMeanData(i, val, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.STATEMENT));
            } else if (i == 4) {
                fig18apfd.add(new GeometricMeanData(i, val, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.STATEMENT));
            } else if (i == 6) {
                fig18apfd.add(new GeometricMeanData(i, val, null, Constants.ORDER.ORIGINAL, Constants.COVERAGE.FUNCTION));
            } else if (i == 8) {
                fig18apfd.add(new GeometricMeanData(i, val, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.FUNCTION));
            } else if (i == 10) {
                fig18apfd.add(new GeometricMeanData(i, val, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.FUNCTION));
            }

            result.append(formatValue(val));
        }
        result.append(" \\\\"); // "\\"
        return result.toString();
    }

    private static double calculate(final double a, final double b) {
        return calculate(a, b, useCoverage);
    }

    private static double calculate(double a, double b, boolean useCoverage) {
        if (useCoverage) {
            return a - b;
        } else {
            return 1 - (a / b);
        }
    }

    public static List<Double> generate18Values(ProjectEnhancedResults project) {
        double[] time = project.get_fig18_time();
        double[] values = project.get_fig_values(18);

        final List<Double> result = new ArrayList<>();

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < time.length; i += 2) {
            // enhancedParaSpeedup,2,3 correspond to either S1,S2,S3 or S4,S5,S6
            // enhanced - unenhanced
            /*
             * double enhancedParaSpeedup = (percentages[i + 1] - percentages[i]) / orig_value * 100;
             * double unenhancedPara = (percentages[i + 3] - percentages[i + 2]) / orig_value * 100;
             * double diffBetweenEnhancedUnenhanced = (percentages[i + 5] - percentages[i + 4]) / orig_value * 100;
             * // the max. of these 3 values
             * double percent = Math.max(enhancedParaSpeedup, Math.max(unenhancedPara, diffBetweenEnhancedUnenhanced));
             */

            // For case B and C
            // List<String> unenTest = Arrays.asList(project.getFig18_unenhanced_tests()[i]);
            // int highestIndex = -1;
            // for (String test : unenTest) {
            // highestIndex = Math.max(origTest.indexOf(test), highestIndex);
            // }

            double percent;
            if (!project.containsDT(true, i, 18)) {
                // Case A
                // 1 - Enh / (uns)
                percent = calculate(time[i + 1], time[i], false);
            } else if (project.containsDT(true, i, 18) && project.containsDT(false, i, 18)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enTimeVal = shift_by_time(project, false, i, 18, false, false);
                double unenTimeVal = shift_by_time(project, true, i, 18, false, false);
                percent = calculate(enTimeVal, unenTimeVal, false);
            } else {
                // Case C
                // 1 - Enh / (uns + orig)
                double unenTimeVal = shift_by_time(project, true, i, 18, false, false);
                percent = calculate(time[i + 1], unenTimeVal, false);
            }

            result.add(percent);
        }

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val;

            if (!project.containsDT(true, i, 18)) {
                // Case A
                // Enhanced - unenhanced
                val = calculate(values[i + 1], values[i]);
            } else if (project.containsDT(true, i, 18) && project.containsDT(false, i, 18)) {
                // Case B
                // Shift_by_enhanced’s_time(orig) - shift_by_unsound’s_time(orig)
                val = calculate(shift_by_time(project, false, i, 18),
                        shift_by_time(project, true, i, 18));
            } else {
                // Case C
                // Enhanced - shift_by_unsound’s_time(orig)
                val = calculate(values[i + 1], shift_by_time(project, true, i, 18));
            }
            if (!allowNegatives && val < 0.0) {
                val = 0.0;
            }

            result.add(val);
        }

        return result;
    }

    private static List<Double> orderCoverage(final ProjectEnhancedResults project, final List<String> testNames) {
        try {
            final Path file = Files.createTempFile("output", "file");

            final Path origOrder = Files.createTempFile("orig", "order");
            Files.write(origOrder, String.join(System.lineSeparator(), testNames).getBytes());

            final Prioritization fixedOrder = new Prioritization(Constants.ORDER.ORIGINAL,
                    file.toAbsolutePath().toString(), sootOutput(project), project.getCoverageType(),
                    null, true, origOrder.toFile(), false);

            final List<Double> result = new ArrayList<>();
            for (final TestFunctionStatement tfs : fixedOrder.getOrderObj().getCoverage(false)) {
                result.add(Double.valueOf(tfs.getName()));
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    private static File sootOutput(ProjectEnhancedResults project) {
        if (project.getTestType().equals("orig")) {
            return sootOutputOrig.toFile();
        } else {
            return sootOutputAuto.toFile();
        }
    }

    private static double shift_by_time(ProjectEnhancedResults project, boolean unen, int i, int figNum) {
        return shift_by_time(project, unen, i, figNum, false);
    }

    private static double shift_by_time(ProjectEnhancedResults project, boolean unen, int i, int figNum, boolean isOriginal) {
        return shift_by_time(project, unen, i, figNum, isOriginal, useCoverage);
    }

    private static double shift_by_time(ProjectEnhancedResults project, boolean unen,
                                        int i, int figNum, boolean isOriginal, boolean useCoverage) {
        Double[] enhancedTime = project.get_fig_Time(unen, i, figNum, isOriginal);

        final Map<String, TestInfo> dt_info = project.get_dt_info(unen, i, figNum, isOriginal);
        final Map<String, TestInfo> orig_info = project.get_orig_info(unen, i, figNum, isOriginal);

        List<String> order = Arrays.asList(project.get_fig_TestList(unen, i, figNum, isOriginal));
        List<String> origOrder = Arrays.asList(project.getOrig_tests());

        // This is the order that "actually" gets run.
        // E.g., if there is a dependent test, it is the (un)enhanced order up to that dependent
        // test, followed by the test in isolation (if enabled), and finally the original order if still necessary
        List<String> actualOrder = new ArrayList<>();

        List<Double> totalTime = new ArrayList<>();

        final String dt = project.get_first_dt(unen, i, figNum, isOriginal);
        final int dtIndex = order.indexOf(dt);

        if (dtIndex == -1) {
            totalTime.addAll(Arrays.asList(enhancedTime));
            actualOrder.addAll(order);
        } else {
            totalTime.addAll(Arrays.asList(enhancedTime).subList(0, dtIndex + 1));
            actualOrder.addAll(order.subList(0, dtIndex + 1));
        }

        if (dt != null) {
            if (useIsolationData) {
                totalTime.add((double) dt_info.get(dt).getTime());
                actualOrder.add(dt);

                // if isolation is still different than original order
                if (!dt_info.get(dt).getResult().equals(orig_info.get(dt).getResult())) {
                    addOrigTests(order, actualOrder, orig_info, origOrder, totalTime);
                }
            } else {
                addOrigTests(order, actualOrder, orig_info, origOrder, totalTime);
            }
        }

        if (useCoverage) {
            List<Double> totalCoverage = orderCoverage(project, actualOrder);
            return Runner.getAPFD(Runner.getCumulListDouble(totalTime), Runner.getCumulListDouble(totalCoverage));
        } else {
            return listToTime(totalTime);
        }
    }

    private static void addOrigTests(List<String> order,
                                     List<String> actualOrder, Map<String, TestInfo> origInfo,
                                     List<String> origOrder, List<Double> totalTime) {
        // We only need ot run enough tests from the original order to cover the selected tests.
        // e.g. If we only select A and C from the original order of A,B,C,D, to verify our results
        // we only need to run A,B,C (excluding D).
        final List<String> toCover = new ArrayList<>(order);

        for (final String testName : origOrder) {
            if (!toCover.isEmpty()) {
                totalTime.add((double) origInfo.get(testName).getTime());
                actualOrder.add(testName);
                toCover.remove(testName);
            } else {
                break;
            }
        }
    }

    /*
     * a private method that generates Figure 19
     */
    private static String generate19(ProjectEnhancedResults project, double orig_time_value,
                                     List<GeometricMeanData> fig19GeoData, PercentWrapper percentComparedToUnenhanced) {
        final List<Double> values = generate19Values(project);

        return generate19WithValues(project, orig_time_value, fig19GeoData, percentComparedToUnenhanced, values);
    }

    public static String generate19WithValues(ProjectEnhancedResults project, double orig_time_value,
                                              List<GeometricMeanData> fig19GeoData,
                                              PercentWrapper percentComparedToUnenhanced,
                                              final List<Double> values) {
        final StringBuilder result = new StringBuilder(project.getName());

        double[] orig_values = project.get_fig19_orig();
        double[] time_values = project.get_fig19_time();

        final Iterator<Double> valuesIt = values.iterator();

        for (int i = 0; i + 2 <= orig_values.length; i += 2) {
            double diffBetweenEnhancedUnenhanced = valuesIt.next();
            double enhancedParaSpeedup = orig_values[i + 1];
            double unenhancedPara = orig_values[i];

            // Increase in runtime of enhanced compared to unenhanced
            percentComparedToUnenhanced.percent += (enhancedParaSpeedup - unenhancedPara) / orig_time_value;
            percentComparedToUnenhanced.numPercents += 1;

            result.append(formatValue(diffBetweenEnhancedUnenhanced));

            // result += " & " + timeFormat.format(enhancedParaSpeedup) + " $\\rightarrow$ " +
            // timeFormat.format(unenhancedPara);
            fig19GeoData.add(new GeometricMeanData(getK(i), enhancedParaSpeedup, Constants.TD_SETTING.OMITTED_TD,
                    Constants.ORDER.ORIGINAL, null));
            fig19GeoData.add(new GeometricMeanData(getK(i), unenhancedPara, Constants.TD_SETTING.GIVEN_TD,
                    Constants.ORDER.ORIGINAL, null));
            fig19GeoData.add(new GeometricMeanData(i, diffBetweenEnhancedUnenhanced, null, Constants.ORDER.ORIGINAL, null));
        }

        // TIME ORDER
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= time_values.length; i += 2) {
            double enhancedParaSpeedup = time_values[i + 1];
            double unenhancedPara = time_values[i];
            double diffBetweenEnhancedUnenhanced = valuesIt.next();

            // Increase in runtime of enhanced compared to unenhanced
            percentComparedToUnenhanced.percent += (enhancedParaSpeedup - unenhancedPara) / orig_time_value;
            percentComparedToUnenhanced.numPercents += 1;

            result.append(formatValue(diffBetweenEnhancedUnenhanced));

            // result += " & " + timeFormat.format(enhancedParaSpeedup) + " $\\rightarrow$ " +
            // timeFormat.format(unenhancedPara);
            fig19GeoData.add(new GeometricMeanData(getK(i), enhancedParaSpeedup, Constants.TD_SETTING.OMITTED_TD,
                    Constants.ORDER.TIME, null));
            fig19GeoData.add(new GeometricMeanData(getK(i), unenhancedPara, Constants.TD_SETTING.GIVEN_TD,
                    Constants.ORDER.TIME, null));
            fig19GeoData.add(new GeometricMeanData(i, diffBetweenEnhancedUnenhanced, null, Constants.ORDER.TIME, null));
        }
        result.append("\\\\");

        return result.toString();
    }

    public static List<Double> generate19Values(ProjectEnhancedResults project) {
        double[] orig_values = project.get_fig19_orig();
        double[] time_values = project.get_fig19_time();

        final List<Double> result = new ArrayList<>();

        // ORIGINAL ORDER
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= orig_values.length; i += 2) {
            result.add(paraResults(project, orig_values, i, true));
        }

        // TIME ORDER
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= time_values.length; i += 2) {
            result.add(paraResults(project, time_values, i, false));
        }

        return result;
    }

    private static double paraResults(ProjectEnhancedResults project, double[] values, int i,
                                      boolean isOriginal) {
        double enhancedParaSpeedup = values[i + 1];
        double unenhancedPara = values[i];
        double diffBetweenEnhancedUnenhanced;

        if (!project.containsDT(true, i, 19, isOriginal)) {
            // Case A. Neither have dts.
            diffBetweenEnhancedUnenhanced = calculate(enhancedParaSpeedup, unenhancedPara, false);
        } else if (project.containsDT(true, i, 19, isOriginal) && project.containsDT(false, i, 19, isOriginal)) {
            // Case B, both enhanced and unenhanced have dts
            double enTimeVal = shift_by_time(project, false, i, 19, isOriginal, false);
            double unenTimeVal = shift_by_time(project, true, i, 19, isOriginal, false);
            diffBetweenEnhancedUnenhanced = calculate(enTimeVal, unenTimeVal, false);
        } else {
            // Case C. Just the unenhanced has a dt
            double unenTimeVal = shift_by_time(project, true, i, 19, isOriginal, false);
            diffBetweenEnhancedUnenhanced = calculate(enhancedParaSpeedup, unenTimeVal, false);
        }

        return diffBetweenEnhancedUnenhanced;
    }

    public static EnhancedResults setup(final boolean allowNegatives, final Path directory, final Path outputDirectory) {
        EnhancedResultsFigureGenerator.allowNegatives = allowNegatives;

        EnhancedResultsFigureGenerator.outputDirectoryName = outputDirectory.toAbsolutePath().toString();

        File[] fList = directory.toFile().listFiles();
        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<>();
        List<Project> proj_auto_arrayList = new ArrayList<>();

        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(fList, new EnhancedResultsFigureGenerator(), true, proj_orig_arrayList, proj_auto_arrayList);

        PercentWrapper percentRuntime = new PercentWrapper();

        Preconditions.checkArgument(proj_orig_arrayList.size() <= 1, "This method should be used to analyze at most one project at a time!");
        Preconditions.checkArgument(proj_auto_arrayList.size() <= 1, "This method should be used to analyze at most one project at a time!");

        ProjectEnhancedResults origProj = null;
        if (!proj_orig_arrayList.isEmpty()) {
            origProj = (ProjectEnhancedResults) proj_orig_arrayList.get(0);
        }

        ProjectEnhancedResults autoProj = null;
        if (!proj_auto_arrayList.isEmpty()) {
            autoProj = (ProjectEnhancedResults) proj_auto_arrayList.get(0);
        }

        return new EnhancedResults(origProj, autoProj, directory);
    }

    /*
     * a private method to generate the LaTeX format of the data of each Project in projList
     *
     * @param projList a list of Projects that each contain data
     */

    private static String generateLatexString(List<Project> projList, List<Project> otherProjList, String type,
            PercentWrapper percentComparedToUnenhanced) {
        String latexString = "";
        sortList(projList);

        int index = 0;
        List<GeometricMeanData> fig17GeoData = new ArrayList<>();
        List<GeometricMeanData> fig18GeoDataPercent = new ArrayList<>();
        List<GeometricMeanData> fig18GeoDataAPFD = new ArrayList<>();
        List<GeometricMeanData> fig19GeoData = new ArrayList<>();
        for (Project projTemp : projList) {
            ProjectEnhancedResults temp = (ProjectEnhancedResults) projTemp;
            // get the correct orig_value...one of the Lists will not have the correct value (will be 0)
            if (temp.isFig19()) {
                double orig_time_value = (temp.getOrigTimeValue() == 0)
                        ? ((ProjectEnhancedResults) otherProjList.get(index)).getOrigTimeValue()
                        : temp.getOrigTimeValue();
                latexString += generate19(temp, orig_time_value, fig19GeoData, percentComparedToUnenhanced);
                latexString += "\r\n";
            } else if (temp.isFig18()) {
                double orig_time_value = (temp.getOrigTimeValue() == 0)
                        ? ((ProjectEnhancedResults) otherProjList.get(index)).getOrigTimeValue()
                        : temp.getOrigTimeValue();
                latexString += generate18(temp, orig_time_value, fig18GeoDataAPFD, fig18GeoDataPercent,
                        percentComparedToUnenhanced, type);
                latexString += "\r\n";
            } else if (temp.isFig17()) {
                latexString += generate17(temp, fig17GeoData);
                latexString += "\r\n";
            }
            index++;
        }

        if (!fig17GeoData.isEmpty()) {
        	double[] geometricMeans = new double[4];
        	Map<Set<String>, Set<Double>> covOrdToVals = getCovOrdToValues(fig17GeoData);
        	
        	if (covOrdToVals.keySet().size() != geometricMeans.length) {
        		exitWithError("Coverage order combination in files is more than expected. Expected: 4. Found: " + covOrdToVals.keySet());
        	}

        	Set<String> statementAbs = new HashSet<>();
        	statementAbs.add(Constants.ORDER.ABSOLUTE.toString());
        	statementAbs.add(Constants.COVERAGE.STATEMENT.toString());
        	addToGeoMean(covOrdToVals, statementAbs, geometricMeans, 0);

        	Set<String> statementRel = new HashSet<>();
        	statementRel.add(Constants.ORDER.RELATIVE.toString());
        	statementRel.add(Constants.COVERAGE.STATEMENT.toString());
        	addToGeoMean(covOrdToVals, statementRel, geometricMeans, 1);

        	Set<String> functionAbs = new HashSet<>();
        	functionAbs.add(Constants.ORDER.ABSOLUTE.toString());
        	functionAbs.add(Constants.COVERAGE.FUNCTION.toString());
        	addToGeoMean(covOrdToVals, functionAbs, geometricMeans, 2);

        	Set<String> functionRel = new HashSet<>();
        	functionRel.add(Constants.ORDER.RELATIVE.toString());
        	functionRel.add(Constants.COVERAGE.FUNCTION.toString());
        	addToGeoMean(covOrdToVals, functionRel, geometricMeans, 3);

        	if (useCoverage) {
        	    latexString += addGeoString(geometricMeans, null);
            } else {
                latexString += addGeoString(null, geometricMeans);
            }

            if (type.equals("orig")) {
                getMeanOfDiffs("priorHumanWritten", fig17GeoData, false);
            } else if (type.equals("auto")) {
                getMeanOfDiffs("priorAutoGenerated", fig17GeoData, false);
            } else {
                throw new RuntimeException();
            }
        }

        if (!fig18GeoDataPercent.isEmpty()) {
        	
        	double[] geometricMeansAPFD = new double[6];
        	double[] geometricMeansTime = new double[6];

        	selectionParseGeoMeans(fig18GeoDataAPFD, geometricMeansAPFD);
        	selectionParseGeoMeans(fig18GeoDataPercent, geometricMeansTime);

        	if (useCoverage) {
                latexString += addGeoString(geometricMeansAPFD, geometricMeansTime);
            } else {
        	    double[] allTimes = ArrayUtils.addAll(geometricMeansTime, geometricMeansAPFD);

        	    latexString += addGeoString(null, allTimes);
            }

            if (type.equals("orig")) {
                getMeanOfDiffs("seleHumanWrittenPercent", fig18GeoDataPercent, true);
                getMeanOfDiffs("seleHumanWrittenAPFD", fig18GeoDataAPFD, false);
            } else if (type.equals("auto")) {
                getMeanOfDiffs("seleAutoGeneratedPercent", fig18GeoDataPercent, true);
                getMeanOfDiffs("seleAutoGeneratedAPFD", fig18GeoDataAPFD, false);
            } else {
                throw new RuntimeException();
            }
        }

        if (!fig19GeoData.isEmpty()) {

            double[] diffOfOrig = new double[4];
            for (int i = 0; i < 4; i++) {
                diffOfOrig[i] = 1.0;
            }
            int[] origCounter = new int[4];

            double[] diffOfTime = new double[4];
            for (int i = 0; i < 4; i++) {
                diffOfTime[i] = 1.0;
            }
            int[] timeCounter = new int[4];

            for (GeometricMeanData data : fig19GeoData) {
                if (data.getTdSetting() != null) {
                    continue;
                }
                if (data.getOrder().equals(Constants.ORDER.ORIGINAL)) {
                    diffOfOrig[data.getK() / 2] *= data.getValue() + 1.0;
                    origCounter[data.getK() / 2] += 1;
                } else {
                    diffOfTime[data.getK() / 2] *= data.getValue() + 1.0;
                    timeCounter[data.getK() / 2] += 1;
                }
            }

            double[] geometricMeans = new double[2 * 4];
            for (int i = 0; i < 2 * 4; i++) {
                if (i > 3) {
                    geometricMeans[i] = Math.pow(diffOfTime[i - 4], (1.0 / timeCounter[i - 4])) - 1.0;
                } else {
                    geometricMeans[i] = Math.pow(diffOfOrig[i], (1.0 / origCounter[i])) - 1.0;
                }
            }

            latexString += addGeoString(null, geometricMeans);

            if (type.equals("orig")) {
                getMeanOfDiffs("paraHumanWritten", fig19GeoData, true);
            } else if (type.equals("auto")) {
                getMeanOfDiffs("paraAutoGenerated", fig19GeoData, true);
            } else {
                throw new RuntimeException();
            }
        }

        // take off the "\r\n" from the last line
        return latexString;
    }
    
    private static void selectionParseGeoMeans(List<GeometricMeanData> geoData, double[] geometricMeans) {
    	Map<Set<String>, Set<Double>> covOrdToVals = getCovOrdToValues(geoData);
    	
    	if (covOrdToVals.keySet().size() != geometricMeans.length) {
    		exitWithError("Coverage order combination in files is more than expected. Expected: 6. Found: " + covOrdToVals.keySet());
    	}

    	Set<String> statementOrig = new HashSet<>();
    	statementOrig.add(Constants.ORDER.ORIGINAL.toString());
    	statementOrig.add(Constants.COVERAGE.STATEMENT.toString());
    	addToGeoMean(covOrdToVals, statementOrig, geometricMeans, 0);
    	
    	Set<String> statementAbs = new HashSet<>();
    	statementAbs.add(Constants.ORDER.ABSOLUTE.toString());
    	statementAbs.add(Constants.COVERAGE.STATEMENT.toString());
    	addToGeoMean(covOrdToVals, statementAbs, geometricMeans, 1);

    	Set<String> statementRel = new HashSet<>();
    	statementRel.add(Constants.ORDER.RELATIVE.toString());
    	statementRel.add(Constants.COVERAGE.STATEMENT.toString());
    	addToGeoMean(covOrdToVals, statementRel, geometricMeans, 2);

    	Set<String> functionOrig = new HashSet<>();
    	functionOrig.add(Constants.ORDER.ORIGINAL.toString());
    	functionOrig.add(Constants.COVERAGE.FUNCTION.toString());
    	addToGeoMean(covOrdToVals, functionOrig, geometricMeans, 3);

    	Set<String> functionAbs = new HashSet<>();
    	functionAbs.add(Constants.ORDER.ABSOLUTE.toString());
    	functionAbs.add(Constants.COVERAGE.FUNCTION.toString());
    	addToGeoMean(covOrdToVals, functionAbs, geometricMeans, 4);

    	Set<String> functionRel = new HashSet<>();
    	functionRel.add(Constants.ORDER.RELATIVE.toString());
    	functionRel.add(Constants.COVERAGE.FUNCTION.toString());
    	addToGeoMean(covOrdToVals, functionRel, geometricMeans, 5);
    }
    
    private static String addGeoString(double[] geometricMeansAPFD, double[] geometricMeansTime) {
        StringBuilder sb = new StringBuilder();
        sb.append("\\hline\r\nGeometric mean");
        if (geometricMeansTime != null) {        	
        	for (int i = 0; i < geometricMeansTime.length; i++) {
        		// double diffOfGeometricMeans = geometricMeans[i + 1] - geometricMeans[i];
        		String diffStringFormat = timeFormat.format(geometricMeansTime[i]);
        		if (diffStringFormat.equals("-0\\%")) {
        			diffStringFormat = "0\\%";
        		}
        		// if (diffOfGeometricMeans >= 0.0 || diffStringFormat.equals("0\\%")) {
        		// diffStringFormat = "\\pMinus" + diffStringFormat;
        		// }
        		// if (diffOfGeometricMeans * 100 < 10.0 && diffOfGeometricMeans * 100 > -10.0) {
        		// diffStringFormat = "\\z" + diffStringFormat;
        		// }
        		sb.append(" & " + diffStringFormat);
        	}
        }
        if (geometricMeansAPFD != null) {        	
        	for (int i = 0; i < geometricMeansAPFD.length; i++) {
        		// double diffOfGeometricMeans = geometricMeans[i + 1] - geometricMeans[i];
        		String diffStringFormat = "";                
        		String output = apfdFormat.format(geometricMeansAPFD[i]);
        		if (output.equals("-.00")) {
        			output = ".00";
        		}
        		if (geometricMeansAPFD[i] >= 0.0 || output.equals(".00")) {
        			diffStringFormat += "\\pMinus";// + output;
        		}
        		diffStringFormat += output;
        		sb.append(" & " + diffStringFormat);
        	}
        }
        sb.append(" \\\\");
        return sb.toString();
    }
    
    private static void addToGeoMean(Map<Set<String>, Set<Double>> covOrdToVals, Set<String> key, double[] geoMeans, int index) {
    	if (!covOrdToVals.containsKey(key)) {
    		exitWithError("Geometric mean missing " + key + ". Only contains " + covOrdToVals.keySet());
    	}
    	
    	Set<Double> values = covOrdToVals.get(key);
    	double product = 1.0;
    	for (Double val : values) {
    		product *= val + 1.0;
    	}
    	
    	geoMeans[index] = Math.pow(product, (1.0 / values.size())) - 1.0;
    }
    
    private static Map<Set<String>, Set<Double>> getCovOrdToValues(List<GeometricMeanData> geoData) {
    	Map<Set<String>, Set<Double>> covOrderToVals = new HashMap<>();
    	for (GeometricMeanData data : geoData) {
    		Set<String> key = new HashSet<String>();
    		key.add(data.getCoverage().toString());
    		key.add(data.getOrder().toString());

            Set<Double> currVals = covOrderToVals.computeIfAbsent(key, k -> new HashSet<>());
            currVals.add(data.getValue());
    	}
    	return covOrderToVals;
    }

    private static void getMeanOfDiffs(String name, List<GeometricMeanData> figData, boolean isPercent) {
        // Get mean of the differences
        double diffOfOrig = 1.0;
        int origCounter = 0;
        for (GeometricMeanData data : figData) {
            if (data.getTdSetting() != null) {
                continue;
            }
            diffOfOrig *= data.getValue() + 1.0;
            origCounter += 1;
        }

        double origGeoMean = 1.0 - (Math.pow(diffOfOrig, (1.0 / origCounter)) - 1.0);
        String data;
        if (isPercent) {
            data = formatPercent(origGeoMean, false);
        } else {
            data = formatAPFD(origGeoMean);
        }

        writeToLatexFile("\\newcommand{\\" + name + "}{" + data + "}\n",
                outputDirectoryName + System.getProperty("file.separator") + "enhanced-results-commands.tex", true);
    }

    private static String outputDirectoryName;
    protected static boolean useIsolationData;
    private static Path sootOutputOrig;
    private static Path sootOutputAuto;
    private static boolean useCoverage;


    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        allowNegatives = argsList.contains("-allowNegatives");
        useIsolationData = argsList.contains("-useIsolationData");
        useCoverage = argsList.contains("-useCoverage");

        String directoryName = mustGetArgName(argsList, "-directory");
        // name of directory where files should be outputted
        outputDirectoryName = mustGetArgName(argsList, "-outputDirectory");

        if (useCoverage) {
            final Path dtSubj = Paths.get(mustGetArgName(argsList, "-dtSubj"));

            sootOutputOrig = dtSubj.resolve("sootTestOutput-orig");
            sootOutputAuto = dtSubj.resolve("sootTestOutput-auto");
        }

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<>();
        List<Project> proj_auto_arrayList = new ArrayList<>();

        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(fList, new EnhancedResultsFigureGenerator(), true, proj_orig_arrayList, proj_auto_arrayList);

        if (!setupProjects(proj_orig_arrayList)) return;
        if (!setupProjects(proj_auto_arrayList)) return;

        PercentWrapper percentRuntime = new PercentWrapper();

        // generate LaTeX for the human-written and automatic test suites
        String origLatexString = generateLatexString(proj_orig_arrayList, proj_auto_arrayList, "orig", percentRuntime);
        String autoLatexString = generateLatexString(proj_auto_arrayList, proj_orig_arrayList, "auto", percentRuntime);

        origLatexString += "\n%Percent increase compared to unenhanced (including orig and auto): "
                + formatPercent(percentRuntime.percent, false);
        origLatexString += "\n%Number of comparisons (including orig and auto): " + percentRuntime.numPercents;
        autoLatexString += "\n%Percent increase compared to unenhanced (including orig and auto): "
                + formatPercent(percentRuntime.percent, false);
        autoLatexString += "\n%Number of comparisons (including orig and auto): " + percentRuntime.numPercents;

        String origOutputFilename = outputDirectoryName + System.getProperty("file.separator");
        String autoOutputFilename = outputDirectoryName + System.getProperty("file.separator");

        // fig 19
        if ((!proj_orig_arrayList.isEmpty() && ((ProjectEnhancedResults) proj_orig_arrayList.get(0)).isFig19())
                || (!proj_auto_arrayList.isEmpty()
                        && ((ProjectEnhancedResults) proj_auto_arrayList.get(0)).isFig19())) {
            origOutputFilename += "enhanced-para-orig-results.tex";
            autoOutputFilename += "enhanced-para-auto-results.tex";
        } else if ((!proj_orig_arrayList.isEmpty() && ((ProjectEnhancedResults) proj_orig_arrayList.get(0)).isFig18())
                || (!proj_auto_arrayList.isEmpty()
                        && ((ProjectEnhancedResults) proj_auto_arrayList.get(0)).isFig18())) {
            origOutputFilename += "enhanced-sele-orig-results.tex";
            autoOutputFilename += "enhanced-sele-auto-results.tex";
        } else { // fig 17
            origOutputFilename += "enhanced-prior-orig-results.tex";
            autoOutputFilename += "enhanced-prior-auto-results.tex";
        }

        writeToLatexFile(origLatexString, origOutputFilename, false);
        writeToLatexFile(autoLatexString, autoOutputFilename, false);
    }

    private static boolean setupProjects(List<Project> projects) {
        for (final Project results : projects) {
            final ProjectEnhancedResults projResults = (ProjectEnhancedResults) results;
            if (!projResults.setup()) {
                System.out.println("[ERROR] Could not setup project: " + projResults.getName());
                return false;
            }
        }
        return true;
    }

    @Override
	public void doParaCalculations() {
		ProjectEnhancedResults currProj = (ProjectEnhancedResults) FigureGenerator.currProj;
        String order_time_string = parseFile(file, Constants.ORDER_TIME_PARA);
        double order_time = Double.parseDouble(order_time_string);
        timeInFile = getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TIME_STRING);

        // order will be time or original
        // k = 2, 4, 8, 16 is the number of machines
        int k = flagsList.indexOf("-numOfMachines");
        String numMachines_string = flagsList.get(k + 1);
        int numMachines = Integer.parseInt(numMachines_string);

        currProj.useFig19();
        // this array will correspond to P1 or P2
        double[] curr_fig19_array = null;
        if (orderName.equals("original")) {
            curr_fig19_array = currProj.get_fig19_orig();
        } else if (orderName.equals("time")) { // orderName == time
            curr_fig19_array = currProj.get_fig19_time();
        } else {
            exitWithError("Unexpected order: " + orderName);
        }

        String testStr =
                getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TEST_ORDER_LIST);
        testStr = testStr.substring(1, testStr.length() - 1);
        String[] test_list = testStr.split(", ");

        int index = -1;
        boolean isEnhanced = resolveDependences != null;

        if (numMachines == 2) {
            index = 0;
        } else if (numMachines == 4) {
            index = 2;
        } else if (numMachines == 8) {
            index = 4;
        } else if (numMachines == 16) {
            index = 6;
        } else {
            exitWithError("Unexpected numMachines: " + numMachines);
        }

        if (isEnhanced) {
            index += 1;
        }
        curr_fig19_array[index] = order_time;
        currProj.setNumTotalDependentTestsPara(orderName.equals("original"), index, numTotal);
        setTime(currProj, timeInFile, index, orderName.equals("original"));
        currProj.setTestListPara(orderName.equals("original"), index, test_list);

        currProj.addAllTestsInfo(allTestToInfo, index, orderName.equals("original"));
        currProj.addIsolationInfo(dtToInfo, index, orderName.equals("original"));
        currProj.addOrigInfo(origToInfo, index, orderName.equals("original"));

        if (coverageInFile != null) {
            currProj.setCoverage(19, strArrayToDoubleArray(getRidSquareBrackets(coverageInFile)), index, orderName.equals("original"));
            currProj.setCoverageType(Constants.COVERAGE.valueOf(coverageName.toUpperCase()));
        }
    }

	@Override
	public void doSeleCalculations() {
		ProjectEnhancedResults currProj = (ProjectEnhancedResults) FigureGenerator.currProj;

		String apfd_value_string = parseFile(file, Constants.APFD_VALUE);
        double apfd_value = Double.parseDouble(apfd_value_string);
        String order_time_string = parseFile(file, Constants.ORDER_TIME);
        double order_time = Double.parseDouble(order_time_string);
        currProj.useFig18();
        double[] fig18_values_array = currProj.get_fig_values(18);
        double[] fig18_time_array = currProj.get_fig18_time();
        String testStr =
                getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TEST_ORDER_LIST);
        testStr = testStr.substring(1, testStr.length() - 1);
        String[] test_list = testStr.split(", ");

        int index = -1;
        boolean isEnhanced = resolveDependences != null;

        // original values, index should be i=0, i+=2
        if (coverageName.equals("statement")) {
            if (orderName.equals("original")) {
                // S1
                index = 0;
            } else if (orderName.equals("absolute")) {
                // S2
                index = 2;
            } else if (orderName.equals("relative")) {
                // S3
                index = 4;
            } else {
                exitWithError("Unexpected order: " + orderName);
            }
        } else if (coverageName.equals("function")) {
            if (orderName.equals("original")) {
                // S4
                index = 6;
            } else if (orderName.equals("absolute")) {
                // S5
                index = 8;
            } else if (orderName.equals("relative")) {
                // S6
                index = 10;
            } else {
                exitWithError("Unexpected order: " + orderName);
            }
        } else {
            exitWithError("Unexpected coverageName: " + coverageName);
        }

        if (isEnhanced) {
            index += 1;
        }
        fig18_values_array[index] = useCoverage ? apfd_value : order_time;
        fig18_time_array[index] = order_time;
        currProj.setNumTotalDependentTests(18, index, numTotal);
        setTime(currProj, 18, timeInFile, index);
        currProj.setTestList(18, index, test_list);

        currProj.addAllTestsInfo(allTestToInfo, index);
        currProj.addIsolationInfo(dtToInfo, index);
        currProj.addOrigInfo(origToInfo, index);

        currProj.setCoverage(18, strArrayToDoubleArray(getRidSquareBrackets(coverageInFile)), index);
        currProj.setCoverageType(Constants.COVERAGE.valueOf(coverageName.toUpperCase()));
    }

    @Override
    public void doPrioCalculations() {
		ProjectEnhancedResults currProj = (ProjectEnhancedResults) FigureGenerator.currProj;

        // if orderName is original, run time for entire test suite
        String apfd_value_string = parseFile(file, Constants.APFD_VALUE);
        double apfd_value = Double.parseDouble(apfd_value_string);
        String order_time_string = parseFile(file, Constants.ORDER_TIME);
        double order_time = Double.parseDouble(order_time_string);
        String testStr =
                getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TEST_ORDER_LIST);
        testStr = testStr.substring(1, testStr.length() - 1);
        String[] test_list = testStr.split(", ");

        if (orderName.equals("original")) {
            currProj.setOrigTimeValue(order_time);
            currProj.setOrigAPFDValue(apfd_value);
            if (timeInFile != null && coverageInFile != null) {
                currProj.setOrig_time(strArrayToDoubleArray(getRidSquareBrackets(timeInFile)));
                currProj.setOrig_coverage(strArrayToDoubleArray(getRidSquareBrackets(coverageInFile)));
            }
            currProj.setOrig_tests(test_list);
            return;
        }

        currProj.useFig17();
        double[] fig17_array = currProj.get_fig_values(17);

        int index = -1;
        boolean isEnhanced = resolveDependences != null;

        // original values, index should be i=0, i+=2
        if (coverageName.equals("statement")) {
            if (orderName.equals("absolute")) {
                // T3
                index = 0;
            } else if (orderName.equals("relative")) { // relative
                // T4
                index = 2;
            } else {
                exitWithError("Unexpected order: " + orderName);
            }
        } else if (coverageName.equals("function")) {
            if (orderName.equals("absolute")) {
                // T5
                index = 4;
            } else if (orderName.equals("relative")) { // relative
                // T7
                index = 6;
            } else {
                exitWithError("Unexpected order: " + orderName);
            }
        } else {
            exitWithError("Unexpected coverageName: " + coverageName);
        }

        if (isEnhanced) {
            index += 1;
        }
        fig17_array[index] = useCoverage ? apfd_value : order_time;
        currProj.setNumTotalDependentTests(17, index, numTotal);
        setTime(currProj, 17, timeInFile, index);
        currProj.setTestList(17, index, test_list);

        currProj.addAllTestsInfo(allTestToInfo, index);
        currProj.addIsolationInfo(dtToInfo, index);
        currProj.addOrigInfo(origToInfo, index);

        currProj.setCoverage(17, strArrayToDoubleArray(getRidSquareBrackets(coverageInFile)), index);
        currProj.setCoverageType(Constants.COVERAGE.valueOf(coverageName.toUpperCase()));
        currProj.setTestType(testType);
    }

    static class PercentWrapper {
        public double percent;
        public int numPercents;

        public PercentWrapper() {
            percent = 0.0;
            numPercents = 0;
        }
    }

    public static void setTime(ProjectEnhancedResults currProj, int figNum, String timeInFile, int indexOfProj) {
        // Get time and coverage information for this configuration
        if (timeInFile != null) {
            currProj.setTimeInfo(figNum, indexOfProj, strArrayToDoubleArray(getRidSquareBrackets(timeInFile)));
        }
    }

    public static void setTime(ProjectEnhancedResults currProj, String timeInFile, int indexOfProj,
                               boolean isOriginal) {
        // Get time and coverage information for this configuration
        if (timeInFile != null) {
            currProj.setTimeInfoPara(isOriginal, indexOfProj, strArrayToDoubleArray(getRidSquareBrackets(timeInFile)));
        }
    }
}
