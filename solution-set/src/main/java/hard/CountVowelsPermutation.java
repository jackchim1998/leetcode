package hard;

import java.util.Arrays;

/**
 * @author Jack
 */
public class CountVowelsPermutation {
    private static int MOD = 1_000_000_007;

    public int countVowelPermutation(int n) {
        int[] vowels = new int[5];
        Arrays.fill(vowels, 1);
        for (int i = 1; i < n; i++) {
            int[] newVowels = new int[5];
            newVowels[0] = ((vowels[1] + vowels[2]) % MOD + vowels[4]) % MOD;
            newVowels[1] = (vowels[0] + vowels[2]) % MOD;
            newVowels[2] = (vowels[1] + vowels[3]) % MOD;
            newVowels[3] = vowels[2];
            newVowels[4] = (vowels[2] + vowels[3]) % MOD;
            vowels = newVowels;
        }
        return ((((vowels[0] + vowels[1]) % MOD + vowels[2]) % MOD + vowels[3]) % MOD + vowels[4]) % MOD;
    }
}
