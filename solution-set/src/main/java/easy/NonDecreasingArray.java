package easy;

/**
 * @author Jack
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        boolean quotaUsed = false;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] < nums[i - 1]) {
                if (quotaUsed) return false;
                quotaUsed = true;
                if (i == 1)
                    nums[i - 1] = Integer.MIN_VALUE;
                else if (nums[i] >= nums[i - 2])
                    nums[i - 1] = nums[i - 2];
                else
                    nums[i] = nums[i - 1];
            } else i++;
        }
        return true;
    }
}
