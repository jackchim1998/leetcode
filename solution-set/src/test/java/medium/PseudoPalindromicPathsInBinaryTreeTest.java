package medium;

import common.BinaryTreeBuilder;
import common.TreeNode;
import medium.PseudoPalindromicPathsInBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
public class PseudoPalindromicPathsInBinaryTreeTest  {
    private final PseudoPalindromicPathsInBinaryTree solution = new PseudoPalindromicPathsInBinaryTree();

    @Test
    public void example1() {
        TreeNode root = new BinaryTreeBuilder(new Integer[]{2,3,1,3,1,null,1}).build();
        int res = solution.pseudoPalindromicPaths(root);
        assertEquals(2, res);
    }

    @Test
    public void example2() {
        TreeNode root = new BinaryTreeBuilder(new Integer[]{2,1,1,1,3,null,null,null,null,null,1}).build();
        int res = solution.pseudoPalindromicPaths(root);
        assertEquals(1, res);
    }
}
