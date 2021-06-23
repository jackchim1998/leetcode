package linkedlist.medium;

import common.ListNode;

/**
 * @author Jack
 */
public class ReverseLinkedListII {
//    ListNode rightNode;

    public ListNode reverseBetween(ListNode head, int left, int right) {
        return iteration(head, left, right);
    }

//    private ListNode recursion(ListNode head, int left, int right) {
//        ListNode beforeHead = new ListNode(0, head);
//        ListNode current = beforeHead;
//        for (int i = 0; i < left - 1; i++)
//            current = current.next;
//        ListNode beforeLeft = current;
//        beforeLeft.next.next = recursive(beforeLeft.next, beforeLeft.next.next, right - left);
//        beforeLeft.next = rightNode;
//        return beforeHead.next;
//    }
//
//    private ListNode recursive(ListNode before, ListNode curr, int leave) {
//        if (leave <= 0) {
//            rightNode = before;
//            return curr;
//        }
//        ListNode afterRight = recursive(curr, curr.next, leave - 1);
//        curr.next=before;
//        return afterRight;
//    }

    private ListNode iteration(ListNode head, int left, int right) {
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
