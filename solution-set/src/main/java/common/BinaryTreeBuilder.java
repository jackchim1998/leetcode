package common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class BinaryTreeBuilder {
    private final Integer[] values;

    public BinaryTreeBuilder(Integer[] values) {
        this.values = values;
    }

    public TreeNode build() {
        if (values == null || values.length == 0 || values[0] == null)
            return null;
        TreeNode root = new TreeNode(values[0]);
        List<TreeNode> nodes = List.of(root);
        int idx = 1;
        while (!nodes.isEmpty() && idx < values.length) {
            List<TreeNode> next = new ArrayList<>(nodes.size() * 2);
            for (TreeNode node : nodes) {
                node.left = newTreeNode(idx++);
                if (node.left != null) next.add(node.left);
                node.right = newTreeNode(idx++);
                if (node.right != null) next.add(node.right);
            }
            nodes = next;
        }
        if (idx < values.length) throw new RuntimeException("Find Disconnected Node In idx = " + idx);
        return root;
    }

    private TreeNode newTreeNode(int idx) {
        return idx < values.length && values[idx] != null ? new TreeNode(values[idx]) : null;
    }

}
