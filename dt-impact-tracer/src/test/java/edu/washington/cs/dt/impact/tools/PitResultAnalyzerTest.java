package edu.washington.cs.dt.impact.tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PitResultAnalyzerTest {
    @Test
    public void testGroupCoverage() {
        final List<String> testOrder = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        final MutantMatrix.Mutation mutation1 =
                new MutantMatrix.Mutation("test", "1", "1", Collections.singletonList("B"));
        final MutantMatrix.Mutation mutation2 =
                new MutantMatrix.Mutation("test", "1", "2", Arrays.asList("B", "C"));
        final MutantMatrix.Mutation mutation3 =
                new MutantMatrix.Mutation("test", "1", "3", Collections.singletonList("A"));
        final MutantMatrix.MutationGroup group =
                new MutantMatrix.MutationGroup(0, new ArrayList<>(Arrays.asList(mutation1, mutation2, mutation3)));

        assertEquals(Arrays.asList("33.3", "66.6", "0.0", "0.0"), group.showCoverage(testOrder));
    }
}
