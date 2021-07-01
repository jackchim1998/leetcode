package easy;

import easy.NonDecreasingArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class NonDecreasingArrayTest {
    private final NonDecreasingArray solution = new NonDecreasingArray();

    @Test
    void example1() {
        assertTrue(solution.checkPossibility(new int[]{4, 2, 3}));
    }

    @Test
    void example2() {
        assertFalse(solution.checkPossibility(new int[]{4, 2, 1}));
    }

    @Test
    void example3() {
        assertFalse(solution.checkPossibility(new int[]{3, 4, 2, 3}));
    }

    @Test
    void example4() {
        assertFalse(solution.checkPossibility(new int[]{1, 5, 4, 6, 7, 10, 8, 9}));
    }

    @Test
    void example5() {
        assertTrue(solution.checkPossibility(new int[]{-1, 4, 2, 3}));
    }

    @Test
    void example6() {
        assertTrue(solution.checkPossibility(new int[]{5,7,1,8}));
    }
}
