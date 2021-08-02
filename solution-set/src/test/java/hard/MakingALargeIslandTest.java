package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MakingALargeIslandTest {
    private final MakingALargeIsland solution = new MakingALargeIsland();

    @Test
    void example1() {
        int result = solution.largestIsland(new int[][]{
                {1, 0},
                {0, 1}
        });
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.largestIsland(new int[][]{
                {1, 1},
                {0, 1}
        });
        assertEquals(4, result);
    }

    @Test
    void example3() {
        int result = solution.largestIsland(new int[][]{
                {1, 1},
                {1, 1}
        });
        assertEquals(4, result);
    }

    @Test
    void example4() {
        int result = solution.largestIsland(new int[][]{
                {0, 0},
                {0, 0}
        });
        assertEquals(1, result);
    }
}
