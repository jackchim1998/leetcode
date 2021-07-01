package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * dp + backtracking
 * q.131
 * constaint:
 * 1 <= s.length <= 16
 * s contains only lowercase English letters.
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currList = new ArrayList<>();
        int[] dp = new int[s.length()];
        dfs(0, result, currList, s, dp);
        return result;
    }

    private void dfs(int start, List<List<String>> result, List<String> currList, String s, int[] dp) {
        if (start >= s.length())
            result.add(new ArrayList<>(currList));
        for (int end = start; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || (dp[start + 1] >> (end - 1) & 1) > 0)) {
                dp[start] |=  (1 << end);
                currList.add(s.substring(start, end + 1));
                dfs(end + 1, result, currList, s, dp);
                currList.remove(currList.size() - 1);
            }
        }
    }
}
