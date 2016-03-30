
package edu.washington.cs.dt.impact.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import edu.washington.cs.dt.impact.data.GeometricMeanData;
import edu.washington.cs.dt.impact.data.Project789;
import edu.washington.cs.dt.impact.util.Constants;

public class dependentTestGenerator {

    private static final String FIXED_DTS = "Number of DTs fixed:";
    private static final String NOT_FIXED_DTS = "Number of DTs not fixed:";
    private static final String CRYSTAL_NAME = "Crystal";
    private static final String JFREECHART_NAME = "JFreechart";
    private static final String JODATIME_NAME = "Joda-Time";
    private static final String SYNOTPIC_NAME = "Synoptic";
    private static final String XMLSECURITY_NAME = "XML Security";

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
     * a private method to generate a line of LaTeX needed for figure 7
     *
     * @param projectName the name of the Project789
     *
     * @param values the ordered values that need to be written
     *
     *
     * format: Crystal & 0.026 & 0.001 & 0.000 & 0.000 \\
     */
    private static String generate7(String projectName, int[] dts, int[] total) {
        String result = projectName;
        for (int i = 0; i < dts.length; i++) {
            total[i] += dts[i];
            int val = dts[i];
            result += " & " + val;
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /*
     * a private method to generate a line of LaTeX needed for figure 8
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
    private static String generate8(String projectName, int[] dts, int[] total) {
        String result = projectName;
        for (int i = 0; i < dts.length; i++) {
            total[i] += dts[i];
            int val = dts[i];
            result += " & " + val;
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /*
     * a private method that generates Figure 9
     */
    private static String generate9(String projectName, int[] orig_order, int[] time, int[] total) {
        String result = projectName;
        for (int i = 0; i < orig_order.length; i++) {
            total[i] += orig_order[i];
            int val = orig_order[i];
            result += " & " + val;
        }
        for (int i = 0; i < time.length; i++) {
            total[i + 4] += time[i];
            int val = time[i];
            result += " & " + val;
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /*
     * a private method that searches a List<Project789> objects for the project that matches projName
     *
     * @return -1 if no match found, otherwise index of the project with projName
     */

    private static int indexOfByName(List<Project789> projList, String projName) {
        int index = 0;
        for (Project789 temp : projList) {
            if (temp.getName().equals(projName)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private static void sortList(List<Project789> projList, List<Project789> sortedList, String keyword) {
        for (Project789 temp : projList) {
            if (temp.getName().equals(keyword)) {
                sortedList.add(temp);
                return;
            }
        }
    }

    /*
     * a private method to generate the LaTeX format of the data of each Project789 in projList
     *
     * @param projList a list of Project789s that each contain data
     */

    private static String generateLatexString(List<Project789> projList, List<Project789> otherProjList, String type) {
        String latexString = "";
        List<Project789> sortedList = new ArrayList<Project789>();
        sortList(projList, sortedList, CRYSTAL_NAME);
        sortList(projList, sortedList, JFREECHART_NAME);
        sortList(projList, sortedList, JODATIME_NAME);
        sortList(projList, sortedList, SYNOTPIC_NAME);
        sortList(projList, sortedList, XMLSECURITY_NAME);
        int[] total;
        if (sortedList.get(0).isFig7()) {
            total = new int[4];
        } else if (sortedList.get(0).isFig8()) {
            total = new int[6];
        } else {
            total = new int[8];
        }
        for (Project789 temp : sortedList) {
            // get the correct orig_value...one of the Lists will not have the correct value (will be 0)

            if (temp.isFig7()) {
                if (type.equals("orig")) {
                    latexString += generate7(temp.getName(), temp.get_fig7_human(), total);
                } else {
                    latexString += generate7(temp.getName(), temp.get_fig7_auto(), total);
                }
                latexString += "\r\n";
            } else if (temp.isFig8()) {
                if (type.equals("orig")) {
                    latexString += generate8(temp.getName(), temp.get_fig8_human(), total);
                } else {
                    latexString += generate8(temp.getName(), temp.get_fig8_auto(), total);
                }
                latexString += "\r\n";
            } else if (temp.isFig9()) {
                if (type.equals("orig")) {
                    latexString +=
                            generate9(temp.getName(), temp.get_fig9_human_orig(), temp.get_fig9_human_time(), total);
                } else {
                    latexString +=
                            generate9(temp.getName(), temp.get_fig9_auto_orig(), temp.get_fig9_auto_time(), total);
                }
                latexString += "\r\n";
            }
        }
        latexString += "Total";
        for (int i = 0; i < total.length; i++) {
            latexString += " & ";
            latexString += total[i];
        }
        latexString += " \\\\";

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
         * 7: prioritization
         * 8: selection
         * 9: parallelizaiton
         */

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        // create a list of project Objects that each have a diff project name
        int size = 5;
        List<Project789> proj_orig_arrayList = new ArrayList<Project789>(size);
        List<Project789> proj_auto_arrayList = new ArrayList<Project789>(size);

        for (File file : fList) {
            if (file.isFile()) {

                // String containing all the flags
                String flagsInFile = getFlagsLine(file);
                if (flagsInFile == null) {
                    continue;
                }
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
                if (projectName.equals("crystal")) {
                    projectName = CRYSTAL_NAME;
                } else if (projectName.equals("jfreechart")) {
                    projectName = JFREECHART_NAME;
                } else if (projectName.equals("jodatime")) {
                    projectName = JODATIME_NAME;
                } else if (projectName.equals("synoptic")) {
                    projectName = SYNOTPIC_NAME;
                } else if (projectName.equals("xml_security")) {
                    projectName = XMLSECURITY_NAME;
                } else {
                    System.err.println("Project789 argument is specified but the project name"
                            + " value provided is invalid. Please use either crystal, jfreechart, jodatime, synoptic or xml_security.");
                    System.exit(0);
                }

                index = flagsList.indexOf("-testType");
                String testType = flagsList.get(index + 1);

                // TODO: change back to index = flagsList.indexOf("-dependentTestFile");
                index = flagsList.indexOf("-resolveDependences");
                String resolveDependences = null;
                // if index = -1, flag not present
                if (index != -1) {
                    resolveDependences = flagsList.get(index);
                }

                // see if List needs to orig or auto generated one
                List<Project789> currProjList = null;
                if (testType.equals("auto")) {
                    currProjList = proj_auto_arrayList;
                } else if (testType.equals("orig")) {
                    currProjList = proj_orig_arrayList;
                }

                // index of this project in the arrayList, might be -1 if not found
                int indexOfProj = indexOfByName(currProjList, projectName);

                // Project789 Object that corresponds to the current project name in this file
                Project789 currProj = null;

                if (indexOfProj != -1) {
                    currProj = currProjList.get(indexOfProj);
                } else {// projectName not seen before

                    currProj = new Project789(projectName);
                    currProjList.add(currProj);
                }

                // get the number of dts

                int numFixed = Integer.parseInt(parseFile(file, FIXED_DTS));
                int numNotFixed = Integer.parseInt(parseFile(file, NOT_FIXED_DTS));
                int numTotal = numFixed + numNotFixed;

                // parallelization technique, figure 9
                if (techniqueName.equals("parallelization")) {
                    // order will be time or original
                    // k = 2, 4, 8, 16 is the number of machines
                    index = flagsList.indexOf("-numOfMachines");
                    String numMachines_string = flagsList.get(index + 1);
                    int numMachines = Integer.parseInt(numMachines_string);

                    currProj.useFig9();
                    // this array will correspond to P1 or P2
                    int[] curr_fig9_human, curr_fig9_auto;
                    if (orderName.equals("original")) {
                        curr_fig9_human = currProj.get_fig9_human_orig();
                        curr_fig9_auto = currProj.get_fig9_auto_orig();
                    } else { // orderName == time
                        curr_fig9_human = currProj.get_fig9_human_time();
                        curr_fig9_auto = currProj.get_fig9_auto_time();
                    }

                    if (resolveDependences == null) { // non-enhanced
                        if (numMachines == 2) {
                            curr_fig9_human[0] = numTotal;
                        } else if (numMachines == 4) {
                            curr_fig9_human[1] = numTotal;
                        } else if (numMachines == 8) {
                            curr_fig9_human[2] = numTotal;
                        } else if (numMachines == 16) {
                            curr_fig9_human[3] = numTotal;
                        }
                    } else // enhanced
                    {
                        if (numMachines == 2) {
                            curr_fig9_auto[0] = numTotal;
                        } else if (numMachines == 4) {
                            curr_fig9_auto[1] = numTotal;
                        } else if (numMachines == 8) {
                            curr_fig9_auto[2] = numTotal;
                        } else if (numMachines == 16) {
                            curr_fig9_auto[3] = numTotal;
                        }
                    }

                } // selection technique, figure 8
                else if (techniqueName.equals("selection")) {
                    currProj.useFig8();
                    int[] fig8_human = currProj.get_fig8_human();
                    int[] fig8_auto = currProj.get_fig8_auto();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) { // original
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig8_human[0] = numTotal;
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig8_human[1] = numTotal;
                            } else {
                                // S3
                                fig8_human[2] = numTotal;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig8_human[3] = numTotal;

                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig8_human[4] = numTotal;
                            } else {
                                // S6
                                fig8_human[5] = numTotal;
                            }
                        }

                    } else { // auto
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("original")) {
                                // S1
                                fig8_auto[0] = numTotal;
                            } else if (orderName.equals("absolute")) {
                                // S2
                                fig8_auto[1] = numTotal;
                            } else {
                                // S3
                                fig8_auto[2] = numTotal;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("original")) {
                                // S4
                                fig8_auto[3] = numTotal;

                            } else if (orderName.equals("absolute")) {
                                // S5
                                fig8_auto[4] = numTotal;
                            } else {
                                // S6
                                fig8_auto[5] = numTotal;
                            }
                        }
                    }

                } // prioritization techinque, figure 7
                else if (techniqueName.equals("prioritization")) {

                    currProj.useFig7();
                    int[] fig7_human = currProj.get_fig7_human();
                    int[] fig7_auto = currProj.get_fig7_auto();
                    // original values, index should be i=0, i+=2
                    if (resolveDependences == null) {
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig7_human[0] = numTotal;
                            } else { // relative
                                // T4
                                fig7_human[1] = numTotal;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig7_human[2] = numTotal;

                            } else { // relative
                                // T7
                                fig7_human[3] = numTotal;
                            }
                        }

                    } else { // auto, index should be i = 1, i+=2
                        if (coverageName.equals("statement")) {
                            if (orderName.equals("absolute")) {
                                // T3
                                fig7_auto[0] = numTotal;
                            } else {
                                // T4
                                fig7_auto[1] = numTotal;
                            }

                        } else if (coverageName.equals("function")) {
                            if (orderName.equals("absolute")) {
                                // T5
                                fig7_auto[2] = numTotal;

                            } else {
                                // T7
                                fig7_auto[3] = numTotal;
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
        if ((!proj_orig_arrayList.isEmpty() && proj_orig_arrayList.get(0).isFig7())
                || (!proj_auto_arrayList.isEmpty() && proj_auto_arrayList.get(0).isFig7())) {
            origOutputFilename += "figure7-orig-results.tex";
            autoOutputFilename += "figure7-auto-results.tex";
        } else if ((!proj_orig_arrayList.isEmpty() && proj_orig_arrayList.get(0).isFig8())
                || (!proj_auto_arrayList.isEmpty() && proj_auto_arrayList.get(0).isFig8())) {
            origOutputFilename += "figure8-orig-results.tex";
            autoOutputFilename += "figure8-auto-results.tex";
        } else { // fig 9
            origOutputFilename += "figure9-orig-results.tex";
            autoOutputFilename += "figure9-auto-results.tex";
        }

        writeToLatexFile(origLatexString, origOutputFilename);
        writeToLatexFile(autoLatexString, autoOutputFilename);

    }
}
