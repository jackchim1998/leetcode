package medium;

import medium.NumberOfSubArraysWithBoundedMaximum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class NumberOfSubArraysWithBoundedMaximumTest {
    private final NumberOfSubArraysWithBoundedMaximum solution = new NumberOfSubArraysWithBoundedMaximum();

    @Test
    void example1() {
        int result = solution.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3);
        assertEquals(3, result);
    }
}
