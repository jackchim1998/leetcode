package medium;

/**
 * @author Jack
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] exist = new boolean[256];
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < chars.length) {
            if (exist[chars[end]]) {
                do {
                    exist[chars[start]] = false;
                    start++;
                } while (chars[start - 1] != chars[end]);
            } else {
                exist[chars[end]] = true;
                end++;
                max = Math.max(max, end - start);
            }
        }
        return max;
    }
}
