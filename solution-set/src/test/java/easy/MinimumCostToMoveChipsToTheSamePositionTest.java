package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumCostToMoveChipsToTheSamePositionTest {
    private final MinimumCostToMoveChipsToTheSamePosition solution = new MinimumCostToMoveChipsToTheSamePosition();

    @Test
    void example1() {
        int result = solution.minCostToMoveChips(new int[]{1, 2, 3});
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.minCostToMoveChips(new int[]{2, 2, 2, 3, 3});
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.minCostToMoveChips(new int[]{1, 10000});
        assertEquals(1, result);
    }
}