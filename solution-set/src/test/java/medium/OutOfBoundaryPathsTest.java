package medium;

import medium.OutOfBoundaryPaths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class OutOfBoundaryPathsTest {
    private final OutOfBoundaryPaths solution = new OutOfBoundaryPaths();

    @Test
    void example1() {
        assertEquals(12, solution.findPaths(1, 3, 3, 0, 1));
    }
}
