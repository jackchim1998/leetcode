package bit.medium;

/**
 * @author Jack
 */
public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int[] bits = new int[words.length];
        int max = 0;
        for (int i = 0; i < words.length; i++)
            for (char c : words[i].toCharArray())
                bits[i] |= 1 << (c - 'a');
        for (int i = 0; i < words.length; i++)
            for (int j = i + 1; j < words.length; j++)
                if ((bits[i] & bits[j]) == 0)
                    max = Math.max(words[i].length() * words[j].length(), max);
        return max;
    }
}
