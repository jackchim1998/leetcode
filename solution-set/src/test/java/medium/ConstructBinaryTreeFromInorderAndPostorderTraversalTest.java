package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    private final ConstructBinaryTreeFromInorderAndPostorderTraversal solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void example1() {
        TreeNode result = solution.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        TreeNode result = solution.buildTree(new int[]{-1}, new int[]{-1});
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{-1}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }
}