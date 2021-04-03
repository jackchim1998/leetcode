package dp.hard;

/**
 * @author Jack
 * q.32
 * constraint:
 * 0 <= s.length <= 3 * 104
 * s[i] is '(', or ')'.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s.length() <= 0) return 0;
        int maxCnt = 0;
        int offset = 0;
        char[] arr = s.toCharArray();
        int[] dp = new int[arr.length + 1];
        if (arr[0] == '(')
            offset++;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ')') {
                offset--;
                if (offset < 0)
                    offset = 0;
                else {
                    dp[i + 1] = dp[i] + 2;
                    dp[i + 1] += dp[i + 1 - dp[i + 1]];
                    maxCnt = Math.max(maxCnt, dp[i + 1]);
                }
            } else
                offset++;
        }
        return Math.max(maxCnt, dp[arr.length]);
    }

}
