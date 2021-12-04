package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamCheckerTest {
    @Test
    void example1() {
        StreamChecker checker = new StreamChecker(new String[]{"cd", "f", "kl"});
        assertFalse(checker.query('a'));
        assertFalse(checker.query('b'));
        assertFalse(checker.query('c'));
        assertTrue(checker.query('d'));
        assertFalse(checker.query('e'));
        assertTrue(checker.query('f'));
        assertFalse(checker.query('g'));
        assertFalse(checker.query('h'));
        assertFalse(checker.query('i'));
        assertFalse(checker.query('j'));
        assertFalse(checker.query('k'));
        assertTrue(checker.query('l'));
    }
}