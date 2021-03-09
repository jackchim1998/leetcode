package common;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Jack
 */
class BinaryTreeBuilderTest {
    @Test
    void emptyOrNullTree() {
        assertNull(new BinaryTreeBuilder(new Integer[]{}).build());
        assertNull(new BinaryTreeBuilder(null).build());
    }

    @Test
    void normalTree() {
        TreeNode root = new BinaryTreeBuilder(new Integer[]{1,2,3,4,null,null,7}).build();
        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
        assertEquals(4, root.left.left.val);
        assertNull(root.left.right);
        assertNull(root.right.left);
        assertEquals(7, root.right.right.val);
    }

    @Test
    void disconnectedTree() {
        assertThrows(RuntimeException.class, () -> new BinaryTreeBuilder(new Integer[]{1,null,3,4,5,null,7}).build());
    }

}
