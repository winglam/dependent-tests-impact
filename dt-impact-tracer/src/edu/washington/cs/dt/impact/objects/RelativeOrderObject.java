package edu.washington.cs.dt.impact.objects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.util.TestMethodData;

public class RelativeOrderObject implements OrderObject{
    private Set<String> allLines;
    private String outputFileName;
    private List<TestMethodData> methodList;

    public RelativeOrderObject(String outputFileName, List<TestMethodData> methodList, Set<String> allLines) {
        this.allLines = allLines;
        this.outputFileName = outputFileName;
        this.methodList = methodList;
    }

    @Override
    public void printResults() {
        if (outputFileName == null) {
            printToConsole();
        } else {
            printToFile();
        }
    }

    private void printToConsole() {
        Set<String> currentLines = new HashSet<String>(allLines);
        while (methodList.size() > 0) {
            TestMethodData highestData = methodList.remove(0);
            System.out.println(highestData.getName());
            Set<String> highestDataLines = highestData.getLines();
            for (TestMethodData methodData : methodList) {
                methodData.removeLines(highestDataLines);
            }
            currentLines.removeAll(highestDataLines);

            // all possible lines of code have been executed
            if (currentLines.size() == 0) {
                currentLines = new HashSet<String>(allLines);
                for (TestMethodData tmd : methodList) {
                    tmd.reset();
                }
            }

            Collections.sort(methodList);
        }
    }

    private void printToFile() {
        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter(outputFileName);
            writer = new BufferedWriter(output);

            Set<String> currentLines = new HashSet<String>(allLines);
            while (methodList.size() > 0) {
                TestMethodData highestData = methodList.remove(0);
                Set<String> highestDataLines = highestData.getLines();
                writer.write(highestData.getName() + "\n");
                for (TestMethodData methodData : methodList) {
                    methodData.removeLines(highestDataLines);
                }
                currentLines.removeAll(highestDataLines);

                // all possible lines of code have been executed
                if (currentLines.size() == 0) {
                    currentLines = new HashSet<String>(allLines);
                    for (TestMethodData tmd : methodList) {
                        tmd.reset();
                    }
                }

                Collections.sort(methodList);
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
