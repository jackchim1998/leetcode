package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Jack
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();
        Queue<List<TreeNode>> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(List.of(root));
        while (!queue.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode node : queue.poll()) {
                if (node.left != null)  next.add(node.left);
                if (node.right != null)  next.add(node.right);
                curr.add(node.val);
            }
            if (!next.isEmpty()) queue.add(next);
            if (!curr.isEmpty())result.add(curr);
        }
        return result;
    }
}
