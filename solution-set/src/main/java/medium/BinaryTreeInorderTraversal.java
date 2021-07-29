package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> recursiveInorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        recursiveInorderTraversal(result, root);
        return result;
    }

    private void recursiveInorderTraversal(ArrayList<Integer> result, TreeNode node) {
        if (node == null) return;
        recursiveInorderTraversal(result, node.left);
        result.add(node.val);
        recursiveInorderTraversal(result, node.right);
    }
}
