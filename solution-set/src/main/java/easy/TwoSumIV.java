package easy;

import common.TreeNode;

import java.util.HashSet;

/**
 * @author Jack
 */
public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k, new HashSet<>());
    }

    private boolean dfs(TreeNode node, int k, HashSet<Integer> exists) {
        if (node == null) return false;
        if (dfs(node.left, k, exists)) return true;
        if (exists.contains(k - node.val)) return true;
        exists.add(node.val);
        return dfs(node.right, k, exists);
    }
}
