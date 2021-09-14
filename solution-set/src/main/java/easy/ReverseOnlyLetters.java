package easy;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (end >= 0 && !Character.isLetter(chars[end]))
            end--;
        while (start < end) {
            if (Character.isLetter(chars[start])) {
                chars[start] = s.charAt(end);
                chars[end] = s.charAt(start);
                do end--; while (end >= 0 && !Character.isLetter(chars[end]));
            }
            start++;
        }
        return String.valueOf(chars);
    }

}
