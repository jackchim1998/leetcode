package medium;

import common.TreeNode;

/**
 * @author Jack
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        return includeOne(root) ? root : null;
    }

    private boolean includeOne(TreeNode root) {
        if (root == null) return false;
        boolean left = includeOne(root.left);
        if (!left) root.left = null;
        boolean right = includeOne(root.right);
        if (!right) root.right = null;
        return root.val == 1 || left || right;
    }
}
