package common;


/**
 * @author Jack
 */
public class BinaryTreeUtil {
    public static boolean isAllNodesSameValue(TreeNode node1, TreeNode node2) {
        if (node1 == null)
            return node2 == null;
        if (node2 == null)
            return false;
        if (node1.val != node2.val)
            return false;
        return isAllNodesSameValue(node1.left, node2.left) && isAllNodesSameValue(node2.right, node2.right);
    }
}
