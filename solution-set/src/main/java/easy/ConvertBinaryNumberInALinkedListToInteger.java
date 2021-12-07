package easy;

import common.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        for (ListNode curr = head; curr != null; curr = curr.next)
            result = (result << 1) + curr.val;
        return result;
    }
}
