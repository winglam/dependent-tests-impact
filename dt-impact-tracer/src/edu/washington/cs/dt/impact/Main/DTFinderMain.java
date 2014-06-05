/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 */
package edu.washington.cs.dt.impact.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import edu.washington.cs.dt.impact.tools.DependentTestFinder;


public class DTFinderMain {

    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        // if specified, the output is saved to the file name instead of printed to console
        File dependentTestFile = null;
        int dependentFile = argsList.indexOf("-dependentTestFile");
        if (dependentFile != -1) {
            // get index of output file
            int dependentFileNameIndex = dependentFile + 1;
            if (dependentFileNameIndex >= argsList.size()) {
                System.err
                .println("Dependent test file argument is specified but a file name is not."
                        + " Please use the format: -dependentTestFile aFileName");
                System.exit(0);
            }
            dependentTestFile = new File(argsList.get(dependentFileNameIndex));
        } else {
            System.err
            .println("No dependent test file specified."
                    + " Please use the format: -dependentTestFile aFileName");
            System.exit(0);
        }

        String currentOrderFile = null;
        int currentOrderIndex = argsList.indexOf("-currentOrderFile");
        if (currentOrderIndex != -1) {
            int currentOrderFileIndex = currentOrderIndex + 1;
            if (currentOrderFileIndex >= argsList.size()) {
                System.err
                .println("Current order file argument is specified but a file name is not."
                        + " Please use the format: -currentOrderFile aFileName");
                System.exit(0);
            }
            currentOrderFile = argsList.get(currentOrderFileIndex);
        } else {
            System.err.println("No current order file argument is specified."
                    + " Please use the format: -currentOrderFile aFileName");
            System.exit(0);
        }

        String originalOrderFile = null;
        int originalOrderIndex = argsList.indexOf("-originalOrderFile");
        if (originalOrderIndex != -1) {
            int originalOrderFileIndex = originalOrderIndex + 1;
            if (originalOrderFileIndex >= argsList.size()) {
                System.err
                .println("Original order file argument is specified but a file name is not."
                        + " Please use the format: -originalOrderFile aFileName");
                System.exit(0);
            }
            originalOrderFile = argsList.get(originalOrderFileIndex);
        } else {
            System.err.println("No original order file argument is specified."
                    + " Please use the format: -originalOrderFile aFileName");
            System.exit(0);
        }

        String filesToDelete = null;
        int filesToDeleteIndex = argsList.indexOf("-filesToDelete");
        if (filesToDeleteIndex != -1) {
            // get index of output file
            int filesToDeleteFileIndex = filesToDeleteIndex + 1;
            if (filesToDeleteFileIndex >= argsList.size()) {
                System.err
                .println("Files to delete argument is specified but a file name is not."
                        + " Please use the format: -filesToDelete aFileName");
                System.exit(0);
            }
            filesToDelete = argsList.get(filesToDeleteFileIndex);
        } else {
            System.err.println("No files to delete argument is specified."
                    + " Please use the format: -filesToDelete aFileName");
            System.exit(0);
        }

        String dtFile = null;
        int dtListIndex = argsList.indexOf("-dtFile");
        if (dtListIndex != -1) {
            // get index of output file
            int dtListFileIndex = dtListIndex + 1;
            if (dtListFileIndex >= argsList.size()) {
                System.err
                .println("DT file argument is specified but a file name is not."
                        + " Please use the format: -dtFile aFileName");
                System.exit(0);
            }
            dtFile = argsList.get(dtListFileIndex);
        } else {
            System.err.println("No DT file argument is specified."
                    + " Please use the format: -dtFile aFileName");
            System.exit(0);
        }

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(dependentTestFile));
            String line = br.readLine();
            while (line != null && !line.trim().matches("Original order result:        Test order result:")) {
                line = br.readLine();
            }

            if (line == null) {
                br.close();
                throw new RuntimeException("Incorrect format for dependent test file.");
            }

            String nextLine = br.readLine();
            if (nextLine == null) {
                System.out.println("There are no dependent tests left!");
            } else {
                Scanner s = new Scanner(nextLine);

                String testName = null;
                String testResult = null;
                if (s.hasNext()) {
                    testName = s.next();
                    testName = testName.substring(0, testName.length() - 1);
                } else {
                    s.close();
                    throw new RuntimeException("Incorrect format for dependent test file.");
                }
                if (s.hasNext()) {
                    testResult = s.next();
                } else {
                    s.close();
                    throw new RuntimeException("Incorrect format for dependent test file.");
                }

                s.close();
                argsList.clear();
                argsList.add("-dependentTestName");
                argsList.add(testName);
                argsList.add("-dependentTestResult");
                argsList.add(testResult);
                argsList.add("-currentOrderFile");
                argsList.add(currentOrderFile);
                argsList.add("-originalOrderFile");
                argsList.add(originalOrderFile);
                argsList.add("-filesToDelete");
                argsList.add(filesToDelete);
                argsList.add("-dtFile");
                argsList.add(dtFile);
                String[] newArgs = new String[argsList.size()];
                newArgs = argsList.toArray(newArgs);
                DependentTestFinder.main(newArgs);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}