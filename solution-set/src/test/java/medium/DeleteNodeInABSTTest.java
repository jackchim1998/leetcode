package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class DeleteNodeInABSTTest {
    private final DeleteNodeInABST solution = new DeleteNodeInABST();

    @Test
    void example1() {
        TreeNode result = solution.deleteNode(new BinaryTreeBuilder(new Integer[]{5, 3, 6, 2, 4, null, 7}).build(), 3);
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{5, 4, 6, 2, null, null, 7}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example2() {
        TreeNode result = solution.deleteNode(new BinaryTreeBuilder(new Integer[]{5, 3, 6, 2, 4, null, 7}).build(), 0);
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{5, 3, 6, 2, 4, null, 7}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }

    @Test
    void example3() {
        TreeNode result = solution.deleteNode(new BinaryTreeBuilder(new Integer[]{}).build(), 0);
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }

}