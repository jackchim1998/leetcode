package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {
    private final MaximumSubarray solution = new MaximumSubarray();

    @Test
    void example1() {
        int result = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, result);
    }

    @Test
    void example2() {
        int result = solution.maxSubArray(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    void example3() {
        int result = solution.maxSubArray(new int[]{5, 4, -1, 7, 8});
        assertEquals(23, result);
    }
}