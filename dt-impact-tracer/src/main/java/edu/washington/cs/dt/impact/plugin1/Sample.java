package edu.washington.cs.dt.impact.plugin1;

import com.reedoei.testrunner.mavenplugin.TestPlugin;
import com.reedoei.testrunner.mavenplugin.TestPluginPlugin;
import com.reedoei.testrunner.testobjects.TestLocator;
import edu.washington.cs.dt.impact.Main.InstrumentationMain;
import edu.washington.cs.dt.impact.runner.OneConfigurationRunner;
import edu.washington.cs.dt.impact.tools.detectors.FailingTestDetector;
import edu.washington.cs.dt.main.ImpactMain;
import edu.washington.cs.dt.tools.UnitTestFinder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.maven.cli.MavenCli;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.classworlds.realm.ClassRealm;
import scala.collection.JavaConverters;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.FileSystems;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample extends TestPlugin {
    // Constants For runPrecomputedDependencies
    static final int MEDIANTIMES = 5;
    static final int RANDOMTIMES = 100;

    static final String[] TESTTYPES = { "orig" };
    static final String[] COVERGAES = { "statement", "function" };
    static final int[] MACHINES = { 2, 4, 8, 16};

    static final String[] PRIOORDERS = { "original", "relative" };
    static final String[] SELEORDERS = { "original", "absolute", "relative "};

    static final String prioDir = "prioritization-results";
    static final String seleDir = "selection-results";
    static final String paraDir = "parallelization-results";

    static final String prioList = "prioritization-dt-list";
    static final String seleList = "selection-dt-list";
    static final String paraList = "parallelization-dt-list";

    // Args (Re-Declared Upon Each Use)
    String[] args = {};

    // MavenCli Variables
    ClassRealm classRealm = (ClassRealm) Thread.currentThread().getContextClassLoader();
    MavenCli cli = new MavenCli(classRealm.getWorld());

    // Main Directories
    String dtSubjectSource, dtSubject, dtTools, dtResults, dtLibs, dtClass, dtTests;

    // Output Directories
    String dtData, prioResults, seleResults, paraResults, prioDTLists, seleDTLists, paraDTLists;
    String subprocessOutput;

    // Extraneous Directories (Not Used, But May Be Useful Later
    String dtTestSource;

    public void execute(MavenProject project) {
        setupPaths(project);
        gatherDependencies();
        setupTestPrioritization(project);
        setupTestSelection(project);
        setupTestParallelization(project);

        runPrecomputedDependencies(project);
    }

    private void setupPaths(MavenProject project){
        // Main Directories
        dtSubjectSource = System.getProperty("user.dir");

        dtSubject = dtSubjectSource.concat("/target");
        dtTools = buildClassPath(dtSubjectSource.concat("/lib/*"));
        dtResults = dtSubjectSource.concat("/results");
            FileUtils.deleteQuietly(new File(dtResults));
            new File(dtResults).mkdirs();

        dtLibs = buildClassPath(dtSubject.concat("/dependency/*"));
        dtClass = dtSubject.concat("/classes");
        dtTests = dtSubject.concat("/test-classes");

        // Output Main Directories
        TestPluginPlugin.mojo().getLog().info("Main Directories: " );
        TestPluginPlugin.mojo().getLog().info("dtSubjectSource: " + dtSubjectSource);
        TestPluginPlugin.mojo().getLog().info("dtSubject: " + dtSubject);
        TestPluginPlugin.mojo().getLog().info("dtTools: " + dtTools);
        TestPluginPlugin.mojo().getLog().info("dtResults: " + dtResults);
        TestPluginPlugin.mojo().getLog().info("dtLibs: " + dtLibs);
        TestPluginPlugin.mojo().getLog().info("dtClass: " + dtClass);
        TestPluginPlugin.mojo().getLog().info("dtTests: " + dtTests);



        // Output Directories
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

        // Print Output Directories
        TestPluginPlugin.mojo().getLog().info("Output Directories: " );
        TestPluginPlugin.mojo().getLog().info("dtData: " + dtData);
        TestPluginPlugin.mojo().getLog().info("prioResults: " + prioResults);
        TestPluginPlugin.mojo().getLog().info("seleResults: " + seleResults);
        TestPluginPlugin.mojo().getLog().info("paraResults: " + paraResults);
        TestPluginPlugin.mojo().getLog().info("prioDTLists: " + prioDTLists);
        TestPluginPlugin.mojo().getLog().info("seleDTLists: " + seleDTLists);
        TestPluginPlugin.mojo().getLog().info("paraDTLists: " + paraDTLists);


        // Extraneous Directories (Not Used, But May Be Useful Later
        dtTestSource = project.getBuild().getTestSourceDirectory();

        TestPluginPlugin.mojo().getLog().info("Extraneous Directories: " );
        TestPluginPlugin.mojo().getLog().info("dtTestSource: " + dtTestSource);

        //export DT_ROOT=/home/jgxue2/Test-Second-Bash-Script-V2
        //export DT_SUBJ_ROOT=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d
            // Top-most Module

        //export DT_SUBJ_SRC=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d/elastic-job-lite-core
            // Desired Target Module
        //export DT_SUBJ=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d/elastic-job-lite-core/target
            // Desired Module's Target Folder
        //export DT_LIBS=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d/elastic-job-lite-core/target/dependency/*
            // Desired Target Module
        //export DT_CLASS=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d/elastic-job-lite-core/target/classes
        //export DT_TESTS=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d/elastic-job-lite-core/target/test-classes
        //export DT_TEST_SRC=$DT_ROOT/elastic-job-lite-old-6d6e460a10b535c149c0f670ec562be027b8808d/elastic-job-lite-core/src/test/java
    }

    // Gather The Dependencies Of The Subject
    private void gatherDependencies(){
        TestPluginPlugin.mojo().getLog().info("Gathering Dependencies Of The Subject");

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

    // Setup A Subject For Test Prioritization
    private void setupTestPrioritization(MavenProject project){
        // SECTION 1: Find Human Written Tests (old version, original tests)
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



        // SECTION 2: Alienate Failing Tests
        args = new String[]{
                "--classpath", dtClass + ":" + dtTests + ":" + dtLibs,
                "--tests", dtResults + "/orig-order.txt",
                "--output", dtResults + "/ignore-order.txt"};
        FailingTestDetector.outputFailedTests(project,
                dtResults + "/orig-order.txt",
                dtResults + "/ignore-order.txt");



        // SECTION 3: Instrument Test & Source Files
        String JAVA_HOME = expandEnvVars("${JAVA_HOME}");
        // Instrument Test Files
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
            TestPluginPlugin.mojo().getLog().info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.mojo().getLog().info("Command Error: Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*");
            TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Instrument Source Files
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
            TestPluginPlugin.mojo().getLog().info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtClass" +
                    " --soot-cp dtLibs:dtClass:JAVA_HOME/jre/lib/*");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.mojo().getLog().info("Command Error Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
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



        // SECTION 4: Copy Any Resource Files From dtClass & dtTests (e.g. Configuration Files - Exclude *.class Files)
        // TODO


        // SECTION 5: Run Instrumented Tests
        TestPluginPlugin.mojo().getLog().info("Running Instrumented Tests");
	    args = new String[]{
                "-classpath", dtLibs + ":" + dtTools + ":" + dtSubjectSource + "/sootOutput/",
                "-inputTests", dtResults + "/orig-order.txt"};
        ImpactMain.main(args);



        // SECTION 6: Move Resultant Files To Result
        try {
            FileUtils.moveDirectory(new File(dtSubjectSource + "/sootTestOutput"), new File(dtResults + "/sootTestOutput-orig"));
            FileUtils.deleteDirectory(new File(dtSubjectSource + "/sootOutput"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Setup A Subject For Test Selection
    private void setupTestSelection(MavenProject project){
        // SECTION 1: Instrument Test & Source Files
        String JAVA_HOME = expandEnvVars("${JAVA_HOME}");
        // Instrument Test Files
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
            TestPluginPlugin.mojo().getLog().info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.mojo().getLog().info("Command Error: Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtTests" +
                    " --soot-cp dtLibs:dtClass:dtTests:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
            TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Instrument Source Files
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
            TestPluginPlugin.mojo().getLog().info("Command Input Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir dtClass" +
                    " --soot-cp dtLibs:dtClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.mojo().getLog().info("Command Error Stream For: java -cp dtTools:JAVA_HOME/jre/lib/*:" +
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



        // SECTION 2: Copy Any Resource Files From dtClass & dtTests (e.g. Configuration Files - Exclude *.class Files)
        // TODO



        // SECTION 3: Run Instrumented Tests
        TestPluginPlugin.mojo().getLog().info("Running Instrumented Tests");
        args = new String[]{
                "-classpath", dtLibs + ":" + dtTools + ":" + dtSubjectSource + "/sootOutput/",
                "-inputTests", dtResults + "/orig-order.txt"};
        ImpactMain.main(args);



        // SECTION 4: Move Resultant Files To Result
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
    private void setupTestParallelization(MavenProject project){
        // SECTION 1: Calculate Runtimes For Tests
        TestPluginPlugin.mojo().getLog().info("Calculating Runtimes For Tests");
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



        // SECTION 2: Move Resultant Files To Result
        try {
            FileUtils.moveFile(new File(dtSubjectSource + "/orig-time.txt"), new File(dtResults + "/orig-time.txt"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Run Precomputed Dependencies
    private void runPrecomputedDependencies(MavenProject project){
        String classpath = dtLibs  + ":" + dtTools + ":" + dtTests + ":" + dtClass;

        runTestPrioritization(project, classpath);
    }

    // Run Test Prioritization
    private void runTestPrioritization(MavenProject project, String classpath){
        TestPluginPlugin.mojo().getLog().info("Generating Pre-computed Dependencies");

        for (String k : TESTTYPES){
            for (String i : COVERGAES)
                for (String j : PRIOORDERS){
                    String precomputeFlag = "-resolveDependences" + prioDTLists + "/prioritization-" + k + "-" + i + "-" + j + ".txt";
                    String postProcessFlag = "";

                    args = new String[]{
                            "-technique", "prioritization",
                            "-coverage", i,
                            "-order", j,
                            "-origOrder", dtResults + "/" + k + "-order.txt",
                            "-testInputDir", dtResults + "/sootTestOutput-" + k,
                            "-filesToDelete", "",
                            "-getCoverage",
                            "-project", "",
                            "-testType", k,
                            "-outputDir", prioResults,
                            "-timeToRun", Integer.toString(MEDIANTIMES),
                            "-classpath", classpath,
                            precomputeFlag,
                            postProcessFlag};
                    TestPluginPlugin.mojo().getLog().info("OneConfigurationRunner Parameters\n\t" +  StringUtils.join(args, "\n\t"));
                    OneConfigurationRunner.main(args);
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
