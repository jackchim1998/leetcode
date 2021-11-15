package easy;

import common.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode beforeRoot = new ListNode(0);
        ListNode left = l1;
        ListNode right = l2;
        ListNode current = beforeRoot;
        while (left != null || right != null) {
            if (left == null) {
                current.next = right;
                right = right.next;
            } else if (right == null) {
                current.next = left;
                left = left.next;
            } else if (left.val > right.val) {
                current.next = right;
                right = right.next;
            } else {
                current.next = left;
                left = left.next;
            }
            current = current.next;
        }
        return beforeRoot.next;
    }
}
