package medium;

/**
 * @author Jack
 * q.238
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) product *= nums[i];
            else if (zeroIdx == -1) zeroIdx = i;
            else return new int[nums.length];
        }

        int[] result = new int[nums.length];
        if (zeroIdx != -1) {
            result[zeroIdx] = product;
            return result;
        }
        for (int i = 0; i < nums.length; i++)
            result[i] = product / nums[i];
        return result;
    }
}
