package easy;

import common.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode beforeHead = new ListNode(0, head);
        ListNode curr = beforeHead;
        while (curr.next != null) {
            if (curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return beforeHead.next;
    }
}
