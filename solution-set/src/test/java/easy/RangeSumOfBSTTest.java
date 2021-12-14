package easy;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeSumOfBSTTest {
    private final RangeSumOfBST solution = new RangeSumOfBST();

    @Test
    void example1() {
        int result = solution.rangeSumBST(new BinaryTreeBuilder(new Integer[]{10, 5, 15, 3, 7, null, 18}).build(), 7, 15);
        assertEquals(32, result);
    }

    @Test
    void example2() {
        int result = solution.rangeSumBST(new BinaryTreeBuilder(new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6}).build(), 6, 10);
        assertEquals(23, result);
    }

}