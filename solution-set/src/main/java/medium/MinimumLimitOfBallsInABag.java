package medium;

public class MinimumLimitOfBallsInABag {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = high(nums);
        while (low < high) {
            int mid = (low + high) / 2;
            int ops = 0;
            for (int num : nums) {
                ops += (num -1) / mid;
            }
            if (ops <= maxOperations) {
                high = mid;
            } else {
                low = mid  + 1;
            }
        }
        return high;
    }

    private int high(int[] nums) {
        int high = 1;
        for (int num : nums) {
            high = Math.max(num, high);
        }
        return high;
    }

}
