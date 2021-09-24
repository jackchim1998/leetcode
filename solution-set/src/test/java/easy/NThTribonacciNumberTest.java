package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NThTribonacciNumberTest {
    private final NThTribonacciNumber solution = new NThTribonacciNumber();

    @Test
    void example1() {
        int result = solution.tribonacci(4);
        assertEquals(4, result);
    }

    @Test
    void example2() {
        int result = solution.tribonacci(25);
        assertEquals(1389537, result);
    }
}