package medium;

public class MakeStringASubsequenceUsingCyclicIncrements {
    public boolean canMakeSubsequence(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int i = 0, j = 0;
        while (i < str1.length()) {
            if (chars1[i] == chars2[j] ||
                    (chars1[i] - 'a' + 1) % 26 == (chars2[j] - 'a')) {
                j++;
            }
            i++;
            if (j == str2.length()) {
                return true;
            }
        }

        return false;
    }
}
