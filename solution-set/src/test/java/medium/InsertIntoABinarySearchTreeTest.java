package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import medium.InsertIntoABinarySearchTree;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class InsertIntoABinarySearchTreeTest {
    private final InsertIntoABinarySearchTree solution = new InsertIntoABinarySearchTree();

    @Test
    void example1() {
        TreeNode input = new BinaryTreeBuilder(new Integer[]{4, 2, 7, 1, 3, null, null}).build();
        TreeNode result = solution.insertIntoBST(input, 5);
        BinaryTreeUtil.isAllNodesSameValue(result, input);
    }
}
