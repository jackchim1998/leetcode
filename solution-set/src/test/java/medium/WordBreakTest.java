package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class WordBreakTest {
    private final WordBreak solution = new WordBreak();

    @Test
    void example1() {
        assertTrue(solution.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    void example2() {
        assertTrue(solution.wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    void example3() {
        assertFalse(solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    void example4() {
        assertFalse(solution.wordBreak("aaaaaaa", List.of("aaa", "aaaaa")));
    }
}
