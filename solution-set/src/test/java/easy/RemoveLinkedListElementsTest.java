package easy;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveLinkedListElementsTest {
    private final RemoveLinkedListElements solution = new RemoveLinkedListElements();

    @Test
    void example1() {
        ListNode input = new LinkedListBuilder(new int[]{1, 2, 6, 3, 4, 5, 6}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build();
        ListNode result = solution.removeElements(input, 6);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode input = new LinkedListBuilder(new int[]{}).build();
        ListNode expected = new LinkedListBuilder(new int[]{}).build();
        ListNode result = solution.removeElements(input, 1);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example3() {
        ListNode input = new LinkedListBuilder(new int[]{7, 7, 7, 7}).build();
        ListNode expected = new LinkedListBuilder(new int[]{}).build();
        ListNode result = solution.removeElements(input, 7);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }


}