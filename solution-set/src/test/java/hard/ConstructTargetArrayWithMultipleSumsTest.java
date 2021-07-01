package hard;

import hard.ConstructTargetArrayWithMultipleSums;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class ConstructTargetArrayWithMultipleSumsTest {
    private final ConstructTargetArrayWithMultipleSums solution = new ConstructTargetArrayWithMultipleSums();

    @Test
    void example1() {
        assertTrue(solution.isPossible(new int[]{9, 3, 5}));
    }

    @Test
    void example2() {
        assertFalse(solution.isPossible(new int[]{1, 1, 1, 2}));
    }

    @Test
    void example3() {
        assertTrue(solution.isPossible(new int[]{8, 5}));
    }
}
