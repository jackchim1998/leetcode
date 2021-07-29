package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCutsTest {
    private final MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts solution = new MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts();

    @Test
    void example1() {
        assertEquals(4, solution.maxArea(5, 4, new int[]{1, 2, 4}, new int[]{1, 3}));
    }

    @Test
    void example2() {
        assertEquals(6, solution.maxArea(5, 4, new int[]{3, 1}, new int[]{1}));
    }

    @Test
    void example3() {
        assertEquals(9, solution.maxArea(5, 4, new int[]{3}, new int[]{3}));
    }

}
