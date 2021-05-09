package math.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class SuperPalindromesTest {
    private final SuperPalindromes solution = new SuperPalindromes();

    @Test
    void example1() {
        assertEquals(4, solution.superpalindromesInRange("4", "1000"));
    }

    @Test
    void example2() {
        assertEquals(1, solution.superpalindromesInRange("1", "2"));
    }

    @Test
    void example3() {
        assertEquals(16, solution.superpalindromesInRange("9357639525", "2353857225354"));
    }

    @Test
    void example4() {
        assertEquals(4, solution.superpalindromesInRange("444", "17017"));
    }
}
