package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeStringASubsequenceUsingCyclicIncrementsTest {
    private final MakeStringASubsequenceUsingCyclicIncrements solution = new MakeStringASubsequenceUsingCyclicIncrements();

    @Test
    void example1() {
        boolean result = solution.canMakeSubsequence("abc", "ad");
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.canMakeSubsequence("zc", "ad");
        assertTrue(result);
    }

    @Test
    void example3() {
        boolean result = solution.canMakeSubsequence("ab", "d");
        assertFalse(result);
    }

}