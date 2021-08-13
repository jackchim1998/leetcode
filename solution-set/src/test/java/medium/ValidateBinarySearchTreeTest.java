package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class ValidateBinarySearchTreeTest {
    private final ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    @Test
    void example1() {
        boolean result = solution.isValidBST(new BinaryTreeBuilder(new Integer[]{2, 1, 3}).build());
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.isValidBST(new BinaryTreeBuilder(new Integer[]{5, 1, 4, null, null, 3, 6}).build());
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.isValidBST(new BinaryTreeBuilder(new Integer[]{5, 4, 6, null, null, 3, 7}).build());
        assertFalse(result);
    }

    @Test
    void example4() {
        boolean result = solution.isValidBST(new BinaryTreeBuilder(new Integer[]{Integer.MIN_VALUE, Integer.MIN_VALUE}).build());
        assertFalse(result);
    }

    @Test
    void example5() {
        boolean result = solution.isValidBST(new BinaryTreeBuilder(new Integer[]{Integer.MAX_VALUE}).build());
        assertTrue(result);
    }

    @Test
    void example6() {
        boolean result = solution.isValidBST(new BinaryTreeBuilder(new Integer[]{Integer.MIN_VALUE, null, Integer.MAX_VALUE}).build());
        assertTrue(result);
    }
}
