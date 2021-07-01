package medium;

/**
 * @author Jack
 */
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        boolean[] exist = new boolean[10001];
        while (j < nums.length) {
            if (exist[nums[j]]) {
                sum -= nums[i];
                exist[nums[i++]] = false;
            } else {
                sum += nums[j];
                max = Math.max(max, sum);
                exist[nums[j++]] = true;
            }
        }
        return max;
    }
}
