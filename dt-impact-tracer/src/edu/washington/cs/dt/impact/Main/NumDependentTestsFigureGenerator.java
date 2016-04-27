
package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.data.Project;
import edu.washington.cs.dt.impact.data.ProjectNumDependentTests;
import edu.washington.cs.dt.impact.util.Constants;

public class NumDependentTestsFigureGenerator extends FigureGenerator {

    /*
     * a private method to generate a line of LaTeX needed for figure 7
     *
     */
    private static String generate7(String projectName, int[] dts, int[] total, IntegerWrapper numConfigWithDT) {
        String result = projectName;
        for (int i = 0; i < dts.length; i++) {
            total[i] += dts[i];
            int val = dts[i];
            result += " & " + val;
            if (val > 0) {
                numConfigWithDT.numConfigWithDT += 1;
            }
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /*
     * a private method to generate a line of LaTeX needed for figure 8
     *
     */
    private static String generate8(String projectName, int[] dts, int[] total, IntegerWrapper numConfigWithDT) {
        String result = projectName;
        for (int i = 0; i < dts.length; i++) {
            total[i] += dts[i];
            int val = dts[i];
            result += " & " + val;
            if (val > 0) {
                numConfigWithDT.numConfigWithDT += 1;
            }
        }
        result += " \\\\"; // "\\"
        return result;
    }

    /*
     * a private method that generates Figure 9
     */
    private static String generate9(String projectName, int[] orig_order, int[] time, int[] total,
            IntegerWrapper numConfigWithDT) {
        String result = projectName;
        for (int i = 0; i < orig_order.length; i++) {
            total[i] += orig_order[i];
            int val = orig_order[i];
            result += " & " + val;
            if (val > 0) {
                numConfigWithDT.numConfigWithDT += 1;
            }
        }
        for (int i = 0; i < time.length; i++) {
            total[i + 4] += time[i];
            int val = time[i];
            result += " & " + val;
            if (val > 0) {
                numConfigWithDT.numConfigWithDT += 1;
            }
        }
        result += " \\\\"; // "\\"
        return result;
    }

    private static class IntegerWrapper {
        public int numConfigWithDT;
        public int numConfig;

        public IntegerWrapper() {
            numConfigWithDT = 0;
            numConfig = 0;
        }
    }

    /*
     * a private method to generate the LaTeX format of the data of each Project in projList
     *
     * @param projList a list of Projects that each contain data
     */
    private static String generateLatexString(List<Project> projList, List<Project> otherProjList, String type,
            IntegerWrapper numConfigWithDT) {
        String latexString = "";
        List<Project> sortedList = new ArrayList<Project>();
        sortList(projList, sortedList, Constants.CRYSTAL_NAME);
        sortList(projList, sortedList, Constants.JFREECHART_NAME);
        sortList(projList, sortedList, Constants.JODATIME_NAME);
        sortList(projList, sortedList, Constants.SYNOTPIC_NAME);
        sortList(projList, sortedList, Constants.XMLSECURITY_NAME);
        int[] total;
        if (((ProjectNumDependentTests) sortedList.get(0)).isFig9()) {
            total = new int[8];
        } else if (((ProjectNumDependentTests) sortedList.get(0)).isFig8()) {
            total = new int[6];
        } else {
            total = new int[4];
        }

        for (Project temp2 : sortedList) {
            ProjectNumDependentTests temp = (ProjectNumDependentTests) temp2;
            // get the correct orig_value...one of the Lists will not have the correct value (will be 0)
            if (temp.isFig9()) {
                if (type.equals("orig")) {
                    latexString += generate9(temp.getName(), temp.get_fig9_human_orig(), temp.get_fig9_human_time(),
                            total, numConfigWithDT);
                } else {
                    latexString += generate9(temp.getName(), temp.get_fig9_auto_orig(), temp.get_fig9_auto_time(),
                            total, numConfigWithDT);
                }
                latexString += "\r\n";
            } else if (temp.isFig8()) {
                if (type.equals("orig")) {
                    latexString += generate8(temp.getName(), temp.get_fig8_human(), total, numConfigWithDT);
                } else {
                    latexString += generate8(temp.getName(), temp.get_fig8_auto(), total, numConfigWithDT);
                }
                latexString += "\r\n";
            } else if (temp.isFig7()) {
                if (type.equals("orig")) {
                    latexString += generate7(temp.getName(), temp.get_fig7_human(), total, numConfigWithDT);
                } else {
                    latexString += generate7(temp.getName(), temp.get_fig7_auto(), total, numConfigWithDT);
                }
                latexString += "\r\n";
            }
        }

        latexString += "\r\n";
        latexString += "\\hline";
        latexString += "\r\n";
        latexString += "\\textbf{Total}";
        for (int i = 0; i < total.length; i++) {
            latexString += " & ";
            latexString += total[i];
        }
        latexString += "\\\\";

        latexString += "\r\n";
        latexString += "\\hline";

        numConfigWithDT.numConfig += total.length * sortedList.size();

        // take off the "\r\n" from the last line
        return latexString;
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
        List<Project> proj_orig_arrayList = new ArrayList<Project>(size);
        List<Project> proj_auto_arrayList = new ArrayList<Project>(size);

        for (File file : fList) {
            if (file.isFile()) {

                // String containing all the flags
                String flagsInFile = getFlagsLine(file, Constants.ARGUMENT_STRING);
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
                if (index != -1) { // only count files without dependentTestFile
                    continue;
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

                    currProj2 = new ProjectNumDependentTests(projectName);
                    currProjList.add(currProj2);
                }
                ProjectNumDependentTests currProj = (ProjectNumDependentTests) currProj2;

                // get the number of dts

                int numFixed = Integer.parseInt(parseFile(file, Constants.FIXED_DTS));
                int numNotFixed = Integer.parseInt(parseFile(file, Constants.NOT_FIXED_DTS));
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

                    if (testType.equals("orig")) { // human
                        if (numMachines == 2) {
                            curr_fig9_human[0] = numTotal;
                        } else if (numMachines == 4) {
                            curr_fig9_human[1] = numTotal;
                        } else if (numMachines == 8) {
                            curr_fig9_human[2] = numTotal;
                        } else if (numMachines == 16) {
                            curr_fig9_human[3] = numTotal;
                        }
                    } else // auto
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
                    if (testType.equals("orig")) { // human

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
                    if (testType.equals("orig")) { // human
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
                    } else { // auto
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

        IntegerWrapper numConfigWithDT = new IntegerWrapper();

        // generate LaTeX for the human-written and automatic test suites
        String origLatexString = generateLatexString(proj_orig_arrayList, proj_auto_arrayList, "orig", numConfigWithDT);
        String autoLatexString = generateLatexString(proj_auto_arrayList, proj_orig_arrayList, "auto", numConfigWithDT);
        origLatexString +=
                "\n%Number of configurations with DT (including orig and auto): " + numConfigWithDT.numConfigWithDT;
        origLatexString += "\n%Number of configurations (including orig and auto): " + numConfigWithDT.numConfig;
        autoLatexString +=
                "\n%Number of configurations with DT (including orig and auto): " + numConfigWithDT.numConfigWithDT;
        autoLatexString += "\n%Number of configurations (including orig and auto): " + numConfigWithDT.numConfig;

        String origOutputFilename = outputDirectoryName + System.getProperty("file.separator");
        String autoOutputFilename = outputDirectoryName + System.getProperty("file.separator");
        if ((!proj_orig_arrayList.isEmpty() && ((ProjectNumDependentTests) proj_orig_arrayList.get(0)).isFig9())
                || (!proj_auto_arrayList.isEmpty()
                        && ((ProjectNumDependentTests) proj_auto_arrayList.get(0)).isFig9())) {
            origOutputFilename += "figure9-orig-results.tex";
            autoOutputFilename += "figure9-auto-results.tex";
        } else if ((!proj_orig_arrayList.isEmpty() && ((ProjectNumDependentTests) proj_orig_arrayList.get(0)).isFig8())
                || (!proj_auto_arrayList.isEmpty()
                        && ((ProjectNumDependentTests) proj_auto_arrayList.get(0)).isFig8())) {
            origOutputFilename += "figure8-orig-results.tex";
            autoOutputFilename += "figure8-auto-results.tex";
        } else { // fig 7
            origOutputFilename += "figure7-orig-results.tex";
            autoOutputFilename += "figure7-auto-results.tex";
        }

        writeToLatexFile(origLatexString, origOutputFilename);
        writeToLatexFile(autoLatexString, autoOutputFilename);

    }
}
