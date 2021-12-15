package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertionSortListTest {
    private final InsertionSortList solution = new InsertionSortList();

    @Test
    void example1() {
        ListNode result = solution.insertionSortList(new LinkedListBuilder(new int[]{4, 2, 1, 3}).build());
        ListNode expected = new LinkedListBuilder(new int[]{1, 2, 3, 4}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode result = solution.insertionSortList(new LinkedListBuilder(new int[]{-1, 5, 3, 4, 0}).build());
        ListNode expected = new LinkedListBuilder(new int[]{-1, 0, 3, 4, 5}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }
}