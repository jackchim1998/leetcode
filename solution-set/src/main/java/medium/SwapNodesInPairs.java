package medium;

import common.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode beforeHead = new ListNode(0, head);
        ListNode curr = beforeHead;
        while (curr.next != null && curr.next.next != null) {
            ListNode third = curr.next.next.next;
            curr.next.next.next = curr.next;
            curr.next = curr.next.next;
            curr.next.next.next = third;
            curr = curr.next.next;
        }
        return beforeHead.next;
    }
}
