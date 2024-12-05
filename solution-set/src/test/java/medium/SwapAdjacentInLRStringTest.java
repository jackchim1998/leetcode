package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapAdjacentInLRStringTest {
    private final SwapAdjacentInLRString solution = new SwapAdjacentInLRString();

    @Test
    void example1() {
        boolean result = solution.canTransform("RXXLRXRXL", "XRLXXRRLX");
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.canTransform("X", "L");
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.canTransform("LLR", "RRL");
        assertFalse(result);
    }

    @Test
    void example4() {
        boolean result = solution.canTransform("RXR", "XXR");
        assertFalse(result);
    }

}