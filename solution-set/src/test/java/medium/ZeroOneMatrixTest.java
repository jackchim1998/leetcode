package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class ZeroOneMatrixTest {
    private final ZeroOneMatrix solution = new ZeroOneMatrix();

    @Test
    void example1() {
        int[][] input = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] result = solution.updateMatrix(input);
        assertArrayEquals(new int[]{0, 0, 0}, result[0]);
        assertArrayEquals(new int[]{0, 1, 0}, result[1]);
        assertArrayEquals(new int[]{0, 0, 0}, result[2]);
    }

    @Test
    void example2() {
        int[][] input = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] result = solution.updateMatrix(input);
        assertArrayEquals(new int[]{0, 0, 0}, result[0]);
        assertArrayEquals(new int[]{0, 1, 0}, result[1]);
        assertArrayEquals(new int[]{1, 2, 1}, result[2]);
    }

}
