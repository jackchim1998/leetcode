package easy;

import common.BinaryTreeBuilder;
import common.TreeNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PathSumTest {
    private final PathSum solution = new PathSum();

    @Test
    void example1() {
        TreeNode tree = new BinaryTreeBuilder(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}).build();
        assertTrue(solution.hasPathSum(tree, 22));
    }

    @Test
    void example2() {
        TreeNode tree = new BinaryTreeBuilder(new Integer[]{1, 2, 3}).build();
        assertFalse(solution.hasPathSum(tree, 5));
    }

    @Test
    void example3() {
        TreeNode tree = new BinaryTreeBuilder(new Integer[]{1, 2}).build();
        assertFalse(solution.hasPathSum(tree, 0));
    }

    @Test
    void example4() {
        TreeNode tree = new BinaryTreeBuilder(new Integer[]{1, 2}).build();
        assertFalse(solution.hasPathSum(tree, 1));
    }
}