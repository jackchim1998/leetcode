package medium;

public class DominoAndTrominoTiling {
    private static final int MOD = 1_000_000_007;

    public int numTilings(int n) {
        int[] dp = new int[Math.max(n + 1, 3)];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        int prefixSum = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % MOD + (2 * prefixSum) % MOD) % MOD;
            prefixSum = (prefixSum + dp[i - 2]) % MOD;
        }
        return dp[n];
    }
}
