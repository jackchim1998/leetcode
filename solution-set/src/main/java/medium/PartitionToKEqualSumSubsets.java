package medium;

import java.util.Arrays;

public class PartitionToKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int count = 0;
        for (int num : nums)
            count += num;
        if (count % k != 0) return false;

        Arrays.sort(nums);
        return backtrack(nums, 0, count / k, 0, nums.length - 1);
    }

    private boolean backtrack(int[] nums, int visited, int equalSum, int currSum, int index) {
        if (visited == (1 << nums.length) - 1) return true;
        for (int i = index; i >= 0; i--) {
            if ((visited & (1 << i)) == 0) {
                int newSum = nums[i] + currSum;
                if (newSum <= equalSum && backtrack(nums, visited | (1 << i), equalSum, newSum % equalSum, newSum == equalSum ? nums.length - 1 : i - 1))
                    return true;
            }
        }
        return false;
    }

}
