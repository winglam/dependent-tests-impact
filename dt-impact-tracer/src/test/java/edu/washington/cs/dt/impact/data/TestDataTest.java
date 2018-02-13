package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.RESULT;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestDataTest {
    @Test
    public void testFromString() throws Exception {
        final TestData expected = new TestData("A", RESULT.PASS,
                new HashSet<>(Arrays.asList("B", "C")),
                new HashSet<>(Arrays.asList("D", "E")),
                RESULT.FAILURE,
                new ArrayList<>(Arrays.asList("B", "C", "A", "D", "E")));

        assertEquals(expected, TestData.fromString(expected.toString()));
    }
}