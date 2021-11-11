package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumValueToGetPositiveStepByStepSumTest {
    private final MinimumValueToGetPositiveStepByStepSum solution = new MinimumValueToGetPositiveStepByStepSum();

    @Test
    void example1() {
        int result = solution.minStartValue(new int[]{-3, 2, -3, 4, 2});
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.minStartValue(new int[]{1, 2});
        assertEquals(1, result);
    }

    @Test
    void example3() {
        int result = solution.minStartValue(new int[]{1, -2, -3});
        assertEquals(5, result);
    }
}