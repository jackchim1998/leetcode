package linkedlist.medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class SwappingNodesInALinkedListTest {
    private final SwappingNodesInALinkedList solution = new SwappingNodesInALinkedList();

    @Test
    void example1() {
        ListNode expect = new LinkedListBuilder(new int[]{1, 4, 3, 2, 5}).build();
        ListNode actual = solution.swapNodes(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build(), 2);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expect, actual));
    }

    @Test
    void example2() {
        ListNode expect = new LinkedListBuilder(new int[]{7, 9, 6, 6, 8, 7, 3, 0, 9, 5}).build();
        ListNode actual = solution.swapNodes(new LinkedListBuilder(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5}).build(), 5);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expect, actual));
    }

    @Test
    void example3() {
        ListNode expect = new LinkedListBuilder(new int[]{1}).build();
        ListNode actual = solution.swapNodes(new LinkedListBuilder(new int[]{1}).build(), 1);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expect, actual));
    }

    @Test
    void example4() {
        ListNode expect = new LinkedListBuilder(new int[]{2, 1}).build();
        ListNode actual = solution.swapNodes(new LinkedListBuilder(new int[]{1, 2}).build(), 1);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expect, actual));
    }

    @Test
    void example5() {
        ListNode expect = new LinkedListBuilder(new int[]{1, 2, 3}).build();
        ListNode actual = solution.swapNodes(new LinkedListBuilder(new int[]{1, 2, 3}).build(), 2);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expect, actual));
    }


}
