package dp.medium;

/**
 * @author Jack
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int pos = 0;
        int count = 0;
        while (pos < nums.length - 1) {
            count++;
            if (nums[pos] + pos >= nums.length + 1) break;
            int maxStep = nums[pos];
            int maxDistance = 0;
            int stepChosen = 0;
            for (int i = 1; i <= maxStep; i++)
                if (maxDistance < nums[pos + i] + i) {
                    maxDistance = nums[pos + i] + i;
                    stepChosen = i;
                }
            pos += stepChosen;
        }
        return count;
    }
}
