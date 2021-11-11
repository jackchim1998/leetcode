package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    void example1() {
        int result = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, result);
    }
}