package edu.washington.cs.dt.impact.objects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.util.TestMethodData;


public class StandardOrderObject {
    protected String filename;
    protected List<TestMethodData> methodList;

    public StandardOrderObject(String outputFileName, List<TestMethodData> methodList) {
        this.filename = outputFileName;
        this.methodList = methodList;
    }

    public void checkForDependentTests() {
        Set<TestMethodData> printedTests = new HashSet<TestMethodData>();
        List<TestMethodData> dtMethodList = new LinkedList<TestMethodData>();
        for (TestMethodData tmd : methodList) {
            sortDT(dtMethodList.size(), dtMethodList, printedTests, tmd);
        }
        this.methodList = dtMethodList;
    }

    private int sortDT(int index, List<TestMethodData> dtMethodList, Set<TestMethodData> printedTests, TestMethodData methodData) {
        if (!printedTests.contains(methodData)) {
            Set<TestMethodData> execBefore = methodData.getDependentTests(true);
            for (TestMethodData tmd : execBefore) {
                if (dtMethodList.indexOf(tmd) >= 0 && dtMethodList.indexOf(tmd) < index) {
                    index = dtMethodList.indexOf(tmd);
                }
            }

            Set<TestMethodData> execAfter = methodData.getDependentTests(false);
            for (TestMethodData tmd : execAfter) {
                index = sortDT(index, dtMethodList, printedTests, tmd);
            }

            printedTests.add(methodData);
            dtMethodList.add(index, methodData);
            index += 1;

            for (TestMethodData tmd : execBefore) {
                index = sortDT(index, dtMethodList, printedTests, tmd);
            }
        }
        return index;
    }

    public void printResults() {
        if (filename == null) {
            for (TestMethodData methodData : methodList) {
                System.out.println(methodData.getName());
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(filename);
                writer = new BufferedWriter(output);

                for (TestMethodData methodData : methodList) {
                    writer.write(methodData.getName() + "\n");
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
