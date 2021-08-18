package medium;

/**
 * @author Jack
 * q.91
 * constraint:
 * 1 <= s.length <= 100
 * s contains only digits and may contain leading zero(s).
 */
public class DecodeWays {
    public int numDecoding(String s) {
        char[] arr = s.toCharArray();
        int[] dp = new int[arr.length + 2];
        dp[arr.length + 1] = 0;
        dp[arr.length] = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0')
                dp[i] = 0;
            else {
                int currentDigit = arr[i] - '0';
                int prevDigit = i + 1 < arr.length ? arr[i + 1] - '0' : 0;
                int value = currentDigit * 10 + prevDigit;
                dp[i] = value > 26 ? dp[i + 1] : dp[i + 1] + dp[i + 2];
            }
        }
        return dp[0];
    }
}
