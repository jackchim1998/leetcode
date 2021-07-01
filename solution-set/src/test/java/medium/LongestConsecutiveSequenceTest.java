package medium;

import medium.LongestConsecutiveSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    @Test
    void example1() {
        assertEquals(4, solution.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
