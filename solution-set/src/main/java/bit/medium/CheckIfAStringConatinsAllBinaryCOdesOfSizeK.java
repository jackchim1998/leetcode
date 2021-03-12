package bit.medium;

/**
 * @author Jack
 */
public class CheckIfAStringConatinsAllBinaryCOdesOfSizeK {
    public boolean hasAllCodes(String s, int k) {
        if (s.length() < k) return false;
        char[] chars = s.toCharArray();
        boolean[] exist = new boolean[1 << k];
        int x = initInt(chars, k);
        for (int i = k - 1; i < chars.length; i++) {
            x = ((x & ((1 << k - 1) - 1)) << 1) + chars[i] - '0';
            exist[x] = true;
        }
        for (boolean b : exist) if (!b) return false;
        return true;
    }

    private int initInt(char[] chars, int k) {
        int x = 0;
        for (int i = 0; i < k - 1; i++)
            x = (x << 1) + chars[i] - '0';
        return x;
    }
}
