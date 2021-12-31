package medium;

import common.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        return maxAncestorDiff(root, root.val, root.val);
    }

    private int maxAncestorDiff(TreeNode node, int min, int max) {
        if (node == null) return max - min;
        int currMin = Math.min(min, node.val);
        int currMax = Math.max(max, node.val);
        int left = maxAncestorDiff(node.left, currMin, currMax);
        int right = maxAncestorDiff(node.right, currMin, currMax);
        return Math.max(left, right);
    }
}
