package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MinimumOperationsToMakeArrayEqualTest {
    private final MinimumOperationsToMakeArrayEqual solution = new MinimumOperationsToMakeArrayEqual();

    @Test
    void example1() {
        assertEquals(2, solution.minOperations(3));
    }

    @Test
    void example2() {
        assertEquals(9, solution.minOperations(6));
    }

}
