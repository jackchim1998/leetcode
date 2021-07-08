package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class KthSmallestElementInASortedMatrixTest {
    private final KthSmallestElementInASortedMatrix solution = new KthSmallestElementInASortedMatrix();

    @Test
    void example1() {
        int result = solution.kthSmallest(new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        }, 8);
        assertEquals(13, result);
    }

    @Test
    void example2() {
        int result = solution.kthSmallest(new int[][]{
                {1, 3, 5},
                {6, 7, 12},
                {11, 14, 14}
        }, 6);
        assertEquals(11, result);
    }
}
