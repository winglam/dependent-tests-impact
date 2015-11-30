/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Creates a list of tests that is ordered with test parallelization based on the parameters
 * specified to the constructor.
 */

package edu.washington.cs.dt.impact.technique;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.washington.cs.dt.impact.data.TestFunctionStatement;
import edu.washington.cs.dt.impact.data.TestList;
import edu.washington.cs.dt.impact.data.TestTime;
import edu.washington.cs.dt.impact.order.Relative;
import edu.washington.cs.dt.impact.order.Standard;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;

public class Parallelization extends Test {
    private List<Standard> splitTests;

    /**
     * 
     * @param order the order in which to order the tests with
     * @param outputFileName the name of the output file
     * @param inputTestFolder folder containing all test cases
     * @param coverage the coverage to consider when processing the test cases
     * @param dependentTestsFile the file containing the information
     *  regarding which test depends on which
     * @param k the number of lists to split the tests into
     * @param origOrder the original order in which the test cases are ran in
     * @param timeOrder file specifying the amount of nanoseconds each test takes to execute
     */
    public Parallelization(ORDER order, String outputFileName, File inputTestFolder,
            COVERAGE coverage, File dependentTestsFile, int k, File origOrder, File timeOrder) {
        super(inputTestFolder, coverage, dependentTestsFile);

        splitTests = new LinkedList<Standard>();
        if (outputFileName == null) {
            throw new RuntimeException("Test parallelization cannot be ran"
                    + " without a specified output file name.");
        }

        if (order == ORDER.RELATIVE || order == ORDER.ABSOLUTE || order == ORDER.TIME) {
            Collections.sort(methodList);
            if (order == ORDER.RELATIVE) {
                methodList = new Relative(outputFileName, methodList, allCoverageLines).getMethodList();
            } else if (order == ORDER.TIME) {
                Map<String, TestFunctionStatement> nameToMethodData =
                        getNameToMethodData(methodList);
                methodList.clear();
                Map<String, TestTime> nameToTimeData = new HashMap<String, TestTime>();

                // create TestTimeDatas instead of TestMethodDatas
                Map<String, Long> testNameToTime = processFile(timeOrder);
                for (String key : testNameToTime.keySet()) {
                    TestTime currTTD = new TestTime(key, testNameToTime.get(key));
                    methodList.add(currTTD);
                    nameToTimeData.put(key, currTTD);
                }

                // go through each TestMethodData and setup its
                // corresponding TestTimeData's dependences
                for (String key : nameToMethodData.keySet()) {
                    TestFunctionStatement currTMD = nameToMethodData.get(key);
                    TestTime currTTD = nameToTimeData.get(key);
                    for (TestFunctionStatement tmd : currTMD.getDependentTests(true)) {
                        currTTD.addDependentTest(nameToTimeData.get(tmd.getName()), true);
                    }
                    for (TestFunctionStatement tmd : currTMD.getDependentTests(false)) {
                        currTTD.addDependentTest(nameToTimeData.get(tmd.getName()), false);
                    }
                }
                Collections.sort(methodList);
            }

            // create k test list each representing a machine
            List<TestList> tmdLists = new ArrayList<TestList>();
            for (int i = 0; i < k; i++) {
                tmdLists.add(new TestList());
            }

            // add each test in methodList to the machine with the least amount of lines
            for (TestFunctionStatement tmd : methodList) {
                Collections.sort(tmdLists);
                tmdLists.get(0).addTest(tmd);
            }

            // create a Standard for the test list corresponding to each machine
            for (int i = 0; i < tmdLists.size(); i++) {
                splitTests.add(new Standard(outputFileName + i, tmdLists.get(i).getTestList()));
            }
        } else if (order == ORDER.RANDOM || order == ORDER.ORIGINAL) {
            if (order == ORDER.RANDOM) {
                Collections.shuffle(methodList);
            } else if (order == ORDER.ORIGINAL) {
                parseOrigOrderToMethodList(origOrder, getNameToMethodData(methodList));
            }

            // split the tests. if the tests can't be split by k perfectly,
            // the size of the first (list size)%k lists are 1 greater than the rest
            int size = methodList.size() / k;
            if (methodList.size() % k != 0) {
                size += 1;
            }

            int index = 0;
            for (int j = 0; j < k; j++) {
                List<TestFunctionStatement> tests = new LinkedList<TestFunctionStatement>();
                for (int counter = 0; index < methodList.size() && counter < size; index++) {
                    tests.add(methodList.get(index));
                    counter += 1;
                }
                splitTests.add(new Standard(outputFileName + j, tests));
            }
        } else {
            System.err.println("Test parallelization is specified with an incompatible order."
                    + " Compatible orders are: random, relative or absolute.");
            System.exit(0);
        }
    }

    private Map<String, Long> processFile(File f) {
        if (!f.isFile()) {
            throw new RuntimeException(f.getName() + " file is invalid.");
        }

        Map<String, Long> testsToResults = new HashMap<String, Long>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            while(line != null) {
                while (line != null && !line.matches("^Pass: [0-9]+,"
                        + " Fail: [0-9]+, Error: [0-9]+$")) {
                    line = br.readLine();
                }

                if (line == null) {
                    break;
                }

                String nextLine = br.readLine();
                if (nextLine.equals("{}")) {
                    line = nextLine;
                    continue;
                }

                String[] testResults = nextLine.split(", ");
                if (testResults.length >= 1) {
                    testResults[0] = testResults[0].substring(1);
                    String lastTest = testResults[testResults.length - 1];
                    testResults[testResults.length - 1] =
                            lastTest.substring(0, lastTest.length() - 1);

                    for (String s : testResults) {
                        String[] testAndResult = s.split("=");
                        testsToResults.put(testAndResult[0], Long.parseLong(testAndResult[1]));
                    }
                }
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testsToResults;
    }

    @Override
    public void printResults() {
        for (Standard obj : splitTests) {
            obj.checkForDependentTests();
            obj.printResults();
        }
    }

    @Override
    public List<TestFunctionStatement> getResults(int machine) {
        splitTests.get(machine).checkForDependentTests();
        return splitTests.get(machine).getMethodList();
    }
}