package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestStringChainTest {
    private final LongestStringChain solution = new LongestStringChain();

    @Test
    void example1() {
        assertEquals(4, solution.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"}));
    }

}
