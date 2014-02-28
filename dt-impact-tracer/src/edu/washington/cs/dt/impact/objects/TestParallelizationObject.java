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

public class TestParallelizationObject extends TestObject {
    private List<OrderObject> splitTests;

    public TestParallelizationObject(ORDER order, String outputFileName, File inputTestFolder, COVERAGE coverage, File dependentTestsFile, int k, File origOrder) {
        super(inputTestFolder, coverage, dependentTestsFile);

        splitTests = new LinkedList<OrderObject>();
        if (outputFileName == null) {
            throw new RuntimeException("Test parallelization cannot be ran without a specified output file name.");
        }

        if (order == ORDER.RELATIVE || order == ORDER.ABSOLUTE) {
            Collections.sort(methodList);
            if (order == ORDER.RELATIVE) {
                methodList = new RelativeOrderObject(outputFileName, methodList, allLines).generateRelativeOrderList();
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
                Map<String, TestMethodData> nameToMethodData = new HashMap<String, TestMethodData>();
                for (TestMethodData methodData : methodList) {
                    nameToMethodData.put(methodData.getName(), methodData);
                }

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

    @Override
    public void printResults() {
        for (OrderObject obj : splitTests) {
            obj.printResults();
        }
    }
}