package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPlusSignTest {
    private final LargestPlusSign solution = new LargestPlusSign();

    @Test
    void example1() {
        int result = solution.orderOfLargestPlusSign(5, new int[][]{{4, 2}});
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.orderOfLargestPlusSign(1, new int[][]{{0, 0}});
        assertEquals(0, result);
    }

    @Test
    void example3() {
        int result = solution.orderOfLargestPlusSign(5, new int[][]{
                {0, 2},
                {0, 4},
                {1, 2},
                {2, 0},
                {2, 3},
                {2, 4},
                {3, 4},
                {4, 2},
                {4, 4}});
        assertEquals(2, result);
    }
}