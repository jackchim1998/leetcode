package medium;

import common.TreeNode;

/**
 * @author Jack
 */
public class DeepestLeavesSum {
    int deepestLevel = 0;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;
        if (level > deepestLevel) {
            deepestLevel = level;
            sum = 0;
        }
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
        if (node.left == null && node.right == null && level == deepestLevel)
            sum += node.val;
    }
}
