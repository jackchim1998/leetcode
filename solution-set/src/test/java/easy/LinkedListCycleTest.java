package easy;

import common.LinkedListBuilder;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {
    private final LinkedListCycle solution = new LinkedListCycle();

    @Test
    void example1() {
        ListNode root = new LinkedListBuilder(new int[]{3, 2, 0, -4}).build();
        root.next.next.next.next = root.next;
        boolean result = solution.hasCycle(root);
        assertTrue(result);
    }

    @Test
    void example2() {
        ListNode root = new LinkedListBuilder(new int[]{1, 2}).build();
        root.next.next = root;
        boolean result = solution.hasCycle(root);
        assertTrue(result);
    }

    @Test
    void example3() {
        ListNode root = new LinkedListBuilder(new int[]{1}).build();
        boolean result = solution.hasCycle(root);
        assertFalse(result);
    }
}