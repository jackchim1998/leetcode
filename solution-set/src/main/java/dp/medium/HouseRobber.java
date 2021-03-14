package dp.medium;

/**
 * @author Jack
 * q.198
 * constraint:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int rob = 0, notRob = 0;
        for (int num : nums) {
            int prevRob = rob;
            rob = notRob + num;
            notRob = Math.max(notRob, prevRob);
        }
        return Math.max(rob, notRob);
    }
}
