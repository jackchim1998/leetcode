package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MinimumWindowSubstringTest {
    private final MinimumWindowSubstring solution = new MinimumWindowSubstring();

    @Test
    void example1() {
        String result = solution.minWindow("ADOBECODEBANC", "ABC");
        assertEquals("BANC", result);
    }

    @Test
    void example2() {
        String result = solution.minWindow("a", "a");
        assertEquals("a", result);
    }

    @Test
    void example3() {
        String result = solution.minWindow("a", "aa");
        assertEquals("", result);
    }

    @Test
    void example4() {
        String result = solution.minWindow("ab", "b");
        assertEquals("b", result);
    }

    @Test
    void example5() {
        String result = solution.minWindow("bba", "ab");
        assertEquals("ba", result);
    }
}
