package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorIITest {
    private final BasicCalculatorII solution = new BasicCalculatorII();

    @Test
    void example1() {
        int result = solution.calculate("3+2*2");
        assertEquals(7, result);
    }

    @Test
    void example2() {
        int result = solution.calculate(" 3/2 ");
        assertEquals(1, result);
    }

    @Test
    void example3() {
        int result = solution.calculate(" 3+5 / 2 ");
        assertEquals(5, result);
    }
}