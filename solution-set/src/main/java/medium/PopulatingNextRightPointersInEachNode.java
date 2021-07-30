package medium;

/**
 * @author Jack
 */
public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null || root.left == null) return root;
        root.left.next = root.right;
        if (root.next != null) root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }

    static final class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        Node(int val) {
            this.val = val;
        }

    }
}
