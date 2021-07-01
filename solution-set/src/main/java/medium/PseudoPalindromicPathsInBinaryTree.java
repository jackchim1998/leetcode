package medium;

import common.TreeNode;

/**
 * @author Jack
 * q.1457
 * constraint:
 * The number of nodes in the tree is in the range [1, 105].
 * 1 <= Node.val <= 9
 */

public class PseudoPalindromicPathsInBinaryTree {
    private int res;

    public int pseudoPalindromicPaths(TreeNode root) {
        res = 0;
        loop(root, 0);
        return res;
    }

    private void loop(TreeNode node, int r) {
        if (node == null) return;
        r ^= 1 << node.val; // xor can remove duplicate
        if (node.left == null && node.right == null && isPalindromic(r)) {
            res++;
            return;
        }
        loop(node.left, r);
        loop(node.right, r);
    }

    private boolean isPalindromic(int r) {
        int oneCount = 0;
        while(r != 0) {
            if ((r & 1) >= 1)
                oneCount++;
            r >>>= 1;
        }
        return oneCount <= 1;
    }
}
