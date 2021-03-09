package binarytree.medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeUtil;
import common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class AddOneRowToTreeTest {
    private final AddOneRowToTree solution = new AddOneRowToTree();

    @Test
    public void example1() {
        TreeNode input = new BinaryTreeBuilder(new Integer[]{4, 2, 6, 3, 1, 5, null}).build();
        TreeNode res = solution.addOneRow(input, 1, 2);
        BinaryTreeUtil.isAllNodesSameValue(res, new BinaryTreeBuilder(new Integer[]{4, 1, 1, 2, null, null, 6, 3, 1, null, null, null, null, 5, null}).build());
    }

    @Test
    public void example2() {
        TreeNode input = new BinaryTreeBuilder(new Integer[]{4, 2, null, 3, 1, null, null}).build();
        TreeNode res = solution.addOneRow(input, 1, 3);
        BinaryTreeUtil.isAllNodesSameValue(res, new BinaryTreeBuilder(new Integer[]{4, 2, null, 1, 1, null, null, 3, null, null, 1}).build());
    }
}
