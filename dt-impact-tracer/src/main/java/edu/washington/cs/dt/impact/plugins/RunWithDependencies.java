package edu.washington.cs.dt.impact.plugins;

import com.reedoei.testrunner.mavenplugin.TestPluginPlugin;
import com.reedoei.testrunner.testobjects.TestLocator;
import edu.washington.cs.dt.impact.runner.OneConfigurationRunner;
import edu.washington.cs.dt.impact.runner.Runner;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.maven.cli.MavenCli;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.classworlds.realm.ClassRealm;
import scala.collection.JavaConverters;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RunWithDependencies {
    // Constants
    static final int MEDIANTIMES = 5;
    static final int RANDOMTIMES = 100;

    static final String[] TESTTYPES = { "orig" };
    static final String[] COVERGAES = { "statement", "function" };
    static String[] MACHINES = { "2", "4", "8", "16"};

    static final String[] PRIOORDERS = { "absolute", "relative" };
    static final String[] SELEORDERS = { "original", "absolute", "relative"};

    // Args (Re-Declared Upon Each Use)
    String[] args = {};

    // MavenCli Variables
    ClassRealm classRealm = (ClassRealm) Thread.currentThread().getContextClassLoader();
    MavenCli cli = new MavenCli(classRealm.getWorld());

    // Old Version Main Directories
    String dtSubjectSource, dtSubject, dtTools, dtLibs, dtClass, dtTests;

    // Old Version Output Directories
    String dtResults, dtData, prioResults, seleResults, paraResults, prioDTLists, seleDTLists, paraDTLists;

    // New Version Main Directories
    String newDTSubjectSource, newDTSubject, newDTTools, newDTLibs, newDTClass, newDTTests;
    String subprocessOutput;

    public void execute(MavenProject project) {
        // Project Setup
        setupPaths(project);
        gatherDependencies();
        gatherTests(project);

        // Setup Test Algorithms
        setupTestSelection();

        // Run With Dependencies
        String classpath = newDTLibs  + ":" + newDTTools + ":" + newDTTests + ":" + newDTClass;
        runTestPrioritization(classpath);
        runTestSelection(classpath);
        runTestParallelization(classpath);
    }

    private void setupPaths(MavenProject project) {
        // Old Version
        dtSubjectSource = System.getProperty("path");

        dtSubject = dtSubjectSource.concat("/target");
        dtTools = buildClassPath(dtSubjectSource.concat("/lib/*"));
        dtLibs = buildClassPath(dtSubject.concat("/dependency/*"));
        dtClass = dtSubject.concat("/classes");
        dtTests = dtSubject.concat("/test-classes");

        // Old Version Data
        dtResults = dtSubjectSource.concat("/results");
        dtData = dtResults.concat("/data");
        prioResults = dtResults.concat("/prioritization-results");
        seleResults = dtResults.concat("/selection-results");
        paraResults = dtResults.concat("/parallelization-results");

        prioDTLists = dtData.concat("/prioritization-dt-lists");
        seleDTLists = dtData.concat("/selection-dt-lists");
        paraDTLists = dtData.concat("/parallelization-dt-lists");

        // New Version
        newDTSubjectSource = System.getProperty("user.dir");

        newDTSubject = newDTSubjectSource.concat("/target");
            new File(newDTSubject).mkdirs();
        newDTTools = buildClassPath(newDTSubjectSource.concat("/lib/*"));
        newDTLibs = buildClassPath(newDTSubject.concat("/dependency/*"));
        newDTClass = newDTSubject.concat("/classes");
        newDTTests = newDTSubject.concat("/test-classes");
    }

    // Compile & Gather The Dependencies Of The Subject
    private void gatherDependencies() {
        TestPluginPlugin.info("Gathering Dependencies Of The Subject");

        cli.doMain(new String[]{"compile",
                "test-compile",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip"}, newDTSubjectSource, System.out, System.out);
        cli.doMain(new String[]{"install",
                "-fn",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip"}, newDTSubjectSource, System.out, System.out);
    }

    // Gather Tests
    private void gatherTests(MavenProject project) {
        TestPluginPlugin.info("Moving Test Info From The Old Version To The New Version");
        try {
            FileUtils.moveFile(new File(dtResults + "/orig-order.txt"), new File(newDTSubjectSource + "/orig-order.txt"));
            FileUtils.moveFile(new File(dtResults + "/ignore-order.txt"), new File(newDTSubjectSource + "/ignore-order.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        TestPluginPlugin.info("Removing Failed Tests");
        try {
            List<String> origOrder = Files.readAllLines(new File(newDTSubjectSource + "/orig-order.txt").toPath());
            List<String> ignoreOrder = Files.readAllLines(new File(newDTSubjectSource + "/ignore-order.txt").toPath());
            origOrder.removeAll(ignoreOrder);

            Files.write(new File(newDTSubjectSource + "/orig-order.txt").toPath(), origOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TestPluginPlugin.info("Removing Missing Tests");
        humanWrittenTests(project);
        try {
            List<String> origOrder = Files.readAllLines(new File(newDTSubjectSource + "/orig-order.txt").toPath());
            List<String> newOrigOrder = Files.readAllLines(new File(newDTSubjectSource + "/new-orig-order.txt").toPath());

            List<String> missingTests = new ArrayList<>(origOrder);
            missingTests.removeAll(newOrigOrder);
            origOrder.removeAll(missingTests);

            Files.write(new File(newDTSubjectSource + "/orig-order.txt").toPath(), origOrder);
            FileUtils.deleteQuietly(new File(newDTSubjectSource + "/new-orig-order.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Adjust MACHINES (Less Tests Than Number Of Cores)
        int numInvalidEntries = 0;
        for (String num : MACHINES){
            try {
                if ((int)Files.lines(new File(newDTSubjectSource + "/orig-order.txt").toPath()).count() < Integer.parseInt(num)){
                    numInvalidEntries++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] temp = new String[MACHINES.length - numInvalidEntries];
        for (int i = 0; i < temp.length; i++){
            temp[i] = MACHINES[i];
        }
        MACHINES = temp;
    }

    private void humanWrittenTests(MavenProject project){
        TestPluginPlugin.info("Finding Human Written Tests (new version, original tests)");
        try {
            // Generates orig-order.txt
            final List<String> tests = JavaConverters.bufferAsJavaList(TestLocator.tests(project).toBuffer());
            FileWriter writer = new FileWriter(new File(newDTSubjectSource + "/new-orig-order.txt"));
            for(String str: tests) {
                writer.write(str);
                writer.write(System.getProperty("line.separator"));
            }
            writer.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // Setup Test Selection On The New Version
    private void setupTestSelection() {
        String JAVA_HOME = expandEnvVars("${JAVA_HOME}");

        // Instrument Source Files
        TestPluginPlugin.info("Test Selection: Instrumenting Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + newDTTools + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + newDTClass +
                    " --soot-cp " + newDTLibs + ":" + newDTClass + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") +
                    " -technique selection" +
                    " --java-version 1.8";
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: java -cp newDTTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir newDTClass" +
                    " --soot-cp newDTLibs:newDTClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection" +
                    " --java-version 1.8");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error Stream For: java -cp newDTTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir newDTClass" +
                    " --soot-cp newDTLibs:newDTClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection" +
                    " --java-version 1.8");
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete Unncessary Files
        try {
            FileUtils.deleteDirectory(new File(newDTSubjectSource + "/sootOutput"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Run Test Prioritization With Dependencies
    private void runTestPrioritization(String classpath){
        // Create env-files File
        try {
            new File(newDTSubjectSource + "/env-files").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Run Technique With Dependencies
        TestPluginPlugin.info("Test Prioritization: Running With Dependencies");
        for (String k : TESTTYPES) {
            String postProcessFlag = "";

            TestPluginPlugin.info("Running Prioritization For: " + k + "Test Type");
            args = new String[]{
                    "-technique", "prioritization",
                    "-coverage", "statement",
                    "-order", "original",
                    "-origOrder", newDTSubjectSource + "/" + k + "-order.txt",
                    "-testInputDir", dtResults + "/sootTestOutput-" + k,
                    "-filesToDelete", newDTSubjectSource + "/env-files",
                    "-project", "",
                    "-testType", k,
                    "-outputDir", prioResults,
                    "-timeToRun", Integer.toString(MEDIANTIMES),
                    "-classpath", classpath,
                    "-getCoverage",
                    postProcessFlag};
            Runner.nullOutputFileName();
            TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
            OneConfigurationRunner.main(args);

            for (String i : COVERGAES) {
                for (String j : PRIOORDERS) {
                    TestPluginPlugin.info("Running Prioritization Without Dependent Test File");
                    args = new String[]{
                            "-technique", "prioritization",
                            "-coverage", i,
                            "-order", j,
                            "-origOrder", newDTSubjectSource + "/" + k + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + k,
                            "-filesToDelete", newDTSubjectSource + "/env-files",
                            "-getCoverage",
                            "-project", "",
                            "-testType", k,
                            "-outputDir", prioResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);

                    TestPluginPlugin.info("Running Prioritization With Dependent Test File");
                    args = new String[]{
                            "-technique", "prioritization",
                            "-coverage", i,
                            "-order", j,
                            "-origOrder", newDTSubjectSource + "/" + k + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + k,
                            "-filesToDelete", newDTSubjectSource + "/env-files",
                            "-getCoverage",
                            "-project", "",
                            "-testType", k,
                            "-outputDir", prioResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            "-dependentTestFile", prioDTLists + "/prioritization-" + "" + "-" + k + "-" + i + "-" + j + ".txt",
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);
                }
            }
        }
    }

    // Run Test Selection With Dependencies
    private void runTestSelection(String classpath){
        // Create env-files File
        try {
            new File(newDTSubjectSource + "/env-files").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Run Technique With Dependencies
        TestPluginPlugin.info("Test Selection: Running With Dependencies");
        for (String k : TESTTYPES) {
            String postProcessFlag = "";

            TestPluginPlugin.info("Running Selection For: " + k + "Test Type");
            args = new String[]{
                    "-technique", "prioritization",
                    "-coverage", "statement",
                    "-order", "original",
                    "-origOrder", newDTSubjectSource + "/" + k + "-order.txt",
                    "-testInputDir", dtResults + "/sootTestOutput-" + k + "-selection",
                    "-filesToDelete", newDTSubjectSource + "/env-files",
                    "-project", "",
                    "-testType", k,
                    "-outputDir", seleResults,
                    "-timeToRun", Integer.toString(MEDIANTIMES),
                    "-classpath", classpath,
                    "-getCoverage",
                    postProcessFlag};
            Runner.nullOutputFileName();
            TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
            OneConfigurationRunner.main(args);

            for (String i : COVERGAES) {
                for (String j : SELEORDERS) {
                    TestPluginPlugin.info("Running Selection Without Dependent Test File");
                    args = new String[]{
                            "-technique", "selection",
                            "-coverage", i,
                            "-order", j,
                            "-origOrder", newDTSubjectSource + "/" + k + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + k + "-selection",
                            "-filesToDelete", newDTSubjectSource + "/env-files",
                            "-project", "",
                            "-testType", k,
                            "-oldVersCFG", dtResults + "/selectionOutput",
                            "-newVersCFG", newDTSubjectSource + "/selectionOutput",
                            "-getCoverage",
                            "-outputDir", seleResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);

                    TestPluginPlugin.info("Running Selection With Dependent Test File");
                    args = new String[]{
                            "-technique", "selection",
                            "-coverage", i,
                            "-order", j,
                            "-origOrder", newDTSubjectSource + "/" + k + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + k + "-selection",
                            "-filesToDelete", newDTSubjectSource + "/env-files",
                            "-project", "",
                            "-testType", k,
                            "-oldVersCFG", dtResults + "/selectionOutput",
                            "-newVersCFG", newDTSubjectSource + "/selectionOutput",
                            "-getCoverage",
                            "-outputDir", seleResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            "-dependentTestFile", seleDTLists + "/selection-" + "" + "-" + k + "-" + i + "-" + j + ".txt",
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);
                }
            }
        }
    }

    // Run Test Parallelization With Dependencies
    private void runTestParallelization(String classpath){
        // Create env-files File
        try {
            new File(newDTSubjectSource + "/env-files").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Run Technique With Dependencies
        TestPluginPlugin.info("Test Parallelization: Running With Dependencies");
        for (String j : TESTTYPES) {
            String postProcessFlag = "";

            TestPluginPlugin.info("Running Parallelization For: " + j + "Test Type");
            args = new String[]{
                    "-technique", "prioritization",
                    "-coverage", "statement",
                    "-order", "original",
                    "-origOrder", newDTSubjectSource + "/" + j + "-order.txt",
                    "-testInputDir", dtResults + "/sootTestOutput-" + j,
                    "-filesToDelete", newDTSubjectSource + "/env-files",
                    "-project", "",
                    "-testType", j,
                    "-outputDir", paraResults,
                    "-timeToRun", Integer.toString(MEDIANTIMES),
                    "-classpath", classpath,
                    "-getCoverage",
                    postProcessFlag};
            Runner.nullOutputFileName();
            TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
            OneConfigurationRunner.main(args);

            String[] paraOrders = { "original", "time" };
            for (String k : MACHINES) {
                for (String order : paraOrders) {
                    String timeFlag = "";
                    if (order.equals("time")){
                        timeFlag = dtResults + "/" + j + "-time.txt";
                    }

                    TestPluginPlugin.info("Running Parallelization Without Dependent Test File");
                    args = new String[]{
                            "-technique", "parallelization",
                            "-order", order,
                            "-timeOrder", timeFlag,
                            "-origOrder", newDTSubjectSource + "/" + j + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + j,
                            "-filesToDelete", newDTSubjectSource + "/env-files",
                            "-project", "",
                            "-testType", j,
                            "-numOfMachines", k,
                            "-outputDir", paraResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);

                    TestPluginPlugin.info("Running Parallelization With Dependent Test File");
                    args = new String[]{
                            "-technique", "parallelization",
                            "-order", order,
                            "-timeOrder", timeFlag,
                            "-origOrder", newDTSubjectSource + "/" + j + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + j,
                            "-filesToDelete", newDTSubjectSource + "/env-files",
                            "-project", "",
                            "-testType", j,
                            "-numOfMachines", k,
                            "-outputDir", paraResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            "-dependentTestFile", paraDTLists + "/parallelization-" + "" + "-" + j + "-" + k + "-" + order + ".txt",
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);
                }
            }
        }
    }

    /**
     * This function builds a classpath from the passed string
     * From https://stackoverflow.com/questions/4752817/expand-environment-variables-in-text
     *
     * @param text environment variable
     * @return returns the complete classpath with the environment_variable expanded
     */
    public static String expandEnvVars(String text) {
        Map<String, String> envMap = System.getenv();
        for (Map.Entry<String, String> entry : envMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            text = text.replaceAll("\\$\\{" + key + "\\}", value);
        }
        return text;
    }

    /**
     * This function builds a classpath from the passed Strings
     * From https://stackoverflow.com/questions/22965975/how-to-set-up-classpath-of-javacompiler-to-multiple-jar-files-using-wildcard
     *
     * @param paths classpath elements
     * @return returns the complete classpath with wildcards expanded
     */
    private static String buildClassPath(String... paths) {
        StringBuilder sb = new StringBuilder();
        for (String path : paths) {
            if (path.endsWith("*")) {
                path = path.substring(0, path.length() - 1);
                File pathFile = new File(path);
                pathFile.mkdirs();
                System.out.println(path);
                for (File file : Objects.requireNonNull(pathFile.listFiles())) {
                    if (file.isFile() && file.getName().endsWith(".jar")) {
                        sb.append(path);
                        sb.append(file.getName());
                        sb.append(System.getProperty("path.separator"));
                    }
                }
            } else {
                sb.append(path);
                sb.append(System.getProperty("path.separator"));
            }
        }
        return sb.toString();
    }
}
