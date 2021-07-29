package medium;

/**
 * @author Jack
 * q.198
 * constraint:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int start, int end) {
        int rob = 0;
        int notRob = 0;
        for (; start <= end; start++) {
            int prevRob = rob;
            rob = notRob + nums[start];
            notRob = Math.max(notRob, prevRob);
        }
        return Math.max(rob, notRob);
    }
}
