package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class ArrayOfDoubledPairsTest {
    private final ArrayOfDoubledPairs solution = new ArrayOfDoubledPairs();

    @Test
    void example1() {
        boolean result = solution.canReorderDoubled(new int[]{3, 1, 3, 6});
        assertFalse(result);
    }

    @Test
    void example2() {
        boolean result = solution.canReorderDoubled(new int[]{2, 1, 2, 6});
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.canReorderDoubled(new int[]{4, -2, 2, -4});
        assertTrue(result);
    }

    @Test
    void example4() {
        boolean result = solution.canReorderDoubled(new int[]{1, 2, 4, 16, 8, 4});
        assertFalse(result);
    }

    @Test
    void example5() {
        boolean result = solution.canReorderDoubled(new int[]{2, 1, 1, 4, 8, 8});
        assertFalse(result);
    }

    @Test
    void example6() {
        boolean result = solution.canReorderDoubled(new int[]{1, 2, 4, 8});
        assertTrue(result);
    }

    @Test
    void example7() {
        boolean result = solution.canReorderDoubled(new int[]{-1, 4, 6, 8, -4, 6, -6, 3, -2, 3, -3, -8});
        assertTrue(result);
    }
}
