package math.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jack
 */
class ReorderedPowerOf2Test {
    private final ReorderedPowerOf2 solution = new ReorderedPowerOf2();

    @Test
    void example1() {
        assertTrue(solution.reorderedPowerOf2(1));
    }

    @Test
    void example2() {
        assertFalse(solution.reorderedPowerOf2(10));
    }

    @Test
    void example3() {
        assertTrue(solution.reorderedPowerOf2(16));
    }

    @Test
    void example4() {
        assertFalse(solution.reorderedPowerOf2(24));
    }

    @Test
    void example5() {
        assertTrue(solution.reorderedPowerOf2(125));
    }

}
