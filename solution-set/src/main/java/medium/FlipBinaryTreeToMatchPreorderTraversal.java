package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class FlipBinaryTreeToMatchPreorderTraversal {
    private int idx = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        if (root.val != voyage[0]) return List.of(-1);
        List<Integer> results = new ArrayList<>();
        if (isInvalid(root, voyage, results))
            return List.of(-1);
        return results;
    }

    private boolean isInvalid(TreeNode node, int[] voyage, List<Integer> results) {
        idx++;
        if (node.left != null && node.right != null) {
            if (node.left.val != voyage[idx] && node.right.val == voyage[idx]) {
                TreeNode tmp = node.left;
                node.left = node.right;
                node.right = tmp;
                results.add(node.val);
            }
            return isInvalid(node.left, voyage, results) || node.right.val != voyage[idx] || isInvalid(node.right, voyage, results);
        } else if (node.left != null) return node.left.val != voyage[idx] || isInvalid(node.left, voyage, results);
        else if (node.right != null) return node.right.val != voyage[idx] || isInvalid(node.right, voyage, results);
        return false;
    }
}
