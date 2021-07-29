package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class FindAndReplacePatternTest {
    private final FindAndReplacePattern solution = new FindAndReplacePattern();

    @Test
    void example1() {
        List<String> result = solution.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb");
        validate(new String[]{"mee", "aqq"}, result);
    }

    @Test
    void example2() {
        List<String> result = solution.findAndReplacePattern(new String[]{"aa", "bb", "ab", "cd"}, "aa");
        validate(new String[]{"aa", "bb"}, result);
    }

    private void validate(String[] expectedList, List<String> result) {
        assertEquals(expectedList.length, result.size());
        for (String expected : expectedList)
            assertTrue(result.contains(expected));
    }

}
