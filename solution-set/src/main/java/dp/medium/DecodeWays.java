package dp.medium;

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
        boolean prevZero = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0') {
                if (prevZero) return 0;
                prevZero = true;
                dp[i] = 0;
                continue;
            }
            int value = (arr[i] - '0') * 10 + (i + 1 < arr.length ? arr[i + 1] - '0' : 0);
            if (value > 26 && prevZero) return 0;
            dp[i] = value > 26 ? dp[i + 1] : dp[i + 1] + dp[i + 2];
            prevZero = false;
        }
        return dp[0];
    }

    /**
     * below is first attempt of dp
     */

//    private char[] arr;
//    private int[] dp;
//
//    public int numDecoding(String s) {
//        arr = s.toCharArray();
//        dp = new int[arr.length];
//        Arrays.fill(dp, 0, dp.length, -1);
//        return decode(arr.length - 1);
//    }
//
//    private int decode(int idx) {
//        if (idx < 0) return 1;
//        int val = idx >= 1 ? 10 * (arr[idx - 1] - '0') + (arr[idx] - '0') : (arr[idx] - '0');
//        if (val == 0) return 0;
//        if (val == 10 || val == 20)
//            return getDP(idx - 2);
//        if (val > 10 && val <= 26) {
//            if (getDP(idx - 1) == 0 || getDP(idx - 2) == 0)
//                return 0;
//            return getDP(idx - 1) + getDP(idx - 2);
//
//        }
//        if (val % 10 == 0)
//            return 0;
//        return getDP(idx - 1);
//    }
//
//    private int getDP(int idx) {
//        if (idx < 0) return 1;
//        if (dp[idx] >= 0)
//            return dp[idx];
//        dp[idx] = decode(idx);
//        return dp[idx];
//    }
}
