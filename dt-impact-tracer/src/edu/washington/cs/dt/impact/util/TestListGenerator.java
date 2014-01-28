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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;

public class TestListGenerator {
    private static Set<String> allLines = new HashSet<String>();

    public static void main(String[] args) {
        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        // get the technique, the default is absolute
        TECHNIQUE techniqueName = Constants.DEFAULT_TECHNIQUE;
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
                .println("Technique name is invalid. Try \"prioritization-absolute\", \"prioritization-relative\", \"random\" or \"selection\".");
                System.exit(0);
            }
        }

        // get directory for the input of test files, the default is sootTestOutput
        int testInputDir = argsList.indexOf("-testInputDir");
        String testInputDirName = Constants.DEFAULT_TEST_DIR;
        if (testInputDir != -1) {
            int testInputDirNameIndex = testInputDir + 1;
            if (testInputDirNameIndex >= argsList.size()) {
                System.err
                .println("Test input directory argument is specified but a directory name is not. Please use the format: -testInputDir aDirName");
                System.exit(0);
            }
            testInputDirName = argsList.get(testInputDirNameIndex);
        }

        // if specified, the output is saved to the file name instead of printed to console
        String outputFileName = null;
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
        COVERAGE coverage = COVERAGE.STATEMENT;
        int coverageIndex = argsList.indexOf("-coverage");
        if (coverageIndex != -1) {
            int coverageNameIndex = coverageIndex + 1;
            if (coverageNameIndex >= argsList.size()) {
                System.err
                .println("Coverage argument is specified but valid coverage was not. Please use the format: -coverage aCoverageName");
                System.exit(0);
            }
            String coverageStr = argsList.get(coverageNameIndex).trim().toLowerCase();
            if (coverageStr.equals("statement")) {
                coverage = COVERAGE.STATEMENT;
            } else if (coverageStr.equals("branch")) {
                coverage = COVERAGE.BRANCH;
            } else if (coverageStr.equals("function")) {
                coverage = COVERAGE.FUNCTION;
            } else {
                System.err
                .println("Coverage is invalid. Try \"statement\", \"branch\" or \"function\".");
                System.exit(0);
            }
        }

        File selectionOutput1 = null;
        File selectionOutput2 = null;
        File origOrder = null;
        if (techniqueName == TECHNIQUE.SELECTION) {
            // get directory of old version's selection output
            int oldVersCFGIndex = argsList.indexOf("-oldVersCFG");
            if (oldVersCFGIndex != -1) {
                int oldVersCFGNameIndex = oldVersCFGIndex + 1;
                if (oldVersCFGNameIndex >= argsList.size()) {
                    System.err.println("Old version CFG argument is specified but a directory path is not. Please use the format: -oldVersCFG adirpath");
                    System.exit(0);
                }
                selectionOutput1 = new File(argsList.get(oldVersCFGNameIndex));
                if (!selectionOutput1.isDirectory()) {
                    System.err.println("Old version CFG argument is specified but the directory path is invalid. Please check the directory path.");
                    System.exit(0);
                }
            } else {
                System.err.println("No old version CFG argument is specified. Please use the format: -oldVersCFG adirpath");
                System.exit(0);
            }

            // get directory of new version's selection output
            int newVersCFGIndex = argsList.indexOf("-newVersCFG");
            if (newVersCFGIndex != -1) {
                int newVersCFGNameIndex = newVersCFGIndex + 1;
                if (newVersCFGNameIndex >= argsList.size()) {
                    System.err.println("New version CFG argument is specified but a directory path is not. Please use the format: -newVersCFG adirpath");
                    System.exit(0);
                }
                selectionOutput2 = new File(argsList.get(newVersCFGNameIndex));
                if (!selectionOutput2.isDirectory()) {
                    System.err.println("New version CFG argument is specified but the directory path is invalid. Please check the directory path.");
                    System.exit(0);
                }
            } else {
                System.err.println("No new version CFG argument is specified. Please use the format: -newVersCFG adirpath");
                System.exit(0);
            }

            // get file for the original order in which the tests should be ordered
            int origOrderIndex = argsList.indexOf("-origOrder");
            if (origOrderIndex != -1) {
                int origOrderNameIndex = origOrderIndex + 1;
                if (origOrderNameIndex >= argsList.size()) {
                    System.err.println("Original order argument is specified but a directory path is not. Please use the format: -origOrder afilepath");
                    System.exit(0);
                }
                origOrder = new File(argsList.get(origOrderNameIndex));
                if (!origOrder.isFile()) {
                    System.err.println("Original order argument is specified but the file path is invalid. Please check the file path.");
                    System.exit(0);
                }
            }
        }

        List<TestMethodData> methodList = listFilesForFolder(new File(testInputDirName), coverage);
        if (techniqueName == TECHNIQUE.PRIORITIZATION_ABSOLUTE) {
            testPrioritization(methodList, outputFileName, false);
        } else if (techniqueName == TECHNIQUE.PRIORITIZATION_RELATIVE) {
            testPrioritization(methodList, outputFileName, true);
        } else if (techniqueName == TECHNIQUE.SELECTION) {
            Set<String> changedCoverage = findCoverage(selectionOutput1, selectionOutput2, coverage);
            methodList = testSelection(changedCoverage, origOrder, methodList);
            outputMethodList(methodList, outputFileName);
        } else if (techniqueName == TECHNIQUE.RANDOM) {
            Collections.shuffle(methodList);
            outputMethodList(methodList, outputFileName);
        }
    }

    private static void outputMethodList(List<TestMethodData> methodList, String outputFileName) {
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

    private static void testPrioritization(List<TestMethodData> methodList, String outputFileName, boolean isRelative) {
        Collections.sort(methodList);
        if (outputFileName == null) {
            if (isRelative) {
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

    private static Set<String> findCoverage(File selectionOutput1, File selectionOutput2, final COVERAGE coverage) {
        Map<String, List<String>> oldVersMap = coverageCount(selectionOutput1);
        Map<String, List<String>> newVersMap = coverageCount(selectionOutput2);
        Set<String> changedCoverage = new HashSet<String>();

        if (coverage == COVERAGE.FUNCTION) {
            // generate the list of methods that has been changed
            for (String key : oldVersMap.keySet()) {
                if (!newVersMap.containsKey(key) || !oldVersMap.get(key).equals(newVersMap.get(key))) {
                    changedCoverage.add(key);
                }
            }
        } else if (coverage == COVERAGE.STATEMENT){
            // generate the list of statements that has been changed
            for (String key : oldVersMap.keySet()) {
                if (!newVersMap.containsKey(key)) {
                    changedCoverage.addAll(oldVersMap.get(key));
                } else if (!oldVersMap.get(key).equals(newVersMap.get(key))) {
                    oldVersMap.get(key).removeAll(newVersMap.get(key));
                    changedCoverage.addAll(oldVersMap.get(key));
                }
            }
        }

        return changedCoverage;
    }

    private static List<TestMethodData> testSelection(Set<String> changedCoverage, File origOrder, List<TestMethodData> methodList) {
        // removes all tests from consideration if they don't execute any of the methods that has been changed
        Map<String, TestMethodData> nameToMethodData = new HashMap<String, TestMethodData>();
        for (TestMethodData methodData : methodList) {
            methodData.retainLines(changedCoverage);
            if (methodData.getLineCount() != 0) {
                nameToMethodData.put(methodData.getName(), methodData);
            }
        }

        // determine the order in which the tests should be outputted
        if (origOrder == null) {
            methodList.retainAll(nameToMethodData.values());
            Collections.sort(methodList);
        } else {
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

        return methodList;
    }

    private static Map<String, List<String>> coverageCount(final File folder) {
        Map<String, List<String>> retMap = new HashMap<String, List<String>>();

        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                BufferedReader br;
                try {
                    br = new BufferedReader(new FileReader(fileEntry));
                    String line;
                    List<String> lines = new LinkedList<String>();
                    while ((line = br.readLine()) != null) {
                        lines.add(line);
                    }
                    br.close();
                    retMap.put(fileEntry.getName(), lines);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            } else {
                continue;
            }
        }

        return retMap;
    }

    private static List<TestMethodData> listFilesForFolder(final File folder, final COVERAGE coverage ) {
        List<TestMethodData> methodList = new ArrayList<TestMethodData>();
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
}