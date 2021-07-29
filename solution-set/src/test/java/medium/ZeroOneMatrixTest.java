package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        int[][] actual = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        AssertUtil.assertEquals(actual, solution.updateMatrix(input));
    }

    @Test
    void example2() {
        int[][] input = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] actual = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        AssertUtil.assertEquals(actual, solution.updateMatrix(input));
    }

    @Test
    void example3() {
        int[][] input = {
                {0, 1, 0, 1, 1},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1}
        };
        int[][] actual = {
                {0, 1, 0, 1, 2},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1}
        };
        AssertUtil.assertEquals(actual, solution.updateMatrix(input));
    }

}
