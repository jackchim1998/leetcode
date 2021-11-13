package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchA2DMatrixTest {
    private final SearchA2DMatrix solution = new SearchA2DMatrix();

    @Test
    void example1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = solution.searchMatrix(matrix, target);
        assertTrue(result);
    }

    @Test
    void example2() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        boolean result = solution.searchMatrix(matrix, target);
        assertFalse(result);
    }
}