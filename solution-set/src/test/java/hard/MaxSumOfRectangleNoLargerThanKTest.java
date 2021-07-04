package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaxSumOfRectangleNoLargerThanKTest {
    private final MaxSumOfRectangleNoLargerThanK solution = new MaxSumOfRectangleNoLargerThanK();

    @Test
    void example1() {
        int result = solution.maxSumSubmatrix(new int[][]{
                {1, 0, 1},
                {0, -2, 3}
        }, 2);
        assertEquals(2, result);
    }
}
