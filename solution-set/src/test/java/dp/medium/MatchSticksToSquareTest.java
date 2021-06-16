package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class MatchSticksToSquareTest {
    private final MatchSticksToSquare solution = new MatchSticksToSquare();

    @Test
    void example1() {
        assertTrue(solution.makesquare(new int[]{1, 1, 2, 2, 2}));
    }

    @Test
    void example2() {
        assertFalse(solution.makesquare(new int[]{3, 3, 3, 4}));
    }

    @Test
    void example3() {
        assertTrue(solution.makesquare(new int[]{5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3}));
    }
}
