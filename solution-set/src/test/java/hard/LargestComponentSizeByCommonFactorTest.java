package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestComponentSizeByCommonFactorTest {
    private final LargestComponentSizeByCommonFactor solution = new LargestComponentSizeByCommonFactor();

    @Test
    void example1() {
        int result = solution.largestComponentSize(new int[]{4, 6, 15, 35});
        assertEquals(4, result);
    }

    @Test
    void example2() {
        int result = solution.largestComponentSize(new int[]{20, 50, 9, 63});
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.largestComponentSize(new int[]{2, 3, 6, 7, 4, 12, 21, 39});
        assertEquals(8, result);
    }
}