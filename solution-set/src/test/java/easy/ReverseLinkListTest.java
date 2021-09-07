package easy;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverseLinkListTest {
    private final ReverseLinkList solution = new ReverseLinkList();

    @Test
    void example1() {
        ListNode result = solution.reverseList(new LinkedListBuilder(new int[]{1, 2, 3, 4, 5}).build());
        assertTrue(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(new int[]{5, 4, 3, 2, 1}).build(), result));
    }

    @Test
    void example2() {
        ListNode result = solution.reverseList(new LinkedListBuilder(new int[]{}).build());
        assertTrue(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(new int[]{}).build(), result));
    }
}
