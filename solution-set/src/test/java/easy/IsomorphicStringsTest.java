package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class IsomorphicStringsTest {
    private final IsomorphicStrings solution = new IsomorphicStrings();

    @Test
    void example1() {
        boolean result = solution.isIsomorphic("egg", "add");
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.isIsomorphic("foo", "bar");
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.isIsomorphic("paper", "title");
        assertTrue(result);
    }

    @Test
    void example4() {
        boolean result = solution.isIsomorphic("badc", "baba");
        assertFalse(result);
    }
}
