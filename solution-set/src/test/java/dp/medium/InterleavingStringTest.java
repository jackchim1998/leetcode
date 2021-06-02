package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class InterleavingStringTest {
    private final InterleavingString solution = new InterleavingString();

    @Test
    void example1() {
        assertTrue(solution.isInterleave("", "", ""));
    }

    @Test
    void example2() {
        assertTrue(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
}
