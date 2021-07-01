package medium;

import medium.MaximumProductOfWordLengths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumProductOfWordLengthsTest {
    private final MaximumProductOfWordLengths solution = new MaximumProductOfWordLengths();

    @Test
    void example1() {
        assertEquals(16, solution.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
    }
}
