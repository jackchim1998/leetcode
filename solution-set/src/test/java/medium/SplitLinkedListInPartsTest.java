package medium;

import common.LinkedListBuilder;
import common.LinkedListUtil;
import common.ListNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SplitLinkedListInPartsTest {
    private final SplitLinkedListInParts solution = new SplitLinkedListInParts();

    @Test
    void example1() {
        int k = 5;
        ListNode input = new LinkedListBuilder(new int[]{1, 2, 3}).build();
        ListNode[] expected = new ListNode[]{
                new LinkedListBuilder(new int[]{1}).build(),
                new LinkedListBuilder(new int[]{2}).build(),
                new LinkedListBuilder(new int[]{3}).build(),
                null,
                null
        };
        validate(expected, input, k);
    }

    @Test
    void example2() {
        int k = 3;
        ListNode input = new LinkedListBuilder(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}).build();
        ListNode[] expected = new ListNode[]{
                new LinkedListBuilder(new int[]{1, 2, 3, 4}).build(),
                new LinkedListBuilder(new int[]{5, 6, 7}).build(),
                new LinkedListBuilder(new int[]{8, 9, 10}).build()
        };
        validate(expected, input, k);
    }

    private void validate(ListNode[] expected, ListNode input, int k) {
        ListNode[] result = solution.splitListToParts(input, k);
        assertEquals(k, result.length);
        assertEquals(k, expected.length);
        for (int i = 0; i < k; i++)
            assertTrue(LinkedListUtil.isAllNodesSameValue(expected[i], result[i]));
    }

}