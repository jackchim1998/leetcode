package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestSubstringWithoutRepeatingCharactersTest {
    private final LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void example1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void example2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void example3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void example4() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}
