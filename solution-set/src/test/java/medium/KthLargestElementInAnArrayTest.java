package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jack
 */
class KthLargestElementInAnArrayTest {
    private final KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    @Test
    void example1() {
        int result = solution.findKthLargest(new int[]{3, 2, 5, 1, 6, 4}, 2);
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        assertEquals(4, result);
    }

    @Test
    void partitionExample1() {
        int[] arr = {3, 2, 5, 1, 6, 4};
        int result = solution.partition(arr, 0, arr.length - 1);
        assertEquals(3,result);
    }
}