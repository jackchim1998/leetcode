package binarytree.medium;

import common.TreeNode;

/**
 * @author Jack
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                if (root.right != null) {
                    TreeNode right = root.right;
                    TreeNode tmp = root.left;
                    while (tmp.right != null)
                        tmp = tmp.right;
                    tmp.right = right;
                }
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
