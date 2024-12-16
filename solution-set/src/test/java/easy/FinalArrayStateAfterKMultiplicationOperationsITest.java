package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalArrayStateAfterKMultiplicationOperationsITest {
    private final FinalArrayStateAfterKMultiplicationOperationsI solution = new FinalArrayStateAfterKMultiplicationOperationsI();

    @Test
    void example1PQVersion() {
        int[] result = solution.getFinalStatePQVersion(new int[]{2, 1, 3, 5, 6}, 5, 2);
        assertArrayEquals(new int[]{8, 4, 6, 5, 6}, result);
    }

    @Test
    void example2PQVersion() {
        int[] result = solution.getFinalStatePQVersion(new int[]{1, 2}, 3, 4);
        assertArrayEquals(new int[]{16, 8}, result);
    }

    @Test
    void example1() {
        int[] result = solution.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2);
        assertArrayEquals(new int[]{8, 4, 6, 5, 6}, result);
    }

    @Test
    void example2() {
        int[] result = solution.getFinalState(new int[]{1, 2}, 3, 4);
        assertArrayEquals(new int[]{16, 8}, result);
    }

    @Test
    void example3() {
        int[] result = solution.getFinalState(new int[]{10, 1, 10, 1}, 2, 2);
        assertArrayEquals(new int[]{10, 4, 10, 1}, result);
    }

}