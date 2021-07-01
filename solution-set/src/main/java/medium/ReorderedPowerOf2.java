package medium;

import java.util.Arrays;

/**
 * @author Jack
 * q.869
 * constaint:
 * 1 <= N <= 10^9
 */
public class ReorderedPowerOf2 {
    // it is quickest, because it only consider 32 cases, and use arrays to avoid permutation
    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        for (int i = 0; i < 31; ++i)
            if (Arrays.equals(A, count(1 << i)))
                return true;
        return false;
    }

    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }
    /**
     * backtracking solution, very slow, it has 9! permutation.
     */
//    public boolean reorderedPowerOf2(int N) {
//        int[] digits = digits(N);
//        boolean[] used = new boolean[digits.length];
//        return backtracking(digits, used, 0, digits.length);
//    }
//
//    private boolean backtracking(int[] digits, boolean[] used, int N, int leave) {
//        if (leave == 0) return isPowOf2(N);
//        for (int i = 0; i < digits.length; i++) {
//            if (!used[i]) {
//                if (leave == digits.length && digits[i] == 0) continue;
//                int val = digits[i] * (int) Math.pow(10, leave - 1);
//                used[i] = true;
//                N += val;
//                if (backtracking(digits, used, N, leave - 1)) return true;
//                N -= val;
//                used[i] = false;
//            }
//        }
//        return false;
//    }
//
//    private int[] digits(int n) {
//        List<Integer> digits = new ArrayList<>();
//        while (n != 0) {
//            digits.add(n % 10);
//            n /= 10;
//        }
//        return digits.stream().mapToInt(i -> i).toArray();
//    }
//
//    private boolean isPowOf2(int N) {
//        int cnt = 0;
//        while (N != 0) {
//            if ((N & 1) == 1) cnt++;
//            N >>= 1;
//        }
//        return cnt == 1;
//    }

}
