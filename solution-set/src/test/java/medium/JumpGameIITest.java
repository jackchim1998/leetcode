package medium;

import medium.JumpGameII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class JumpGameIITest {
    private final JumpGameII solution = new JumpGameII();

    @Test
    void example1() {
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void example2() {
        assertEquals(1, solution.jump(new int[]{2, 1}));
    }

    @Test
    void example3() {
        assertEquals(1, solution.jump(new int[]{3, 2, 1}));
    }

}
