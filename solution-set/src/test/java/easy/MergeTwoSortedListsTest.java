package easy;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test
    void example1() {
        ListNode list1 = new LinkedListBuilder(new int[]{1, 2, 4}).build();
        ListNode list2 = new LinkedListBuilder(new int[]{1, 3, 4}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1, 1, 2, 3, 4, 4}).build();
        ListNode result = solution.mergeTwoLists(list1, list2);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode list1 = new LinkedListBuilder(new int[]{}).build();
        ListNode list2 = new LinkedListBuilder(new int[]{}).build();
        ListNode expected = new LinkedListBuilder(new int[]{}).build();
        ListNode result = solution.mergeTwoLists(list1, list2);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example3() {
        ListNode list1 = new LinkedListBuilder(new int[]{}).build();
        ListNode list2 = new LinkedListBuilder(new int[]{0}).build();
        ListNode expected = new LinkedListBuilder(new int[]{0}).build();
        ListNode result = solution.mergeTwoLists(list1, list2);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

}