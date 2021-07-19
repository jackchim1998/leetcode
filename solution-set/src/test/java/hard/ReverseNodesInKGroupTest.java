package hard;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class ReverseNodesInKGroupTest {
    private final ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    @Test
    void example1() {
        ListNode listNode = solution.reverseKGroup(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build(), 2);
        ListNode expected = new LinkedListBuilder(new int[]{2, 1, 4, 3, 5}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, listNode));
    }

    @Test
    void example2() {
        ListNode listNode = solution.reverseKGroup(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build(), 3);
        ListNode expected = new LinkedListBuilder(new int[]{3, 2, 1, 4, 5}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, listNode));
    }

}
