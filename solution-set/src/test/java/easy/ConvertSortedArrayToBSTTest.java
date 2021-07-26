package easy;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class ConvertSortedArrayToBSTTest {
    private final ConvertSortedArrayToBST solution = new ConvertSortedArrayToBST();

    @Test
    void example1() {
        TreeNode result = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        BinaryTreeUtil.isAllNodesSameValue(new BinaryTreeBuilder(new Integer[]{0,-10,5,null,-3,null,9}).build(), result);
    }
}
