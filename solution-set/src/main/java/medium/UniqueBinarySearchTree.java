package medium;

/**
 * @author Jack
 * q.96
 * Constraints:
 * 1 <= n <= 19
 */
public class UniqueBinarySearchTree {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        return calculate(n, dp);
    }

    private int calculate(int n, int[] dp) {
        if (dp[n] <= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += calculate(i - 1, dp) * calculate(n - i, dp);
            dp[n] = sum;
        }
        return dp[n];
    }
}
