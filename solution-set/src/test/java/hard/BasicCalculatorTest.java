package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {
    private final BasicCalculator solution = new BasicCalculator();

    @Test
    void example1() {
        int result = solution.calculate("1 + 1");
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.calculate("2 - 1 + 2");
        assertEquals(3, result);
    }

    @Test
    void example3() {
        int result = solution.calculate("(1+(4+5+2)-3)+(6+8)");
        assertEquals(23, result);
    }

    @Test
    void example4() {
        int result = solution.calculate("2147483647");
        assertEquals(2147483647, result);
    }

    @Test
    void example5() {
        int result = solution.calculate("(6)-(8)-(7)+(1+(6))");
        assertEquals(-2, result);
    }
}