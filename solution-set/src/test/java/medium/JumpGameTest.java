package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class JumpGameTest {
    private final JumpGame solution = new JumpGame();

    @Test
    void example1() {
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void example2() {
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void example3() {
        assertTrue(solution.canJump(new int[]{2, 0}));
    }

}
