package medium;

import common.TreeNode;

/**
 * @author Jack
 */
public class MaximumProductOfSplittedBinaryTree {
    private static final int MOD = 1_000_000_007;
    private long max;

    public int maxProduct(TreeNode root) {
        int totalSum = totalSum(root);
        max = 0;
        sum(root, totalSum);
        return (int) (max % MOD);
    }

    private int sum(TreeNode node, int totalSum) {
        if (node == null) return 0;
        int leftSum = sum(node.left, totalSum);
        int rightSum = sum(node.right, totalSum);

        max = Math.max(max, (long) leftSum * (totalSum - leftSum));
        max = Math.max(max, (long) rightSum * (totalSum - rightSum));
        return leftSum + rightSum + node.val;
    }

    private int totalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + totalSum(node.left) + totalSum(node.right);
    }
}
