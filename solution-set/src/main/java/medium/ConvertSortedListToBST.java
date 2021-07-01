package medium;

import common.ListNode;
import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class ConvertSortedListToBST { // we can use slow-fast pointer to find mid, and cut it into 2 parts, and repeat
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return generate(list, 0, list.size() - 1);
    }

    private TreeNode generate(List<Integer> list, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        return new TreeNode(list.get(mid), generate(list, start, mid-1), generate(list, mid + 1, end));
    }
}
