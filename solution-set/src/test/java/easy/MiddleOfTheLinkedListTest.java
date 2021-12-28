package easy;

import common.LinkedListBuilder;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {
    private final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    @Test
    void example1() {
        ListNode result = solution.middleNode(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build());
        assertEquals(3, result.val);
    }

    @Test
    void example2() {
        ListNode result = solution.middleNode(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5, 6}).build());
        assertEquals(4, result.val);
    }

}