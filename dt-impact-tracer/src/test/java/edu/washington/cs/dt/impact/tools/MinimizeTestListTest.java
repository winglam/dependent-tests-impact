package edu.washington.cs.dt.impact.tools;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MinimizeTestListTest {
    private static Path dtListPath;

    // Note the behaviors aren't actually different
    // This is because what is actually being tested is the ability of MinimizeTestList to parse this
    // string, and it will only run off of the revealed different behavior section (so whether there
    // is cautally a different is unimportant).
    private static final String DT_LIST =
            "Test: edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test3\n" +
            "Intended behavior: PASS\n" +
            "when executed after: [edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test1, " +
                    "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2, " +
                    "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test3]\n" +
            "The revealed different behavior: PASS\n" +
            "when executed after: [edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2, " +
                    "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test1, " +
                    "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test3]\n";

    @BeforeClass
    public static void beforeClass() throws Exception {
        dtListPath = Files.createTempFile("dt-list", null);
        Files.write(dtListPath, DT_LIST.getBytes());
    }

    @AfterClass
    public static void afterClass() {
        try {
            Files.deleteIfExists(dtListPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRunsFromDtList() throws Exception {
        final Set<MinimizeTestList> minimizers = MinimizeTestList.fromDtList(dtListPath);

        assertEquals(1, minimizers.size());

        for (final MinimizeTestList minimizer : minimizers) {
            // Only 1 minimizer, so hard coding expected output for just one is okay.

            final List<String> result = minimizer.run().getDeps();
            assertThat(result, contains("edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2"));
            assertThat(result, hasSize(1));
        }
    }

    @Test
    public void testFindMinimalToPass() throws Exception {
        final List<String> tests =
                new ArrayList<>(Arrays.asList(
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2",
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test1",
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test3"
                ));

        final MinimizeTestList minimizer =
                new MinimizeTestList(tests, "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test3");

        final List<String> result = minimizer.run().getDeps();
        assertThat(result, contains("edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2"));
        assertThat(result, hasSize(1));
    }

    @Test
    public void testFindMinimalToFail() throws Exception {
        final List<String> tests =
                new ArrayList<>(Arrays.asList(
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2",
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test1",
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test3"
                ));

        final MinimizeTestList minimizer =
                new MinimizeTestList(tests, "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test1");

        final List<String> result = minimizer.run().getDeps();
        assertThat(result, contains("edu.washington.cs.dt.impact.samples.ExampleMinimizeClassA.test2"));
        assertThat(result, hasSize(1));
    }

    @Test
    public void testFindToFailWithResettingTest() throws Exception {
        final List<String> tests =
                new ArrayList<>(Arrays.asList(
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassB.test1",
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassB.test2",
                        "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassB.test4"
                ));

        final MinimizeTestList minimizer =
                new MinimizeTestList(tests, "edu.washington.cs.dt.impact.samples.ExampleMinimizeClassB.test4");

        final List<String> result = minimizer.run().getDeps();
        assertThat(result, contains("edu.washington.cs.dt.impact.samples.ExampleMinimizeClassB.test1"));
        assertThat(result, hasSize(1));
    }

    @Test(expected = MinimizeTestListException.class)
    public void testDetectFlakyTests() throws Exception {
        final List<String> tests =
                new ArrayList<>(Collections.singletonList(
                        "edu.washington.cs.dt.impact.samples.ExampleHasFlakyTests.testFlakyFileDependent"
                ));

        final MinimizeTestList minimizer =
                new MinimizeTestList(tests, "edu.washington.cs.dt.impact.samples.ExampleHasFlakyTests.testFlakyFileDependent");
        final List<String> result = minimizer.run().getDeps();
    }
}