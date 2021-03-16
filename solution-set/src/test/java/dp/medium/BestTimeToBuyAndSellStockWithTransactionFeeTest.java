package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BestTimeToBuyAndSellStockWithTransactionFeeTest {
    private final BestTimeToBuyAndSellStockWithTransactionFee solution = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void example1() {
        assertEquals(8, solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }

    @Test
    void example2() {
        assertEquals(6, solution.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }

    @Test
    void example3() {
        assertEquals(4, solution.maxProfit(new int[]{4, 5, 2, 4, 3, 3, 1, 2, 5, 4}, 1));
    }

    @Test
    void example4() {
        assertEquals(4, solution.maxProfit(new int[]{2,2,1,1,5,5,3,1,5,4}, 2));
    }

}
