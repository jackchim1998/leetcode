package easy;

import static java.lang.Math.min;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        for (char c : text.toCharArray())
            counts[c - 'a']++;
        return min(counts[1], min(counts[0], min(counts[11] / 2, min(counts[14] / 2, counts[13]))));
    }
}
