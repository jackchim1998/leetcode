package string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class DeleteOperationForTwoStringsTest {
    private final DeleteOperationForTwoStrings solution = new DeleteOperationForTwoStrings();

    @Test
    void example1() {
        assertEquals(4, solution.minDistance("leetcode", "etco"));
    }
    @Test
    void example2() {
        assertEquals(3, solution.minDistance("park", "spake"));
    }
}
