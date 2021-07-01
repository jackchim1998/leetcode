package medium;

/**
 * @author Jack
 */
public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        boolean deleted = false;
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            int cnt = duplicateCount(chars, i, k);
            if (cnt < k) result.append(chars, i, cnt);
            else deleted = true;
            i += cnt;
        }
        return deleted ? removeDuplicates(result.toString(), k) : result.toString();
    }

    private int duplicateCount(char[] s, int start, int k) {
        int cnt = 1;
        while (cnt < k && start + cnt < s.length && s[start + cnt] == s[start + cnt - 1])
            cnt++;
        return cnt;
    }
}
