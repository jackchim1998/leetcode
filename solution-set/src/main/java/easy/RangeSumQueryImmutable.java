package easy;

/**
 * @author Jack
 */
public class RangeSumQueryImmutable {
    private final int[] sums;

    public RangeSumQueryImmutable(int[] nums) {
        sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 0; i < nums.length; i++)
            sums[i + 1] = nums[i] + sums[i];
    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
