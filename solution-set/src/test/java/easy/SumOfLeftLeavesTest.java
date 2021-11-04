package easy;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfLeftLeavesTest {
    private final SumOfLeftLeaves solution = new SumOfLeftLeaves();

    @Test
    void example1() {
        int result = solution.sumOfLeftLeaves(new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build());
        assertEquals(24, result);
    }

    @Test
    void example2() {
        int result = solution.sumOfLeftLeaves(new BinaryTreeBuilder(new Integer[]{1}).build());
        assertEquals(0, result);
    }
}