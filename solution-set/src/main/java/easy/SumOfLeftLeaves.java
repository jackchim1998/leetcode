package easy;

import common.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        if (root.left == null && root.right == null)
            return isLeft ? root.val : 0;

        int sum = 0;
        if (root.left != null)
            sum += sumOfLeftLeaves(root.left, true);
        if (root.right != null)
            sum += sumOfLeftLeaves(root.right, false);
        return sum;
    }
}
