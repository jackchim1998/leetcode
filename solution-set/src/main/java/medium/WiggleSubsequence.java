package medium;

/**
 * @author Jack
 * q.376
 * constraint:
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 */
public class WiggleSubsequence { // official solution is more clean
    public int wiggleMaxLength(int[] nums) {
        int cnt = 0, idx = 1;
        boolean direction = false;
        while (idx < nums.length) {
            if (nums[idx] - nums[idx - 1] != 0) {
                direction = !(nums[idx] > nums[idx - 1]);
                cnt++;
                break;
            } else idx++;
        }
        for (idx++; idx < nums.length; idx++) {
            if (nums[idx] - nums[idx - 1] == 0) continue;
            if (direction == (nums[idx] - nums[idx - 1] > 0)) {
                cnt++;
                direction = !direction;
            }
        }
        return cnt + 1;
    }
}
