package edu.washington.cs.dt.impact.tools;

import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.data.TestData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ParallelDependentTestFinderTest {
    private ParallelDependentTestFinder dtFinder;

    @Before
    public void setUp() {
        Map<String, RESULT> origResults = new HashMap<>();
        origResults.put("A", RESULT.PASS);
        origResults.put("B", RESULT.PASS);
        origResults.put("dt", RESULT.PASS);
        origResults.put("C", RESULT.PASS);

        Map<String, RESULT> newResults = new HashMap<>();
        origResults.put("A", RESULT.PASS);
        origResults.put("B", RESULT.PASS);
        origResults.put("dt", RESULT.FAILURE);
        origResults.put("C", RESULT.PASS);

        Map<String, Set<TestData>> knownDependencies = new HashMap<>();
        Set<TestData> dependencies = new HashSet<>();
        dependencies.add(new TestData("dt", RESULT.PASS,
                Collections.singleton("A"), Collections.emptySet(),
                RESULT.FAILURE,
                Collections.singletonList("dt")));
        dependencies.add(new TestData("dt", RESULT.PASS,
                Collections.emptySet(), Collections.singleton("C"),
                RESULT.FAILURE,
                Arrays.asList("C", "A", "dt")));

        knownDependencies.put("dt", dependencies);

        dtFinder = new ParallelDependentTestFinder("dt",
                Arrays.asList("A", "B", "dt", "C"),
                origResults,
                Arrays.asList("B", "C", "dt", "A"),
                newResults,
                new ArrayList<>(),
                knownDependencies);
    }

    @Test
    public void getDependencyChains() throws Exception {
        final List<String> testOrder = new ArrayList<>(Arrays.asList("F", "A", "K", "J", "B", "L", "C", "dt"));
        final List<List<String>> output = dtFinder.getDependencyChains(testOrder);

        final Set<List<String>> expected = new HashSet<>(Arrays.asList(
                Collections.singletonList("F"),
                Arrays.asList("K", "J", "B", "L")));

        assertTrue(output.containsAll(expected));
    }

    @Test
    public void getAllDependencyChains() throws Exception {
        final List<List<String>> input = Arrays.asList(
                Collections.singletonList("1"),
                Collections.singletonList("2"),
                Collections.singletonList("3"));

        final Set<List<String>> expected = new HashSet<>(Arrays.asList(
                Collections.singletonList("1"),
                Collections.singletonList("2"),
                Collections.singletonList("3"),
                Arrays.asList("1", "2"),
                Arrays.asList("1", "3"),
                Arrays.asList("1", "2", "3"),
                Arrays.asList("2", "3")));

        final List<List<String>> output =
                dtFinder
                        .getAllDependencyChains(input)
                        .collect(Collectors.toList());

        assertTrue(expected.containsAll(output));
    }
}