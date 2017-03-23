package edu.washington.cs.dt.impact.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import edu.washington.cs.dt.impact.data.Project;

public class FigureGenerator {
    protected static final DecimalFormat apfdFormat = new DecimalFormat(".00");
    protected static final DecimalFormat timeFormat = new DecimalFormat("#\\%");
    protected static final DecimalFormat percentFormat = new DecimalFormat("0");
    protected static boolean allowNegatives = false;
    protected static final int NUM_PRIOR_TECHNIQUES = 4;
    protected static final int NUM_SELE_TECHNIQUES = 6;
    protected static final int NUM_PARA_TECHNIQUES = 8;
    protected static final int NUM_PARA_NO_K_TECHNIQUES = 2;

    /*
     * A public method to search a file for a keyword and return the value that follows
     * that keyword
     *
     * @return the data value without any leading or trailing whitespaces, null if keyword not found
     */
    public static String parseFile(File file, String keyword) {
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

    public static void exitWithError(String message) {
        System.err.println(message);
        Thread.dumpStack();
        System.exit(0);
    }

    /*
     * A public method to search a file for a keyword and return the value that follows
     * that keyword
     *
     * @return the data value without any leading or trailing whitespaces, null if keyword not found
     */
    public static int parseFileForNumOfDTs(File file, String keyword) {
        int numDTs = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(keyword)) {
                    // gets numeric value of data
                    String data = currLine.substring(keyword.length(), currLine.length());
                    // trim away any whitespaces leading or after the data value
                    numDTs += Integer.valueOf(data.trim());
                }
            }
            scanner.close(); // close Scanner before returning
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } finally {
            scanner.close();
        }
        return numDTs; // none of the lines contained the keyword
    }
    
    public static List<String> parseFileForDTs(File file, String keyword, boolean findLast) {
        List<String> DTs = new ArrayList<String>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(keyword)) {
                	// Ex. [randoop.jfreechart.RandoopTest1.test300, randoop.jfreechart.RandoopTest4.test270, randoop.jfreechart.RandoopTest0.test79]
                	currLine = scanner.nextLine();
                	currLine = currLine.substring(1, currLine.length() - 1);
                	if (findLast) {
                		DTs.clear();
                	}
                	DTs.addAll(Arrays.asList(currLine.split(", ")));
                }
            }
            scanner.close(); // close Scanner before returning
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } finally {
            scanner.close();
        }
        return DTs; // none of the lines contained the keyword
    }

    public static double parseFileForMaxTime(File file, String keyword) {
        double maxTime = 0.0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(keyword)) {
                    double data = Double.parseDouble(currLine.substring(keyword.length(), currLine.length()).trim());
                    if (data > maxTime) {
                        maxTime = data;
                    }
                }
            }
            scanner.close(); // close Scanner before returning
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } finally {
            scanner.close();
        }
        return maxTime; // none of the lines contained the keyword
    }

    /*
     * A public method to search a file for a keyword and return the value that follows
     * that keyword
     *
     * @return the data value without any leading or trailing whitespaces, null if keyword not found
     */
    public static String getNextLine(File file, String currLineKeyword, String nextLineKeyword) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(currLineKeyword)) {
                    currLine = scanner.nextLine();
                    while (!currLine.contains(nextLineKeyword)) {
                        currLine = scanner.nextLine();
                    }
                    return scanner.nextLine();
                }
            }
            scanner.close(); // close Scanner before returning
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        } finally {
            scanner.close();
        }
        return null; // none of the lines contained the keyword
    }

    protected static String formatPercent(double num, boolean addPhantomZeros) {
    	StringBuilder sb = new StringBuilder();

        String diffStringFormat = timeFormat.format(num);
        if (diffStringFormat.equals("-0\\%")) {
            diffStringFormat = "0\\%";
        }
        
        if (addPhantomZeros) {
            if (num < 1.0) {
            	sb.append("\\z");
            }
            
            if (num < 0.10) {
            	sb.append("\\z");
            }
        }
        
        sb.append(diffStringFormat);
        
        return sb.toString();
    }

    /*
     * a public method that gets the line with all the flags in the file
     * that line starts with "-technique"
     */
    public static String getFlagsLine(File file, String keyword, boolean getSameLine) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if (currLine.contains(keyword)) {
                	if (!getSameLine) {
                        currLine = scanner.nextLine();                		
                	}
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
     * A public method that returns the name of the argument specified by the flag
     *
     * @return the name of the argument corresponding to flag
     */
    public static String mustGetArgName(List<String> argsList, String flag) {
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
    
    public static String getArgName(List<String> argsList, String flag) {
        String flagName = null;
        int index = argsList.indexOf(flag);
        if (index != -1) {
            int nameIndex = index + 1;
            if (nameIndex >= argsList.size()) {
                System.err.println(flag + " argument is specified but flagName is not." + " Please use the format: "
                        + flag + " flagName");
                return null;
            }
            flagName = argsList.get(nameIndex);
        } else {
            System.err
                    .println("No" + flag + " argument is specified." + " Please use the format: " + flag + " flagName");
            return null;
        }
        return flagName;
    }

    public static int getK(int i) {
        if (i == 0) {
            return 2;
        } else if (i == 2) {
            return 4;
        } else if (i == 4) {
            return 8;
        } else if (i == 6) {
            return 16;
        }
        return 1;
    }

    /*
     * a public method that searches a List<Project> objects for the project that matches projName
     *
     * @return -1 if no match found, otherwise index of the project with projName
     */

    public static int indexOfByName(List<Project> projList, String projName) {
        int index = 0;
        for (Project temp : projList) {
            if (temp.getName().equals(projName)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void sortList(List<Project> projList, List<Project> sortedList, String keyword) {
        for (Project temp : projList) {
            if (temp.getName().equals(keyword)) {
                sortedList.add(temp);
                return;
            }
        }
    }
    
    private static Comparator<Project> ALPHABETICAL_ORDER = new Comparator<Project>() {
        public int compare(Project str1, Project str2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1.getName(), str2.getName());
            if (res == 0) {
                res = str1.getName().compareTo(str2.getName());
            }
            return res;
        }
    };
    
    public static void sortList(List<Project> projList) {
        Collections.sort(projList, ALPHABETICAL_ORDER);
    }

    /*
     * a public method that writes to the output file specified using the given latex string
     *
     */

    public static void writeToLatexFile(String latex, String outputFileName, boolean append) {
        try {
            File outputFile = new File(outputFileName);
            FileWriter writer = new FileWriter(outputFile, append);
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

}
