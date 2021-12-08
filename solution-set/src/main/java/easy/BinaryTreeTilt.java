package easy;

import common.TreeNode;

public class BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        return sum(root)[0];
    }

    private int[] sum(TreeNode node) { // 0 is diff, 1 is sum
        if (node == null) return new int[]{0, 0};
        int[] left = sum(node.left);
        int[] right = sum(node.right);
        return new int[]{Math.abs(left[1] - right[1]) + left[0] + right[0], node.val + left[1] + right[1]};
    }
}
