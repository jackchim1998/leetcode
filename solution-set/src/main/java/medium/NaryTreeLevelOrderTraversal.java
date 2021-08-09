package medium;

import common.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, root, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, Node node, int level) {
        if (node == null) return;
        if (result.size() <= level)
            result.add(new ArrayList<>());
        List<Integer> list = result.get(level);
        list.add(node.val);
        for (Node child : node.children)
            dfs(result, child, level + 1);
    }
}
