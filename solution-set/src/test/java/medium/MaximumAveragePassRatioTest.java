package medium;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAveragePassRatioTest {
    private final MaximumAveragePassRatio solution = new MaximumAveragePassRatio();

    @Test
    void example1() {
        double result = solution.maxAverageRatio(new int[][]{
                new int[]{1, 2},
                new int[]{3, 5},
                new int[]{2, 2}
        }, 2);
        assertEquals(0.78333, new BigDecimal(result).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }

    @Test
    void example2() {
        double result = solution.maxAverageRatio(new int[][]{
                new int[]{2,4},
                new int[]{3,9},
                new int[]{4, 5},
                new int[]{2, 10}
        }, 4);
        assertEquals(0.53485, new BigDecimal(result).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }
}