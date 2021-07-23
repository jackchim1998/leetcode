package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Jack
 */
class BinaryTreeBuilderV2Test {
    @Test
    void emptyOrNullTree() {
        assertNull(new BinaryTreeBuilderV2(null).build());
        assertNull(new BinaryTreeBuilderV2(new Integer[]{}).build());
        assertNull(new BinaryTreeBuilderV2(new Integer[]{null, 1}).build());
    }

    @Test
    void normalTree() {
        TreeNode root = new BinaryTreeBuilderV2(new Integer[]{1, null, 2, 3, 4}).build();
        assertEquals(1, root.val);
        assertNull(root.left);
        assertEquals(2, root.right.val);
        assertEquals(3, root.right.left.val);
        assertEquals(4, root.right.right.val);
    }

    @Test
    void disconnectedTree() {
        assertThrows(RuntimeException.class, () -> new BinaryTreeBuilderV2(new Integer[]{1, null, null, 2}).build());
        assertThrows(RuntimeException.class, () -> new BinaryTreeBuilderV2(new Integer[]{1, null, 2, null, 3, null, 4, null, null, 5}).build());
    }
}
