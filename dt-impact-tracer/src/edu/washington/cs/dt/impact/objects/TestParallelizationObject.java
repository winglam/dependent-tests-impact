package edu.washington.cs.dt.impact.objects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.TestMethodData;

public class TestParallelizationObject extends TestObject {
    private String outputFilename;
    private List<List<String>> splitTests;

    public TestParallelizationObject(ORDER order, String outputFilename, File inputTestFolder, COVERAGE coverage, File dependentTestsFile, int k, File origOrder) {
        super(inputTestFolder, coverage, dependentTestsFile);

        Map<String, TestMethodData> nameToMethodData = new HashMap<String, TestMethodData>();
        for (TestMethodData methodData : methodList) {
            nameToMethodData.put(methodData.getName(), methodData);
        }

        List<List<String>> splitTests = new LinkedList<List<String>>();

        if (order == ORDER.ORIGINAL) {
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
        } else if (order == ORDER.RANDOM) {
            Collections.shuffle(methodList);
        } else {
            System.err.println("Test parallelization is specified with an incompatible order. Compatible orders are: random.");
            System.exit(0);
        }

        // split the tests. if the tests can't be split by k perfectly, the size of the first (list size)%k lists are 1 greater than the rest
        int size = methodList.size() / k;
        if (methodList.size() % k != 0) {
            size += 1;
        }
        int index = 0;
        for (int j = 0; j < k; j++) {
            List<String> tests = new LinkedList<String>();
            for (int counter = 0; index < methodList.size() && counter < size; index++) {
                tests.add(methodList.get(index).getName());
                counter += 1;
            }
            splitTests.add(tests);
        }

        this.outputFilename = outputFilename;
        this.splitTests = splitTests;
    }

    @Override
    public void printResults() {
        for (int i = 0; i < splitTests.size(); i++) {
            printResults(outputFilename + i, splitTests.get(i));
        }
    }

    private void printResults(String filename, List<String> tests) {
        if (filename == null) {
            for (String s : tests) {
                System.out.println(s);
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(filename);
                writer = new BufferedWriter(output);

                for (String s : tests) {
                    writer.write(s + "\n");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                    if (output != null) {
                        output.close();
                    }
                } catch (IOException e) {
                    // Ignore issues during closing
                }
            }
        }
    }
}