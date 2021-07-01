package medium;

import common.TreeNode;

/**
 * @author Jack
 * q.337
 * constraint:
 * The number of nodes in the tree is in the range [1, 104].
 * 0 <= Node.val <= 104
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int[] res = loop(root);
        return Math.max(res[0], res[1]);
    }

    private int[] loop(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = loop(node.left);
        int[] right = loop(node.right);
        return new int[]{node.val + left[1] + right[1], Math.max(left[0] + right[0], Math.max(left[1] + right[0], Math.max(left[0] + right[1], left[1] + right[1])))};
    }
}
