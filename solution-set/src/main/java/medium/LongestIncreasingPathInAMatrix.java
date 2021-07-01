package medium;

/**
 * @author Jack
 * <p>
 * constraint:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * 0 <= matrix[i][j] <= 231 - 1
 */
public class LongestIncreasingPathInAMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (dp[i][j] == 0)
                    dp[i][j] = dfs(matrix, dp, i, j);
                max = Math.max(dp[i][j], max);
            }
        return max;
    }

    private int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (i < 0 || i >= matrix.length) return 0;
        if (j < 0 || j >= matrix[0].length) return 0;
        if (dp[i][j] != 0) return dp[i][j];
        int max = 0;
        if (i > 0 && matrix[i][j] > matrix[i - 1][j])
            max = Math.max(max, dfs(matrix, dp, i - 1, j));
        if (i < matrix.length - 1 && matrix[i][j] > matrix[i + 1][j])
            max = Math.max(max, dfs(matrix, dp, i + 1, j));
        if (j > 0 && matrix[i][j] > matrix[i][j - 1])
            max = Math.max(max, dfs(matrix, dp, i, j - 1));
        if (j < matrix[0].length - 1 && matrix[i][j] > matrix[i][j + 1])
            max = Math.max(max, dfs(matrix, dp, i, j + 1));
        dp[i][j] = max + 1;
        return dp[i][j];
    }


}
