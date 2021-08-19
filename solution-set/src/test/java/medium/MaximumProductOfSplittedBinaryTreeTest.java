package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumProductOfSplittedBinaryTreeTest {
    private final MaximumProductOfSplittedBinaryTree solution = new MaximumProductOfSplittedBinaryTree();

    @Test
    void example1() {
        int result = solution.maxProduct(new BinaryTreeBuilder(new Integer[]{1, 2, 3, 4, 5, 6}).build());
        assertEquals(110, result);
    }

    @Test
    void example2() {
        int result = solution.maxProduct(new BinaryTreeBuilder(new Integer[]{1, null, 2, 3, 4, null, null, 5, 6}).build());
        assertEquals(90, result);
    }

    @Test
    void example3() {
        int result = solution.maxProduct(new BinaryTreeBuilder(new Integer[]{2, 3, 9, 10, 7, 8, 6, 5, 4, 11, 1}).build());
        assertEquals(1025, result);
    }

    @Test
    void example4() {
        int result = solution.maxProduct(new BinaryTreeBuilder(new Integer[]{1, 1}).build());
        assertEquals(1, result);
    }
}
