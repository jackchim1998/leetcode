package easy;

import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> recursiveInorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        recursiveInorderTraversal(result, root);
        return result;
    }

    private void recursiveInorderTraversal(ArrayList<Integer> result, TreeNode node) {
        if (node == null) return;
        recursiveInorderTraversal(result, node.left);
        recursiveInorderTraversal(result, node.right);
        result.add(node.val);
    }
}
