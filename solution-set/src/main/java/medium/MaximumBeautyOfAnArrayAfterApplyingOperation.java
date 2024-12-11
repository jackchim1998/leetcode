package medium;

import java.util.Arrays;

public class MaximumBeautyOfAnArrayAfterApplyingOperation {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);

        int start = 0;
        int end = 0;
        int result = 0;
        while (end < nums.length) {
            if (nums[end] - nums[start] <= k * 2) {
                end++;
                result = Math.max(result, end - start);
            } else {
                start++;
            }
        }

        return result;
    }
}
