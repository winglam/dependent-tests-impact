package edu.washington.cs.dt.impact.plugin2;

import com.reedoei.testrunner.mavenplugin.TestPlugin;
import com.reedoei.testrunner.mavenplugin.TestPluginPlugin;
import org.apache.commons.io.FileUtils;
import org.apache.maven.cli.MavenCli;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.classworlds.realm.ClassRealm;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Sample extends TestPlugin {
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

    // New Version Output Directories
    String newDTResults;
    public void execute(MavenProject project) {
        setupPaths(project);
        gatherDependencies();
        setupTestPrioritization(project);
        setupTestSelection(project);
    }

    private void setupPaths(MavenProject project){
        // Old
        dtSubjectSource = System.getProperty("path");

        dtSubject = dtSubjectSource.concat("/target");
        dtTools = buildClassPath(dtSubjectSource.concat("/lib/*"));
        dtLibs = buildClassPath(dtSubject.concat("/dependency/*"));
        dtClass = dtSubject.concat("/classes");
        dtTests = dtSubject.concat("/test-classes");

        // Data
        dtData = dtResults.concat("/data");
        dtResults = dtSubjectSource.concat("/results");
        prioResults = dtResults.concat("/prioritization-results");
        seleResults = dtResults.concat("/selection-results");
        paraResults = dtResults.concat("/parallelization-results");

        prioDTLists = dtData.concat("/prioritization-dt-lists");
        seleDTLists = dtData.concat("/selection-dt-lists");
        paraDTLists = dtData.concat("/parallelization-dt-lists");

        // New
        newDTSubjectSource = System.getProperty("user.dir");

        newDTSubject = newDTSubjectSource.concat("/target");
        newDTTools = buildClassPath(newDTSubjectSource.concat("/lib/*"));
        newDTLibs = buildClassPath(newDTSubject.concat("/dependency/*"));
        newDTClass = newDTSubject.concat("/classes");
        newDTTests = newDTSubject.concat("/test-classes");

        // Results
        newDTResults = newDTSubjectSource.concat("/results");
    }

    // Compile & Gather The Dependencies Of The Subject
    private void gatherDependencies(){
        TestPluginPlugin.mojo().getLog().info("Gathering Dependencies Of The Subject");

        cli.doMain(new String[]{"compile",
                "test-compile",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip" }, newDTSubjectSource, System.out, System.out);
        cli.doMain(new String[]{"install",
                "-fn",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip" }, newDTSubjectSource, System.out, System.out);
    }

    // Setup Test Prioritization On The New Version
    private void setupTestPrioritization(MavenProject project){
        TestPluginPlugin.mojo().getLog().info("Moving Test Info From The Old Version To The New Version");
        try {
            FileUtils.moveFile(new File(dtResults + "/orig-order.txt"), new File(newDTResults + "/orig-order.txt"));
            FileUtils.moveFile(new File(dtResults + "/ignore-order.txt"), new File(newDTResults + "/ignore-order.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }



        TestPluginPlugin.mojo().getLog().info("Removing Failed Tests");
        try {
            List<String> origOrder = Files.readAllLines(new File(newDTResults + "/orig-order.txt").toPath());
            List<String> ignoreOrder = Files.readAllLines(new File(newDTResults + "/orig-order.txt").toPath());
            origOrder.removeAll(ignoreOrder);

            Files.write(new File(newDTResults + "/orig-order.txt").toPath(), origOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }


        TestPluginPlugin.mojo().getLog().info("Removing Missing Tests");

    }

    // Setup Test Selection On The New Version
    private void setupTestSelection(MavenProject project){
        String JAVA_HOME = expandEnvVars("${JAVA_HOME}");

        // Instrument Source Files
        TestPluginPlugin.mojo().getLog().info("Test Selection: Instrumenting Files");
        subprocessOutput = null;
        try {
            // Runtime Exec
            String command = "java -cp " + newDTTools + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") + ":" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir " + newDTClass  +
                    " --soot-cp " + newDTLibs + ":" + newDTClass + ":" + buildClassPath(JAVA_HOME + "/jre/lib/*") +
                    " -technique selection" +
                    " --java-version 1.8";
            Process p = Runtime.getRuntime().exec(command);

            // Stream Readers
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // Read Command Output
            TestPluginPlugin.mojo().getLog().info("Command Input Stream For: java -cp newDTTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir newDTClass" +
                    " --soot-cp newDTLibs:newDTClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection" +
                    " --java-version 1.8");
            while ((subprocessOutput = stdInput.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().info(subprocessOutput);
            }

            // Read Command Errors
            TestPluginPlugin.mojo().getLog().info("Command Error Stream For: java -cp newDTTools:JAVA_HOME/jre/lib/*:" +
                    " edu.washington.cs.dt.impact.Main.InstrumentationMain" +
                    " -inputDir newDTClass" +
                    " --soot-cp newDTLibs:newDTClass:JAVA_HOME/jre/lib/*" +
                    " -technique selection" +
                    " --java-version 1.8");
            while ((subprocessOutput = stdError.readLine()) != null) {
                TestPluginPlugin.mojo().getLog().error(subprocessOutput);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }



        // Delete Unncessary Files
        try {
            FileUtils.deleteDirectory(new File(newDTSubjectSource + "/sootOutput"));
        } catch (Exception e){
            e.printStackTrace();
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