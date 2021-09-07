package easy;

import common.ListNode;

public class ReverseLinkList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        ListNode next = head.next;
        head.next = null;

        while (next != null) {
            ListNode nextNext = next.next;
            next.next = curr;
            curr = next;
            next = nextNext;

        }
        return curr;
    }
}
