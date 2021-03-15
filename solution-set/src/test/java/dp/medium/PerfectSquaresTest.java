package dp.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jack
 */
class PerfectSquaresTest {
    private final PerfectSquares solution = new PerfectSquares();

    @Test
    void example1() {
        assertEquals(3, solution.numSquares(12));
    }

    @Test
    void example2() {
        assertEquals(2, solution.numSquares(13));
    }

    @Test
    void example3() {
        assertEquals(3, solution.numSquares(11));
    }
}
