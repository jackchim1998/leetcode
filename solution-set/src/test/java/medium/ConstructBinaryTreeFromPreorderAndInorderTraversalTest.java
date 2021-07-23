package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private final ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void example1() {
        BinaryTreeUtil.isAllNodesSameValue(new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build(), solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }

}
