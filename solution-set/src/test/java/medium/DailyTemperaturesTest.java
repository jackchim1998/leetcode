package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {
    private final DailyTemperatures solution = new DailyTemperatures();

    @Test
    void example1() {
        int[] result = solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    void example2() {
        int[] result = solution.dailyTemperatures(new int[]{30, 40, 50, 60});
        int[] expected = {1, 1, 1, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    void example3() {
        int[] result = solution.dailyTemperatures(new int[]{30, 60, 90});
        int[] expected = {1, 1, 0};
        assertArrayEquals(expected, result);
    }
}