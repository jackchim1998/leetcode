package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Jack
 */
class LinkedListBuilderTest {
    @Test
    void emptyOrNullList() {
        assertNull(new LinkedListBuilder(new int[]{}).build());
        assertNull(new LinkedListBuilder(null).build());
    }

    @Test
    void normalTree() {
        ListNode root = new LinkedListBuilder(new int[]{1, 2, 3, 4}).build();
        assertEquals(1, root.val);
        assertEquals(2, root.next.val);
        assertEquals(3, root.next.next.val);
        assertEquals(4, root.next.next.next.val);
        assertNull(root.next.next.next.next);
    }
}
