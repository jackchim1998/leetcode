package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CoinChangeIITest {
    private final CoinChangeII solution = new CoinChangeII();

    @Test
    void example() {
        assertEquals(4, solution.change(5, new int[]{1, 2, 5}));
    }

    @Test
    void example2() {
        assertEquals(0, solution.change(3, new int[]{2}));
    }

    @Test
    void example3() {
        assertEquals(1, solution.change(10, new int[]{10}));
    }

    @Test
    void example4() {
        assertEquals(10, solution.change(10, new int[]{1, 2, 5}));
    }

    @Test
    void example5() {
        assertEquals(12701, solution.change(500, new int[]{1, 2, 5}));
    }

    @Test
    void example6() {
        assertEquals(1, solution.change(0, new int[]{}));
    }
}
