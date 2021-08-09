package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class AddStringsTest {
    private final AddStrings solution = new AddStrings();

    @Test
    void example1() {
        String result = solution.addStrings("11", "123");
        assertEquals("134", result);
    }

    @Test
    void example2() {
        String result = solution.addStrings("456", "77");
        assertEquals("533", result);
    }

    @Test
    void example3() {
        String result = solution.addStrings("0", "0");
        assertEquals("0", result);
    }

    @Test
    void example4() {
        String result = solution.addStrings("9", "99");
        assertEquals("108", result);
    }
}
