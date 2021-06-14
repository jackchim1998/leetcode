package dp.medium;

/**
 * @author Jack
 */
public class StoneGameVII {
    int[][] sumOfRange;
    int[][] dp;

    public int stoneGameVII(int[] stones) {
        sumOfRange = new int[stones.length][stones.length]; // prefix zero
        dp = new int[stones.length][stones.length];
        sumOfRange[0][0] = stones[0];
        for (int i = 1; i < stones.length; i++)
            sumOfRange[0][i] = sumOfRange[0][i - 1] + stones[i];
        for (int i = 1; i < stones.length; i++)
            for (int j = i; j < stones.length; j++)
                sumOfRange[i][j] = sumOfRange[i - 1][j] - stones[i - 1];
        return backtracking(0, stones.length - 1, true);
    }

    private int backtracking(int start, int end, boolean isAlex) { // return score diff
        if (start >= end) return 0;
        if (dp[start][end] != 0) return dp[start][end];
        int left = backtracking(start + 1, end, !isAlex);
        int right = backtracking(start, end - 1, !isAlex);
        dp[start][end] = isAlex ? Math.max(left + sumOfRange[start + 1][end], right + sumOfRange[start][end - 1])
                : Math.min(left - sumOfRange[start + 1][end], right - sumOfRange[start][end - 1]);
        return dp[start][end];
    }
}
