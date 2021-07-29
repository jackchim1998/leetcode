package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class SlidingPuzzleTest {
    private final SlidingPuzzle solution = new SlidingPuzzle();

    @Test
    void example1() {
        assertEquals(1, solution.slidingPuzzle(new int[][]{{1, 2, 3}, {4, 0, 5}}));
    }

}
