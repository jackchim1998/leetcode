package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    void example1() {
        assertEquals("bab", solution.longestPalindrome("babad"));
    }

    @Test
    void example2() {
        assertEquals("aaaa", solution.longestPalindrome("aaaa"));
    }

}
