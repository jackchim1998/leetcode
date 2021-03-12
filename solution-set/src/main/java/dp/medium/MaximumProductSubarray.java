package dp.medium;

/**
 * @author Jack
 * q.152
 * constraint:
 * 1 <= nums.length <= 2 * 104
 * -10 <= nums[i] <= 10
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            max = Math.max(product, max);
            if (product == 0) product = 1;
        }
        product = 1;
        for (int i = nums.length-1; i >=0; i--) {
            product *= nums[i];
            max = Math.max(product, max);
            if (product == 0) product = 1;
        }
        return max;
    }
}
