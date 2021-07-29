package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class RedundantConnectionTest {
    private final RedundantConnection solution = new RedundantConnection();

    @Test
    void example1() {
        int[] result = solution.findRedundantConnection(new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        });
        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void example2() {
        int[] result = solution.findRedundantConnection(new int[][]{
                {1, 2},
                {1, 3},
                {2, 3}
        });
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }
}
