package easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for (int num : nums)
            if (num == 1) curr++;
            else {
                max = Math.max(curr, max);
                curr = 0;
            }
        return Math.max(curr, max);
    }
}
