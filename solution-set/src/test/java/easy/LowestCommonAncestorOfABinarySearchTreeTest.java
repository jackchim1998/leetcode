package easy;

import common.BinaryTreeBuilderV2;
import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LowestCommonAncestorOfABinarySearchTreeTest {
    private final LowestCommonAncestorOfABinarySearchTree solution = new LowestCommonAncestorOfABinarySearchTree();

    @Test
    void example1() {
        TreeNode root = new BinaryTreeBuilderV2(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5}).build();
        TreeNode treeNode = solution.lowestCommonAncestor(root, root.left, root.right);
        assertEquals(root, treeNode);
    }
}
