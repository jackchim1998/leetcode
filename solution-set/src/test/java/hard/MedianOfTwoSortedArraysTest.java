package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jack
 */
class MedianOfTwoSortedArraysTest {
    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    void example1() {
        double result = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assertEquals(2.5, result);
    }

    @Test
    void example2() {
        double result = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assertEquals(2, result);
    }

    // 1 3 (3) 9 5
    // 2 3 (6) 8
    @Test
    void example3() {
        double result = solution.findMedianSortedArrays(new int[]{1, 3, 9, 5, 3}, new int[]{2, 6, 3, 8});
        assertEquals(3, result);
    }
}