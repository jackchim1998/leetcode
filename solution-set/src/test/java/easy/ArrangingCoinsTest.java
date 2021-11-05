package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrangingCoinsTest {
    private final ArrangingCoins solution = new ArrangingCoins();

    @Test
    void example1() {
        assertEquals(2, solution.arrangeCoins(5));
    }

    @Test
    void example2() {
        assertEquals(3, solution.arrangeCoins(8));
    }

    @Test
    void example3() {
        assertEquals(60070, solution.arrangeCoins(1804289383));
    }

}