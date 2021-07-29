package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumLengthOfRepeatedSubarrayTest {
    private final MaximumLengthOfRepeatedSubarray solution = new MaximumLengthOfRepeatedSubarray();

    @Test
    void example1() {
        int result = solution.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});
        assertEquals(3, result);
    }

}
