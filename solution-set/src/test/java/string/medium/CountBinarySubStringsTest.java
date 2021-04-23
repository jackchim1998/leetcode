package string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jack
 */
class CountBinarySubStringsTest {
    private final CountBinarySubStrings solution = new CountBinarySubStrings();
    @Test
    void example1() {
        assertEquals(6, solution.countBinarySubstrings("00110011"));
    }

    @Test
    void example2() {
        assertEquals(3, solution.countBinarySubstrings("00110"));
    }
    @Test
    void example3() {
        assertEquals(4, solution.countBinarySubstrings("10101"));
    }
}
