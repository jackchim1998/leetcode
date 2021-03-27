package dp.medium;

/**
 * @author Jack
 * q.647
 */
public class PalindromicStrings {
    public int countSubstrings(String s) { // same technique in palindromic string, but expand around center instead of loop
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result += expand(chars, i, i);
            result += expand(chars, i, i + 1);
        }
        return result;
    }

    int expand(char[] chars, int start, int end) { // use iteration is quicker than recursion
        int ans = 0;
        while (start >= 0 && end <chars.length) {
            if (chars[start] != chars[end]) break;
            start--;
            end++;
            ans++;
        }
        return ans;
    }
    /**
     * classic dp method for palindromicStrings, but a bit slow in this question
     */
//    public int countSubstrings(String s) {
//        char[] chars = s.toCharArray();
//        boolean[][] dp = new boolean[chars.length][chars.length];
//        int result = 0;
//        for (int len = 0; len < chars.length; len++)
//            for (int idx = 0; idx + len < chars.length; idx++)
//                if (chars[idx] == chars[idx + len] && (len <= 2 || dp[len - 2][idx + 1])) {
//                    dp[len][idx] = true;
//                    result++;
//                }
//        return result;
//    }
}
