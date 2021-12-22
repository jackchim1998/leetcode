package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class ReorderListTest {
    private final ReorderList solution = new ReorderList();

    @Test
    void example1() {
        ListNode list = new LinkedListBuilder(new int[]{1, 2, 3, 4}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1, 4, 2, 3}).build();
        solution.reorderList(list);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, list));
    }

    @Test
    void example2() {
        ListNode list = new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1, 5, 2, 4, 3}).build();
        solution.reorderList(list);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, list));
    }

    @Test
    void example3() {
        ListNode list = new LinkedListBuilder(new int[]{1}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1}).build();
        solution.reorderList(list);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, list));
    }

}