package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class StampingTheSequenceTest {
    private final StampingTheSequence solution = new StampingTheSequence();

    @Test
    void example1() {
        assertArrayEquals(new int[]{0, 3, 1}, solution.movesToStamp("abca", "aabcaca"));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, solution.movesToStamp("h", "hhhhh"));
    }

}
