package medium;

import medium.MaximalSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximalSquareTest {
    private final MaximalSquare solution = new MaximalSquare();

    @Test
    void example1() {
        assertEquals(4, solution.maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));
    }

    @Test
    void example2() {
        assertEquals(1, solution.maximalSquare(new char[][]{
                {'0', '1'}
        }));
    }

    @Test
    void example3() {
        assertEquals(0, solution.maximalSquare(new char[][]{
                {'0'}
        }));
    }

    @Test
    void example4() {
        assertEquals(1, solution.maximalSquare(new char[][]{
                {'0', '1'}
        }));
    }
}
