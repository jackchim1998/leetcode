package medium;

/**
 * @author Jack
 */
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int skipped = 0;
        int max = 0;
        while (end < nums.length) {
            if (nums[end] == 1) {
                max = Math.max(max, end - start + 1);
                end++;
            } else if (skipped < k) {
                max = Math.max(max, end - start + 1);
                skipped++;
                end++;
            } else {
                while (nums[start] == 1) start++;
                start++;
                skipped--;
            }
        }
        return max;
    }

}
