package medium;

import medium.MaximumProductSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumProductSubarrayTest {
    private final MaximumProductSubarray solution = new MaximumProductSubarray();

    @Test
    void example1() {
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    void example2() {
        assertEquals(0, solution.maxProduct(new int[]{-2, 0, -1}));
    }

    @Test
    void example3() {
        assertEquals(2, solution.maxProduct(new int[]{0, 2}));
    }

    @Test
    void example4() {
        assertEquals(-2, solution.maxProduct(new int[]{-2}));
    }

    @Test
    void example5() {
        assertEquals(2, solution.maxProduct(new int[]{-1, 0, -2, 2}));
    }
}
