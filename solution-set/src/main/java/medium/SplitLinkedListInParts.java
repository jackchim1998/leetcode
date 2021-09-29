package medium;

import common.ListNode;

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int count = count(head);

        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            int countOfPart = count / k + (i < count % k ? 1 : 0);
            result[i] = curr;
            for (int j = 0; j < countOfPart - 1; j++)
                curr = curr.next;
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }
        return result;
    }

    private int count(ListNode head) {
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        return n;
    }
}
