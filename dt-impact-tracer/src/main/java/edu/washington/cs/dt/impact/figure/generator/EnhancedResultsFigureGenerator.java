
package edu.washington.cs.dt.impact.figure.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.impact.data.GeometricMeanData;
import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.data.ProjectEnhancedResults;
import edu.washington.cs.dt.impact.runner.Runner;
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
        double[] values = project.get_fig_values(17);
        String result = project.getName();
        List<Double> origTime = Arrays.asList(project.getOrig_time());
        List<Double> origCoverage = Arrays.asList(project.getOrig_coverage());

        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val;

            if (!project.get_fig_NumOfDTs(true, i, 17)) {
                // Case A
                // Enhanced - unenhanced
                val = values[i + 1] - values[i];
            } else if (project.get_fig_NumOfDTs(true, i, 17) && project.get_fig_NumOfDTs(false, i, 17)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // Shift_by_enhanced’s_time(orig) - shift_by_unsound’s_time(orig)
                val = shift_by_time(project.get_fig_Time(false, i, 17), origTime, origCoverage)
                        - shift_by_time(project.get_fig_Time(true, i, 17), origTime,
                                        origCoverage);
            } else {
                // Case C
                // Enhanced - shift_by_unsound’s_time(orig)
                val = values[i + 1] - shift_by_time(project.get_fig_Time(true, i, 17),
                                                    origTime, origCoverage);
            }
            if (!allowNegatives && val < 0.0) {
                val = 0.0;
            }
            if (i == 0) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.STATEMENT));            	
            } else if (i == 2) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.STATEMENT));
            } else if (i == 4) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.ABSOLUTE, Constants.COVERAGE.FUNCTION));
            } else if (i == 6) {
                fig17Data.add(new GeometricMeanData(i, val, null, Constants.ORDER.RELATIVE, Constants.COVERAGE.FUNCTION));
            }

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
        double[] values = project.get_fig_values(18);
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
            if (!project.get_fig_NumOfDTs(true, i, 18)) {
                // Case A
                // 1 - Enh / (uns)
                percent = 1 - (time[i + 1] / time[i]);
            } else if (project.get_fig_NumOfDTs(true, i, 18) && project.get_fig_NumOfDTs(false, i, 18)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(false, i, 18), origTestList))));
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 18), origTestList))));
                percent = 1 - ((time[i + 1] + enOrigTimeVal) / (time[i] + unenOrigTimeVal));
            } else {
                // Case C
                // 1 - Enh / (uns + orig)
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 18), origTestList))));
                percent = 1 - (time[i + 1] / (time[i] + unenOrigTimeVal));
            }
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

            if (!project.get_fig_NumOfDTs(true, i, 18)) {
                // Case A
                // Enhanced - unenhanced
                val = values[i + 1] - values[i];
            } else if (project.get_fig_NumOfDTs(true, i, 18) && project.get_fig_NumOfDTs(false, i, 18)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // Shift_by_enhanced’s_time(orig) - shift_by_unsound’s_time(orig)
                int unenIndex = getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 18),
                                                              origTestList);
                int enIndex = getHighestIndexInOrigTestList(project.get_fig_TestList(false, i, 18),
                                                            origTestList);

                val = shift_by_time(project.get_fig_Time(false, i, 18),
                                    new ArrayList<Double>(origTime.subList(0,enIndex)),
                        new ArrayList<Double>(origCoverage.subList(0, enIndex)))
                        - shift_by_time(project.get_fig_Time(true, i, 18),
                                new ArrayList<Double>(origTime.subList(0, unenIndex)),
                                new ArrayList<Double>(origCoverage.subList(0, unenIndex)));
            } else {
                // Case C
                // Enhanced - shift_by_unsound’s_time(orig)
                int index = getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 18), origTestList);

                val = values[i + 1] - shift_by_time(project.get_fig_Time(true, i, 18),
                        new ArrayList<Double>(origTime.subList(0, index)),
                        new ArrayList<Double>(origCoverage.subList(0, index)));
            }
            if (!allowNegatives && val < 0.0) {
                val = 0.0;
            }

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
        List<Double> origTime = Arrays.asList(project.getOrig_time());
        List<String> origTestList = Arrays.asList(project.getOrig_tests());

        // ORIGINAL ORDER
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= orig_values.length; i += 2) {
            // enhanced
            enhancedParaSpeedup = orig_values[i + 1];
            unenhancedPara = orig_values[i];
            if (!project.get_fig19_NumOfDTs_orig_unen(i)) {
                // Case A
                // 1 - Enh / (uns)
                diffBetweenEnhancedUnenhanced = 1 - (enhancedParaSpeedup / unenhancedPara);
            } else if (project.get_fig19_NumOfDTs_orig_unen(i) && project.get_fig19_NumOfDTs_orig_en(i)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(false, i, 19, true),
                                                                               origTestList))));
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 19, true), origTestList))));
                diffBetweenEnhancedUnenhanced =
                        1 - ((enhancedParaSpeedup + enOrigTimeVal) / (unenhancedPara + unenOrigTimeVal));
            } else {
                // orig
                // Case C
                // 1 - Enh / (uns + orig)
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 19, true),
                                                      origTestList))));
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
                    Constants.ORDER.ORIGINAL, null));
            fig19GeoData.add(new GeometricMeanData(getK(i), unenhancedPara, Constants.TD_SETTING.GIVEN_TD,
                    Constants.ORDER.ORIGINAL, null));
            fig19GeoData.add(new GeometricMeanData(i, diffBetweenEnhancedUnenhanced, null, Constants.ORDER.ORIGINAL, null));
        }

        // TIME ORDER
        // i represents unenhanced, i + 1 represents enhanced
        for (int i = 0; i + 2 <= time_values.length; i += 2) {
            enhancedParaSpeedup = time_values[i + 1];
            unenhancedPara = time_values[i];
            if (!project.get_fig19_NumOfDTs_time_unen(i)) {
                // Case A
                // 1 - Enh / (uns)
                diffBetweenEnhancedUnenhanced = 1 - (enhancedParaSpeedup / unenhancedPara);
            } else if (project.get_fig19_NumOfDTs_time_unen(i) && project.get_fig19_NumOfDTs_time_en(i)) {
                // } else if (project.getName().equals(Constants.CRYSTAL_NAME) && type.equals("auto") && i != 0 && i !=
                // 6) {
                // Case B
                // 1 - (Enh + orig) / (uns + orig)
                double enOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(false, i, 19, false), origTestList))));
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 19, false),
                                                                               origTestList))));
                diffBetweenEnhancedUnenhanced =
                        1 - ((enhancedParaSpeedup + enOrigTimeVal) / (unenhancedPara + unenOrigTimeVal));
            } else {
                // orig
                // Case C
                // 1 - Enh / (uns + orig)
                double unenOrigTimeVal = listToTime(new ArrayList<Double>(origTime.subList(0,
                        getHighestIndexInOrigTestList(project.get_fig_TestList(true, i, 19, false),
                                                                               origTestList))));
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
                    Constants.ORDER.TIME, null));
            fig19GeoData.add(new GeometricMeanData(getK(i), unenhancedPara, Constants.TD_SETTING.GIVEN_TD,
                    Constants.ORDER.TIME, null));
            fig19GeoData.add(new GeometricMeanData(i, diffBetweenEnhancedUnenhanced, null, Constants.ORDER.TIME, null));
        }
        result += "\\\\";
        return result;
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
       	
        	latexString += addGeoString(geometricMeans, null);
        	
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

            latexString += addGeoString(geometricMeansAPFD, geometricMeansTime);
        	
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
    		
    		Set<Double> currVals = covOrderToVals.get(key);
    		if (currVals == null) {
    			currVals = new HashSet<>();
    			covOrderToVals.put(key, currVals);
    		}
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

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        allowNegatives = argsList.contains("-allowNegatives");

        String directoryName = mustGetArgName(argsList, "-directory");
        // name of directory where files should be outputted
        outputDirectoryName = mustGetArgName(argsList, "-outputDirectory");

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        // create a list of project Objects that each have a diff project name
        List<Project> proj_orig_arrayList = new ArrayList<Project>();
        List<Project> proj_auto_arrayList = new ArrayList<Project>();

        // Call super's parse file method and let it parse the files for information and
        // then call doParaCalculations, doSeleCalculations, or doPrioCalculations for each file
        parseFiles(fList, new EnhancedResultsFigureGenerator(), true, proj_orig_arrayList, proj_auto_arrayList);

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
        boolean isEnhanced = resolveDependences == null;

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
        boolean isEnhanced = resolveDependences == null;

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
        fig18_values_array[index] = apfd_value;
        fig18_time_array[index] = order_time;
        currProj.setNumTotalDependentTests(18, index, numTotal);
        setTime(currProj, 18, timeInFile, index);
        currProj.setTestList(18, index, test_list);
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
        boolean isEnhanced = resolveDependences == null;

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
        fig17_array[index] = apfd_value;
        currProj.setNumTotalDependentTests(17, index, numTotal);
        setTime(currProj, 17, timeInFile, index);
        currProj.setTestList(17, index, test_list);
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
