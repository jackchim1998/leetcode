package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialArrayII {
    /*
    4,3,1,6
    notSpecialPairs=2
    [0,2] -> false
    [2,3] -> true
     */
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int[] prefixSum = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1];
            if (nums[i] % 2 == nums[i - 1] % 2) {
                prefixSum[i] += 1;
            }
        }
        int count = 0;
        for (int[] q : queries) {
            int from = q[0];
            int to = q[1];
            ans[count] = prefixSum[to] - prefixSum[from] == 0;
            count++;
        }
        return ans;
    }

}
