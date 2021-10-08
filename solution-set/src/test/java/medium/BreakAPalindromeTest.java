package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakAPalindromeTest {
    private final BreakAPalindrome solution = new BreakAPalindrome();

    @Test
    void example1() {
        String result = solution.breakPalindrome("abccba");
        assertEquals("aaccba", result);
    }

    @Test
    void example2() {
        String result = solution.breakPalindrome("a");
        assertEquals("", result);
    }

    @Test
    void example3() {
        String result = solution.breakPalindrome("aa");
        assertEquals("ab", result);
    }

    @Test
    void example4() {
        String result = solution.breakPalindrome("aba");
        assertEquals("abb", result);
    }
}