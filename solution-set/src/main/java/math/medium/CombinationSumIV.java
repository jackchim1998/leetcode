package math.medium;

/**
 * @author Jack
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        Integer[] dp = new Integer[target + 1];
        dp[0] = 1;
        return dp(nums, target, dp);
    }

    private int dp(int[] nums, int target, Integer[] dp) {
        if (target < 0) return 0;
        if (dp[target] != null) return dp[target];
        int sum = 0;
        for (int num : nums)
            sum += dp(nums, target - num, dp);
        dp[target] = sum;
        return sum;
    }
}
