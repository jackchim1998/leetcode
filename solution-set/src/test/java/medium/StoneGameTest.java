package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class StoneGameTest {
    private final StoneGame solution = new StoneGame();

    @Test
    void example1() {
        boolean result = solution.stoneGame(new int[]{5, 3, 4, 5});
        assertTrue(result);
    }
}
