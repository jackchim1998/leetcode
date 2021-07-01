package medium;

import common.ListNode;

/**
 * @author Jack
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode prevSlow = null;
        while (fast != null) {
            ListNode nextSlow = slow.next;
            slow.next = prevSlow;
            prevSlow = slow;
            slow = nextSlow;

            fast = fast.next;
            if (fast == null) break;
            fast = fast.next;
        }
        return same(prevSlow, slow) || same(prevSlow, slow.next);
    }

    boolean same(ListNode node1, ListNode node2) {
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) return false;
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1 == null && node2 == null;
    }
}
