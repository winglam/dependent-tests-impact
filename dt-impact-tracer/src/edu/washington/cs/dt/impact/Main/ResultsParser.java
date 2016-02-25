package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class project {
    private String name;

    /*
     * fig**[i] corresponds to orig value
     * fig**[i+1] corresponds to new value
     * where i=0, i+=2
     * so when doing calculations, do data = fig**[i] - fig**[i+1]
     */
    // corresponds to T3, T4, T5, and T7 respectively
    private double[] fig17_values;
    // corresponds to S1, S2, S3, S4, S5, and S6 respectively
    private double[] fig18_values;
    // corresponds to S1--S3 and S4--S6
    private double[] fig18_percents;

    private boolean uses_fig17;
    private boolean uses_fig18;

    public project(String projName) {
        name = projName;
        fig17_values = new double[4 * 2];
        fig18_values = new double[6 * 2];
        fig18_percents = new double[2 * 2];
        uses_fig17 = false;
        uses_fig18 = false;
    }

    public boolean isFig17() {
        return uses_fig17;
    }

    public boolean isFig18() {
        return uses_fig18;
    }

    public void useFig17() {
        uses_fig17 = true;
    }

    public void useFig18() {
        uses_fig18 = true;
    }

    public String getName() {
        return name;
    }

    public double[] get_fig17_values() {
        return fig17_values;
    }

    public double[] get_fig18_values() {
        return fig18_values;
    }

    public double[] get_fig18_percents() {
        return fig18_percents;
    }
}

public class ResultsParser {

    // name of line to get values from in Parallelization technique
    public static final String ORDER_TIME = "New order time:";
    // name of line to get values from in selection and prioritization
    public static final String APFD_VALUE = "APFD value:";

