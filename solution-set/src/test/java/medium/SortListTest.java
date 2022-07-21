package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jack
 */
class SortListTest {
    private final SortList solution = new SortList();

    @Test
    void example1() {
        ListNode result = solution.sortList(new LinkedListBuilder(new int[]{4, 2, 1, 3}).build());
        ListNode expected = new LinkedListBuilder(new int[]{1, 2, 3, 4}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        ListNode result = solution.sortList(new LinkedListBuilder(new int[]{-1, 5, 3, 4, 0}).build());
        ListNode expected = new LinkedListBuilder(new int[]{-1, 0, 3, 4, 5}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void getMidExample1() {
        ListNode mid = solution.getMid(new LinkedListBuilder(new int[]{-1, 5, 3, 4, 0}).build());
        assertEquals(4, mid.val);
    }

    @Test
    void getMidExample2() {
        ListNode mid = solution.getMid(new LinkedListBuilder(new int[]{-1, 5, 3, 4}).build());
        assertEquals(3, mid.val);
    }

    @Test
    void mergeExample1() {
        ListNode result = solution.merge(new LinkedListBuilder(new int[]{0, 7}).build(), new LinkedListBuilder(new int[]{2, 5}).build());
        ListNode expected = new LinkedListBuilder(new int[]{0, 2, 5, 7}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void mergeExample2() {
        ListNode result = solution.merge(new LinkedListBuilder(new int[]{0, 7, 9}).build(), new LinkedListBuilder(new int[]{2, 5}).build());
        ListNode expected = new LinkedListBuilder(new int[]{0, 2, 5, 7, 9}).build();
        assertTrue(LinkedListUtil.isAllNodesSameValue(expected, result));
    }
}