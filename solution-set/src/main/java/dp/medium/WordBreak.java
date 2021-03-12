package dp.medium;

import java.util.List;

/**
 * @author Jack
 * q.139
 * constraint:
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of only lowercase English letters.
 * All the strings of wordDict are unique.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) { // use startWith in stead of subString
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int start = 1; start <= s.length(); start++)
            if (dp[start - 1])
                for (String word : wordDict)
                    if (s.startsWith(word, start - 1))
                        dp[start - 1 + word.length()] = true;
        return dp[s.length()];
    }

    /**
     *   the below is bruitFore Method
     */
//    public boolean wordBreak(String s, List<String> wordDict) {
//        return bruitForce(0, s, new HashSet<>(wordDict));
//    }
//
//    private boolean bruitForce(int start, String s, Set<String> wordDict) {
//        if (start >= s.length()) return true;
//        for (int end = start; end < s.length(); end++) {
//            if (wordDict.contains(s.substring(start, end+1))) {
//                if (bruitForce(end+1, s, wordDict))
//                    return true;
//            }
//        }
//        return false;
//    }
}
