package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestTurbulentSubarrayTest {
    private final LongestTurbulentSubarray solution = new LongestTurbulentSubarray();

    @Test
    void example1() {
        int result = solution.maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9});
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.maxTurbulenceSize(new int[]{4, 8, 12, 16});
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.maxTurbulenceSize(new int[]{100});
        assertEquals(1, result);
    }

    @Test
    void example4() {
        int result = solution.maxTurbulenceSize(new int[]{0, 8, 45, 88, 48, 68, 28, 55, 17, 24});
        assertEquals(8, result);
    }
}