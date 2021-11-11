package easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minBuyPrice)
                minBuyPrice = price;
            else if ((price - minBuyPrice) > maxProfit)
                maxProfit = price - minBuyPrice;
        }
        return maxProfit;
    }
}
