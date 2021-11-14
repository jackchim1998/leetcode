package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void example1() {
        boolean result = solution.isAnagram("anagram", "nagaram");
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.isAnagram("rat", "car");
        assertFalse(result);
    }
}