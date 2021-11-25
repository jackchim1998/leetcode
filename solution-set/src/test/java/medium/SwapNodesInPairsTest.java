package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class SwapNodesInPairsTest {
    private final SwapNodesInPairs solution = new SwapNodesInPairs();

    @Test
    void example1() {
        ListNode input = new LinkedListBuilder(new int[]{1, 2, 3, 4}).build();
        ListNode expected = new LinkedListBuilder(new int[]{2, 1, 4, 3}).build();
        ListNode result = solution.swapPairs(input);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode input = new LinkedListBuilder(new int[]{}).build();
        ListNode expected = new LinkedListBuilder(new int[]{}).build();
        ListNode result = solution.swapPairs(input);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example3() {
        ListNode input = new LinkedListBuilder(new int[]{1}).build();
        ListNode expected = new LinkedListBuilder(new int[]{1}).build();
        ListNode result = solution.swapPairs(input);
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }
}