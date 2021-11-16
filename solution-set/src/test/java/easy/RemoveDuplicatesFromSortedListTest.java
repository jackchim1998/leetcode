package easy;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveDuplicatesFromSortedListTest {
    private final RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    @Test
    void example1() {
        ListNode input = new LinkedListBuilder(new int[]{1, 1, 2}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1, 2}).build();
        ListNode result = solution.deleteDuplicates(input);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode input = new LinkedListBuilder(new int[]{1, 1, 2, 3, 3}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1, 2, 3}).build();
        ListNode result = solution.deleteDuplicates(input);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }
}