package linkedlist.medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class RemoveNthNodeFromEndOfListTest {
    private final RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

    @Test
    void example1() {
        ListNode expected = new LinkedListBuilder(new int[]{1, 2, 3, 5}).build();
        ListNode input = new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, solution.removeNthFromEnd(input, 2)));
    }

    @Test
    void example2() {
        ListNode expected = new LinkedListBuilder(new int[]{2}).build();
        ListNode input = new LinkedListBuilder(new int[]{1, 2}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, solution.removeNthFromEnd(input, 2)));
    }
}
