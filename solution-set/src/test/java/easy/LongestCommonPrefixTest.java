package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestCommonPrefixTest {
    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    void example1() {
        String result = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", result);
    }

    @Test
    void example2() {
        String result = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assertEquals("", result);
    }

    @Test
    void example3() {
        String result = solution.longestCommonPrefix(new String[]{"racecar", "dog", "car"});
        assertEquals("", result);
    }
}
