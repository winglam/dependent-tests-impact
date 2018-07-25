package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.util.StandardMain;
import org.apache.commons.lang3.tuple.Pair;

import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public class SubjectPropertiesGenerator extends StandardMain {
    public SubjectPropertiesGenerator(final String[] args) {
        super(args);
    }

    public static void main(final String[] args) {
        try {
            new SubjectPropertiesGenerator(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

    @Override
    protected void run() throws Exception {
        final Path scriptDir = Paths.get(System.getenv("DT_SCRIPTS"));
        final Path resultDir = scriptDir.resolve(String.format("%s-results", System.getenv("SUBJ_NAME")));

        final Properties properties = new Properties();
        properties.setProperty("subject.name", System.getenv("SUBJ_NAME"));
        properties.setProperty("subject.formal_name", System.getenv("SUBJ_NAME_FORMAL"));

        handle(properties, resultDir, "prioritization-results", "prio");
        handle(properties, resultDir, "selection-results", "sele");
        handle(properties, resultDir, "parallelization-results", "para");

        properties.store(new FileOutputStream(resultDir.resolve("subject.properties").toFile()), null);
    }

    private void handle(final Properties properties, final Path resultDir, final String techniqueResultName, final String techniquePropName) {
        final Pair<Map<String, Integer>, Map<String, Integer>> result =
                GetAllUniqueDTs.run(resultDir.resolve("without-dependencies").resolve(techniqueResultName).toString(),
                        "", "");

        final int origSum = result.getLeft().values().stream().mapToInt(Integer::intValue).sum();
        final int autoSum = result.getLeft().values().stream().mapToInt(Integer::intValue).sum();

        properties.setProperty("subject." + techniquePropName + ".orig.dts", String.valueOf(origSum));
        properties.setProperty("subject." + techniquePropName + ".auto.dts", String.valueOf(autoSum));
    }
}
