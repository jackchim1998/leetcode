package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximalRectangleTest {
    private final MaximalRectangle solution = new MaximalRectangle();

    @Test
    void example1() {
        int result = solution.maximalRectangle(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        });
        assertEquals(6, result);
    }

    @Test
    void example2() {
        int result = solution.maximalRectangle(new char[][]{
        });
        assertEquals(0, result);
    }

    @Test
    void example3() {
        int result = solution.maximalRectangle(new char[][]{
                {'0'}
        });
        assertEquals(0, result);
    }

    @Test
    void example4() {
        int result = solution.maximalRectangle(new char[][]{
                {'1'}
        });
        assertEquals(1, result);
    }

    @Test
    void example5() {
        int result = solution.maximalRectangle(new char[][]{
                {'0', '0'}
        });
        assertEquals(0, result);
    }
}