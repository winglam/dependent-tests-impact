/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Contains methods and fields used by all test techniques.
 */

package edu.washington.cs.dt.impact.technique;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.impact.data.TestFunctionStatement;
import edu.washington.cs.dt.impact.order.Standard;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;

public class Test {
    private final String TEST_LINE = "Test: ";
    private final String EXECUTE_AFTER = "when executed after: ";
    private final String TEST_SEP = ", ";

    protected Set<String> allLines;
    protected List<TestFunctionStatement> methodList;
    protected List<TestFunctionStatement> allMethodList;
    protected Standard orderObj;

    public Test(File folder, COVERAGE coverage, File dependentTestsFile) {
        allLines = new HashSet<String>();
        allMethodList = listFilesForFolder(folder, coverage);
        methodList = new ArrayList<TestFunctionStatement>(allMethodList);
        processDependentTests(dependentTestsFile);
    }

    private void processDependentTests(File dependentTestsFile) {
        if (dependentTestsFile != null && dependentTestsFile.isFile()) {
            // list of tests that when executed before reveals the dependent test
            Map<String, List<String>>  execBefore = new HashMap<String, List<String>>();
            // list of tests that when executed after reveals the dependent test
            Map<String, List<String>> execAfter = new HashMap<String, List<String>>();

            Map<String, TestFunctionStatement> nameToMethodData =
                    new HashMap<String, TestFunctionStatement>();
            for (TestFunctionStatement methodData : allMethodList) {
                nameToMethodData.put(methodData.getName(), methodData);
            }

            parseDependentTestsFile(dependentTestsFile, execBefore, execAfter);

            for (String testName : execBefore.keySet()) {
                for (String dtTest : execBefore.get(testName)) {
                    TestFunctionStatement tmd = nameToMethodData.get(dtTest);
                    if (tmd == null ) {
                        tmd = new TestFunctionStatement(dtTest);
                        nameToMethodData.put(dtTest, tmd);
                    }
                    if (nameToMethodData.get(testName) == null) {
                        throw new RuntimeException(testName + " is not a valid test.");
                    }
                    nameToMethodData.get(testName).addDependentTest(tmd, true);
                }
                nameToMethodData.get(testName).reset();
            }

            for (String testName : execAfter.keySet()) {
                for (String dtTest : execAfter.get(testName)) {
                    TestFunctionStatement tmd = nameToMethodData.get(dtTest);
                    if (tmd == null ) {
                        tmd = new TestFunctionStatement(dtTest);
                        nameToMethodData.put(dtTest, tmd);
                    }
                    nameToMethodData.get(testName).addDependentTest(tmd, false);
                }
                nameToMethodData.get(testName).reset();
            }
        }
    }

    private void parseDependentTestsFile(File dependentTestsFile,
            Map<String, List<String>>  execBefore, Map<String, List<String>>  execAfter) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(dependentTestsFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 0) {
                    continue;
                }

                String testName = line.split(TEST_LINE)[1];

                // intended behavior line
                br.readLine();

                // tests reveal dependence when executed after testName
                line = br.readLine();
                String afterTestsStr = line.split(EXECUTE_AFTER)[1];
                if (afterTestsStr.length() > 2) {
                    afterTestsStr = afterTestsStr.substring(1, afterTestsStr.length() - 1);
                    execAfter.put(testName, Arrays.asList(afterTestsStr.split(TEST_SEP)));
                }

                // revealed behavior line
                br.readLine();

                // tests reveal dependence when executed before testName
                line = br.readLine();
                String beforeTestsStr = line.split(EXECUTE_AFTER)[1];
                if (beforeTestsStr.length() > 2 ) {
                    beforeTestsStr = beforeTestsStr.substring(1, beforeTestsStr.length() - 1);
                    execBefore.put(testName, Arrays.asList(beforeTestsStr.split(TEST_SEP)));
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<TestFunctionStatement> listFilesForFolder(final File inputTestFolder,
            final COVERAGE coverage ) {
        List<TestFunctionStatement> methodList = new LinkedList<TestFunctionStatement>();
        if (inputTestFolder == null) {
            throw new RuntimeException("sootOutput is missing some required classes.");
        }
        for (final File fileEntry : inputTestFolder.listFiles()) {
            if (fileEntry.isFile()) {
                TestFunctionStatement methodData = new TestFunctionStatement(fileEntry.getName());
                BufferedReader br;
                try {
                    br = new BufferedReader(new FileReader(fileEntry));
                    String line;

                    while ((line = br.readLine()) != null) {
                        if (coverage == COVERAGE.STATEMENT) {
                            allLines.add(line);
                            methodData.addLine(line);
                        } else if (coverage == COVERAGE.FUNCTION) {
                            String functionName = line.split(" ")[0];
                            allLines.add(functionName);
                            methodData.addLine(functionName);
                        }
                    }
                    br.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                methodData.reset();
                methodList.add(methodData);
            } else {
                continue;
            }
        }
        return methodList;
    }

    protected void parseOrigOrderToMethodList(File origOrder, Map<String, TestFunctionStatement> nameToMethodData) {
        methodList.clear();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(origOrder));
            String line;
            while ((line = br.readLine()) != null) {
                if (nameToMethodData.containsKey(line.trim())) {
                    methodList.add(nameToMethodData.get(line.trim()));
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Map<String, TestFunctionStatement> getNameToMethodData(
            List<TestFunctionStatement> methodList) {
        Map<String, TestFunctionStatement> nameToMethodData =
                new HashMap<String, TestFunctionStatement>();
        for (TestFunctionStatement methodData : methodList) {
            nameToMethodData.put(methodData.getName(), methodData);
        }
        return nameToMethodData;
    }

    public void printResults() {
        orderObj.checkForDependentTests();
        orderObj.printResults();
    }
}
