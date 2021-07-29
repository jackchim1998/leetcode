package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class PartitionListTest {
    private final PartitionList solution = new PartitionList();

    @Test
    void example1() {
        ListNode expected = new LinkedListBuilder(new int[]{1, 2, 2, 4, 3, 5}).build();
        ListNode input = new LinkedListBuilder(new int[]{1, 4, 3, 2, 5, 2}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, solution.partition(input, 3)));
    }

    @Test
    void example2() {
        ListNode expected = new LinkedListBuilder(new int[]{1, 0, 2, 2, 4, 3, 5}).build();
        ListNode input = new LinkedListBuilder(new int[]{1, 4, 3, 0, 2, 5, 2}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, solution.partition(input, 3)));
    }
}
