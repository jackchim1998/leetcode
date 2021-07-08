package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class IslandPerimeterTest {
    private final IslandPerimeter solution = new IslandPerimeter();

    @Test
    void example1() {
        int result = solution.islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        });
        assertEquals(16, result);
    }
}
