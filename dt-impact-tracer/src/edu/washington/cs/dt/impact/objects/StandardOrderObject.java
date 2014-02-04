package edu.washington.cs.dt.impact.objects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import edu.washington.cs.dt.impact.util.TestMethodData;


public class StandardOrderObject implements OrderObject {
    private String filename;
    private List<TestMethodData> methodList;

    public StandardOrderObject(String outputFileName, List<TestMethodData> methodList) {
        this.filename = outputFileName;
        this.methodList = methodList;
    }

    @Override
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
