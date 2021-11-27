package medium;

/**
 * @author Jack
 * q.238
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelfNotUseDivision(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++)
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        suffixProduct[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--)
            suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[i] = prefixProduct[i] * suffixProduct[i];
        return result;
    }

    public int[] productExceptSelfConstantSpaceComplexity(int[] nums) {
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
