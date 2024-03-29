package medium;

/**
 * @author Jack
 * q.714
 * constraint:
 * 1 < prices.length <= 5 * 10^4
 * 0 < prices[i], fee < 5 * 10^4
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee); // if we does not hold stock
            hold = Math.max(hold, cash - prices[i]); // if we hold stock
        }
        return cash;
    }
    /**
     * The Below code is slow due to many if condititons
     */
//    public int maxProfit(int[] prices, int fee) {
//        int sum = 0;
//        int localMin = 50000;
//        int localMax = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            localMax = Math.max(localMax, prices[i]);
//            if (prices[i] < localMin) {
//                localMin = prices[i];
//                localMax = 0;
//            } else if (localMax - localMin - fee > 0 && prices[i + 1] + fee <= localMax) {
//                sum += localMax - localMin - fee;
//                localMin = 50000;
//                localMax = 0;
//            }
//        }
//        localMax = Math.max(localMax, prices[prices.length - 1]);
//        return localMax - localMin - fee > 0 ? sum + localMax - fee - localMin : sum;
//    }
}
