package linkedlist.medium;

import common.ListNode;

/**
 * @author Jack
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode beforeHead = new ListNode(0, head);
        ListNode current = beforeHead;
        for (int i = 0; i < left - 1; i++)
            current = current.next;
        ListNode beforeLeft = current;

        current = current.next;
        ListNode nextNode = current.next;
        for (int i = 0; i < right - left; i++) {
            ListNode newNexNode = nextNode.next;
            nextNode.next = current;
            current = nextNode;
            nextNode = newNexNode;
        }
        beforeLeft.next.next = nextNode;
        beforeLeft.next = current;
        return beforeHead.next;
    }
}
