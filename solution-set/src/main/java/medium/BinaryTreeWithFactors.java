package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack
 * q.823
 * constraint:
 * 1 <= arr.length <= 1000
 * 2 <= arr[i] <= 109
 */
public class BinaryTreeWithFactors {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], i);
        long[] dp = new long[arr.length];
        Arrays.fill(dp, 1);
        for (int product = 0; product < arr.length; product++) {
            for (int factor1 = 0; factor1 < product; factor1++) {
                if (arr[product] % arr[factor1] != 0) continue;
                Integer factor2 = map.get(arr[product] / arr[factor1]);
                if (factor2 != null) {
                    dp[product] = (dp[product] + dp[factor1] * dp[factor2]) % 1_000_000_007;
                }
            }
        }
        long sum = 0;
        for (long dpVal : dp)
            sum += dpVal;
        return (int) (sum % 1_000_000_007);
    }

    /**
     * The below code is wrong.
     * For example (2, 5, 10, 11, 55, 110)
     * 55 should have 3 ways to be formed, and 110  = 2 * 55
     * but when i = 0, j = 4
     * we calculate 110 has only 1*1, because dp[4] is not calculated completely
     */

//    public int numFactoredBinaryTrees(int[] arr) {
//        Arrays.sort(arr);
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++)
//            map.put(arr[i], i);
//        int[] dp = new int[arr.length];
//        Arrays.fill(dp, 1);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                Integer productIdx = map.get(arr[i] * arr[j]);
//                if (productIdx != null) {
//                    dp[productIdx] = i == j ? (dp[productIdx] + dp[i] * dp[j]) % 1_000_000_007 : (dp[productIdx] + 2 * dp[i] * dp[j]) % 1_000_000_007;
//                }
//            }
//        }
//        int sum = 0;
//        for (int dpVal : dp)
//            sum += dpVal;
//        return (sum % 1_000_000_007);
//    }
}
