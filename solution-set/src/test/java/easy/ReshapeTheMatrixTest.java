package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class ReshapeTheMatrixTest {
    private final ReshapeTheMatrix solution = new ReshapeTheMatrix();

    @Test
    void example1() {
        int r = 1;
        int c = 4;
        int[][] result = solution.matrixReshape(new int[][]{
                {1, 2},
                {3, 4}
        }, r, c);
        assertEquals(r, result.length);
        assertEquals(c, result[0].length);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, result[0]);
    }

    @Test
    void example2() {
        int r = 4;
        int c = 1;
        int[][] result = solution.matrixReshape(new int[][]{
                {1, 2},
                {3, 4}
        }, r, c);
        assertEquals(r, result.length);
        assertEquals(c, result[0].length);
        Assertions.assertArrayEquals(new int[]{1}, result[0]);
        Assertions.assertArrayEquals(new int[]{2}, result[1]);
        Assertions.assertArrayEquals(new int[]{3}, result[2]);
        Assertions.assertArrayEquals(new int[]{4}, result[3]);
    }
}
