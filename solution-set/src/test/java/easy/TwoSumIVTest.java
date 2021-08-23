package easy;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class TwoSumIVTest {
    private final TwoSumIV solution = new TwoSumIV();

    @Test
    void example1() {
        boolean result = solution.findTarget(new BinaryTreeBuilder(new Integer[]{5, 3, 6, 2, 4, null, 7}).build(), 9);
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.findTarget(new BinaryTreeBuilder(new Integer[]{5, 3, 6, 2, 4, null, 7}).build(), 28);
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.findTarget(new BinaryTreeBuilder(new Integer[]{2, 1, 3}).build(), 4);
        assertTrue(result);
    }

    @Test
    void example4() {
        boolean result = solution.findTarget(new BinaryTreeBuilder(new Integer[]{2, 1, 3}).build(), 1);
        assertFalse(result);
    }

    @Test
    void example5() {
        boolean result = solution.findTarget(new BinaryTreeBuilder(new Integer[]{2, 1, 3}).build(), 3);
        assertTrue(result);
    }
}
