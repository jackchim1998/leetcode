package binarytree.hard;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BinaryTreeMaximumPathSumTest {
    private final BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    @Test
    void example1() {
        assertEquals(6, solution.maxPathSum(new BinaryTreeBuilder(new Integer[]{1, 2, 3}).build()));
    }

    @Test
    void example2() {
        assertEquals(-3, solution.maxPathSum(new BinaryTreeBuilder(new Integer[]{-3}).build()));
    }
}
