
package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.data.GeometricMeanData;
import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.data.ProjectEnhancedResults;
import edu.washington.cs.dt.impact.util.Constants;

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
        double[] values = project.get_fig17_values();
        boolean[] unenNumOfDTs = project.get_fig17_NumOfDTs_unen();
        boolean[] enNumOfDTs = project.get_fig17_NumOfDTs_en();
        String result = project.getName();
        List<Double> origTime = Arrays.asList(project.getOrig_time());
        List<Double> origCoverage = Arrays.asList(project.getOrig_coverage());

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val;

            if (!unenNumOfDTs[i]) {
                // Case A
                // Enhanced - unenhanced
                val = values[i + 1] - values[i];
            } else if (unenNumOfDTs[i] && enNumOfDTs[i]) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // Shift_by_enhanced’s_time(orig) - shift_by_unsound’s_time(orig)
                val = shift_by_time(project.getFig17_time_en()[i], origTime, origCoverage)
                        - shift_by_time(project.getFig17_time_unen()[i], origTime, origCoverage);
            } else {
                // Case C
                // Enhanced - shift_by_unsound’s_time(orig)
                val = values[i + 1] - shift_by_time(project.getFig17_time_unen()[i], origTime, origCoverage);
            }
            if (!allowNegatives && val < 0.0) {
                val = 0.0;
            }
            fig17Data.add(new GeometricMeanData(i, val, null, null));
            String output = apfdFormat.format(val);
            if (output.equals("-.00")) {
                output = ".00";
            }
            result += " & ";
            if (val >= 0.0 || output.equals(".00")) {
                result += "\\pMinus";// + output;
            }
            result += output;
        }
        result += " \\\\"; // "\\"
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
        double[] time = project.get_fig18_time();
        double[] values = project.get_fig18_values();
        boolean[] unenNumOfDTs = project.get_fig18_NumOfDTs_unen();
        boolean[] enNumOfDTs = project.get_fig18_NumOfDTs_en();
        String result = project.getName() + "       ";
        List<Double> origTime = Arrays.asList(project.getOrig_time());
        List<Double> origCoverage = Arrays.asList(project.getOrig_coverage());
        List<String> origTestList = Arrays.asList(project.getOrig_tests());

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
            if (!unenNumOfDTs[i]) {
                // Case A
                // 1 - Enh / (uns)
                percent = 1 - (time[i + 1] / time[i]);
            } else if (unenNumOfDTs[i] && enNumOfDTs[i]) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig18_en_test_list()[i], origTestList))));
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig18_unen_test_list()[i], origTestList))));
                percent = 1 - ((time[i + 1] + enOrigTimeVal) / (time[i] + unenOrigTimeVal));
            } else {
                // Case C
                // 1 - Enh / (uns + orig)
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig18_unen_test_list()[i], origTestList))));
                percent = 1 - (time[i + 1] / (time[i] + unenOrigTimeVal));
            }
            fig18percent.add(new GeometricMeanData(i, percent, null, null));
            percent *= 100;

            // Increase in runtime of enhanced compared to unenhanced
            percentComparedToUnenhanced.percent += (time[i + 1] - time[i]) / orig_time_value;
            percentComparedToUnenhanced.numPercents += 1;

            if (!allowNegatives && percent < 0.0) {
                percent = 0.0;
            }
            result += " & ";
            String output = percentFormat.format(percent);
            if (output.equals("-0")) {
                output = "0";
            }
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

            result += output + "\\%"; // "\%"
        }
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val;

            if (!unenNumOfDTs[i]) {
                // Case A
                // Enhanced - unenhanced
                val = values[i + 1] - values[i];
            } else if (unenNumOfDTs[i] && enNumOfDTs[i]) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // Shift_by_enhanced’s_time(orig) - shift_by_unsound’s_time(orig)
                int unenIndex = getHighestIndexInOrigTestList(project.getFig18_unen_test_list()[i], origTestList);
                int enIndex = getHighestIndexInOrigTestList(project.getFig18_en_test_list()[i], origTestList);

                val = shift_by_time(project.getFig18_time_en()[i], new ArrayList<Double>(origTime.subList(0, enIndex)),
                        new ArrayList<Double>(origCoverage.subList(0, enIndex)))
                        - shift_by_time(project.getFig18_time_unen()[i],
                                new ArrayList<Double>(origTime.subList(0, unenIndex)),
                                new ArrayList<Double>(origCoverage.subList(0, unenIndex)));
            } else {
                // Case C
                // Enhanced - shift_by_unsound’s_time(orig)
                int index = getHighestIndexInOrigTestList(project.getFig18_unen_test_list()[i], origTestList);

                val = values[i + 1] - shift_by_time(project.getFig18_time_unen()[i],
                        new ArrayList<Double>(origTime.subList(0, index)),
                        new ArrayList<Double>(origCoverage.subList(0, index)));
            }
            if (!allowNegatives && val < 0.0) {
                val = 0.0;
            }
            fig18apfd.add(new GeometricMeanData(i, val, null, null));
            String output = apfdFormat.format(val);
            if (output.equals("-.00")) {
                output = ".00";
            }
            result += " & ";
            // if (val >= 0.0 || output.equals(".00")) {
            // result += "\\pMinus";
            // }
            result += output;
        }
        result += " \\\\"; // "\\"
        return result;
    }

    private static double shift_by_time(Double[] enhancedTime, List<Double> origTime, List<Double> origCoverage) {
        List<Double> totalTime = new ArrayList<Double>(Arrays.asList(enhancedTime));
        int enhancedSize = totalTime.size();
        totalTime.addAll(origTime);
        List<Double> totalCoverage = new ArrayList<Double>();
        for (int j = 0; j < enhancedSize; j++) {
            totalCoverage.add(0.0);
        }
        totalCoverage.addAll(origCoverage);
        return Runner.getAPFD(Runner.getCumulListDouble(totalTime), Runner.getCumulListDouble(totalCoverage));
    }

    /*
     * a private method that generates Figure 19
     */
    private static String generate19(ProjectEnhancedResults project, double orig_time_value,
            List<GeometricMeanData> fig19GeoData, PercentWrapper percentComparedToUnenhanced) {
        double[] orig_values = project.get_fig19_orig();
        double[] time_values = project.get_fig19_time();
        String result = project.getName();
        double enhancedParaSpeedup = 0;
        double unenhancedPara = 0;
        double diffBetweenEnhancedUnenhanced = 0;
        boolean[] unenNumOfDTs = project.get_fig19_NumOfDTs_orig_unen();
        boolean[] enNumOfDTs = project.get_fig19_NumOfDTs_orig_en();
        List<Double> origTime = Arrays.asList(project.getOrig_time());
        List<String> origTestList = Arrays.asList(project.getOrig_tests());

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= orig_values.length; i += 2) {
            // enhanced
            enhancedParaSpeedup = orig_values[i + 1];
            unenhancedPara = orig_values[i];
            if (!unenNumOfDTs[i]) {
                // Case A
                // 1 - Enh / (uns)
                diffBetweenEnhancedUnenhanced = 1 - (enhancedParaSpeedup / unenhancedPara);
            } else if (unenNumOfDTs[i] && enNumOfDTs[i]) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig19_en_test_list()[i], origTestList))));
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig19_unen_test_list()[i], origTestList))));
                diffBetweenEnhancedUnenhanced =
                        1 - ((enhancedParaSpeedup + enOrigTimeVal) / (unenhancedPara + unenOrigTimeVal));
            } else {
                // orig
                // Case C
                // 1 - Enh / (uns + orig)
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig19_unen_test_list()[i], origTestList))));
                diffBetweenEnhancedUnenhanced = 1 - (enhancedParaSpeedup / (unenhancedPara + unenOrigTimeVal));
            }

            // Increase in runtime of enhanced compared to unenhanced
            percentComparedToUnenhanced.percent += (enhancedParaSpeedup - unenhancedPara) / orig_time_value;
            percentComparedToUnenhanced.numPercents += 1;

            String output = timeFormat.format(diffBetweenEnhancedUnenhanced);
            if (output.equals("-0\\%")) {
                output = "0\\%";
            }

            result += " & ";
            // if (diffBetweenEnhancedUnenhanced >= 0.0 || output.equals("0\\%")) {
            // result += "\\pMinus";
            // if (output.length() == 3) // single digit number, #\%
            // {
            // result += "\\z";
            // }
            // } else { // negative
            // if (output.length() == 4) {// single digit number, #\%
            // result += "\\z";
            // }
            // }

            result += output;
            // result += " & " + timeFormat.format(enhancedParaSpeedup) + " $\\rightarrow$ " +
            // timeFormat.format(unenhancedPara);
            fig19GeoData.add(new GeometricMeanData(getK(i), enhancedParaSpeedup, Constants.TD_SETTING.OMITTED_TD,
                    Constants.ORDER.ORIGINAL));
            fig19GeoData.add(new GeometricMeanData(getK(i), unenhancedPara, Constants.TD_SETTING.GIVEN_TD,
                    Constants.ORDER.ORIGINAL));
            fig19GeoData.add(new GeometricMeanData(i, diffBetweenEnhancedUnenhanced, null, Constants.ORDER.ORIGINAL));
        }
        unenNumOfDTs = project.get_fig19_NumOfDTs_time_unen();
        enNumOfDTs = project.get_fig19_NumOfDTs_time_en();

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= time_values.length; i += 2) {
            enhancedParaSpeedup = time_values[i + 1];
            unenhancedPara = time_values[i];
            if (!unenNumOfDTs[i]) {
                // Case A
                // 1 - Enh / (uns)
                diffBetweenEnhancedUnenhanced = 1 - (enhancedParaSpeedup / unenhancedPara);
            } else if (unenNumOfDTs[i] && enNumOfDTs[i]) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig19_en_test_list()[i], origTestList))));
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig19_unen_test_list()[i], origTestList))));
                diffBetweenEnhancedUnenhanced =
                        1 - ((enhancedParaSpeedup + enOrigTimeVal) / (unenhancedPara + unenOrigTimeVal));
            } else {
                // orig
                // Case C
                // 1 - Enh / (uns + orig)
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.getFig19_unen_test_list()[i], origTestList))));
                diffBetweenEnhancedUnenhanced = 1 - (enhancedParaSpeedup / (unenhancedPara + unenOrigTimeVal));
            }

            // Increase in runtime of enhanced compared to unenhanced
            percentComparedToUnenhanced.percent += (enhancedParaSpeedup - unenhancedPara) / orig_time_value;
            percentComparedToUnenhanced.numPercents += 1;

            String output = timeFormat.format(diffBetweenEnhancedUnenhanced);
            if (output.equals("-0\\%")) {
                output = "0\\%";
            }

            result += " & ";
            // if (diffBetweenEnhancedUnenhanced >= 0.0 || output.equals("0\\%")) {
            // result += "\\pMinus";
            // if (output.length() == 3) // single digit number, #\%
            // {
            // result += "\\z";
            // }
            // } else { // negative
            // if (output.length() == 4) {// single digit number, #\%
            // result += "\\z";
            // }
            // }

            result += output;
            // result += " & " + timeFormat.format(enhancedParaSpeedup) + " $\\rightarrow$ " +
            // timeFormat.format(unenhancedPara);
            fig19GeoData.add(new GeometricMeanData(getK(i), enhancedParaSpeedup, Constants.TD_SETTING.OMITTED_TD,
                    Constants.ORDER.TIME));
            fig19GeoData.add(new GeometricMeanData(getK(i), unenhancedPara, Constants.TD_SETTING.GIVEN_TD,
                    Constants.ORDER.TIME));
            fig19GeoData.add(new GeometricMeanData(i, diffBetweenEnhancedUnenhanced, null, Constants.ORDER.TIME));
        }
        result += "\\\\";
        return result;
    }

    private static String formatAPFD(double num) {
        double val = num;
        if (!allowNegatives && val < 0.0) {
            val = 0.0;
        }
        String output = apfdFormat.format(val);
        if (output.equals("-.00")) {
            output = ".00";
        }
        return output;
    }

    /*
     * a private method to generate the LaTeX format of the data of each Project in projList
     *
     * @param projList a list of Projects that each contain data
     */

    private static String generateLatexString(List<Project> projList, List<Project> otherProjList, String type,
            PercentWrapper percentComparedToUnenhanced) {
        String latexString = "";
        List<Project> sortedList = new ArrayList<Project>();
        sortList(projList, sortedList, Constants.CRYSTAL_NAME);
        sortList(projList, sortedList, Constants.JFREECHART_NAME);
        sortList(projList, sortedList, Constants.JODATIME_NAME);
        sortList(projList, sortedList, Constants.SYNOTPIC_NAME);
        sortList(projList, sortedList, Constants.XMLSECURITY_NAME);

        int index = 0;
        List<GeometricMeanData> fig17GeoData = new ArrayList<>();
        List<GeometricMeanData> fig18GeoDataPercent = new ArrayList<>();
        List<GeometricMeanData> fig18GeoDataAPFD = new ArrayList<>();
        List<GeometricMeanData> fig19GeoData = new ArrayList<>();
        for (Project projTemp : sortedList) {
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
            if (type.equals("orig")) {
                getMeanOfDiffs("priorHumanWritten", fig17GeoData, false);
            } else if (type.equals("auto")) {
                getMeanOfDiffs("priorAutoGenerated", fig17GeoData, false);
            } else {
                throw new RuntimeException();
            }
        }

        if (!fig18GeoDataPercent.isEmpty()) {
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
            // int columns = 16;
            // double[] geometricMeans = new double[columns];
            // for (int i = 0; i < columns; i++) {
            // double value = 1.0;
            // int counter = 0;
            // for (GeometricMeanData data : fig19GeoData) {
            // if (data.getOrder() == null || data.getTdSetting() == null) {
            // continue;
            // }
            // if (i % 2 == 0 && !data.getTdSetting().equals(Constants.TD_SETTING.OMITTED_TD)) {
            // continue;
            // }
            // if (i % 2 == 1 && !data.getTdSetting().equals(Constants.TD_SETTING.GIVEN_TD)) {
            // continue;
            // }
            // if (i >= 0 && i < 8 && !data.getOrder().equals(Constants.ORDER.ORIGINAL)) {
            // continue;
            // }
            // if (i >= 8 && i < 16 && !data.getOrder().equals(Constants.ORDER.TIME)) {
            // continue;
            // }
            //
            // if (i == 0 && data.getK() == 2) {
            // value *= data.getValue();
            // } else if (i == 1 && data.getK() == 2) {
            // value *= data.getValue();
            // } else if (i == 2 && data.getK() == 4) {
            // value *= data.getValue();
            // } else if (i == 3 && data.getK() == 4) {
            // value *= data.getValue();
            // } else if (i == 4 && data.getK() == 8) {
            // value *= data.getValue();
            // } else if (i == 5 && data.getK() == 8) {
            // value *= data.getValue();
            // } else if (i == 6 && data.getK() == 16) {
            // value *= data.getValue();
            // } else if (i == 7 && data.getK() == 16) {
            // value *= data.getValue();
            // } else if (i == 8 && data.getK() == 2) {
            // value *= data.getValue();
            // } else if (i == 9 && data.getK() == 2) {
            // value *= data.getValue();
            // } else if (i == 10 && data.getK() == 4) {
            // value *= data.getValue();
            // } else if (i == 11 && data.getK() == 4) {
            // value *= data.getValue();
            // } else if (i == 12 && data.getK() == 8) {
            // value *= data.getValue();
            // } else if (i == 13 && data.getK() == 8) {
            // value *= data.getValue();
            // } else if (i == 14 && data.getK() == 16) {
            // value *= data.getValue();
            // } else if (i == 15 && data.getK() == 16) {
            // value *= data.getValue();
            // } else {
            // continue;
            // }
            // counter += 1;
            // }
            // geometricMeans[i] = Math.pow(value, (1.0 / counter));
            // }
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

            StringBuilder sb = new StringBuilder();
            sb.append("\\hline\r\nGeometric mean");
            for (int i = 0; i < geometricMeans.length; i++) {
                // double diffOfGeometricMeans = geometricMeans[i + 1] - geometricMeans[i];
                String diffStringFormat = timeFormat.format(geometricMeans[i]);
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
            sb.append(" \\\\");
            latexString += sb.toString();

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
            data = formatPercent(origGeoMean);
        } else {
            data = formatAPFD(origGeoMean);
        }

        writeToLatexFile("\\newcommand{\\" + name + "}{" + data + "}\n",
                outputDirectoryName + System.getProperty("file.separator") + "enhanced-results-commands.tex", true);
    }

    private static String outputDirectoryName;

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        allowNegatives = argsList.contains("-allowNegatives");

        String directoryName = getArgName(argsList, "-directory");
        // name of directory where files should be outputted
        outputDirectoryName = getArgName(argsList, "-outputDirectory");

        /*
         * 17: prioritization
         * 18: selection
         * 19: parallelizaiton
         */

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        // create a list of project Objects that each have a diff project name
        int size = 5;
        List<Project> proj_orig_arrayList = new ArrayList<Project>(size);
        List<Project> proj_auto_arrayList = new ArrayList<Project>(size);

        for (File file : fList) {
            if (file.isFile()) {

                // String containing all the flags
                String flagsInFile = getFlagsLine(file, Constants.ARGUMENT_STRING);
                if (flagsInFile == null) {
                    continue;
                }

                String timeInFile = getFlagsLine(file, Constants.TIME_STRING);
                String coverageInFile = getFlagsLine(file, Constants.COVERAGE_STRING);

                // get rid of square brackets
                List<String> flagsList = getRidSquareBrackets(flagsInFile);
                // get rid of whitespaces
                for (int i = 0; i < flagsList.size(); i++) {
                    flagsList.set(i, flagsList.get(i).trim());
                }
                int index = flagsList.indexOf("-technique");
                // index + 1 because want arg after the index of flag
                String techniqueName = flagsList.get(index + 1);

                index = flagsList.indexOf("-coverage");
                String coverageName = flagsList.get(index + 1);

                index = flagsList.indexOf("-order");
                String orderName = flagsList.get(index + 1);

                index = flagsList.indexOf("-project");
                String projectName = flagsList.get(index + 1);
                if (projectName.equals("crystal")) {
                    projectName = Constants.CRYSTAL_NAME;
                } else if (projectName.equals("jfreechart")) {
                    projectName = Constants.JFREECHART_NAME;
                } else if (projectName.equals("jodatime")) {
                    projectName = Constants.JODATIME_NAME;
                } else if (projectName.equals("synoptic")) {
                    projectName = Constants.SYNOTPIC_NAME;
                } else if (projectName.equals("xml_security")) {
                    projectName = Constants.XMLSECURITY_NAME;
                } else {
                    System.err.println("Project argument is specified but the project name"
                            + " value provided is invalid. Please use either crystal, jfreechart, jodatime, synoptic or xml_security.");
                    System.exit(0);
                }

                index = flagsList.indexOf("-testType");
                String testType = flagsList.get(index + 1);

                index = flagsList.indexOf("-dependentTestFile");
                String resolveDependences = null;
                // if index = -1, flag not present
                if (index != -1) {
                    resolveDependences = flagsList.get(index);
                }

                // see if List needs to orig or auto generated one
                List<Project> currProjList = null;
                if (testType.equals("auto")) {
                    currProjList = proj_auto_arrayList;
                } else if (testType.equals("orig")) {
                    currProjList = proj_orig_arrayList;
                }

                // index of this project in the arrayList, might be -1 if not found
                int indexOfProj = indexOfByName(currProjList, projectName);

                // Project Object that corresponds to the current project name in this file
                Project currProj2 = null;

                if (indexOfProj != -1) {
                    currProj2 = currProjList.get(indexOfProj);
                } else {// projectName not seen before
                    currProj2 = new ProjectEnhancedResults(projectName);
                    currProjList.add(currProj2);
                }
                ProjectEnhancedResults currProj = (ProjectEnhancedResults) currProj2;

                int numTotal = parseFileForDTs(file, Constants.NUM_NOT_FIXED_DTS);

                /*
                 * The method setNumTotalDependentTests sets the number of DTS for a specific file corresponding to a
                 * project such as Crystal
                 *
                 * setNumTotalDependentTests(int figNum, int index, int numTotal)
                 *
                 * @param figNum represents the figure number in the paper (17, 18, or 19)
                 *
                 * @param index indicates which column in the figure it corresponds to (i.e. Figure 17 column 0
                 * represents T3)
                 *
                 * @param numTotal is the total number of DTS for that file
                 *
                 */

                // parallelization technique, figure 19
                if (techniqueName.equals("parallelization")) {
                    String order_time_string = parseFile(file, Constants.ORDER_TIME_PARA);
                    double order_time = Double.parseDouble(order_time_string);
                    timeInFile = getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TIME_STRING);

                    // order will be time or original
                    // k = 2, 4, 8, 16 is the number of machines
                    index = flagsList.indexOf("-numOfMachines");
                    String numMachines_string = flagsList.get(index + 1);
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
                    testStr = testStr.substring(1, testStr.length() - 2);
                    String[] test_list = testStr.split(", ");

                    if (resolveDependences == null) { // non-enhanced
                        if (numMachines == 2) {
                            curr_fig19_array[0] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 0, numTotal, false);
                            setTime(currProj, 19, timeInFile, 0, false);
                            currProj.setTestList(19, 0, test_list, false);
                        } else if (numMachines == 4) {
                            curr_fig19_array[2] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 2, numTotal, false);
                            setTime(currProj, 19, timeInFile, 2, false);
                            currProj.setTestList(19, 2, test_list, false);
                        } else if (numMachines == 8) {
                            curr_fig19_array[4] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 4, numTotal, false);
                            setTime(currProj, 19, timeInFile, 4, false);
                            currProj.setTestList(19, 4, test_list, false);
                        } else if (numMachines == 16) {
                            curr_fig19_array[6] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 6, numTotal, false);
                            setTime(currProj, 19, timeInFile, 6, false);
                            currProj.setTestList(19, 6, test_list, false);
                        } else {
                            exitWithError("Unexpected numMachines: " + numMachines);
                        }
                    } else { // enhanced
                        if (numMachines == 2) {
                            curr_fig19_array[1] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 0, numTotal, true);
                            setTime(currProj, 19, timeInFile, 0, true);
                            currProj.setTestList(19, 0, test_list, true);
                        } else if (numMachines == 4) {
                            curr_fig19_array[3] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 2, numTotal, true);
                            setTime(currProj, 19, timeInFile, 2, true);
                            currProj.setTestList(19, 2, test_list, true);
                        } else if (numMachines == 8) {
                            curr_fig19_array[5] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 4, numTotal, true);
                            setTime(currProj, 19, timeInFile, 4, true);
                            currProj.setTestList(19, 4, test_list, true);
                        } else if (numMachines == 16) {
                            curr_fig19_array[7] = order_time;
                            currProj.setNumTotalDependentTestsPara(orderName.equals("original"), 6, numTotal, true);
                            setTime(currProj, 19, timeInFile, 6, true);
                            currProj.setTestList(19, 6, test_list, true);
                        } else {
                            exitWithError("Unexpected numMachines: " + numMachines);
                        }
                    }
                } // selection technique, figure 18
                else if (techniqueName.equals("selection")) {
                    String apfd_value_string = parseFile(file, Constants.APFD_VALUE);
                    double apfd_value = Double.parseDouble(apfd_value_string);
                    String order_time_string = parseFile(file, Constants.ORDER_TIME);
                    double order_time = Double.parseDouble(order_time_string);
                    currProj.useFig18();
                    double[] fig18_values_array = currProj.get_fig18_values();
                    double[] fig18_time_array = currProj.get_fig18_time();
                    String testStr =
                            getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TEST_ORDER_LIST);
                    testStr = testStr.substring(1, testStr.length() - 2);
                    String[] test_list = testStr.split(", ");

                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) { // orig, unenhanced
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig18_values_array[0] = apfd_value;
                                fig18_time_array[0] = order_time;
                                currProj.setNumTotalDependentTests(18, 0, numTotal, false);
                                setTime(currProj, 18, timeInFile, 0, false);
                                currProj.setTestList(18, 0, test_list, false);
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig18_values_array[2] = apfd_value;
                                fig18_time_array[2] = order_time;
                                currProj.setNumTotalDependentTests(18, 2, numTotal, false);
                                setTime(currProj, 18, timeInFile, 2, false);
                                currProj.setTestList(18, 2, test_list, false);
                            } else if (orderName.equals("relative")) {
                                // S3
                                fig18_values_array[4] = apfd_value;
                                fig18_time_array[4] = order_time;
                                currProj.setNumTotalDependentTests(18, 4, numTotal, false);
                                setTime(currProj, 18, timeInFile, 4, false);
                                currProj.setTestList(18, 4, test_list, false);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig18_values_array[6] = apfd_value;
                                fig18_time_array[6] = order_time;
                                currProj.setNumTotalDependentTests(18, 6, numTotal, false);
                                setTime(currProj, 18, timeInFile, 6, false);
                                currProj.setTestList(18, 6, test_list, false);
                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig18_values_array[8] = apfd_value;
                                fig18_time_array[8] = order_time;
                                currProj.setNumTotalDependentTests(18, 8, numTotal, false);
                                setTime(currProj, 18, timeInFile, 8, false);
                                currProj.setTestList(18, 8, test_list, false);
                            } else if (orderName.equals("relative")) {
                                // S6
                                fig18_values_array[10] = apfd_value;
                                fig18_time_array[10] = order_time;
                                currProj.setNumTotalDependentTests(18, 10, numTotal, false);
                                setTime(currProj, 18, timeInFile, 10, false);
                                currProj.setTestList(18, 10, test_list, false);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else {
                            exitWithError("Unexpected coverageName: " + coverageName);
                        }
                    } else if (testType.equals("auto")) { // auto, enhanced, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig18_values_array[1] = apfd_value;
                                fig18_time_array[1] = order_time;
                                currProj.setNumTotalDependentTests(18, 0, numTotal, true);
                                setTime(currProj, 18, timeInFile, 0, true);
                                currProj.setTestList(18, 0, test_list, true);
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig18_values_array[3] = apfd_value;
                                fig18_time_array[3] = order_time;
                                currProj.setNumTotalDependentTests(18, 2, numTotal, true);
                                setTime(currProj, 18, timeInFile, 2, true);
                                currProj.setTestList(18, 2, test_list, true);
                            } else if (orderName.equals("relative")) {
                                // S3
                                fig18_values_array[5] = apfd_value;
                                fig18_time_array[5] = order_time;
                                currProj.setNumTotalDependentTests(18, 4, numTotal, true);
                                setTime(currProj, 18, timeInFile, 4, true);
                                currProj.setTestList(18, 4, test_list, true);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig18_values_array[7] = apfd_value;
                                fig18_time_array[7] = order_time;
                                currProj.setNumTotalDependentTests(18, 6, numTotal, true);
                                setTime(currProj, 18, timeInFile, 6, true);
                                currProj.setTestList(18, 6, test_list, true);
                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig18_values_array[9] = apfd_value;
                                fig18_time_array[9] = order_time;
                                currProj.setNumTotalDependentTests(18, 8, numTotal, true);
                                setTime(currProj, 18, timeInFile, 8, true);
                                currProj.setTestList(18, 8, test_list, true);
                            } else if (orderName.equals("relative")) {
                                // S6
                                fig18_values_array[11] = apfd_value;
                                fig18_time_array[11] = order_time;
                                currProj.setNumTotalDependentTests(18, 10, numTotal, true);
                                setTime(currProj, 18, timeInFile, 10, true);
                                currProj.setTestList(18, 10, test_list, true);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else {
                            exitWithError("Unexpected coverageName: " + coverageName);
                        }
                    } else {
                        exitWithError("Unexpected testType: " + testType);
                    }
                } // prioritization techinque, figure 17
                else if (techniqueName.equals("prioritization")) {
                    // if orderName is original, run time for entire test suite
                    String apfd_value_string = parseFile(file, Constants.APFD_VALUE);
                    double apfd_value = Double.parseDouble(apfd_value_string);
                    String order_time_string = parseFile(file, Constants.ORDER_TIME);
                    double order_time = Double.parseDouble(order_time_string);
                    String testStr =
                            getNextLine(file, Constants.ORDER_TIME + " " + order_time, Constants.TEST_ORDER_LIST);
                    testStr = testStr.substring(1, testStr.length() - 2);
                    String[] test_list = testStr.split(", ");

                    if (orderName.equals("original")) {
                        currProj.setOrigTimeValue(order_time);
                        currProj.setOrigAPFDValue(apfd_value);
                        if (timeInFile != null && coverageInFile != null) {
                            currProj.setOrig_time(strArrayToDoubleArray(getRidSquareBrackets(timeInFile)));
                            currProj.setOrig_coverage(strArrayToDoubleArray(getRidSquareBrackets(coverageInFile)));
                        }
                        currProj.setOrig_tests(test_list);
                        continue;
                    }
                    currProj.useFig17();
                    double[] fig17_array = currProj.get_fig17_values();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) { // orig, unenhanced
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig17_array[0] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 0, numTotal, false);
                                setTime(currProj, 17, timeInFile, 0, false);
                                currProj.setTestList(17, 0, test_list, false);
                            } else if (orderName.equals("relative")) { // relative
                                // T4
                                fig17_array[2] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 2, numTotal, false);
                                setTime(currProj, 17, timeInFile, 2, false);
                                currProj.setTestList(17, 2, test_list, false);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig17_array[4] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 4, numTotal, false);
                                setTime(currProj, 17, timeInFile, 4, false);
                                currProj.setTestList(17, 4, test_list, false);
                            } else if (orderName.equals("relative")) { // relative
                                // T7
                                fig17_array[6] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 6, numTotal, false);
                                setTime(currProj, 17, timeInFile, 6, false);
                                currProj.setTestList(17, 6, test_list, false);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else {
                            exitWithError("Unexpected coverageName: " + coverageName);
                        }
                    } else if (testType.equals("auto")) { // auto, enhanced, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig17_array[1] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 0, numTotal, true);
                                setTime(currProj, 17, timeInFile, 0, true);
                                currProj.setTestList(17, 0, test_list, true);
                            } else if (orderName.equals("relative")) {
                                // T4
                                fig17_array[3] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 2, numTotal, true);
                                setTime(currProj, 17, timeInFile, 2, true);
                                currProj.setTestList(17, 2, test_list, true);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig17_array[5] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 4, numTotal, true);
                                setTime(currProj, 17, timeInFile, 4, true);
                                currProj.setTestList(17, 4, test_list, true);
                            } else if (orderName.equals("relative")) {
                                // T7
                                fig17_array[7] = apfd_value;
                                currProj.setNumTotalDependentTests(17, 6, numTotal, true);
                                setTime(currProj, 17, timeInFile, 6, true);
                                currProj.setTestList(17, 6, test_list, true);
                            } else {
                                exitWithError("Unexpected order: " + orderName);
                            }
                        } else {
                            exitWithError("Unexpected coverageName: " + coverageName);
                        }
                    } else {
                        exitWithError("Unexpected testType: " + testType);
                    }
                } else {
                    exitWithError("Unexpected techniqueName: " + techniqueName);
                }
            }
        }

        PercentWrapper percentRuntime = new PercentWrapper();

        // generate LaTeX for the human-written and automatic test suites
        String origLatexString = generateLatexString(proj_orig_arrayList, proj_auto_arrayList, "orig", percentRuntime);
        String autoLatexString = generateLatexString(proj_auto_arrayList, proj_orig_arrayList, "auto", percentRuntime);

        origLatexString += "\n%Percent increase compared to unenhanced (including orig and auto): "
                + formatPercent(percentRuntime.percent);
        origLatexString += "\n%Number of comparisons (including orig and auto): " + percentRuntime.numPercents;
        autoLatexString += "\n%Percent increase compared to unenhanced (including orig and auto): "
                + formatPercent(percentRuntime.percent);
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

    private static class PercentWrapper {
        public double percent;
        public int numPercents;

        public PercentWrapper() {
            percent = 0.0;
            numPercents = 0;
        }
    }

    private static List<String> getRidSquareBrackets(String line) {
        String lineNoBrackets = line.substring(1, line.length() - 1);
        String[] elements = lineNoBrackets.split(",");
        return Arrays.asList(elements);
    }

    private static Double[] strArrayToDoubleArray(List<String> strArr) {
        Double[] doubleArr = new Double[strArr.size()];
        for (int i = 0; i < strArr.size(); i++) {
            doubleArr[i] = Double.valueOf(strArr.get(i));
        }
        return doubleArr;
    }

    private static void setTime(ProjectEnhancedResults currProj, int figNum, String timeInFile, int indexOfProj,
            boolean isEnhanced) {
        // Get time and coverage information for this configuration
        if (timeInFile != null) {
            currProj.setTimeInfo(figNum, indexOfProj, strArrayToDoubleArray(getRidSquareBrackets(timeInFile)),
                    isEnhanced);
        }
    }
}
