package easy;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchInABinarySearchTreeTest {
    private final SearchInABinarySearchTree solution = new SearchInABinarySearchTree();

    @Test
    void example1() {
        TreeNode result = solution.searchBST(new BinaryTreeBuilder(new Integer[]{4, 2, 7, 1, 3}).build(), 2);
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{2, 1, 3}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }
    @Test
    void example2() {
        TreeNode result = solution.searchBST(new BinaryTreeBuilder(new Integer[]{4, 2, 7, 1, 3}).build(), 0);
        TreeNode expected = new BinaryTreeBuilder(new Integer[]{}).build();
        assertTrue(BinaryTreeUtil.isAllNodesSameValue(expected, result));
    }
}