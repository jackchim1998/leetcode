package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeBuilderV2;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class BinaryTreePruningTest {
    private final BinaryTreePruning solution = new BinaryTreePruning();

    @Test
    void example1() {
        TreeNode root = solution.pruneTree(new BinaryTreeBuilderV2(new Integer[]{1, null, 0,  0, 1}).build());
        TreeNode expected = new BinaryTreeBuilderV2(new Integer[]{1, null, 0,  null, 1}).build();
        BinaryTreeUtil.isAllNodesSameValue(expected, root);
    }
}
