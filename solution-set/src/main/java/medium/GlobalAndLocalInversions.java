package medium;

/**
 * @author Jack
 * q.775
 * constraint:
 * A will be a permutation of [0, 1, ..., A.length - 1].
 * A will have length in range [1, 5000].
 * The time limit for this problem has been reduced.
 */
public class GlobalAndLocalInversions {
    public boolean isIdealPermutation(int[] a) {
        int max = -1;
        for (int i = 2; i < a.length; i++) {
            max = Math.max(max, a[i - 2]);
            if (a[i] < max)
                return false;
        }
        return true;
    }
}
