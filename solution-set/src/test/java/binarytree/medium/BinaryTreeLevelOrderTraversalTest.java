package binarytree.medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BinaryTreeLevelOrderTraversalTest {
    private final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @Test
    void example1() {
        List<List<Integer>> result = solution.levelOrder(new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build());
        assertEquals(3, result.size());
        assertArrayEquals(new int[]{3}, result.get(0).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{9, 20}, result.get(1).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{15, 7}, result.get(2).stream().mapToInt(i -> i).toArray());
    }
}
