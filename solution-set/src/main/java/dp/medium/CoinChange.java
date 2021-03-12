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
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
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

//
//    public int coinChange(int[] coins, int amount) {
//        int[] dp = new int[amount + 1];
//        return stepsNeed(coins, amount, dp);
//    }
//
//    private int stepsNeed(int[] coins, int diff, int[] dp) {
//        if (diff < 0) return -1;
//        if (diff == 0) return 0;
//        if (dp[diff] != 0) return dp[diff]; // use != 0 is faster than > 0
//        int min = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            int steps = stepsNeed(coins, diff - coin, dp);
//            if (steps >= 0 && steps + 1 < min)
//                min = steps+1;
//        }
//        dp[diff] = min == Integer.MAX_VALUE ? -1 : min;
//        return dp[diff];
//    }
}
