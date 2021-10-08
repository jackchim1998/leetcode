package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestPathInAGridWithObstaclesEliminationTest {
    private final ShortestPathInAGridWithObstaclesElimination solution = new ShortestPathInAGridWithObstaclesElimination();

    @Test
    void example1() {
        int result = solution.shortestPath(new int[][]{
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        }, 1);
        assertEquals(6, result);
    }

    @Test
    void example2() {
        int result = solution.shortestPath(new int[][]{
                {0, 1, 1},
                {1, 1, 1},
                {1, 0, 0}
        }, 1);
        assertEquals(-1, result);
    }

}