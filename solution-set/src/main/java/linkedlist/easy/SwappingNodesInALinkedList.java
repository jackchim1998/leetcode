package linkedlist.easy;

import common.ListNode;

/**
 * @author Jack
 */
public class SwappingNodesInALinkedList {
    private ListNode left;
    private ListNode right;

    public ListNode swapNodes(ListNode head, int k) {
        travel(head, k, 0);
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
        return head;
    }

    private int travel(ListNode node, int k, int idx) {
        if (node == null) return idx;
        if (idx + 1 == k) left = node;
        int maxLength = travel(node.next, k, idx + 1);
        if (maxLength - k == idx) right = node;
        return maxLength;
    }
}
