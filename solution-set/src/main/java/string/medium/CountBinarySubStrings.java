package string.medium;

/**
 * @author Jack
 */
public class CountBinarySubStrings {
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int curr = 1;
        int prev = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]) {
                prev = curr;
                curr = 1;
            } else curr++;
            if (curr <= prev)
                result++;
        }
        return result;
    }
}
