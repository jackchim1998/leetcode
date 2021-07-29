package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumErasureValueTest {
    private final MaximumErasureValue solution = new MaximumErasureValue();

    @Test
    void example1() {
        assertEquals(17, solution.maximumUniqueSubarray(new int[]{4, 2, 4, 5, 6}));
    }

}
