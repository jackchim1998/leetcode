package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyStringsTest {
    private final MultiplyStrings solution = new MultiplyStrings();

    @Test
    void example1() {
        String result = solution.multiply("2", "3");
        assertEquals("6", result);
    }

    @Test
    void example2() {
        String result = solution.multiply("123", "456");
        assertEquals("56088", result);
    }

    @Test
    void example3() {
        String result = solution.multiply("9", "99");
        assertEquals("891", result);
    }

}