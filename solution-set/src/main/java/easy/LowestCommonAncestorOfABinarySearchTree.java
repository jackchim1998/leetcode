package easy;

import common.TreeNode;

/**
 * @author Jack
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < q.val)
            return lca(root, p.val, q.val);
        else
            return lca(root, q.val, p.val);
    }

    private TreeNode lca(TreeNode root, int p, int q) {
        if (root == null) return null;
        if (p <= root.val && root.val <= q)
            return root;
        if (root.val < p)
            return lca(root.right, p, q);
        return lca(root.left, p, q);
    }
}
