package easy;

import common.TreeNode;

/**
 * @author Jack
 */
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) { // inclusive
        if (start > end) return null;
        int mid = (start + end) / 2;
        return new TreeNode(nums[mid], sortedArrayToBST(nums, start, mid - 1), sortedArrayToBST(nums, mid + 1, end));
    }
}
