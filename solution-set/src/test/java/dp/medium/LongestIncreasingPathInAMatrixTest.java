package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestIncreasingPathInAMatrixTest {
    private final LongestIncreasingPathInAMatrix solution = new LongestIncreasingPathInAMatrix();

    @Test
    void example1() {
        assertEquals(4, solution.longestIncreasingPath(new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        }));
    }

}
