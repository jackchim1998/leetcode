package medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int twoCount = 0;
        for (int num : nums)
            if (num == 0) zeroCount++;
            else if (num == 2) twoCount++;
        Arrays.fill(nums, 0, zeroCount, 0);
        Arrays.fill(nums, zeroCount, nums.length - twoCount, 1);
        Arrays.fill(nums, nums.length - twoCount, nums.length, 2);
    }
}
