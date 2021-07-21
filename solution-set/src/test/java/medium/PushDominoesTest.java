package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PushDominoesTest {
    private final PushDominoes solution = new PushDominoes();

    @Test
    void example1() {
        String result = solution.pushDominoes("RR.L");
        assertEquals("RR.L", result);
    }

    @Test
    void example2() {
        String result = solution.pushDominoes(".L.R...LR..L..");
        assertEquals("LL.RR.LLRRLL..", result);
    }

    @Test
    void example3() {
        String result = solution.pushDominoes(".L.R.");
        assertEquals("LL.RR", result);
    }

    @Test
    void example4() {
        String result = solution.pushDominoes(".");
        assertEquals(".", result);
    }
}
