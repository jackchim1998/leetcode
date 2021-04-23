package binarytree.hard;

import common.TreeNode;

/**
 * @author Jack
 */
public class BinaryTreeMaximumPathSum {
    private int sum = Integer.MIN_VALUE;
    private int single = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        int max = Math.max(dfs(root), sum);
        if (max != 0) return max;
        return single;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        single = Math.max(single, node.val);
        int readyToReturn = node.val + Math.max(Math.max(left, right), 0);
        this.sum = Math.max(this.sum, Math.max(readyToReturn, node.val + left + right));
        return Math.max(readyToReturn, 0);
    }
}
