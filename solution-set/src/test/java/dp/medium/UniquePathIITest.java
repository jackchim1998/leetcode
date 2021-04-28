package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class UniquePathIITest {
    private final UniquePathII solution = new UniquePathII();

    @Test
    void example1() {
        int result = solution.uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        });
        assertEquals (2, result);
    }
}
