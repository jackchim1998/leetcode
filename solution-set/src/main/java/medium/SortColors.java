package medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class SortColors {
    public void sortColorsTwoPass(int[] nums) {
        int zeroCount = 0;
        int twoCount = 0;
        for (int num : nums)
            if (num == 0) zeroCount++;
            else if (num == 2) twoCount++;
        Arrays.fill(nums, 0, zeroCount, 0);
        Arrays.fill(nums, zeroCount, nums.length - twoCount, 1);
        Arrays.fill(nums, nums.length - twoCount, nums.length, 2);
    }

    public void sortColorsOnePass(int[] nums) {
        int p0=0;
        int curr=0;
        int p2 = nums.length - 1;
        while (curr <= p2) {
            if (nums[curr] == 0)
                swap(nums, p0++, curr++);
            else if (nums[curr] == 2)
                swap(nums, curr, p2--);
            else curr++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
