package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaxConsecutiveOnesIIITest {
    private final MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

    @Test
    void example1() {
        int result = solution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3);
        assertEquals(10, result);
    }

    @Test
    void example2() {
        int result = solution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 0);
        assertEquals(4, result);
    }

    @Test
    void example3() {
        int result = solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);
        assertEquals(6, result);
    }
}
