package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class SwimInRisingWaterTest {
    private final SwimInRisingWater solution = new SwimInRisingWater();

    @Test
    void example1() {
        int result = solution.swimInWater(new int[][]{
                {0, 2},
                {1, 3}
        });
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.swimInWater(new int[][]{
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        });
        assertEquals(16, result);
    }

    @Test
    void isPassed() {
        boolean passed = solution.isPassed(new int[][]{
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        }, 16);
        assertTrue(passed);
    }
}
