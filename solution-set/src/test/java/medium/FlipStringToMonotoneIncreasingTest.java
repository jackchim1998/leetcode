package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class FlipStringToMonotoneIncreasingTest {
    private final FlipStringToMonotoneIncreasing solution = new FlipStringToMonotoneIncreasing();

    @Test
    void example1() {
        int result = solution.minFlipsMonoIncr("00110");
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.minFlipsMonoIncr("010110");
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.minFlipsMonoIncr("00011000");
        assertEquals(2, result);
    }

    @Test
    void example4() {
        int result = solution.minFlipsMonoIncr("0101100011");
        assertEquals(3, result);
    }

    @Test
    void example5() {
        int result = solution.minFlipsMonoIncr("10011111110010111011");
        assertEquals(5, result);
    }
}
