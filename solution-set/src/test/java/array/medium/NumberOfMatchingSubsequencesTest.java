package array.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class NumberOfMatchingSubsequencesTest {
    private final NumberOfMatchingSubsequences solution = new NumberOfMatchingSubsequences();

    @Test
    void example1() {
        assertEquals(2, solution.numMatchingSubseq("dsahjpjauf", new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }
}
