package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class IncreasingTripletSubsequenceTest {
    private final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

    @Test
    void example1() {
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void example2() {
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void example3() {
        assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}
