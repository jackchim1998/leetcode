package medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class LongestIncreasingSubarray {
    public int lengthOfLIS(int[] nums) {
        int[] sorted = new int[nums.length];
        int nextIdx = 0;
        for (int num : nums) {
            int idx = Arrays.binarySearch(sorted, 0, nextIdx, num);
            if (idx < 0) {
                idx = -idx - 1;
                sorted[idx] = num;
                if (idx == nextIdx) nextIdx++;
            }
        }
        return nextIdx;
    }
}
