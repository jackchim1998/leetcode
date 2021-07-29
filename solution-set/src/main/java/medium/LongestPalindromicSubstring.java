package medium;

/**
 * @author Jack
 * q.5
 * There is a quickest method only for finding Palindromic Substring called Manacher's Algorithm
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) { // expand around center
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int max = Math.max(len, len2);
            if (max > end - start + 1) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expand(String s, int start, int end) {
        if (start < 0 || start >= s.length()) return end - start - 1;
        if (end < 0 || end >= s.length()) return end - start - 1;
        if (s.charAt(start) != s.charAt(end)) return end - start - 1;
        return expand(s, start - 1, end + 1);
    }
    /**
     * dp method, only 30% faster than other
     */
//    public String longestPalindrome(String s) {
//        String result = s.substring(0, 1);
//        int max = 1;
//        boolean[][] dp = new boolean[s.length()][s.length()]; // [start] [end]
//        for (int i = 0; i < s.length(); i++)
//            dp[i][i] = true;
//        for (int len = 2; len <= s.length(); len++)
//            for (int start = 0; start + len - 1 < s.length(); start++)
//                if (s.charAt(start) == s.charAt(start + len - 1) && (len < 4 || dp[start + 1][start + len - 2])) {
//                    dp[start][start + len - 1] = true;
//                    if (len > max) {
//                        result = s.substring(start, start + len);
//                        max = len;
//                    }
//                }
//        return result;
//    }
}
