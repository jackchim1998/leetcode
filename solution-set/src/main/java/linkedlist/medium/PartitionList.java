package linkedlist.medium;

import common.ListNode;

/**
 * @author Jack
 * q.86
 */
public class PartitionList { // there is a better two-point approach
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode beforeHead = new ListNode(0, head);
        ListNode positionBeforeInsert = beforeHead;
        while (positionBeforeInsert.next != null && positionBeforeInsert.next.val < x)
            positionBeforeInsert = positionBeforeInsert.next;
        ListNode curr = positionBeforeInsert;
        while (curr.next != null) {
            if (curr.next.val < x) {
                ListNode next = curr.next.next;
                curr.next.next = positionBeforeInsert.next;
                positionBeforeInsert.next = curr.next;
                positionBeforeInsert = positionBeforeInsert.next;
                curr.next = next;
            } else
                curr = curr.next;
        }
        return beforeHead.next;
    }
}
