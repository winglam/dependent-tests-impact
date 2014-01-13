package edu.washington.cs.dt.impact.util;

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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;

public class TestListGenerator {
    private static String outputFileName;
    private static List<TestMethodData> methodList = new ArrayList<TestMethodData>();
    private static boolean isRelative = false;
    private static Set<String> currentLines = new HashSet<String>();
    private static Set<String> allLines = new HashSet<String>();
    private static COVERAGE coverage = COVERAGE.STATEMENT;

    public static void main(String[] args) {
        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        TECHNIQUE techniqueName = Constants.DEFAULT_TECHNIQUE;
        // get the technique, the default is absolute
        int techniqueIndex = argsList.indexOf("-technique");
        if (techniqueIndex != -1) {
            // get index of technique name
            int techniqueNameIndex = techniqueIndex + 1;
            if (techniqueNameIndex >= argsList.size()) {
                System.err
                .println("Technique argument is specified but technique name is not. Please use the format: -technique aTechniqueName");
                System.exit(0);
            }

            String techniqueStr = argsList.get(techniqueNameIndex).toLowerCase().trim();
            if (techniqueStr.equals("prioritization-absolute")) {
                techniqueName = TECHNIQUE.PRIORITIZATION_ABSOLUTE;
            } else if (techniqueStr.equals("prioritization-relative")) {
                techniqueName = TECHNIQUE.PRIORITIZATION_RELATIVE;
            } else if (techniqueStr.equals("selection")) {
                techniqueName = TECHNIQUE.SELECTION;
            } else if (techniqueStr.equals("random")) {
                techniqueName = TECHNIQUE.RANDOM;
            } else {
                System.err
                .println("Technique name is invalid. Try \"prioritization-absolute\", \"prioritization-relative\" or \"selection\".");
                System.exit(0);
            }
        }

        // get directory for the input of text files
        int testInputDir = argsList.indexOf("-testInputDir");
        String testInputDirName = Constants.DEFAULT_TEST_DIR;
        if (testInputDir != -1) {
            // get index of output directory
            int testInputDirNameIndex = testInputDir + 1;
            if (testInputDirNameIndex >= argsList.size()) {
                System.err
                .println("Test input directory argument is specified but a directory name is not. Please use the format: -testInputDir aDirName");
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
                System.err
                .println("Output file argument is specified but a file name is not. Please use the format: -outputFile aFileName");
                System.exit(0);
            }
            outputFileName = argsList.get(outputFileNameIndex);
        }

        // get the coverage, the default is statement
        int coverageIndex = argsList.indexOf("-coverage");
        if (coverageIndex != -1) {
            // get index of output file
            int coverageNameIndex = coverageIndex + 1;
            if (coverageNameIndex >= argsList.size()) {
                System.err
                .println("Coverage argument is specified but valid coverage was not. Please use the format: -coverage aCoverageName");
                System.exit(0);
            }
            String coverageStr = argsList.get(coverageNameIndex).trim().toLowerCase();
            if (coverageStr.equals("statement")) {
                coverage = Constants.COVERAGE.STATEMENT;
            } else if (coverageStr.equals("branch")) {
                coverage = Constants.COVERAGE.BRANCH;
            } else if (coverageStr.equals("function")) {
                coverage = Constants.COVERAGE.FUNCTION;
            } else {
                System.err
                .println("Coverage is invalid. Try \"statement\", \"branch\" or \"function\".");
                System.exit(0);
            }
        }

        if (techniqueName == TECHNIQUE.PRIORITIZATION_ABSOLUTE) {
            testPrioritization(testInputDirName);
        } else if (techniqueName == TECHNIQUE.PRIORITIZATION_RELATIVE) {
            isRelative = true;
            testPrioritization(testInputDirName);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            testSelection(testInputDirName);
        } else if (techniqueName == TECHNIQUE.RANDOM) {
            testRandom(testInputDirName);
        }
    }

    private static void testRandom(String outputDirName) {
        listFilesForFolder(new File(outputDirName));
        Collections.shuffle(methodList);

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

    private static void testPrioritization(String outputDirName) {
        listFilesForFolder(new File(outputDirName));
        Collections.sort(methodList);
        if (outputFileName == null) {
            if (isRelative) {
                currentLines = new HashSet<String>(allLines);
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
                    currentLines = new HashSet<String>(allLines);
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

    private static void testSelection(String outputDirName) {
        // TODO
    }

    private static void listFilesForFolder(final File folder) {
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
                        if (coverage == Constants.COVERAGE.STATEMENT) {
                            allLines.add(line);
                            methodData.addLine(line);
                        } else if (coverage == Constants.COVERAGE.FUNCTION) {
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
    }
}
