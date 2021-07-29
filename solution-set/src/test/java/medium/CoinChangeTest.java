package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CoinChangeTest {
    private final CoinChange solution = new CoinChange();

    @Test
    void example1() {
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void example2() {
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

    @Test
    void example3() {
        assertEquals(0, solution.coinChange(new int[]{1}, 0));
    }

    @Test
    void example4() {
        assertEquals(1, solution.coinChange(new int[]{1}, 1));
    }

    @Test
    void example5() {
        assertEquals(2, solution.coinChange(new int[]{1}, 2));
    }

    @Test
    void example6() {
        assertEquals(20, solution.coinChange(new int[]{186, 419, 83, 408}, 6249));
    }
}
