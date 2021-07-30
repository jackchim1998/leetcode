package medium;

/**
 * @author Jack
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int end = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--)
            if (i + nums[i] >= end)
                end = i;
        return end <= 0;
    }
}
