package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import medium.ReverseLinkedListII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class ReverseLinkedListIITest {
    private final ReverseLinkedListII solution = new ReverseLinkedListII();

    @Test
    void example1() {
        ListNode head = new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build();
        ListNode reversedHead = solution.reverseBetween(head, 2, 4);
        assertTrue(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(new int[]{1, 4, 3, 2, 5}).build(), reversedHead));
    }
}
