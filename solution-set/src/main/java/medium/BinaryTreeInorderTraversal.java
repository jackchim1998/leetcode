package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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

    public List<Integer> iterativeInorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            curr = node.right;
        }
        return result;
    }
}
