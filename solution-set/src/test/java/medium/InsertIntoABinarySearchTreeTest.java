package medium;

import common.BinaryTreeBuilderV2;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class InsertIntoABinarySearchTreeTest {
    private final InsertIntoABinarySearchTree solution = new InsertIntoABinarySearchTree();

    @Test
    void example1() {
        TreeNode input = new BinaryTreeBuilderV2(new Integer[]{4, 2, 7, 1, 3}).build();
        TreeNode result = solution.insertIntoBST(input, 5);
        BinaryTreeUtil.isAllNodesSameValue(result, input);
    }
}
