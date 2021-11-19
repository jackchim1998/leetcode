package easy;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeTest {
    private final SymmetricTree solution = new SymmetricTree();

    @Test
    void example1() {
        boolean result = solution.isSymmetric(new BinaryTreeBuilder(new Integer[]{1, 2, 2, 3, 4, 4, 3}).build());
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.isSymmetric(new BinaryTreeBuilder(new Integer[]{1, 2, 2, null, 3, null, 3}).build());
        assertFalse(result);
    }
}