package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfTwoTest {
    private final PowerOfTwo solution = new PowerOfTwo();

    @Test
    void example1() {
        assertTrue(solution.isPowerOfTwo(1));
    }

    @Test
    void example2() {
        assertTrue(solution.isPowerOfTwo(16));
    }

    @Test
    void example3() {
        assertFalse(solution.isPowerOfTwo(3));
    }
}