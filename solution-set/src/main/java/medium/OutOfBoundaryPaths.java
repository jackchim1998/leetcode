package medium;

import java.util.logging.Level;

/**
 * @author Jack
 */
public class OutOfBoundaryPaths {
    private static final int MOD = 1_000_000_007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dp = new int[m][n];
        int sum = 0;
        dp[startRow][startColumn] = 1;
        for (int level = maxMove - 1; level >= 0; level--) {
            int[][] newLevelDp = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) {
                    if (dp[i][j] != 0) {
                        if (i > 0) newLevelDp[i - 1][j] = (newLevelDp[i - 1][j] + dp[i][j]) % MOD;
                        else sum = (sum + dp[i][j]) % MOD;

                        if (j > 0) newLevelDp[i][j - 1] = (newLevelDp[i][j - 1] + dp[i][j]) % MOD;
                        else sum = (sum + dp[i][j]) % MOD;

                        if (i < m - 1) newLevelDp[i + 1][j] = (newLevelDp[i + 1][j] + dp[i][j]) % MOD;
                        else sum = (sum + dp[i][j]) % MOD;

                        if (j < n - 1) newLevelDp[i][j + 1] = (newLevelDp[i][j + 1] + dp[i][j]) % MOD;
                        else sum = (sum + dp[i][j]) % MOD;
                    }
                }
            dp = newLevelDp;
        }
        return sum;
    }
}
