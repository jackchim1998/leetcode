package medium;

import common.ListNode;

/**
 * @author Jack
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode beforeFrontList = new ListNode(0);
        ListNode frontCurr = beforeFrontList;
        ListNode beforeBackList = new ListNode(0);
        ListNode backCurr = beforeBackList;
        ListNode curr = head;
        boolean isFront = true;
        while (curr != null) {
            if (isFront) {
                frontCurr.next = curr;
                frontCurr = frontCurr.next;
            } else {
                backCurr.next = curr;
                backCurr = backCurr.next;
            }
            curr = curr.next;
            isFront = !isFront;
        }
        backCurr.next = null;
        frontCurr.next = beforeBackList.next;
        return beforeFrontList.next;
    }
}
