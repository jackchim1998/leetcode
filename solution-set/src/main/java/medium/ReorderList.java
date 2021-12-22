package medium;

import common.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode reversedListHead = reverse(mid.next);
        mid.next = null;
        reorder(head, reversedListHead);
    }

    private void reorder(ListNode node1, ListNode node2) {
        while (node1 != null) {
            ListNode next1 = node1.next;
            node1.next = node2;
            if (next1 == null) break;

            ListNode next2 = node2.next;
            node2.next = next1;
            node1 = next1;
            node2 = next2;
        }
    }

    private ListNode reverse(ListNode node) {
        if (node == null) return null;
        ListNode curr = node;
        ListNode next = node.next;
        node.next = null;
        while (next != null) {
            ListNode newNext = next.next;
            next.next = curr;
            curr = next;
            next = newNext;
        }
        return curr;
    }

    private ListNode findMid(ListNode head) {
        ListNode beforeHead = new ListNode(0, head);
        ListNode slow = beforeHead;
        ListNode fast = beforeHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
