package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class SumOfSquareNumbersTest {
    private final SumOfSquareNumbers solution = new SumOfSquareNumbers();

    @Test
    void example7() {
        assertTrue(solution.judgeSquareSum(10000000));
    }

    @Test
    void example6() {
        assertFalse(solution.judgeSquareSum(Integer.MAX_VALUE));
    }

    @Test
    void example5() {
        assertTrue(solution.judgeSquareSum(5));
    }

    @Test
    void example4() {
        assertTrue(solution.judgeSquareSum(4));
    }

    @Test
    void example3() {
        assertFalse(solution.judgeSquareSum(3));
    }

    @Test
    void example2() {
        assertTrue(solution.judgeSquareSum(2));
    }

    @Test
    void example1() {
        assertTrue(solution.judgeSquareSum(1));
    }
}
