package medium;

public class BreakAPalindrome {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if (len < 2) return "";
        char[] chars = palindrome.toCharArray();
        int half = len / 2;
        for (int i = 0; i < half; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return String.valueOf(chars);
            }
        }
        chars[len - 1] = 'b';
        return String.valueOf(chars);
    }

}
