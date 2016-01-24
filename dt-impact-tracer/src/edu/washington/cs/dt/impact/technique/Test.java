/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 *         Contains methods and fields used by all test techniques.
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
import edu.washington.cs.dt.impact.util.Constants;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;

public class Test {
    private final String EXECUTE_AFTER = "when executed after: ";
    private final String TEST_SEP = ", ";

    // all lines specific to the type of COVERAGE specified
    protected Set<String> allCoverageLines;
    protected List<TestFunctionStatement> methodList;
    protected List<TestFunctionStatement> allMethodList;
    protected Standard orderObj;
    private final Map<String, Set<String>> testToAllLines;

    public Test(File folder, COVERAGE coverage, File dependentTestsFile) {
        allCoverageLines = new HashSet<String>();
        testToAllLines = new HashMap<String, Set<String>>();
        if (allMethodList == null) {
            setAllLines(folder);
            allMethodList = listFilesForFolder(coverage);
        }
        methodList = new ArrayList<TestFunctionStatement>(allMethodList);
        if (dependentTestsFile != null) {
            processDependentTests(dependentTestsFile, null);
        }
    }

    public Test(COVERAGE coverage, List<String> allDTList, File folder) {
        testToAllLines = new HashMap<String, Set<String>>();
        allCoverageLines = new HashSet<String>();
        setAllLines(folder);
        allMethodList = listFilesForFolder(coverage);
        methodList = new ArrayList<TestFunctionStatement>(allMethodList);
        if (allDTList != null) {
            processDependentTests(null, allDTList);
        }
    }

    public void resetDTList(List<String> allDTList) {
        if (allDTList != null) {
            processDependentTests(null, allDTList);
        }
    }

    private void processDependentTests(File dependentTestsFile, List<String> allDTList) {
        // list of tests that when executed before reveals the dependent test
        Map<String, List<String>> execBefore = new HashMap<String, List<String>>();
        // list of tests that when executed after reveals the dependent test
        Map<String, List<String>> execAfter = new HashMap<String, List<String>>();

        Map<String, TestFunctionStatement> nameToMethodData = new HashMap<String, TestFunctionStatement>();
        for (TestFunctionStatement methodData : allMethodList) {
            nameToMethodData.put(methodData.getName(), methodData);
        }

        if (dependentTestsFile != null && dependentTestsFile.isFile()) {
            parseDependentTestsFile(dependentTestsFile, execBefore, execAfter);
        } else {
            parseDependentTestsList(allDTList, execBefore, execAfter);
        }

        for (String testName : execBefore.keySet()) {
            for (String dtTest : execBefore.get(testName)) {
                TestFunctionStatement tmd = nameToMethodData.get(dtTest);
                if (tmd == null) {
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
                if (tmd == null) {
                    tmd = new TestFunctionStatement(dtTest);
                    nameToMethodData.put(dtTest, tmd);
                }
                nameToMethodData.get(testName).addDependentTest(tmd, false);
            }
            nameToMethodData.get(testName).reset();
        }
    }

    private void parseDependentTestsList(List<String> allDTList, Map<String, List<String>> execBefore,
            Map<String, List<String>> execAfter) {
        for (int j = 0; j < allDTList.size();) {
            String line = allDTList.get(j);
            if (line.length() == 0) {
                continue;
            }
            String testName = line.split(Constants.TEST_LINE)[1];
            // revealed behavior line
            j += 2;

            // tests reveal dependence when executed after testName
            line = allDTList.get(j);
            String afterTestsStr = line.split(EXECUTE_AFTER)[1];
            if (afterTestsStr.length() > 2) {
                afterTestsStr = afterTestsStr.substring(1, afterTestsStr.length() - 1);
                execAfter.put(testName, Arrays.asList(afterTestsStr.split(TEST_SEP)));
            }
            // revealed behavior line
            j += 2;

            // tests reveal dependence when executed before testName
            line = allDTList.get(j);
            String beforeTestsStr = line.split(EXECUTE_AFTER)[1];
            if (beforeTestsStr.length() > 2) {
                beforeTestsStr = beforeTestsStr.substring(1, beforeTestsStr.length() - 1);
                execBefore.put(testName, Arrays.asList(beforeTestsStr.split(TEST_SEP)));
            }
            j += 1;
        }
    }

    private void parseDependentTestsFile(File dependentTestsFile, Map<String, List<String>> execBefore,
            Map<String, List<String>> execAfter) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(dependentTestsFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 0) {
                    continue;
                }

                String testName = line.split(Constants.TEST_LINE)[1];

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
                if (beforeTestsStr.length() > 2) {
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

    private List<TestFunctionStatement> listFilesForFolder(final COVERAGE coverage) {
        List<TestFunctionStatement> methodList = new LinkedList<TestFunctionStatement>();
        for (String testName : testToAllLines.keySet()) {
            TestFunctionStatement methodData = new TestFunctionStatement(testName);
            for (String line : testToAllLines.get(testName)) {
                if (coverage == COVERAGE.STATEMENT) {
                    allCoverageLines.add(line);
                    methodData.addLine(line);
                } else if (coverage == COVERAGE.FUNCTION) {
                    String functionName = line.split(" ")[0];
                    allCoverageLines.add(functionName);
                    methodData.addLine(functionName);
                }
            }
            methodData.reset();
            methodList.add(methodData);
        }
        return methodList;
    }

    private void setAllLines(final File inputTestFolder) {
        if (inputTestFolder == null) {
            throw new RuntimeException("sootOutput is missing some required classes.");
        }
        for (final File fileEntry : inputTestFolder.listFiles()) {
            if (fileEntry.isFile() && !fileEntry.getName().startsWith(".") && !fileEntry.isHidden()) {
                BufferedReader br;
                try {
                    br = new BufferedReader(new FileReader(fileEntry));
                    Set<String> lines = new HashSet<String>();

                    String line;
                    while ((line = br.readLine()) != null) {
                        lines.add(line);
                    }
                    testToAllLines.put(fileEntry.getName(), lines);
                    br.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                continue;
            }
        }
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

    protected void parseOrigOrderListToMethodList(List<String> origOrder,
            Map<String, TestFunctionStatement> nameToMethodData) {
        methodList.clear();
        for (String line : origOrder) {
            if (nameToMethodData.containsKey(line.trim())) {
                methodList.add(nameToMethodData.get(line.trim()));
            }

        }
    }

    protected Map<String, TestFunctionStatement> getNameToMethodData(List<TestFunctionStatement> methodList) {
        Map<String, TestFunctionStatement> nameToMethodData = new HashMap<String, TestFunctionStatement>();
        for (TestFunctionStatement methodData : methodList) {
            nameToMethodData.put(methodData.getName(), methodData);
        }
        return nameToMethodData;
    }

    public void printResults() {
        orderObj.checkForDependentTests();
        orderObj.printResults();
    }

    public List<TestFunctionStatement> getResults(int machine) {
        orderObj.checkForDependentTests();
        return orderObj.getMethodList();
    }
}
