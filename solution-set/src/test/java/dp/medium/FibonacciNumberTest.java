package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class FibonacciNumberTest {
    private final FibonacciNumber solution = new FibonacciNumber();

    @Test
    void example1() {
        assertEquals(3, solution.fib(4));
    }

}
