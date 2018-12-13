package edu.washington.cs.dt.impact.plugins;

import com.reedoei.testrunner.mavenplugin.TestPluginPlugin;
import com.reedoei.testrunner.testobjects.TestLocator;
import edu.washington.cs.dt.impact.runner.OneConfigurationRunner;
import edu.washington.cs.dt.impact.runner.Runner;
import edu.washington.cs.dt.impact.tools.OutputPrecomputedDependences;
import edu.washington.cs.dt.impact.tools.detectors.FailingTestDetector;
import edu.washington.cs.dt.main.ImpactMain;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.maven.cli.MavenCli;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.classworlds.realm.ClassRealm;
import scala.collection.JavaConverters;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

import edu.washington.cs.dt.impact.plugins.Helper;

public class PrecomputeDependencies {
    // Constants
    static final int MEDIANTIMES = 5;
    static final int RANDOMTIMES = 100;

    static final String[] TESTTYPES = { "orig" };
    static final String[] COVERGAES = { "statement", "function" };
    static String[] MACHINES = { "2", "4", "8", "16" };

    static final String[] PRIOORDERS = { "absolute", "relative" };
    static final String[] SELEORDERS = { "original", "absolute", "relative "};

    // Args (Re-Declared Upon Each Use)
    String[] args = {};

    // MavenCli Variables
    ClassRealm classRealm = (ClassRealm) Thread.currentThread().getContextClassLoader();
    MavenCli cli = new MavenCli(classRealm.getWorld());

    // Main Directories
    String dtSubjectSource, dtSubject, dtTools, dtLibs, dtClass, dtTests;

    // Output Directories
    String dtResults, dtData, prioResults, seleResults, paraResults, prioDTLists, seleDTLists, paraDTLists;
    String subprocessOutput;

    // Extraneous Directories (Not Used, But May Be Useful Later
    String dtTestSource;

