package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.impact.tools.lifetime.Lifetimes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDataGenerator extends StandardMain {
    private final Path path;

    private TestDataGenerator(final String[] args) {
        super(args);

        this.path = Paths.get(getArgRequired("path"));
    }

    public static void main(final String[] args) {
        try {
            new TestDataGenerator(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

    @Override
    protected void run() throws Exception {
    }
}
