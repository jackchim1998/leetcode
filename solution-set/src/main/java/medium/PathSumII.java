package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new LinkedList<>(), root, targetSum);
        return result;
    }

    public void backtracking(List<List<Integer>> result, Deque<Integer> currPath, TreeNode currNode, int targetSum) {
        if (currNode == null) return;
        int newTarget = targetSum - currNode.val;
        currPath.addLast(currNode.val);
        backtracking(result, currPath, currNode.left, newTarget);
        backtracking(result, currPath, currNode.right, newTarget);
        if (newTarget == 0 && currNode.left == null && currNode.right == null)
            result.add(new ArrayList<>(currPath));
        currPath.pollLast();
    }
}
