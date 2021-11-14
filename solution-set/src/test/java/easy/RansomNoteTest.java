package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RansomNoteTest {
    private final RansomNote solution = new RansomNote();

    @Test
    void example1() {
        boolean result = solution.canConstruct("a", "b");
        assertFalse(result);
    }

    @Test
    void example2() {
        boolean result = solution.canConstruct("aa", "ab");
        assertFalse(result);
    }
    @Test
    void example3() {
        boolean result = solution.canConstruct("aa", "aab");
        assertTrue(result);
    }
}