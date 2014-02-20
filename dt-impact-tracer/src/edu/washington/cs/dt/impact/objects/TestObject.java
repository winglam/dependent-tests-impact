package edu.washington.cs.dt.impact.objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.TestMethodData;


public abstract class TestObject {
    private final String TEST_LINE = "Test: ";
    private final String EXECUTE_AFTER = "when executed after: ";

    protected Set<String> allLines;
    protected List<TestMethodData> methodList;
    protected OrderObject orderObj;

    // list of tests that when executed before reveals the dependent test
    protected Map<String, List<String>> execBefore;
    // list of tests that when executed after reveals the dependent test
    protected Map<String, List<String>> execAfter;

    public TestObject(File folder, COVERAGE coverage, File dependentTestsFile) {
        allLines = new HashSet<String>();
        methodList = listFilesForFolder(folder, coverage);
        parseDependentTests(dependentTestsFile);
    }


    private void parseDependentTests(File dependentTestsFile) {
        if (dependentTestsFile != null && dependentTestsFile.isFile()) {
            execBefore = new HashMap<String, List<String>>();
            execAfter = new HashMap<String, List<String>>();

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
                        execAfter.put(testName, Arrays.asList(afterTestsStr.split(", ")));
                    }

                    // revealed behavior line
                    br.readLine();

                    // tests reveal dependence when executed before testName
                    line = br.readLine();
                    String beforeTestsStr = line.split(EXECUTE_AFTER)[1];
                    if (beforeTestsStr.length() > 2 ) {
                        beforeTestsStr = beforeTestsStr.substring(1, beforeTestsStr.length() - 1);
                        execBefore.put(testName, Arrays.asList(beforeTestsStr.split(", ")));
                    }
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private List<TestMethodData> listFilesForFolder(final File inputTestFolder, final COVERAGE coverage ) {
        List<TestMethodData> methodList = new ArrayList<TestMethodData>();
        if (inputTestFolder == null) {
            throw new RuntimeException("sootOutput is missing some required classes.");
        }

        for (final File fileEntry : inputTestFolder.listFiles()) {
            if (fileEntry.isFile()) {
                TestMethodData methodData = new TestMethodData(fileEntry.getName());
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


    public void printResults() {
        orderObj.printResults();
    }
}
