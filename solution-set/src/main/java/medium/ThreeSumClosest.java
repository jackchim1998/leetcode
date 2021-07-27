package medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestVal = 0;
        int absClosestDiff = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int val = nums[i] + nums[left] + nums[right];
                int diff = val - target;
                int absDiff = Math.abs(diff);
                if (absDiff < absClosestDiff){
                    closestVal = val;
                    absClosestDiff = absDiff;
                }

                if (diff < 0) left++;
                else if (diff > 0) right--;
                else return target;
            }
        }
        return closestVal;
    }
}
