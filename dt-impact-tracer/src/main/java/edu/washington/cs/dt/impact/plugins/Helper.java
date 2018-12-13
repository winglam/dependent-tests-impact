package edu.washington.cs.dt.impact.plugins;

import com.reedoei.testrunner.mavenplugin.TestPluginPlugin;
import org.apache.maven.cli.MavenCli;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;

public class Helper {
    // Compile & Gather The Dependencies Of A Subject
    public static void gatherDependencies(MavenCli client, String subjectPath){
        TestPluginPlugin.info("Gathering Dependencies Of The Subject");

        client.doMain(new String[]{"compile",
                "test-compile",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip" }, subjectPath, System.out, System.out);
        client.doMain(new String[]{"install",
                "-fn",
                "-Dmaven.javadoc.skip=true",
                "-DskipTests",
                "dependency:copy-dependencies",
                "-Drat.skip=true",
                "-Dcobertura.skip" }, subjectPath, System.out, System.out);
    }

    // Adjust MACHINES
    public static String[] adjustMachineCount(String[] machines, String testOrderPath){
        int numInvalidEntries = 0;
        for (String num : machines){
            try {
                if ((int) Files.lines(new File(testOrderPath).toPath()).count() < Integer.parseInt(num)){
                    numInvalidEntries++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] temp = new String[machines.length - numInvalidEntries];
        for (int i = 0; i < temp.length; i++){
            temp[i] = machines[i];
        }

        return temp;
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
    public static String buildClassPath(String... paths) {
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
