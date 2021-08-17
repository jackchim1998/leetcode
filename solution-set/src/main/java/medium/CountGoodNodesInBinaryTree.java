package medium;

import common.TreeNode;

/**
 * @author Jack
 */
public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }

    private int goodNodes(TreeNode node, int max) {
        if (node == null) return 0;
        int count = node.val >= max ? 1 : 0;
        int newMax = Math.max(max, node.val);
        count += goodNodes(node.left, newMax);
        count += goodNodes(node.right, newMax);
        return count;
    }

}
