package easy;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s.isEmpty()) return 0;
        int max = 1;
        for (int i = 1, curr = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i - 1))
                max = Math.max(max, ++curr);
            else
                curr = 1;
        return max;
    }
}
