package linkedlist.medium;

import common.ListNode;

/**
 * @author Jack
 * q.1721
 * constraint:
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 105
 * 0 <= Node.val <= 100
 */
public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head, right = head;
        for (int i = 0; i < k - 1; i++)
            left = left.next;
        ListNode fast = left;
        while (fast.next != null) {
            fast = fast.next;
            right = right.next;
        }
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
        return head;
    }

    /**
     * the below code is O(n) time and O(1) space
     * But it is slow due to recursion (many function call)
     */
//    private ListNode left;
//    private ListNode right;
//
//    public ListNode swapNodes(ListNode head, int k) {
//        travel(head, k, 0);
//        int tmp = left.val;
//        left.val = right.val;
//        right.val = tmp;
//        return head;
//    }
//
//    private int travel(ListNode node, int k, int idx) {
//        if (node == null) return idx;
//        if (idx + 1 == k) left = node;
//        int maxLength = travel(node.next, k, idx + 1);
//        if (maxLength - k == idx) right = node;
//        return maxLength;
//    }
}
