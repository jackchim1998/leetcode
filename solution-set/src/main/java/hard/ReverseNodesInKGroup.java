package hard;

import common.ListNode;

/**
 * @author Jack
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode beforeHead = new ListNode(0, head);
        ListNode current = beforeHead;
        while (true) {
            ListNode tail = current.next;
            int count = 0;
            while (count < k && tail != null) {
                tail = tail.next;
                count++;
            }
            if (count != k) break;
            ListNode beforeStart = current;
            ListNode end = current.next;
            current = current.next;
            ListNode nextNode = current.next;
            current.next = tail;
            for (int i = 0; i < k - 1; i++) {
                ListNode newNextNode = nextNode.next;
                nextNode.next = current;
                current = nextNode;
                nextNode = newNextNode;
            }
            beforeStart.next = current;
            current = end;
        }
        return beforeHead.next;
    }
}
