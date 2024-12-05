package medium;

public class SwapAdjacentInLRString {
    public boolean canTransform(String start, String result) {
        int n = start.length();
        char[] s = start.toCharArray();
        char[] r = result.toCharArray();
        int i = 0, j = 0;
        while (i < n && j < n) {
            while (i < n) {
                if (s[i] != 'X') {
                    break;
                }
                i++;
            }
            while (j < n) {
                if (r[j] != 'X') {
                    break;
                }
                j++;
            }
            if (i >= n || j >= n) {
                return i == n && j == n;
            }
            if (s[i] != r[j]) {
                return false;
            }
            if (s[i] == 'L' && i < j) {
                return false;
            }
            if (s[i] == 'R' && j < i) {
                return false;
            }
            i++;
            j++;
        }
        while (i < n) {
            if (s[i] != 'X') {
                return false;
            }
            i++;
        }
        while (j < n) {
            if (r[j] != 'X') {
                return false;
            }
            j++;
        }
        return true;
    }
}
