package medium;

public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        int shift = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            shift = (shifts[i] + shift) % 26;
            chars[i] = (char) ((chars[i] - 'a' + shift) % 26 + 'a');
        }
        return String.valueOf(chars);
    }
}
