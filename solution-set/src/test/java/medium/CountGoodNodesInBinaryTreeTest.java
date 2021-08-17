package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CountGoodNodesInBinaryTreeTest {
    private final CountGoodNodesInBinaryTree solution = new CountGoodNodesInBinaryTree();

    @Test
    void example1() {
        int result = solution.goodNodes(new BinaryTreeBuilder(new Integer[]{3, 1, 4, 3, null, 1, 5}).build());
        assertEquals(4, result);
    }

    @Test
    void example2() {
        int result = solution.goodNodes(new BinaryTreeBuilder(new Integer[]{3, 3, null, 4, 2}).build());
        assertEquals(3, result);
    }

    @Test
    void example3() {
        int result = solution.goodNodes(new BinaryTreeBuilder(new Integer[]{1}).build());
        assertEquals(1, result);
    }
}
