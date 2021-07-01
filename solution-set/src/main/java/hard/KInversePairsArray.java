package hard;

/**
 * @author Jack
 */
public class KInversePairsArray {
    int mod = 1_000_000_007;

    public int kInversePairs(int n, int k) {
        if (n == 1 && k == 0) return 1;
        int[][] dp = new int[n + 1][k + 1];
        dp[1][0] = 1;
        for (int i = 2; i < n; i++) {
            dp[i][0] = 1;
            int maxPossiblePairs = i * (i - 1) / 2;
            int stop = Math.min(k, maxPossiblePairs);
            for (int j = 1; j < i && j <= stop; j++)
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
            for (int j = i; j <= stop; j++)
                dp[i][j] = (dp[i][j - 1] + (dp[i - 1][j] - dp[i - 1][j - i]) % mod) % mod;
        }
        for (int i = 0; i < n; i++)
            if (k - i >= 0)
                dp[n][k] = (dp[n][k] + dp[n - 1][k - i]) % mod;
        return dp[n][k];
    }

}
