package medium;

public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != -1) {
                int idx = i;
                int cur = 0;
                while (nums[idx] != -1) {
                    cur++;
                    int newIdx = nums[idx];
                    nums[idx] = -1;
                    idx = newIdx;
                }
                max = Math.max(max, cur);
            }
        return max;
    }
}
