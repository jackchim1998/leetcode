package dp.medium;

import java.util.Arrays;

/**
 * @author Jack
 * q.322
 * constraint:
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 231 - 1
 * 0 <= amount <= 104
 */
public class CoinChange {
    private int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] < min)
                    min = dp[i - coin];
            }
            if (min < Integer.MAX_VALUE)
                dp[i] = min + 1;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    /**
     * the below code exceeds time limit
     * I think it is slower because of if conditions and lots of function call
     */

//    private int[] dp;
//
//    public int coinChange(int[] coins, int amount) {
//        dp = new int[amount + 1];
//        return stepsNeed(coins, amount);
//    }
//
//    private int stepsNeed(int[] coins, int diff) {
//        if (diff < 0) return -1;
//        if (diff == 0) return 0;
//        if (dp[diff] > 0) return dp[diff];
//        int min = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            int steps = stepsNeed(coins, diff - coin);
//            if (steps < 0) continue;
//            if (steps < min)
//                min = steps;
//        }
//        if (min == Integer.MAX_VALUE)
//            return -1;
//        dp[diff] = min + 1;
//        return dp[diff];
//    }
}
