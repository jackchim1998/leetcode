package easy;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {
    private final MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    void example1() {
        int result = solution.maxDepth(new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build());
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.maxDepth(new BinaryTreeBuilder(new Integer[]{1, null, 2}).build());
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.maxDepth(new BinaryTreeBuilder(new Integer[]{}).build());
        assertEquals(0, result);
    }

    @Test
    void example4() {
        int result = solution.maxDepth(new BinaryTreeBuilder(new Integer[]{0}).build());
        assertEquals(1, result);
    }
}