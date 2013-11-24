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

    private enum TECHNIQUE {PRIORITIZATION_STMT_ABSOLUTE, PRIORITIZATION_STMT_RELATIVE, SELECTION};
    private final static TECHNIQUE DEFAULT_TECHNIQUE = TECHNIQUE.PRIORITIZATION_STMT_ABSOLUTE;
    private final static String DEFAULT_TEST_DIR = "sootTestOutput";
    private static String outputFileName;
    private static List<TestMethodData> methodList = new ArrayList<TestMethodData>();
    private static boolean isRelative = false;

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
            if (techniqueStr.equals("prioritization-stmt-absolute")) {
                techniqueName = TECHNIQUE.PRIORITIZATION_STMT_ABSOLUTE;
            } else if (techniqueStr.equals("prioritization-stmt-relative")) {
                techniqueName = TECHNIQUE.PRIORITIZATION_STMT_RELATIVE;
            } else if (techniqueStr.equals("selection")) {
                techniqueName = TECHNIQUE.SELECTION;
            } else {
                System.err.println("Technique name is invalid. Try \"prioritization-stmt-absolute\", \"prioritization-stmt-relative\" or \"selection\".");
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
        if (outputFile != -1) {
            // get index of output file
            int outputFileNameIndex = outputFile + 1;
            if (outputFileNameIndex >= argsList.size()) {
                System.err.println("Output file argument is specified but a file name is not. Please use the format: -outputFile aFileName");
                System.exit(0);
            }
            outputFileName = argsList.get(outputFileNameIndex);
        }

        // if specified, the output is saved to the file name instead of printed to console
        int coverageIndex = argsList.indexOf("-coverage");
        if (coverageIndex != -1) {
            // get index of output file
            int coverageNameIndex = coverageIndex + 1;
            if (coverageNameIndex  >= argsList.size()) {
                System.err.println("Coverage argument is specified but valid coverage was not. Please use the format: -coverage aCoverageName");
                System.exit(0);
            }
            String coverageStr = argsList.get(coverageNameIndex).trim().toLowerCase();
            if (coverageStr.equals("statement")) {
                TestMethodData.coverage = Constants.COVERAGE.STATEMENT;
            } else if (coverageStr.equals("branch")) {
                TestMethodData.coverage = Constants.COVERAGE.BRANCH;
            } else if (coverageStr.equals("function")) {
                TestMethodData.coverage = Constants.COVERAGE.FUNCTION;
            } else {
                System.err.println("Coverage is invalid. Try \"statement\", \"branch\" or \"function\".");
                System.exit(0);
            }
        }


        if (techniqueName == TECHNIQUE.PRIORITIZATION_STMT_ABSOLUTE) {
            testPrioritizationStmt(testInputDirName);
        } else if (techniqueName == TECHNIQUE.PRIORITIZATION_STMT_RELATIVE) {
            isRelative = true;
            testPrioritizationStmt(testInputDirName);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            testSelection(testInputDirName);
        }
    }

    public static void testPrioritizationStmt(String outputDirName) {
        listFilesForFolder(new File(outputDirName));
        Collections.sort(methodList);
        if (outputFileName == null) {
            if (isRelative) {
                while (methodList.size() > 0) {
                    TestMethodData highestData = methodList.remove(0);
                    System.out.println(highestData.getName());
                    for (TestMethodData methodData : methodList) {
                        methodData.removeLines(highestData.getLines());
                    }
                    Collections.sort(methodList);
                }
            } else {
                for (TestMethodData methodData : methodList) {
                    System.out.println(methodData.getName());
                }
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(outputFileName);
                writer = new BufferedWriter(output);
                if (isRelative) {
                    while (methodList.size() > 0) {
                        TestMethodData highestData = methodList.remove(0);
                        writer.write(highestData.getName() + "\n");
                        for (TestMethodData methodData : methodList) {
                            methodData.removeLines(highestData.getLines());
                        }
                        Collections.sort(methodList);
                    }
                } else {
                    for (TestMethodData methodData : methodList) {
                        writer.write(methodData.getName() + "\n");
                    }
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
        // TODO
    }

    public static void listFilesForFolder(final File folder) {
        if (folder == null) {
            throw new RuntimeException("sootOutput is missing some required classes.");
        }

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
