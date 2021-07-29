package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class IntegerBreakTest {
    private final IntegerBreak solution = new IntegerBreak();

    @Test
    void example1() {
        assertEquals(1, solution.integerBreak(2));
    }

    @Test
    void example2() {
        assertEquals(36, solution.integerBreak(10));
    }

    @Test
    void example3() {
        assertEquals(54, solution.integerBreak(11));
    }
}
