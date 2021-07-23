package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeBuilderV2;
import common.BinaryTreeUtil;
import common.LinkedListBuilder;
import common.TreeNode;
import medium.ConvertSortedListToBST;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class ConvertSortedListToBSTTest {
    private final ConvertSortedListToBST solution = new ConvertSortedListToBST();

    @Test
    void example1() {
        TreeNode treeNode = solution.sortedListToBST(new LinkedListBuilder(new int[]{-10, -3, 0, 5, 9}).build());
        BinaryTreeUtil.isAllNodesSameValue(new BinaryTreeBuilderV2(new Integer[]{0, -3, 9, -10, null, 5, null}).build(), treeNode);
    }
}
