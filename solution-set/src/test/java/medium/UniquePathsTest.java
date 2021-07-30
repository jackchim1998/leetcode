package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class UniquePathsTest {
    private final UniquePaths solution = new UniquePaths();

    @Test
    void example1() {
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void example2() {
        assertEquals(3, solution.uniquePaths(3, 2));
    }

    @Test
    void example3() {
        assertEquals(28, solution.uniquePaths(7, 3));
    }

    @Test
    void example4() {
        assertEquals(6, solution.uniquePaths(3, 3));
    }

}
