package dp.medium;

import binarytree.medium.PseudoPalindromicPathsInBinaryTree;
import common.BinaryTreeBuilder;
import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jack
 */
class DecodeWaysTest {
    private final DecodeWays solution = new DecodeWays();

    @Test
    public void example1() {
        int res = solution.numDecoding("12");
        assertEquals(2, res);
    }

    @Test
    public void example2() {
        int res = solution.numDecoding("226");
        assertEquals(3, res);
    }

    @Test
    public void example3() {
        int res = solution.numDecoding("0");
        assertEquals(0, res);
    }

    @Test
    public void example4() {
        int res = solution.numDecoding("06");
        assertEquals(0, res);
    }

    @Test
    public void example5() {
        int res = solution.numDecoding("10");
        assertEquals(1, res);
    }

    @Test
    public void example6() {
        int res = solution.numDecoding("2101");
        assertEquals(1, res);
    }
    @Test
    public void example7() {
        int res = solution.numDecoding("230");
        assertEquals(0, res);
    }

}
