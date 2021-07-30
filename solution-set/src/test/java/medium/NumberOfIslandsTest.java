package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class NumberOfIslandsTest {
    private final NumberOfIslands solution = new NumberOfIslands();

    @Test
    void example1() {
        int result = solution.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        });
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        });
        assertEquals(3, result);
    }

}
