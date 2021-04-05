package math.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GlobalAndLocalInversionsTest {
    private final GlobalAndLocalInversions solution = new GlobalAndLocalInversions();

    @Test
    void example1() {
        assertTrue(solution.isIdealPermutation(new int[]{1, 0, 2}));
    }

    @Test
    void example2() {
        assertFalse(solution.isIdealPermutation(new int[]{1, 2, 0}));
    }

    @Test
    void example3() {
        assertFalse(solution.isIdealPermutation(new int[]{2, 0, 1, 3}));
    }
}