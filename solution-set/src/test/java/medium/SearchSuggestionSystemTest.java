package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class SearchSuggestionSystemTest {
    private final SearchSuggestionSystem solution = new SearchSuggestionSystem();

    @Test
    void example1() {
        List<List<String>> result = solution.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse");
        assertEquals(5, result.size());
        assertArrayEquals(new String[]{"mobile", "moneypot", "monitor"}, result.get(0).toArray());
        assertArrayEquals(new String[]{"mobile", "moneypot", "monitor"}, result.get(1).toArray());
        assertArrayEquals(new String[]{"mouse", "mousepad"}, result.get(2).toArray());
        assertArrayEquals(new String[]{"mouse", "mousepad"}, result.get(3).toArray());
        assertArrayEquals(new String[]{"mouse", "mousepad"}, result.get(4).toArray());
    }

}
