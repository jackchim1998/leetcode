package medium;

import medium.SetMatrixZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class SetMatrixZeroesTest {
    private final SetMatrixZeroes solution = new SetMatrixZeroes();

    @Test
    void example1() {
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        solution.setZeroes(matrix);
        int[][] expected = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        assertArrayEquals(expected[0], matrix[0]);
        assertArrayEquals(expected[1], matrix[1]);
        assertArrayEquals(expected[2], matrix[2]);
    }

    @Test
    void example2() {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        solution.setZeroes(matrix);
        int[][] expected = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        assertArrayEquals(expected[0], matrix[0]);
        assertArrayEquals(expected[1], matrix[1]);
        assertArrayEquals(expected[2], matrix[2]);
    }

    @Test
    void example3() {
        int[][] matrix = new int[][]{
                {0, 0, 0, 5},
                {4, 3, 1, 4},
                {0, 1, 1, 4},
                {1, 2, 1, 3},
                {0, 0, 1, 1}
        };
        solution.setZeroes(matrix);
        int[][] expected = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        assertArrayEquals(expected[0], matrix[0]);
        assertArrayEquals(expected[1], matrix[1]);
        assertArrayEquals(expected[2], matrix[2]);
        assertArrayEquals(expected[3], matrix[3]);
        assertArrayEquals(expected[4], matrix[4]);
    }
}
