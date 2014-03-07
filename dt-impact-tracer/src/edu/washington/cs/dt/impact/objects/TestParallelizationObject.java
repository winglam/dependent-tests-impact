package edu.washington.cs.dt.impact.objects;

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

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.TestMethodData;
import edu.washington.cs.dt.impact.util.TestTimeData;

public class TestParallelizationObject extends TestObject {
    private List<StandardOrderObject> splitTests;

    public TestParallelizationObject(ORDER order, String outputFileName, File inputTestFolder, COVERAGE coverage, File dependentTestsFile, int k, File origOrder, File timeOrder) {
        super(inputTestFolder, coverage, dependentTestsFile);

        splitTests = new LinkedList<StandardOrderObject>();
        if (outputFileName == null) {
            throw new RuntimeException("Test parallelization cannot be ran without a specified output file name.");
        }

        if (order == ORDER.RELATIVE || order == ORDER.ABSOLUTE || order == ORDER.TIME) {
            Collections.sort(methodList);
            if (order == ORDER.RELATIVE) {
                methodList = new RelativeOrderObject(outputFileName, methodList, allLines).generateRelativeOrderList();
            } else if (order == ORDER.TIME) {
                Map<String, TestMethodData> nameToMethodData = getNameToMethodData(methodList);
                methodList.clear();
                Map<String, TestTimeData> nameToTimeData = new HashMap<String, TestTimeData>();

                // create TestTimeDatas instead of TestMethodDatas
                Map<String, Long> testNameToTime = processFile(timeOrder);
                for (String key : testNameToTime.keySet()) {
                    TestTimeData currTTD = new TestTimeData(key, testNameToTime.get(key));
                    methodList.add(currTTD);
                    nameToTimeData.put(key, currTTD);
                }

                // go through each TestMethodData and setup its corresponding TestTimeData's dependences
                for (String key : nameToMethodData.keySet()) {
                    TestMethodData currTMD = nameToMethodData.get(key);
                    TestTimeData currTTD = nameToTimeData.get(key);
                    for (TestMethodData tmd : currTMD.getDependentTests(true)) {
                        currTTD.addDependentTest(nameToTimeData.get(tmd.getName()), true);
                    }
                    for (TestMethodData tmd : currTMD.getDependentTests(false)) {
                        currTTD.addDependentTest(nameToTimeData.get(tmd.getName()), false);
                    }
                }
                Collections.sort(methodList);
            }

            List<TestListObject> tmdLists = new ArrayList<TestListObject>();
            for (int i = 0; i < k; i++) {
                tmdLists.add(new TestListObject());
            }

            for (TestMethodData tmd : methodList) {
                Collections.sort(tmdLists);
                tmdLists.get(0).addTest(tmd);
            }

            for (int i = 0; i < tmdLists.size(); i++) {
                splitTests.add(new StandardOrderObject(outputFileName + i, tmdLists.get(i).getTestList()));
            }
        } else if (order == ORDER.RANDOM || order == ORDER.ORIGINAL) {
            if (order == ORDER.RANDOM) {
                Collections.shuffle(methodList);
            } else if (order == ORDER.ORIGINAL) {
                Map<String, TestMethodData> nameToMethodData = getNameToMethodData(methodList);
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

            // split the tests. if the tests can't be split by k perfectly, the size of the first (list size)%k lists are 1 greater than the rest
            int size = methodList.size() / k;
            if (methodList.size() % k != 0) {
                size += 1;
            }
            int index = 0;
            for (int j = 0; j < k; j++) {
                List<TestMethodData> tests = new LinkedList<TestMethodData>();
                for (int counter = 0; index < methodList.size() && counter < size; index++) {
                    tests.add(methodList.get(index));
                    counter += 1;
                }
                splitTests.add(new StandardOrderObject(outputFileName + j, tests));
            }
        } else {
            System.err.println("Test parallelization is specified with an incompatible order. Compatible orders are: random, relative or absolute.");
            System.exit(0);
        }
    }

    private Map<String, TestMethodData> getNameToMethodData(List<TestMethodData> methodList) {
        Map<String, TestMethodData> nameToMethodData = new HashMap<String, TestMethodData>();
        for (TestMethodData methodData : methodList) {
            nameToMethodData.put(methodData.getName(), methodData);
        }
        return nameToMethodData;
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
                while (line != null && !line.matches("^Pass: [0-9]+, Fail: [0-9]+, Error: [0-9]+$")) {
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
                    testResults[testResults.length - 1] = lastTest.substring(0, lastTest.length() - 1);

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
        for (StandardOrderObject obj : splitTests) {
            obj.checkForDependentTests();
            obj.printResults();
        }
    }
}