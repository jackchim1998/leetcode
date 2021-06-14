package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class StoneGameVIITest {
    private final StoneGameVII solution = new StoneGameVII();

    @Test
    void example1() {
        assertEquals(6, solution.stoneGameVII(new int[]{5, 3, 1, 4, 2}));
    }
}
