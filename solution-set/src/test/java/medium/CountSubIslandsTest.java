package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CountSubIslandsTest {
    private final CountSubIslands solution = new CountSubIslands();

    @Test
    void example1() {
        int result = solution.countSubIslands(new int[][]{
                {1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1}
        }, new int[][]{
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0}
        });
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.countSubIslands(new int[][]{
                {1, 0, 1, 0, 1},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1}
        }, new int[][]{
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}
        });
        assertEquals(2, result);
    }

}
