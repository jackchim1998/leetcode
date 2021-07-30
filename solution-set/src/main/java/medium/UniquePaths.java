package medium;

import static common.MathUtil.nCr;

/**
 * @author Jack
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return (int) nCr(m + n - 2, m - 1);
    }
}
