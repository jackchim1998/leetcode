package medium;

/**
 * @author Jack
 */
public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        return dp(chars1, chars2, dp, 0, 0);
    }

    private int dp(char[] chars1, char[] chars2, int[][] dp, int idx1, int idx2) {
        if (idx1 == chars1.length) return chars2.length - idx2;
        if (idx2 == chars2.length) return chars1.length - idx1;
        if (dp[idx1][idx2] != 0) return dp[idx1][idx2];
        if (chars1[idx1] == chars2[idx2]) {
            dp[idx1 + 1][idx2 + 1] = dp(chars1, chars2, dp, idx1 + 1, idx2 + 1);
            return dp[idx1 + 1][idx2 + 1];
        }
        dp[idx1 + 1][idx2] = dp(chars1, chars2, dp, idx1 + 1, idx2);
        dp[idx1][idx2 + 1] = dp(chars1, chars2, dp, idx1, idx2 + 1);
        return Math.min(
                dp[idx1 + 1][idx2],
                dp[idx1][idx2 + 1]
        ) + 1;
    }
}
