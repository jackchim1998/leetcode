package easy;

public class NThTribonacciNumber {
    public int tribonacci(int n) {
        int[] nums = new int[]{0, 1, 1};
        for (int i = 3; i <= n; i++)
            nums[i % 3] = nums[0] + nums[1] + nums[2];
        return nums[n % 3];
    }
}
