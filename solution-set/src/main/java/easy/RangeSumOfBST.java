package easy;

import common.TreeNode;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (low > high || root == null) return 0;
        return (root.val >= low && root.val <= high ? root.val : 0)
                + rangeSumBST(root.left, low, Math.min(root.val - 1, high))
                + rangeSumBST(root.right, Math.max(root.val + 1, low), high);
    }
}
