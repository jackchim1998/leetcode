package medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestVal = 0;
        int closestDiff = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++) {
                int perfectVal = target - nums[i] - nums[j];
                int idx = Arrays.binarySearch(nums, j + 1, n, perfectVal);
                if (idx < 0)
                    idx = -idx - 1;
                int diff = Integer.MAX_VALUE;
                int val = Integer.MAX_VALUE;
                if (idx < n) {
                    int rightDiff = nums[idx] - perfectVal;
                    if (rightDiff < diff) {
                        diff = rightDiff;
                        val = nums[i] + nums[j] + nums[idx];
                    }
                }
                if (idx - 1 > j) {
                    int leftDiff = perfectVal - nums[idx - 1];
                    if (leftDiff < diff) {
                        diff = leftDiff;
                        val = nums[i] + nums[j] + nums[idx - 1];
                    }
                }
                if (diff == 0) return target;
                if (diff < closestDiff) {
                    closestVal = val;
                    closestDiff = diff;
                }
            }
        return closestVal;
    }
}
