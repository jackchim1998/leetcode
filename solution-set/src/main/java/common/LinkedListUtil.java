package common;

/**
 * @author Jack
 */
public class LinkedListUtil {
    public static boolean isAllNodesSameValue(ListNode node1, ListNode node2) {
        if (node1 == null)
            return node2 == null;
        if (node2 == null)
            return false;
        if (node1.val != node2.val)
            return false;
        return isAllNodesSameValue(node1.next, node2.next);
    }
}
