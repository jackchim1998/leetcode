package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestIncreasingSubarrayTest {
    private final LongestIncreasingSubarray solution = new LongestIncreasingSubarray();

    @Test
    void example1() {
        int result = solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        assertEquals(4, result);
    }
}
