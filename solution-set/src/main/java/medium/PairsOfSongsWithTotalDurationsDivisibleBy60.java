package medium;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] times) {
        int[] counts = new int[60];
        for (int time : times)
            counts[time % 60]++;

        int result = counts[0] * (counts[0] - 1) / 2 + counts[30] * (counts[30] - 1) / 2;
        for (int i = 1; i < 30; i++)
            result += counts[i] * counts[60 - i];
        return result;
    }
}
