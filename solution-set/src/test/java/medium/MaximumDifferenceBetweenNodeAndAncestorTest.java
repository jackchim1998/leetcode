package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDifferenceBetweenNodeAndAncestorTest {
    private final MaximumDifferenceBetweenNodeAndAncestor solution = new MaximumDifferenceBetweenNodeAndAncestor();

    @Test
    void example1() {
        int result = solution.maxAncestorDiff(new BinaryTreeBuilder(new Integer[]{8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13}).build());
        assertEquals(7, result);
    }

    @Test
    void example2() {
        int result = solution.maxAncestorDiff(new BinaryTreeBuilder(new Integer[]{1, null, 2, null, 0, 3}).build());
        assertEquals(3, result);
    }
}