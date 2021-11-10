package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockIITest {
    private final BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    @Test
    void example1() {
        int result = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(7, result);
    }

    @Test
    void example2() {
        int result = solution.maxProfit(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, result);
    }

    @Test
    void example3() {
        int result = solution.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, result);
    }
}