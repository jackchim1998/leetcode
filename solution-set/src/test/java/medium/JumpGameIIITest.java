package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JumpGameIIITest {
    private final JumpGameIII solution = new JumpGameIII();

    @Test
    void example1() {
        boolean result = solution.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5);
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0);
        assertTrue(result);
    }

    @Test
    void example3() {
        boolean result = solution.canReach(new int[]{3, 0, 2, 1, 2}, 2);
        assertFalse(result);
    }

}