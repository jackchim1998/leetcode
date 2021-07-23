package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeBuilderV2;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LowestCommonAncestorOfABinaryTreeTest {
    private final LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();

    @Test
    void example1 () {
        TreeNode root = new BinaryTreeBuilderV2(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}).build();
        TreeNode treeNode = solution.lowestCommonAncestor(root, root.left, root.right);
        assertEquals(root,treeNode);
    }
}
