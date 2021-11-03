package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SumRootToLeafNumbersTest {
    private final SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    @Test
    void example1() {
        int result = solution.sumNumbers(new BinaryTreeBuilder(new Integer[]{1, 2, 3}).build());
        assertEquals(25, result);
    }

    @Test
    void example2() {
        int result = solution.sumNumbers(new BinaryTreeBuilder(new Integer[]{4, 9, 0, 5, 1}).build());
        assertEquals(1026, result);
    }

}