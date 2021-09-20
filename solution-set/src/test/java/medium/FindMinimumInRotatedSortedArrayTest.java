package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {
    private final FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    @Test
    void example1() {
        int result = solution.findMin(new int[]{3, 4, 5, 1, 2});
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
        assertEquals(0, result);
    }

    @Test
    void example3() {
        int result = solution.findMin(new int[]{11, 13, 15, 17});
        assertEquals(11, result);
    }

}