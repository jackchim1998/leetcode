package medium;

/**
 * @author Jack
 */
public class PartitionArrayIntoDisjointIntervals {
    public int partitionDisjoint(int[] nums) {
        int threshold = nums[0];
        int currMax = nums[0];
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax, nums[i]);
            if (nums[i] < threshold) {
                result = i + 1;
                threshold = currMax;
            }
        }
        return result;
    }
}
