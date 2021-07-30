package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class KthSmallestElementInABSTTest {
    private final KthSmallestElementInABST solution = new KthSmallestElementInABST();

    @Test
    void example1() {
        int result = solution.kthSmallest(new BinaryTreeBuilder(new Integer[]{3, 1, 4, null, 2}).build(), 1);
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.kthSmallest(new BinaryTreeBuilder(new Integer[]{5, 3, 6, 2, 4, null, null, 1}).build(), 3);
        assertEquals(3, result);
    }

}
