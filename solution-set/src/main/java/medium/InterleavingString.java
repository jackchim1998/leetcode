package medium;

/**
 * @author Jack
 */
public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        return dp(dp, s1.toCharArray(), s2.toCharArray(), s3.toCharArray(), 0, 0);
    }

    private boolean dp(int[][] dp, char[] c1, char[] c2, char[] c3, int idx1, int idx2) {
        int idx3 = idx1 + idx2;
        if (idx3 == c3.length) return true;
        if (dp[idx1][idx2] != 0) return dp[idx1][idx2] == 1;
        boolean success = false;
        if (idx1 < c1.length && c1[idx1] == c3[idx3])
            success = dp(dp, c1, c2, c3, idx1 + 1, idx2);
        if (idx2 < c2.length && c2[idx2] == c3[idx3])
            success |= dp(dp, c1, c2, c3, idx1, idx2 + 1);
        dp[idx1][idx2] = success ? 1 : 2;
        return success;
    }
}
