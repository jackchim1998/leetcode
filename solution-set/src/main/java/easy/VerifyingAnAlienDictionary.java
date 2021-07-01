package easy;

/**
 * @author Jack
 * q.953
 */
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] weights = new int[26];
        for (int i = 0; i < order.length(); i++)
            weights[order.charAt(i) - 'a'] = i;
        for (int i = 1; i < words.length; i++) {
            if (!validateComparing(words[i - 1], words[i], weights))
                return false;
        }
        return true;
    }

    private boolean validateComparing(String small, String big, int[] weights) {
        for (int i = 0; i < small.length() && i < big.length(); i++) {
            if (weights[small.charAt(i) - 'a'] < weights[big.charAt(i) - 'a'])
                return true;
            if (weights[small.charAt(i) - 'a'] > weights[big.charAt(i) - 'a'])
                return false;
        }
        return small.length() <= big.length();
    }
}
