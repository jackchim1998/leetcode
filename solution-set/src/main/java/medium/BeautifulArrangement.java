package medium;

/**
 * @author Jack
 * q.526
 * backtracking
 * constraint:
 * 1 <= n <= 15
 */
public class BeautifulArrangement {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1];
        int[] isValid = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                isValid[i - 1] <<= 1;
                if (i % j == 0 || j % i == 0)
                    isValid[i - 1] += 1;
            }
        }
        return backTracking(used, isValid, n);
    }

    private int backTracking(boolean[] used, int[] isValid, int num) {
        if (num == 0) return 1;
        int cnt = 0;
        for (int i = 1; i <= used.length - 1; i++) {
            if (!used[i] && (isValid[num - 1] >> i - 1 & 1) == 1) {
                used[i] = true;
                cnt += backTracking(used, isValid, num - 1);
                used[i] = false;
            }
        }
        return cnt;
    }
}
