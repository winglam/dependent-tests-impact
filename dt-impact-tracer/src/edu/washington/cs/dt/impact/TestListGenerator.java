package edu.washington.cs.dt.impact;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListGenerator {

    private enum TECHNIQUE {PRIORITIZATION, SELECTION};
    private final static TECHNIQUE DEFAULT_TECHNIQUE = TECHNIQUE.PRIORITIZATION;
    private final static String DEFAULT_TEST_DIR = "sootTestOutput";
    private static String outputFileName;
    private static List<TestMethodData> methodList = new ArrayList<TestMethodData>();

    public static void main(String[] args) {
        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        TECHNIQUE techniqueName = DEFAULT_TECHNIQUE;
        // get the technique
        int techniqueIndex = argsList.indexOf("-technique");
        if (techniqueIndex!= -1) {
            // get index of technique name
            int techniqueNameIndex = techniqueIndex + 1;
            if (techniqueNameIndex >= argsList.size()) {
                System.err.println("Technique argument is specified but technique name is not. Please use the format: -technique aTechniqueName");
                System.exit(0);
            }

            String techniqueStr = argsList.get(techniqueNameIndex).toLowerCase().trim();
            if (techniqueStr.equals("prioritization")) {
                techniqueName = TECHNIQUE.PRIORITIZATION;
            } else if (techniqueStr.equals("selection")) {
                techniqueName = TECHNIQUE.SELECTION;
            } else {
                System.err.println("Technique name is invalid. Try \"prioritization\" or \"selection\".");
                System.exit(0);
            }
        }

        // get directory for the input of text files
        int testInputDir = argsList.indexOf("-testInputDir");
        String testInputDirName = DEFAULT_TEST_DIR;
        if (testInputDir != -1) {
            // get index of output directory
            int testInputDirNameIndex = testInputDir + 1;
            if (testInputDirNameIndex >= argsList.size()) {
                System.err.println("Test input directory argument is specified but a directory name is not. Please use the format: -testInputDir aDirName");
                System.exit(0);
            }
            testInputDirName = argsList.get(testInputDirNameIndex);
        }

        // if specified, the output is saved to the file name instead of printed to console
        int outputFile = argsList.indexOf("-outputFile");
        if (outputFile!= -1) {
            // get index of output file
            int outputFileNameIndex = outputFile+ 1;
            if (outputFileNameIndex >= argsList.size()) {
                System.err.println("Output file argument is specified but a file name is not. Please use the format: -outputFile aFileName");
                System.exit(0);
            }
            outputFileName = argsList.get(outputFileNameIndex);
        }

        if (techniqueName == TECHNIQUE.PRIORITIZATION) {
            testPrioritization(testInputDirName);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            testSelection(testInputDirName);
        }
    }

    public static void testPrioritization(String outputDirName) {
        listFilesForFolder(new File(outputDirName));
        Collections.sort(methodList);
        if (outputFileName == null) {
            for (TestMethodData methodData : methodList) {
                System.out.println(methodData.getName());
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(outputFileName);
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

    public static void testSelection(String outputDirName) {

    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                TestMethodData methodData = new TestMethodData(fileEntry.getName());
                BufferedReader br;
                try {
                    br = new BufferedReader(new FileReader(fileEntry));
                    String line;
                    while ((line = br.readLine()) != null) {
                        methodData.addLine(line);
                    }
                    br.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                methodList.add(methodData);
            } else {
                continue;
            }
        }
    }
}
