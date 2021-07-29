package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MinCostClimbingStairsTest {
    private final MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void example1() {
        assertEquals(6, solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
