package medium;

import common.ListNode;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode beforeHead = new ListNode(0);
        ListNode curr = head;
        ListNode prev = beforeHead;
        while (curr != null) {
            ListNode next = curr.next;
            if (prev.val >= curr.val)
                prev = beforeHead;
            while (prev.next != null && prev.next.val < curr.val)
                prev = prev.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return beforeHead.next;
    }
}
