package common;

/**
 * @author Jack
 */
public class BinaryTreeBuilder {
    private final Integer[] values;

    public BinaryTreeBuilder(Integer[] values) {
        this.values = values;
    }

    public TreeNode build() {
        if (values == null || values.length == 0)
            return null;
        return insertLevelOrder(0);
    }

    private TreeNode insertLevelOrder(int idx) {
        if (idx >= values.length) return null;
        if (values[idx] == null) {
            validateDisconnectedNode(idx * 2 + 1);
            validateDisconnectedNode(idx * 2 + 2);
            return null;
        }
        return new TreeNode(values[idx], insertLevelOrder(idx * 2 + 1), insertLevelOrder(idx * 2 + 2));
    }

    private void validateDisconnectedNode(int idx) {
        if (idx>=values.length) return;
        if (values[idx] != null) throw new RuntimeException("Find Disconnected Node In idx = " + idx);
        validateDisconnectedNode(idx * 2 + 1);
        validateDisconnectedNode(idx * 2 + 2);
    }
}