    public void execute(MavenProject project) {
        // Project Setup
        setupPaths(project);
        Helper.gatherDependencies(cli, dtSubjectSource);
        gatherTests(project);

        // Setup Test Algorithms
        setupTestPrioritization();
        setupTestSelection();
        setupTestParallelization();

        // Precompute Dependencies
        try {
            new File(dtResults + "/env-files").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String classpath = dtLibs  + ":" + dtTools + ":" + dtTests + ":" + dtClass;
        runTestPrioritization(classpath);
        runTestParallelization(classpath);

        // Extracts dt-lists & Outputs Files To Necessary Locations
        TestPluginPlugin.info("Generating dt-lists");
        args = new String[]{
                "-prioDirectory", prioResults,
                "-paraDirectory", paraResults,
                "-prioOutputDirectory", prioDTLists,
                "-seleOutputDirectory", seleDTLists,
                "-paraOutputDirectory", paraDTLists};
        OutputPrecomputedDependences.main(args);
    }

    private void setupPaths(MavenProject project){
        // Main Directories
        dtSubjectSource = System.getProperty("user.dir");

        dtSubject = dtSubjectSource.concat("/target");
            new File(dtSubject).mkdirs();
        dtTools = Helper.buildClassPath(dtSubjectSource.concat("/lib/*"));
        dtLibs = Helper.buildClassPath(dtSubject.concat("/dependency/*"));
        dtClass = dtSubject.concat("/classes");
        dtTests = dtSubject.concat("/test-classes");

        // Output Directories
        dtResults = dtSubjectSource.concat("/results");
        FileUtils.deleteQuietly(new File(dtResults));
        new File(dtResults).mkdirs();
        dtData = dtResults.concat("/data");
        new File(dtData).mkdirs();
        prioResults = dtResults.concat("/prioritization-results");
        new File(prioResults).mkdirs();
        seleResults = dtResults.concat("/selection-results");
        new File(seleResults).mkdirs();
        paraResults = dtResults.concat("/parallelization-results");
        new File(paraResults).mkdirs();

        prioDTLists = dtData.concat("/prioritization-dt-lists");
        new File(prioDTLists).mkdirs();
        seleDTLists = dtData.concat("/selection-dt-lists");
        new File(seleDTLists).mkdirs();
        paraDTLists = dtData.concat("/parallelization-dt-lists");
        new File(paraDTLists).mkdirs();

        // Extraneous Directories (Not Used, But May Be Useful Later
        dtTestSource = project.getBuild().getTestSourceDirectory();
    }

    private void gatherTests(MavenProject project){
        humanWrittenTests(project);
        handleFailedTests(project);
    }

    private void humanWrittenTests(MavenProject project){
        TestPluginPlugin.info("Finding Human Written Tests (old version, original tests)");
        try {
            // Generates orig-order.txt
            final List<String> tests = JavaConverters.bufferAsJavaList(TestLocator.tests(project).toBuffer());
            FileWriter writer = new FileWriter(new File(dtResults + "/orig-order.txt"));
            for(String str: tests) {
                writer.write(str);
                writer.write(System.getProperty("line.separator"));
            }
            writer.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private void handleFailedTests(MavenProject project){
        // Locate Failed Tests
        TestPluginPlugin.info("Locating Failed Tests");
        args = new String[]{
                "--classpath", dtClass + ":" + dtTests + ":" + dtLibs,
                "--tests", dtResults + "/orig-order.txt",
                "--output", dtResults + "/ignore-order.txt"};
        FailingTestDetector.outputFailedTests(project,
                dtResults + "/orig-order.txt",
                dtResults + "/ignore-order.txt");

        // Remove Failed Tests
        TestPluginPlugin.info("Removing Failed Tests");
        try {
            List<String> origOrder = Files.readAllLines(new File(dtResults + "/orig-order.txt").toPath());
            List<String> ignoreOrder = Files.readAllLines(new File(dtResults + "/ignore-order.txt").toPath());
            origOrder.remove("com.dangdang.ddframe.job.lite.integrate.std.dataflow.OneOffDataflowElasticJobTest.assertJobInit");
            origOrder.removeAll(ignoreOrder);

            Files.write(new File(dtResults + "/orig-order.txt").toPath(), origOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Adjust MACHINES (Less Tests Than Number Of Cores)
        MACHINES = Helper.adjustMachineCount(MACHINES, dtResults + "/orig-order.txt");
    }

    // Setup A Subject For Test Prioritization
    private void setupTestPrioritization(){
        String JAVA_HOME = Helper.expandEnvVars("${JAVA_HOME}");

        // Instrument Test Files
        TestPluginPlugin.info("Test Prioritization: Instrumenting Test Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + dtTools + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtTests  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + dtTests + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*");
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: " + command);
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error: Stream For: " + command);
            TestPluginPlugin.info(subprocessOutput);
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Instrument Source Files
        TestPluginPlugin.info("Test Prioritization: Instrumenting Source Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + dtTools + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtClass  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*");
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: " + command);
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error Stream For: " + command);
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: Copy Any Resource Files From dtClass & dtTests (e.g. Configuration Files - Exclude *.class Files)

        // Run Instrumented Files
        TestPluginPlugin.info("Test Prioritization: Running Instrumented Files");
        args = new String[]{
                "-classpath", dtLibs + ":" + dtTools + ":" + dtSubjectSource + "/sootOutput/",
                "-inputTests", dtResults + "/orig-order.txt"};
        ImpactMain.main(args);

        // Clean Up Files
        TestPluginPlugin.info("Cleaning Up Files");
        try {
            FileUtils.moveDirectory(new File(dtSubjectSource + "/sootTestOutput"), new File(dtResults + "/sootTestOutput-orig"));
            FileUtils.deleteDirectory(new File(dtSubjectSource + "/sootOutput"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Setup A Subject For Test Selection
    private void setupTestSelection(){
        String JAVA_HOME = Helper.expandEnvVars("${JAVA_HOME}");

        // Instrument Test Files
        TestPluginPlugin.info("Test Selection: Instrumenting Test Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + dtTools + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtTests  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + dtTests + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*") +
                    " -technique selection";
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: " + command);
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error: Stream For: " + command);
            TestPluginPlugin.info(subprocessOutput);
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Instrument Source Files
        TestPluginPlugin.info("Test Selection: Instrumenting Source Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + dtTools + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtClass  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + Helper.buildClassPath(JAVA_HOME + "/jre/lib/*") +
                    " -technique selection";
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: " + command);
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error Stream For: " + command);
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: Copy Any Resource Files From dtClass & dtTests (e.g. Configuration Files - Exclude *.class Files)

        // Run Instrumented Tests
        TestPluginPlugin.info("Test Selection: Running Instrumented Tests");
        args = new String[]{
                "-classpath", dtLibs + ":" + dtTools + ":" + dtSubjectSource + "/sootOutput/",
                "-inputTests", dtResults + "/orig-order.txt"};
        ImpactMain.main(args);


        // Clean Up Files
        TestPluginPlugin.info("Cleaning Up Files");
        try {
            FileUtils.moveDirectory(new File(dtSubjectSource + "/sootTestOutput"), new File(dtResults + "/sootTestOutput-orig-selection"));
            FileUtils.deleteDirectory(new File(dtSubjectSource + "/sootOutput"));
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            FileUtils.moveDirectory(new File(dtSubjectSource + "/selectionOutput"), new File(dtResults + "/selectionOutput"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Setup A Subject For Test Selection
    private void setupTestParallelization(){
        // Calculate Runtimes
        TestPluginPlugin.info("Test Parallelization: Calculating Runtimes For Tests");
        args = new String[]{
                "-classpath", dtLibs + ":" + dtTools + ":" + dtClass + ":" + dtTests,
                "-inputTests", dtResults + "/orig-order.txt",
                "-getTime"};
        PrintStream stdout = System.out;
        try {
            PrintStream out = new PrintStream(new FileOutputStream("orig-time.txt"));
            System.setOut(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImpactMain.main(args);
        System.setOut(stdout);

        // Clean Up Files
        TestPluginPlugin.info("Cleaning Up Files");
        try {
            FileUtils.moveFile(new File(dtSubjectSource + "/orig-time.txt"), new File(dtResults + "/orig-time.txt"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Run Test Prioritization
    private void runTestPrioritization(String classpath){
        // Generate Precomputed Dependences
        TestPluginPlugin.info("Test Prioritization: Generating Precomputed Dependencies");
        for (String k : TESTTYPES) {
            for (String i : COVERGAES) {
                for (String j : PRIOORDERS) {
                    String precomputeFlag = prioDTLists + "/prioritization-" + "" + "-" + k + "-" + i + "-" + j + ".txt";
                    String postProcessFlag = "";

                    args = new String[]{
                            "-technique", "prioritization",
                            "-coverage", i,
                            "-order", j,
                            "-origOrder", dtResults + "/" + k + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + k,
                            "-filesToDelete", dtResults + "/env-files",
                            "-getCoverage",
                            "-project", "",
                            "-testType", k,
                            "-outputDir", prioResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            "-resolveDependences", precomputeFlag,
                            postProcessFlag};
                    Runner.nullOutputFileName();
                    TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);
                }
            }
        }

        // Cleanup Files
        TestPluginPlugin.info("Cleaning Up Files");
        FileUtils.deleteQuietly(new File("tmpfile.txt"));
        FileUtils.deleteQuietly(new File("tmptestfiles.txt"));
    }

    // Run Test Parallelization
    private void runTestParallelization(String classpath){
        // Run Precomputed Dependencies
        TestPluginPlugin.info("Test Parallelization: Generating Precomputed Dependencies");
        for (String j : TESTTYPES) {
            for (String k : MACHINES) {
                String precomputeFlag;
                String postProcessFlag;

                // Original Order
                TestPluginPlugin.info("Original Order");
                precomputeFlag =  prioDTLists + "/parallelization-" + "" + "-" + j + "-" + k + "-original.txt";
                postProcessFlag = "";
                args = new String[]{
                        "-technique", "parallelization",
                        "-order", "original",
                        "-origOrder", dtResults + "/" + j + "-order.txt",
                        "-testInputDir", dtResults + "/sootTestOutput-" + j,
                        "-filesToDelete", dtResults + "/env-files",
                        "-project", "",
                        "-testType", j,
                        "-numOfMachines", k,
                        "-outputDir", paraResults,
                        "-timesToRun", Integer.toString(MEDIANTIMES),
                        "-classpath", classpath,
                        "-resolveDependences", precomputeFlag,
                        postProcessFlag};
                Runner.nullOutputFileName();
                TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                OneConfigurationRunner.main(args);

                // Time Order
                TestPluginPlugin.info("Time Order");
                precomputeFlag =  prioDTLists + "/parallelization-" + "" + "-" + j + "-" + k + "-time.txt";
                postProcessFlag = "";
                args = new String[]{
                        "-technique", "parallelization",
                        "-order", "time",
                        "-timeOrder", dtResults + "/" + j + "-time.txt",
                        "-origOrder", dtResults + "/" + j + "-order.txt",
                        "-testInputDir", dtResults + "/sootTestOutput-" + j,
                        "-filesToDelete", dtResults + "/env-files",
                        "-project", "",
                        "-testType", j,
                        "-numOfMachines", k,
                        "-outputDir", paraResults,
                        "-timesToRun", Integer.toString(MEDIANTIMES),
                        "-classpath", classpath,
                        "-resolveDependences", precomputeFlag,
                        postProcessFlag};
                Runner.nullOutputFileName();
                TestPluginPlugin.info("OneConfigurationRunner Parameters\n\t" + StringUtils.join(args, "\n\t"));
                OneConfigurationRunner.main(args);
            }
        }

        // Cleanup Files
        TestPluginPlugin.info("Cleaning Up Files");
        FileUtils.deleteQuietly(new File("tmpfile.txt"));
        FileUtils.deleteQuietly(new File("tmptestfiles.txt"));
    }
}