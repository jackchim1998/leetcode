package easy;

import easy.MaximumUnitsOnATruck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumUnitsOnATruckTest {
    private final MaximumUnitsOnATruck solution = new MaximumUnitsOnATruck();

    @Test
    void example1() {
        assertEquals(91, solution.maximumUnits(new int[][]{
                {5, 10},
                {2, 5},
                {4, 7},
                {3, 9}
        }, 10));
    }
}
