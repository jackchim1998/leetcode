package array.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    void example1() {
        int[] result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10, 11, 12}, 8);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void example2() {
        int[] result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }

    @Test
    void example3() {
        int[] result = solution.searchRange(new int[]{1}, 1);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
    }
}
