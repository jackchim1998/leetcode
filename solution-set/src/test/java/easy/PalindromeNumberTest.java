package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {
    private final PalindromeNumber solution = new PalindromeNumber();

    @Test
    void example1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void example2() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void example3() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void example4() {
        assertFalse(solution.isPalindrome(-101));
    }

}