package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 */
public class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        Set<String> isMatched = new HashSet<>();
        Set<String> notMatched = new HashSet<>();
        int result = 0;
        for (String word : words) {
            if (isMatched.contains(word))
                result++;
            else if (!notMatched.contains(word)) {
                char[] chars = word.toCharArray();
                boolean success = true;
                int from = 0;
                for (char c : chars) {
                    int idx = s.indexOf(c, from);
                    if (idx < 0) {
                        notMatched.add(word);
                        success = false;
                        break;
                    }
                    from = idx + 1;
                }
                if (success) {
                    isMatched.add(word);
                    result++;
                }
            }
        }
        return result;
    }

}
