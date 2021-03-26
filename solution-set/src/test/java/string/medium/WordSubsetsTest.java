package string.medium;

import org.junit.jupiter.api.Test;
import string.medium.WordSubsets;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class WordSubsetsTest {
    private final WordSubsets solution = new WordSubsets();

    @Test
    void example1() {
        List<String> result = solution.wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"e", "o"});
        validate(new String[]{"facebook", "google", "leetcode"}, result);
    }

    private void validate(String[] expected, List<String> result) {
        assertEquals(expected.length, result.size());
        for (String expectedString : expected)
            assertTrue(result.contains(expectedString));
    }
}
