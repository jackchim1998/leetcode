package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Jack
 */
class OddEvenLinkedListTest {
    private final OddEvenLinkedList solution = new OddEvenLinkedList();

    @Test
    void example1() {
        ListNode result = solution.oddEvenList(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build());
        ListNode expected = new LinkedListBuilder(new int[]{1, 3, 5, 2, 4}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode result = solution.oddEvenList(new LinkedListBuilder(new int[]{2, 1, 3, 5, 6, 4, 7}).build());
        ListNode expected = new LinkedListBuilder(new int[]{2, 3, 6, 7, 1, 5, 4}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }
}
