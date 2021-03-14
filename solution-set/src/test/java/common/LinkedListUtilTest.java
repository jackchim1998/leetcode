package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Jack
 */
class LinkedListUtilTest {
    @Test
    void sameList() {
        assertTrue(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(new int[]{1, 2, 3, 4}).build(), new LinkedListBuilder(new int[]{1, 2, 3, 4}).build()));
        assertTrue(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(null).build(), new LinkedListBuilder(null).build()));
    }

    @Test
    void diffList() {
        assertFalse(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(new int[]{1, 2, 3}).build(), new LinkedListBuilder(new int[]{1, 2, 3, 4}).build()));
        assertFalse(LinkedListUtil.isAllNodesSameValue(new LinkedListBuilder(new int[]{1, 3, 5}).build(), new LinkedListBuilder(null).build()));
    }

}
