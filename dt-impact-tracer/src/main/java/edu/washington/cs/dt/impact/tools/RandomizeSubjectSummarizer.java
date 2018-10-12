/**
 * The contents in -directoryFile is generated from running 'find
 * /scratch/reedoei2/dt-tools/run-new-subjects/druid-1fffc681d28a/experiments/ -name "randomize_*" | xargs dirname | uniq'
 * Usage:
 * java -cp dtdetector-1.2.0.jar:dt-impact-tracer-*-jar-with-dependencies.jar edu.washington.cs.dt.impact.tools
 * .RandomizeSubjectSummarizer -directoryFile randomize_directories.txt -experimentDirName experiments/ > bicycle-random-output.csv
 */

package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.data.TestData;

import static edu.washington.cs.dt.impact.figure.generator.FigureGenerator.mustGetArgName;

/**
 * Created by winglam on 9/21/18.
 */
public class RandomizeSubjectSummarizer {

    private static String directoryFileName = null;

    public static void main(String[] args) {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        // name of directory where files should be outputted
        directoryFileName = mustGetArgName(argsList, "-directoryFile");

        String experimentDirectoryName = mustGetArgName(argsList, "-experimentDirName");

        List<String> directories = FileTools.parseFileToList(new File(directoryFileName));

        System.out.println("project,module,SHA,victim_name,passing_pollutors,failing_pollutors");

        for (String directoryName : directories) {
            File[] randomizeFiles = new File(directoryName).listFiles();

            List<TestData> testDatas = new ArrayList<>();
            for (File f : randomizeFiles) {
                if (f.getName().contains("randomize_")) {
                    testDatas.addAll(getTestData(f));
                }
            }

            String directoryNameNoTarget = directoryName.replace("target", "");
            String[] splitDirectoryName = directoryNameNoTarget.split(experimentDirectoryName);
            String directoryNameUnderExperiments = splitDirectoryName[splitDirectoryName.length - 1];
            String[] projectNameAndModuleName = directoryNameUnderExperiments.split("/");
            String projNameWithSHA = projectNameAndModuleName[0].replace("-new", "").replace("-old","");

            StringBuilder moduleNameBuilder = new StringBuilder();
            for (int i = 1; i < projectNameAndModuleName.length; i++) {
                moduleNameBuilder.append(projectNameAndModuleName[i]);
                moduleNameBuilder.append("/");
            }

            String moduleName = moduleNameBuilder.toString();
            String[] SHAArr = projNameWithSHA.split("-");
            String SHA = SHAArr[SHAArr.length - 1];
            String projName = projNameWithSHA.replace("-" + SHA, "");

            Map<String, String> outputs = new HashMap<>();
            for (TestData data : testDatas) {
                StringBuilder sb = new StringBuilder();
                sb.append(projName);
                sb.append(",");
                sb.append(moduleName);
                sb.append(",");
                sb.append(SHA);
                sb.append(",");
                sb.append(data.getDependentTest());
                String uniqueTestName = sb.toString();

                if (outputs.containsKey(uniqueTestName)) {
                    continue;
                }
                sb.append(",");

                for(String test : data.getBeforeTests()) {
                    sb.append(test);
                    sb.append(";");
                }
                sb.append(",");

                for(String test : data.getAfterTests()) {
                    sb.append(test);
                    sb.append(";");
                }

                outputs.put(uniqueTestName, sb.toString());
            }
            for (String outputKey : outputs.keySet()) {
                System.out.println(outputs.get(outputKey));
            }
        }
    }

    public static List<TestData> getTestData(File file) {
        List<String> lines = FileTools.parseFileToList(file);
        List<TestData> testDatas = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {

            // line example:
            //            Test: io.druid.common.aws.AWSCredentialsConfigTest.testJsonProperty
            //            Intended behavior: ERROR
            //            when executed after: []
            //            The revealed different behavior: ERROR
            //            when executed after: [io.druid.common.aws.AWSCredentialsConfigTest.testStringProperty]
            String testNameLine = lines.get(i);
            if (testNameLine.contains("Test: ")) {
                //            Test: io.druid.common.aws.AWSCredentialsConfigTest.testJsonProperty
                String testName = testNameLine.split("Test: ")[1].trim();

                //            Intended behavior: ERROR
                i = i + 1;
                String intendedBehaviorString = lines.get(i).split("Intended behavior: ")[1].trim();
                RESULT intendedBehavior = RESULT.valueOf(intendedBehaviorString);

                //            when executed after: []
                i = i + 1;
                String arrayStringBefore = lines.get(i).split("when executed after: \\[")[1].replace("]","").trim();
                Set<String> beforeTests = new HashSet<String>(Arrays.asList(arrayStringBefore.split(", ")));

                //            The revealed different behavior: ERROR
                i = i + 1;
                String revealedBehaviorString = lines.get(i).split("The revealed different behavior: ")[1].trim();
                RESULT revealedBehavior = RESULT.valueOf(intendedBehaviorString);

                //            when executed after: [io.druid.common.aws.AWSCredentialsConfigTest.testStringProperty]
                i = i + 1;
                String arrayStringAfter = lines.get(i).split("when executed after: \\[")[1].replace("]","").trim();
                Set<String> afterTests = new HashSet<String>(Arrays.asList(arrayStringAfter.split(", ")));

                TestData currData = new TestData(testName, intendedBehavior, beforeTests, afterTests, revealedBehavior,
                                        new ArrayList<String>());
                testDatas.add(currData);
            }
        }
        return testDatas;
    }
}
