package linkedlist.medium;

import common.ListNode;

/**
 * @author Jack
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeHead = new ListNode(0, head);
        ListNode slow = beforeHead;
        ListNode fast = beforeHead;
        for (int i = 0; i < n; i++)
            fast = fast.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return beforeHead.next;
    }
}
