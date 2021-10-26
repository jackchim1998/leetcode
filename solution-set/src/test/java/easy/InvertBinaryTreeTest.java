package easy;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class InvertBinaryTreeTest {
    private final InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    void example1() {
        TreeNode input = new BinaryTreeBuilder(new Integer[]{4, 2, 7, 1, 3, 6, 9}).build();
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{4, 7, 2, 9, 6, 3, 1}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, solution.invertTree(input)));
    }

    @Test
    void example2() {
        TreeNode input = new BinaryTreeBuilder(new Integer[]{2, 1, 3}).build();
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{2, 3, 1}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, solution.invertTree(input)));
    }

    @Test
    void example3() {
        TreeNode input = new BinaryTreeBuilder(new Integer[]{}).build();
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, solution.invertTree(input)));
    }

}