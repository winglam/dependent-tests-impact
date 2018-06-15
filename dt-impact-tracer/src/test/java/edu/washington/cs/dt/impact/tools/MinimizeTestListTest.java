package edu.washington.cs.dt.impact.tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class MinimizeTestListTest {
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

        final List<String> result = minimizer.run();
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

        final List<String> result = minimizer.run();
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

        final List<String> result = minimizer.run();
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
        final List<String> result = minimizer.run();
    }
}