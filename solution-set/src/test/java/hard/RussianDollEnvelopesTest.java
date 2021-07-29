package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class RussianDollEnvelopesTest {
    private final RussianDollEnvelopes solution = new RussianDollEnvelopes();

    @Test
    void example1() {
        assertEquals(3, solution.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
    }

    @Test
    void example2() {
        assertEquals(4, solution.maxEnvelopes(new int[][]{{17, 18}, {20, 4}, {4, 3}, {14, 6}, {16, 4}, {8, 11}, {17, 11}, {18, 7}, {20, 12}}));
    }
}
