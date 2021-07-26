package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class NonNegativeIntegersWithoutConsecutiveOnesTest {
    private final NonNegativeIntegersWithoutConsecutiveOnes solution = new NonNegativeIntegersWithoutConsecutiveOnes();

    @Test
    void example1() {
        int result = solution.findIntegers(5);
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.findIntegers(1);
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.findIntegers(2);
        assertEquals(3, result);
    }

    @Test
    void example4() {
        int result = solution.findIntegers(28);
        assertEquals(13, result);
    }

    @Test
    void example5() {
        int result = solution.findIntegers(100);
        assertEquals(34, result);
    }

    @Test
    void example6() {
        int result = solution.findIntegers(10);
        assertEquals(8, result);
    }
}
