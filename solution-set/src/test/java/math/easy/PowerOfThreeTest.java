package math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class PowerOfThreeTest {
    private final PowerOfThree solution = new PowerOfThree();

    @Test
    void example1() {
        assertTrue(solution.isPowerOfThree(27));
    }
}
