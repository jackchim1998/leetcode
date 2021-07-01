package hard;

import hard.MaximumGap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumGapTest {
    private final MaximumGap solution = new MaximumGap();

    @Test
    void example1() {
        assertEquals(3, solution.maximumGap(new int[]{3, 6, 9, 1}));
    }

}
