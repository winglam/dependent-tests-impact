package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ResultsParser {

    // name of line to get values from in Parallelization technique
    public static final String ORDER_TIME = "New order time:";
    // name of line to get values from in selection and prioritization
    public static final String APFD_VALUE = "APFD value:";

    /*
     * A private method to search a file for a keyword and return the value that follows
     * that keyword
     *
     * @return the data value without any leading or trailing whitespaces
     */
    private static String parseFile(File file, String keyword) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String currLine = scanner.nextLine();
            // lineNum++;
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
        for (double val : values) {
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
        for (double percent : percentages) {
            result += " & " + percent + "\\%\\pa"; // "\%\pa"
        }
        for (double val : values) {
            result += " & " + val;
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        String directoryName = getArgName(argsList, "-directory");

        // open files with LaTeX template for figures 17, 18, and 19
        // TODO *****************

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isFile()) {
                // do something with the file here
                // figure out how to generate the LaTeX needed for the
                // diagrams...see Constants.java

                // parseFile returns String of form ", prioritization, [...]"
                // parseArgs returns "prioritization"

                String techniqueName = parseFile(file, "-technique");
                techniqueName = parseArgs(techniqueName);

                String coverageName = parseFile(file, "-coverage");
                coverageName = parseArgs(coverageName);

                String orderName = parseFile(file, "-order");
                orderName = parseArgs(orderName);

                String projectName = parseFile(file, "-project");
                projectName = parseArgs(projectName);

                String testType = parseFile(file, "-testType");
                testType = parseArgs(testType);

                if (techniqueName.equals("parallelization")) {
                    String order_time = parseFile(file, ORDER_TIME);

                } else if (techniqueName.equals("selection")) { // selection techinque
                    String apfd_value = parseFile(file, APFD_VALUE);

                } else { // has to be prioritization or garbage value

                }

            }
        }

        // write to output file
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