    /*
     * A private method to search a file for a keyword and return the value that follows
     * that keyword
     *
     * @return the data value without any leading or trailing whitespaces, null if keyword not found
     */
    private static String parseFile(File file, String keyword) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
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
        scanner.close();
        return null; // none of the lines contained the keyword
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
            flagName = argsList.get(nameIndex).toLowerCase().trim();
        } else {
            System.err
                    .println("No" + flag + " argument is specified." + " Please use the format: " + flag + " flagName");
            System.exit(0);
        }
        return flagName;
    }

    /*
     * @param line will be a String of form ", prioritization, [...]"
     *
     * @return line without the commas and whitespace, i.e. "prioritization"
     */
    private static String parseArgs(String line) {
        // line == null only if this flag was not found
        if (line == null) {
            return null;
        }
        int delimiterIndex = line.indexOf(",", 1);
        // -1 if last argument..takes on form: "-testType, orig]"
        if (delimiterIndex == -1) {
            delimiterIndex = line.indexOf("]");
        }
        return line.substring(1, delimiterIndex).trim();

    }

    /*
     * a private method to generate a line of LaTeX needed for figure 17
     *
     * @param projectName the name of the project
     *
     * @param values the ordered values that need to be written
     *
     *
     * format: Crystal & 0.026 & 0.001 & 0.000 & 0.000 \\
     */
    private static String generate17(String projectName, double[] values) {
        String result = projectName;
        /*
         * for (double val : values) {
         * result += " & " + val;
         * }
         */
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val = values[i] - values[i + 1];
            result += " & " + val;
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
     * format: Crystal & 5.4\%\pa & 1.3\%\pa & 0.000 & 0.000 & 0.008 & 0.015 & 0.036 & 0.000 \\
     */
    private static String generate18(String projectName, double[] percentages, double[] values) {
        String result = projectName + "       ";
        /*
         * for (double percent : percentages) {
         * result += " & " + percent + "\\%\\pa"; // "\%\pa"
         * }
         * for (double val : values) {
         * result += " & " + val;
         * }
         */

        for (int i = 0; i + 1 < percentages.length; i += 2) {
            double percent = percentages[i] - percentages[i + 1];
            result += " & " + percent + "\\%\\pa"; // "\%\pa"
        }
        for (int i = 0; i + 1 < values.length; i += 2) {
            double val = values[i] - values[i + 1];
            result += " & " + val;
        }
        result += " \\\\"; // "\\"
        return result;
    }
    /*
     * a private method that searches a List<project> objects for the project that matches projName
     *
     * @return -1 if no match found, otherwise index of the project with projName
     */

    private static int indexOfByName(List<project> projList, String projName) {
        int index = 0;
        for (project temp : projList) {
            if (temp.getName().equals(projName)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        String directoryName = getArgName(argsList, "-directory");

        // open files with LaTeX template for figures 17, 18, and 19
        // TODO *****************
        /*
         * 17: prioritization
         * 18: selection
         * 19: parallelizaiton
         */

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        // create a list of project Objects that each have a diff project name
        int size = 5;
        List<project> proj_human_arrayList = new ArrayList<project>(size);
        List<project> proj_auto_arrayList = new ArrayList<project>(size);

        for (File file : fList) {
            if (file.isFile()) {
                // do something with the file here
                // figure out how to generate the LaTeX needed for the
                // diagrams...see Constants.java

                // parseFile returns String of form ", prioritization, [...]"
                // parseArgs returns "prioritization"

                String techniqueName = parseFile(file, "-technique");
                if (techniqueName != null) {
                    techniqueName = parseArgs(techniqueName);
                }

                String coverageName = parseFile(file, "-coverage");
                if (coverageName != null) {
                    coverageName = parseArgs(coverageName);
                }

                String orderName = parseFile(file, "-order");
                if (orderName != null) {
                    orderName = parseArgs(orderName);
                }

                String projectName = parseFile(file, "-project");
                if (projectName != null) {
                    projectName = parseArgs(projectName);
                }

                String testType = parseFile(file, "-testType");
                if (testType != null) {
                    testType = parseArgs(testType);
                }

                String resolveDependences = parseFile(file, "-resolveDependences");
                if (resolveDependences != null) {
                    resolveDependences = parseArgs(resolveDependences);
                    // resolveDependences will be null if flag not found in file
                }

                // see if List needs to orig or auto generated one
                List<project> currProjList = null;
                if (testType.equals("auto")) {
                    currProjList = proj_auto_arrayList;
                } else if (testType.equals("orig")) {
                    currProjList = proj_human_arrayList;
                }

                // index of this project in the arrayList, might be -1 if not found
                int indexOfProj = indexOfByName(currProjList, projectName);

                // project Object that corresponds to the current project name in this file
                project currProj = null;

                if (indexOfProj != -1) {
                    currProj = currProjList.get(indexOfProj);
                } else {// projectName not seen before

                    currProj = new project(projectName);
                    currProjList.add(currProj);
                }

                // TODO: get the data for all the diff techniques and store in project class arrays

                if (techniqueName.equals("parallelization")) {
                    String order_time = parseFile(file, ORDER_TIME);

                } // selection technique
                else if (techniqueName.equals("selection")) {
                    String apfd_value = parseFile(file, APFD_VALUE);
                    currProj.useFig18();
                    double[] fig18_values_array = currProj.get_fig18_values();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) { // original
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig18_values_array[0] = Double.parseDouble(apfd_value);
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig18_values_array[2] = Double.parseDouble(apfd_value);
                            } else {
                                // S3
                                fig18_values_array[4] = Double.parseDouble(apfd_value);
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig18_values_array[6] = Double.parseDouble(apfd_value);

                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig18_values_array[8] = Double.parseDouble(apfd_value);
                            } else {
                                // S6
                                fig18_values_array[10] = Double.parseDouble(apfd_value);
                            }
                        }

                    } else { // auto, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig18_values_array[1] = Double.parseDouble(apfd_value);
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig18_values_array[3] = Double.parseDouble(apfd_value);
                            } else {
                                // S3
                                fig18_values_array[5] = Double.parseDouble(apfd_value);
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig18_values_array[7] = Double.parseDouble(apfd_value);

                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig18_values_array[9] = Double.parseDouble(apfd_value);
                            } else {
                                // S6
                                fig18_values_array[11] = Double.parseDouble(apfd_value);
                            }
                        }
                    }

                } // prioritization techinque
                else if (techniqueName.equals("prioritization")) {
                    String apfd_value = parseFile(file, APFD_VALUE);
                    currProj.useFig17();
                    double[] fig17_array = currProj.get_fig17_values();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) {
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig17_array[0] = Double.parseDouble(apfd_value);
                            } else {
                                // T4
                                fig17_array[2] = Double.parseDouble(apfd_value);
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig17_array[4] = Double.parseDouble(apfd_value);

                            } else {
                                // T7
                                fig17_array[6] = Double.parseDouble(apfd_value);
                            }
                        }

                    } else { // auto, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig17_array[1] = Double.parseDouble(apfd_value);
                            } else {
                                // T4
                                fig17_array[3] = Double.parseDouble(apfd_value);
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig17_array[5] = Double.parseDouble(apfd_value);

                            } else {
                                // T7
                                fig17_array[7] = Double.parseDouble(apfd_value);
                            }
                        }

                    }

                } else {// garbage value...return error

                }

            }
        }

        // for every project name in the arrayList, generate strings
        /*
         * TODO: make sure generate17() and generate18() are getting values correctly
         * actual data value in LaTeX graph = fig**[i] - fig**[i + 1]
         * where i = 0, i+=2
         */
        // generate LaTeX for the human-written test suites
        String latex17_human = "";
        String latex18_human = "";
        for (project temp : proj_human_arrayList) {
            if (temp.isFig17()) {
                latex17_human += generate17(temp.getName(), temp.get_fig17_values());
                latex17_human += '\n';
            }
            if (temp.isFig18()) {
                latex18_human += generate18(temp.getName(), temp.get_fig18_percents(), temp.get_fig18_values());
                latex18_human += '\n';
            }

        }
        // latex17_human = latex17_human.substring(0, latex17_human.length() - 1);
        // latex18_human = latex18_human.substring(0, latex18_human.length() - 1);

        // generate LaTeX for the automatically-generated test suites
        String latex17_auto = "";
        String latex18_auto = "";
        for (project temp : proj_auto_arrayList) {
            if (temp.isFig17()) {
                latex17_auto += generate17(temp.getName(), temp.get_fig17_values());
                latex17_auto += '\n';
            }
            if (temp.isFig18()) {
                latex18_auto += generate18(temp.getName(), temp.get_fig18_percents(), temp.get_fig18_values());
                latex18_auto += '\n';
            }

        }
        // latex17_auto = latex17_auto.substring(0, latex17_auto.length() - 1);
        // latex18_auto = latex18_auto.substring(0, latex18_auto.length() - 1);

        // TODO: write to output file
    }

}

/*
 * template for LaTeX generation for figure 17
 * Crystal & 0.026 & 0.001 & 0.000 & 0.000 \\
 *
 * for figure 18
 * Crystal & 5.4\%\pa & 1.3\%\pa & 0.000 & 0.000 & 0.008 & 0.015 & 0.036 & 0.000 \\
 */

// The tables needed to be generated and the type of args they require

/*
 * T3 will correspond to the file name PRIORITIZATION-ORIG-CRYSTAL-STATEMENT-ABSOLUTE-CONTAINS_DT-OMITTED_TD.
 * T4 will correspond to the file name PRIORITIZATION-ORIG-CRYSTAL-STATEMENT-RELATIVE-CONTAINS_DT-OMITTED_TD.
 */

/*
 * T3 Prioritize on coverage of statements
 * T4 Prioritize on coverage of statements not yet covered
 * T5 Prioritize on coverage of functions
 * T7 Prioritize on coverage of functions not yet covered
 *
 * S1 Statement Test id (no re-ordering)
 * S2 Statement Number of elements tests cover
 * S3 Statement Number of uncovered elements tests cover
 * S4 Function Test id (no re-ordering)
 * S5 Function Number of elements tests cover
 * S6 Function Number of uncovered elements tests cover
 */

