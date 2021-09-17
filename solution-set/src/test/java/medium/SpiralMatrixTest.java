package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
    private final SpiralMatrix solution = new SpiralMatrix();

    @Test
    void example1() {
        List<Integer> result = solution.spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        assertArrayEquals(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, result.toArray(new Integer[0]));
    }

    @Test
    void example2() {
        List<Integer> result = solution.spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        });
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}, result.toArray(new Integer[0]));
    }
}