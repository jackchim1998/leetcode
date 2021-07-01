package medium;

import common.BinaryTreeBuilder;
import medium.DeepestLeavesSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class DeepestLeavesSumTest {
    private final DeepestLeavesSum solution = new DeepestLeavesSum();

    @Test
    void example1() {
        assertEquals(15, solution.deepestLeavesSum(new BinaryTreeBuilder(new Integer[]{1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, null, null, 8}).build()));
    }

    @Test
    void example2() {
        assertEquals(19, solution.deepestLeavesSum(new BinaryTreeBuilder(new Integer[]{6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5}).build()));
    }

}
