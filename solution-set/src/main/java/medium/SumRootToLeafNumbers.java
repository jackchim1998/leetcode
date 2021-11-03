package medium;

import common.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode node, int path) {
        int newPath = path * 10 + node.val;

        int sum = 0;
        if (node.left != null)
            sum += sumNumbers(node.left, newPath);
        if (node.right != null)
            sum += sumNumbers(node.right, newPath);
        return sum != 0 ? sum : newPath;
    }
}
