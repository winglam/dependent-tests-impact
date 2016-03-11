package edu.washington.cs.dt.impact.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import edu.washington.cs.dt.impact.data.Project;

public class ResultsParser {

    // name of line to get values from in Parallelization technique
    public static final String ORDER_TIME = "Execution time for executing the following testing order:";
    // name of line to get values from in selection and prioritization
    public static final String APFD_VALUE = "APFD value:";
    private static final DecimalFormat apfdFormat = new DecimalFormat("0.000");
    private static final DecimalFormat timeFormat = new DecimalFormat("0.00");
    private static final DecimalFormat percentFormat = new DecimalFormat("0.0");

    /*
     * A private method to search a file for a keyword and return the value that follows
     * that keyword
     *
     * @return the data value without any leading or trailing whitespaces, null if keyword not found
     */
    private static String parseFile(File file, String keyword) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(keyword)) {
                    // gets numeric value of data
                    String data = currLine.substring(keyword.length(), currLine.length());
                    scanner.close(); // close Scanner before returning
                    // trim away any whitespaces leading or after the data value
                    return data.trim();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } finally {
            scanner.close();
        }

        return null; // none of the lines contained the keyword

    }
    /*
     * a private method that gets the line with all the flags in the file
     * that line starts with "-technique"
     */

    private static String getFlagsLine(File file) {
        Scanner scanner = null;
        String keyword = "-technique";
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(keyword)) {
                    scanner.close(); // close Scanner before returning
                    return currLine;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } finally {
            scanner.close();
        }

        return null; // none of the lines contained the keyword -technique
    }

    /*
     * A private method that returns the name of the argument specified by the flag
     *
     * @return the name of the argument corresponding to flag
     */
    private static String getArgName(List<String> argsList, String flag) {
        String flagName = null;
        int index = argsList.indexOf(flag);
        if (index != -1) {
            int nameIndex = index + 1;
            if (nameIndex >= argsList.size()) {
                System.err.println(flag + " argument is specified but flagName is not." + " Please use the format: "
                        + flag + " flagName");
                System.exit(0);
            }
            flagName = argsList.get(nameIndex);
        } else {
            System.err
                    .println("No" + flag + " argument is specified." + " Please use the format: " + flag + " flagName");
            System.exit(0);
        }
        return flagName;
    }

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
    private static String generate17(String projectName, double[] values) {
        String result = projectName;
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val = values[i] - values[i + 1];
            if (val < 0.0) {
                val = 0.0;
            }
            result += " & " + apfdFormat.format(val);
        }
        result += " \\\\"; // "\\"
        return result;
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
    private static String generate18(String projectName, double[] percentages, double[] values, double orig_value,
            String type) {
        String result = projectName + "       ";
        for (int i = 0; i + 5 < percentages.length; i += 6) {
            // calc1,2,3 correspond to either S1,S2,S3 or S4,S5,S6
            // enhanced - unenhanced
            double calc1 = (percentages[i + 1] - percentages[i]) / orig_value * 100;
            double calc2 = (percentages[i + 3] - percentages[i + 2]) / orig_value * 100;
            double calc3 = (percentages[i + 5] - percentages[i + 4]) / orig_value * 100;
            // the max. of these 3 values
            double percent = Math.max(calc1, Math.max(calc2, calc3));
            // if negative, ensure it's 0
            percent = Math.max(0, percent);
            if (percent < 0.0) {
                percent = 0.0;
            }
            if (projectName.equals("crystal") && type.equals("auto")) {
                result += " & " + percentFormat.format(percent) + "\\%\\ra"; // "\%\ra"
            } else {
                result += " & " + percentFormat.format(percent) + "\\%\\pa"; // "\%\pa"
            }
        }
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val = values[i] - values[i + 1];
            if (val < 0.0) {
                val = 0.0;
            }
            result += " & " + apfdFormat.format(val);
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /*
     * a private method that generates Figure 19
     */
    private static String generate19(String projectName, double[] orig_values, double[] time_values,
            double orig_value) {
        String result = projectName;
        double calc1 = 0;
        double calc2 = 0;
        for (int i = 0; i + 2 < orig_values.length; i += 2) {
            calc1 = (orig_values[i] / orig_value) * 100;
            calc2 = (orig_values[i + 1] / orig_value) * 100;
            result += " & " + timeFormat.format(calc1) + " &\\rightarrow$ " + timeFormat.format(calc2);
        }
        for (int i = 0; i + 2 < time_values.length; i += 2) {
            calc1 = (time_values[i] / orig_value) * 100;
            calc2 = (time_values[i + 1] / orig_value) * 100;
            result += " & " + timeFormat.format(calc1) + " &\\rightarrow$ " + timeFormat.format(calc2);
        }
        result += "\\\\";

        return result;
    }

    /*
     * a private method that searches a List<Project> objects for the project that matches projName
     *
     * @return -1 if no match found, otherwise index of the project with projName
     */

    private static int indexOfByName(List<Project> projList, String projName) {
        int index = 0;
        for (Project temp : projList) {
            if (temp.getName().equals(projName)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    /*
     * a private method to generate the LaTeX format of the data of each Project in projList
     *
     * @param projList a list of Projects that each contain data
     */

    private static String generateLatexString(List<Project> projList, List<Project> otherProjList, String type) {
        String latexString = "";

        int index = 0;
        for (Project temp : projList) {
            // get the correct orig_value...one of the Lists will not have the correct value (will be 0)

            if (temp.isFig17()) {
                latexString += generate17(temp.getName(), temp.get_fig17_values());
                latexString += "\r\n";
            } else if (temp.isFig18()) {
                double orig_value =
                        (temp.getOrigValue() == 0) ? otherProjList.get(index).getOrigValue() : temp.getOrigValue();
                latexString += generate18(temp.getName(), temp.get_fig18_percents(), temp.get_fig18_values(),
                        orig_value, type);
                latexString += "\r\n";
            } else if (temp.isFig19()) {
                double orig_value =
                        (temp.getOrigValue() == 0) ? otherProjList.get(index).getOrigValue() : temp.getOrigValue();
                latexString += generate19(temp.getName(), temp.get_fig19_orig(), temp.get_fig19_time(), orig_value);
                latexString += "\r\n";
            }
            index++;
        }
        // take off the "\r\n" from the last line
        return latexString;
    }
    /*
     * a private method that writes to the output file specified using the given latex string
     *
     */

    private static void writeToLatexFile(String latex, String outputFileName) {
        try {
            File outputFile = new File(outputFileName);
            FileWriter writer = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(latex);
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        String directoryName = getArgName(argsList, "-directory");
        // name of directory where files should be outputted
        String outputDirectoryName = getArgName(argsList, "-outputDirectory");

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
                String flagsInFile = getFlagsLine(file);
                // get rid of square brackets
                flagsInFile = flagsInFile.substring(1, flagsInFile.length() - 1);
                String[] flags = flagsInFile.split(",");
                List<String> flagsList = Arrays.asList(flags);
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
                Project currProj = null;

                if (indexOfProj != -1) {
                    currProj = currProjList.get(indexOfProj);
                } else {// projectName not seen before

                    currProj = new Project(projectName);
                    currProjList.add(currProj);
                }

                // parallelization technique, figure 19
                if (techniqueName.equals("parallelization")) {
                    String order_time_string = parseFile(file, ORDER_TIME);
                    double order_time = Double.parseDouble(order_time_string);
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
                    } else { // orderName == time
                        curr_fig19_array = currProj.get_fig19_time();
                    }

                    if (resolveDependences == null) { // non-enhanced
                        if (numMachines == 2) {
                            curr_fig19_array[0] = order_time;
                        } else if (numMachines == 4) {
                            curr_fig19_array[2] = order_time;
                        } else if (numMachines == 8) {
                            curr_fig19_array[4] = order_time;
                        } else if (numMachines == 16) {
                            curr_fig19_array[6] = order_time;
                        }
                    } else // enhanced
                    {
                        if (numMachines == 2) {
                            curr_fig19_array[1] = order_time;
                        } else if (numMachines == 4) {
                            curr_fig19_array[3] = order_time;
                        } else if (numMachines == 8) {
                            curr_fig19_array[5] = order_time;
                        } else if (numMachines == 16) {
                            curr_fig19_array[7] = order_time;
                        }
                    }

                } // selection technique, figure 18
                else if (techniqueName.equals("selection")) {

                    String apfd_value_string = parseFile(file, APFD_VALUE);
                    double apfd_value = Double.parseDouble(apfd_value_string);
                    String order_time_string = parseFile(file, ORDER_TIME);
                    double order_time = Double.parseDouble(order_time_string);
                    currProj.useFig18();
                    double[] fig18_values_array = currProj.get_fig18_values();
                    double[] fig18_percents_array = currProj.get_fig18_percents();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) { // original
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig18_values_array[0] = apfd_value;
                                fig18_percents_array[0] = order_time;
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig18_values_array[2] = apfd_value;
                                fig18_percents_array[2] = order_time;
                            } else {
                                // S3
                                fig18_values_array[4] = apfd_value;
                                fig18_percents_array[4] = order_time;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig18_values_array[6] = apfd_value;
                                fig18_percents_array[6] = order_time;

                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig18_values_array[8] = apfd_value;
                                fig18_percents_array[8] = order_time;
                            } else {
                                // S6
                                fig18_values_array[10] = apfd_value;
                                fig18_percents_array[10] = order_time;
                            }
                        }

                    } else { // auto, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig18_values_array[1] = apfd_value;
                                fig18_percents_array[1] = order_time;
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig18_values_array[3] = apfd_value;
                                fig18_percents_array[3] = order_time;
                            } else {
                                // S3
                                fig18_values_array[5] = apfd_value;
                                fig18_percents_array[5] = order_time;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig18_values_array[7] = apfd_value;
                                fig18_percents_array[7] = order_time;

                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig18_values_array[9] = apfd_value;
                                fig18_percents_array[9] = order_time;
                            } else {
                                // S6
                                fig18_values_array[11] = apfd_value;
                                fig18_percents_array[11] = order_time;
                            }
                        }
                    }

                } // prioritization techinque, figure 17
                else if (techniqueName.equals("prioritization")) {
                    // if orderName is original, run time for entire test suite
                    if (orderName.equals("original")) {
                        String order_time_string = parseFile(file, ORDER_TIME);
                        double order_time = Double.parseDouble(order_time_string);
                        currProj.setOrigValue(order_time);
                        continue;
                    }
                    String apfd_value_string = parseFile(file, APFD_VALUE);
                    double apfd_value = Double.parseDouble(apfd_value_string);
                    currProj.useFig17();
                    double[] fig17_array = currProj.get_fig17_values();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) {
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig17_array[0] = apfd_value;
                            } else { // relative
                                // T4
                                fig17_array[2] = apfd_value;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig17_array[4] = apfd_value;

                            } else { // relative
                                // T7
                                fig17_array[6] = apfd_value;
                            }
                        }

                    } else { // auto, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig17_array[1] = apfd_value;
                            } else {
                                // T4
                                fig17_array[3] = apfd_value;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig17_array[5] = apfd_value;

                            } else {
                                // T7
                                fig17_array[7] = apfd_value;
                            }
                        }

                    }

                } else {// garbage value...return error
                    // TODO throw an exception and exit
                }

            }
        }

        // generate LaTeX for the human-written and automatic test suites
        String origLatexString = generateLatexString(proj_orig_arrayList, proj_auto_arrayList, "orig");
        String autoLatexString = generateLatexString(proj_auto_arrayList, proj_orig_arrayList, "auto");

        String origOutputFilename = outputDirectoryName + System.getProperty("file.separator");
        String autoOutputFilename = outputDirectoryName + System.getProperty("file.separator");
        if (proj_orig_arrayList.get(0).isFig17()) {
            origOutputFilename += "enhanced-prior-orig-results.tex";
            autoOutputFilename += "enhanced-prior-auto-results.tex";
        } else if (proj_orig_arrayList.get(0).isFig18()) {
            origOutputFilename += "enhanced-sele-orig-results.tex";
            autoOutputFilename += "enhanced-sele-auto-results.tex";
        } else { // fig 19
            origOutputFilename += "enhanced-para-orig-results.tex";
            autoOutputFilename += "enhanced-para-auto-results.tex";
        }

        writeToLatexFile(origLatexString, origOutputFilename);
        writeToLatexFile(autoLatexString, autoOutputFilename);

    }
}
