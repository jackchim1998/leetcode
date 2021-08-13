package medium;

import common.TreeNode;


/**
 * @author Jack
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (!isValid(root.left, Long.MIN_VALUE, root.val)) return false;
        return isValid(root.right, root.val, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        if (!isValid(node.left, min, node.val)) return false;
        return isValid(node.right, node.val, max);
    }
}
