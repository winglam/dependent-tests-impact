package edu.washington.cs.dt.impact.data;

import edu.washington.cs.dt.RESULT;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TestData {
    public final String dependentTest;
    public final RESULT intended;
    public final Set<String> beforeTests;
    public final Set<String> afterTests;
    public final RESULT revealed;

    private final List<String> revealingOrder;

    public TestData(final String dependentTest,
                    final RESULT intended,
                    final Set<String> beforeTests,
                    final Set<String> afterTests,
                    final RESULT revealed,
                    final List<String> revealingOrder) {
        this.dependentTest = dependentTest;
        this.intended = intended;
        this.beforeTests = beforeTests;
        this.afterTests = afterTests;
        this.revealed = revealed;
        this.revealingOrder = revealingOrder;
    }

    @Override
    public String toString() {
        // Otherwise, the before/after tests are the tests that cause the revealed behavior to be
        // different from the intended behavior.
        return  "Test: " + dependentTest + "\n" +
                "Intended behavior: " + intended + "\n" +
                "when executed after: " + beforeTests + "\n" +
                "and executed before: " + afterTests + "\n" +
                "The revealed behavior: " + revealed + "\n" +
                "in the order: " + revealingOrder;
    }

    /**
     * Ensures that the current order respects the dependencies contained in this class.
     */
    public void fixOrder(final List<String> currentOrder) {
        int index = currentOrder.indexOf(dependentTest);

        // Only needs fixing if this test is in the order to be run.
        if (index != -1) {
            for (final String dependency : beforeTests) {
                final int testIndex = currentOrder.indexOf(dependency);

                // If the dependent test isn't there, just add it
                if (testIndex == -1) {
                    currentOrder.add(index, dependency);
                } else if (testIndex > index) { // If it is, make sure that it comes before the test
                    currentOrder.remove(testIndex);
                    currentOrder.add(index, dependency);
                }
            }

            // Index could have changed above.
            index = currentOrder.indexOf(dependentTest);

            for (final String dependency : afterTests) {
                final int testIndex = currentOrder.indexOf(dependency);

                // If this test comes before the dependent test, then we need to move it to after.
                if (testIndex != -1 && testIndex < index) {
                    currentOrder.remove(testIndex);
                    currentOrder.add(index + 1, dependency);
                }
            }
        }
    }

    /**
     * @param testOrder The order to get the indices from.
     * @return a stream containing the indices of each dependency stored in this class, if they are
     * in the order passed in.
     */
    public Stream<Integer> getIndices(final List<String> testOrder) {
        return Stream.concat(
                beforeTests.stream().map(testOrder::indexOf),
                afterTests.stream().map(testOrder::indexOf)
        );
    }
}

