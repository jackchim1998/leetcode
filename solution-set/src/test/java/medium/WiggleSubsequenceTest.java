package medium;

import medium.WiggleSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class WiggleSubsequenceTest {
    private final WiggleSubsequence solution = new WiggleSubsequence();

    @Test
    void example1() {
        assertEquals(6, solution.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
    }

    @Test
    void example2() {
        assertEquals(7, solution.wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8}));
    }

    @Test
    void example3() {
        assertEquals(2, solution.wiggleMaxLength(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
