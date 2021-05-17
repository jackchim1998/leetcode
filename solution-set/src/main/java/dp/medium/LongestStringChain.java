package dp.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jack
 */
public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] dp = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            List<Integer> list = map.getOrDefault(words[i].length(), new ArrayList<>());
            list.add(i);
            map.put(words[i].length(), list);
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            dp[i] = dp(map, words, dp, i);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    private int dp(Map<Integer, List<Integer>> map, String[] words, int[] dp, int idx) {
        if (dp[idx] != 0) return dp[idx];
        String word = words[idx];
        List<Integer> list = map.getOrDefault(word.length() + 1, new ArrayList<>());
        int max = 0;
        for (Integer parentIdx : list)
            if (isChain(word, words[parentIdx]))
                max = Math.max(max, dp(map, words, dp, parentIdx));
        dp[idx] = max + 1;
        return dp[idx];
    }

    private boolean isChain(String child, String parent) {
        int childIdx = 0;
        int offset = 0;
        while (childIdx < child.length()) {
            if (child.charAt(childIdx) == parent.charAt(childIdx + offset))
                childIdx++;
            else {
                if (offset >= 1) return false;
                offset++;
            }
        }
        return true;
    }
}
