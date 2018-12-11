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
import java.util.Map;
import java.util.Objects;

public class PrecomputeDependencies {
    // Constants
    static final int MEDIANTIMES = 5;
    static final int RANDOMTIMES = 100;

    static final String[] TESTTYPES = { "orig" };
    static final String[] COVERGAES = { "statement", "function" };
    static final String[] MACHINES = { "2", "4", "8", "16"};

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
        gatherDependencies();
        gatherTests(project);

        // Setup Test Algorithms
        setupTestPrioritization();
        setupTestSelection();
        setupTestParallelization();

        // Precompute Dependencies
        String classpath = dtLibs  + ":" + dtTools + ":" + dtTests + ":" + dtClass;
        runTestPrioritization(classpath);
        runTestParallelization(classpath);

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
        dtTools = buildClassPath(dtSubjectSource.concat("/lib/*"));
        dtLibs = buildClassPath(dtSubject.concat("/dependency/*"));
        dtClass = dtSubject.concat("/classes");
        dtTests = dtSubject.concat("/test-classes");

        // Log Main Directories To Console
        TestPluginPlugin.info("Main Directories: " );
        TestPluginPlugin.info("dtSubjectSource: " + dtSubjectSource);
        TestPluginPlugin.info("dtSubject: " + dtSubject);
        TestPluginPlugin.info("dtTools: " + dtTools);
        TestPluginPlugin.info("dtLibs: " + dtLibs);
        TestPluginPlugin.info("dtClass: " + dtClass);
        TestPluginPlugin.info("dtTests: " + dtTests);

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

        // Log Output Directories To Console
        TestPluginPlugin.info("Output Directories: " );
        TestPluginPlugin.info("dtResults: " + dtResults);
        TestPluginPlugin.info("dtData: " + dtData);
        TestPluginPlugin.info("prioResults: " + prioResults);
        TestPluginPlugin.info("seleResults: " + seleResults);
        TestPluginPlugin.info("paraResults: " + paraResults);
        TestPluginPlugin.info("prioDTLists: " + prioDTLists);
        TestPluginPlugin.info("seleDTLists: " + seleDTLists);
        TestPluginPlugin.info("paraDTLists: " + paraDTLists);

        // Extraneous Directories (Not Used, But May Be Useful Later
        dtTestSource = project.getBuild().getTestSourceDirectory();

        // Log Extraneous Directories To Console
        TestPluginPlugin.info("Extraneous Directories: " );
        TestPluginPlugin.info("dtTestSource: " + dtTestSource);
    }

    // Compile & Gather The Dependencies Of The Subject
    private void gatherDependencies(){
        TestPluginPlugin.info("Gathering Dependencies Of The Subject");

        cli.doMain(new String[]{"compile",
                "test-compile",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip" }, dtSubjectSource, System.out, System.out);
        cli.doMain(new String[]{"install",
                "-fn",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip" }, dtSubjectSource, System.out, System.out);
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
    }

    // Setup A Subject For Test Prioritization
    private void setupTestPrioritization(){
        String JAVA_HOME = expandEnvVars("${JAVA_HOME}");

        // Instrument Test Files
        TestPluginPlugin.info("Test Prioritization: Instrumenting Test Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + dtTools + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtTests  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + dtTests + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*");
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error: Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*");
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
            String command = "java -cp " + dtTools + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtClass  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*");
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtClass" +
                    " --soot-cp dtLibs:dtClass:JAVA_HOME/jre/lib/*");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtClass" +
                    " --soot-cp dtLibs:dtClass:JAVA_HOME/jre/lib/*");
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
        String JAVA_HOME = expandEnvVars("${JAVA_HOME}");

        // Instrument Test Files
        TestPluginPlugin.info("Test Selection: Instrumenting Test Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + dtTools + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtTests  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + dtTests + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") +
                    " -technique selection";
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error: Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
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
            String command = "java -cp " + dtTools + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + dtClass  +
                    " --soot-cp " + dtLibs + ":" + dtClass + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") +
                    " -technique selection";
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtClass" +
                    " --soot-cp dtLibs:dtClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.info("Command Error Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtClass" +
                    " --soot-cp dtLibs:dtClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
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
        // Create env-files File
        try {
            new File(dtResults + "/env-files").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        // Create env-files File
        try {
            new File(dtResults + "/env-files").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

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