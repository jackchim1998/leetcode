package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionTest {
    private final ZigzagConversion solution = new ZigzagConversion();

    @Test
    void example1() {
        String result = solution.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void example2() {
        String result = solution.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void example3() {
        String result = solution.convert("A", 1);
        assertEquals("A", result);
    }

    @Test
    void example4() {
        String result = solution.convert("AB", 1);
        assertEquals("AB", result);
    }

}