package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOperationsToConvertNumberTest {
    private final MinimumOperationsToConvertNumber solution = new MinimumOperationsToConvertNumber();

    @Test
    void example1() {
        int result = solution.minimumOperations(new int[]{2, 4, 12}, 2, 12);
        assertEquals(2, result);
    }
    @Test
    void example2() {
        int result = solution.minimumOperations(new int[]{3,5,7}, 0, -4);
        assertEquals(2, result);
    }
    @Test
    void example3() {
        int result = solution.minimumOperations(new int[]{2,8,16}, 0, 1);
        assertEquals(-1, result);
    }

}