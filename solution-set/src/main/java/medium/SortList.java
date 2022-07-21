package medium;

import common.ListNode;

/**
 * @author jack
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }

    ListNode merge(ListNode left, ListNode right) {
        ListNode beforeHead = new ListNode(0);
        ListNode curr = beforeHead;
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
                curr = curr.next;
            } else {
                curr.next = right;
                right = right.next;
                curr = curr.next;
            }
        }
        curr.next = left != null ? left : right;
        return beforeHead.next;
    }
}
