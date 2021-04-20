package narytree.medium;

import common.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(Node node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        for (Node child : node.children)
            preorder(child, result);
    }
}
