/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Main class to retrieve a dependent test and output what tests should
 * come before and after it in order for the dependent test to attain
 * a desired result in a new order.
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

        // file containing the list of dependent tests that manifested when
        // running the test suite in the current test order
        File dependentTestFile = null;
        int dependentFile = argsList.indexOf("-dependentTestFile");
        if (dependentFile != -1) {
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

        // file containing the current test order the dependent test was ran in
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

        // file containing the original order the dependent test was ran in
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

        // file containing a list of files to delete before each test suite execution
        String filesToDelete = null;
        int filesToDeleteIndex = argsList.indexOf("-filesToDelete");
        if (filesToDeleteIndex != -1) {
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

        // file containing all the information about which
        // test depends on which other test
        String dtFile = null;
        int dtListIndex = argsList.indexOf("-dtFile");
        if (dtListIndex != -1) {
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

        // parse the dependentTestFile and retrieve a dependent test to solve
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(dependentTestFile));
            String line = br.readLine();
            while (line != null && !line.trim().matches(
                    "Original order result:        Test order result:")) {
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

                // recreate the argsList for DependentTestFinder
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