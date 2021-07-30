package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> bfsZigzagLevelOrder(TreeNode root) {
        if (root == null) return List.of();
        int depth = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        result.add(List.of(root.val));
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<Integer> currLevel = new ArrayList<>();
            List<TreeNode> newNodes = new ArrayList<>();
            for (int i = nodes.size() - 1; i >= 0; i--) {
                TreeNode node = nodes.get(i);
                if (node.right != null && node.left != null) {
                    if (depth % 2 == 0) {
                        currLevel.add(node.right.val);
                        newNodes.add(node.right);
                        currLevel.add(node.left.val);
                        newNodes.add(node.left);
                    } else {
                        currLevel.add(node.left.val);
                        newNodes.add(node.left);
                        currLevel.add(node.right.val);
                        newNodes.add(node.right);
                    }
                } else if (node.right != null) {
                    currLevel.add(node.right.val);
                    newNodes.add(node.right);
                } else if (node.left != null) {
                    currLevel.add(node.left.val);
                    newNodes.add(node.left);
                }
            }
            depth++;
            if (!currLevel.isEmpty())
                result.add(currLevel);
            nodes = newNodes;
        }
        return result;
    }

    public List<List<Integer>> dfsZigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, result, 0);
        return result;
    }

    private void dfs(TreeNode node, List<List<Integer>> result, int level) {
        if (node == null) return;
        if (result.size() <= level) result.add(new LinkedList<>());
        List<Integer> levelResult = result.get(level);
        if (level % 2 == 0) levelResult.add(node.val);
        else levelResult.add(0, node.val);
        dfs(node.left, result, level + 1);
        dfs(node.right, result, level + 1);
    }
}
