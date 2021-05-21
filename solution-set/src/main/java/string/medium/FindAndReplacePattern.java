package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words)
            if (validate(word, pattern))
                result.add(word);
        return result;
    }

    private boolean validate(String word, String pattern) {
        int used = 0;
        int[] mapping = new int[26];
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int c = chars[i] - 'a' + 1;
            int idx = pattern.charAt(i) - 'a';
            int location = 1 << c;
            if (mapping[idx] == 0) {
                mapping[idx] = c;
                if ((used & location) != 0) return false;
                used |= location;
            } else if (mapping[idx] != c) return false;
        }
        return true;
    }
}
