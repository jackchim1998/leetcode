package medium;

import medium.PalindromicStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PalindromicStringsTest {
    private final PalindromicStrings solution = new PalindromicStrings();

    @Test
    void example1() {
        assertEquals(6, solution.countSubstrings("aaa"));
    }

    @Test
    void example2() {
        assertEquals(0, solution.countSubstrings(""));
    }

    @Test
    void example3() {
        assertEquals(3, solution.countSubstrings("abc"));
    }
}
