package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class RotateImageTest {
    private final RotateImage solution = new RotateImage();

    @Test
    void example1() {
        int[][] input = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        solution.rotate(input);
        assertArrayEquals(new int[]{7, 4, 1}, input[0]);
        assertArrayEquals(new int[]{8, 5, 2}, input[1]);
        assertArrayEquals(new int[]{9, 6, 3}, input[2]);
    }

}
