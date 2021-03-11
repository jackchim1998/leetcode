package dp.medium;

/**
 * @author Jack
 * q.96
 * Constraints:
 * 1 <= n <= 19
 */
public class UniqueBinarySearchTree {
    private int[] dp;

    public int numTrees(int n) {
        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        return calculate(n);
    }

    private int calculate(int n) {
        if (dp[n] <= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += calculate(i - 1) * calculate(n - i);
            dp[n] = sum;
        }
        return dp[n];
    }
}
