package dp.hard;

import java.util.Arrays;

/**
 * @author Jack
 */
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0
                || envelopes[0] == null || envelopes[0].length != 2)
            return 0;
        Arrays.sort(envelopes, (arr1, arr2) -> arr1[0] == arr2[0] ? arr2[1] - arr1[1] : arr1[0] - arr2[0]);
        int[] dp = new int[envelopes.length];
        int len = 0;
        for (int[] envelope : envelopes) { // find LIS
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if (index < 0)
                index = -(index + 1);
            dp[index] = envelope[1];
            if (index == len)
                len++;
        }
        return len;
    }

    /**
     * below using library to sort and then calculate based on area. It is slow because area relationship is not exactly match envelop relationship
     */
//    public int maxEnvelopes(int[][] envelopes) {
//        int[] dp = new int[envelopes.length];
//        Arrays.sort(envelopes, Comparator.comparingInt(o -> o[0] * o[1]));
//        int result = 0;
//        for (int i = 0; i < envelopes.length; i++) {
//            int max = 0;
//            for (int j = 0; j < i; j++) {
//                if (envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1])
//                    max = Math.max(max, dp[j]);
//            }
//            dp[i] = max + 1;
//            result = Math.max(result, max+1);
//        }
//        return result;
//    }
}
