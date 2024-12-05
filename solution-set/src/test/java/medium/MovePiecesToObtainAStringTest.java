package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovePiecesToObtainAStringTest {
    private final MovePiecesToObtainAString solution = new MovePiecesToObtainAString();

    @Test
    void example1() {
        boolean result = solution.canChange("_L__R__R_", "L______RR");
        assertTrue(result);
    }
    @Test
    void example2() {
        boolean result = solution.canChange("R_L_", "__LR");
        assertFalse(result);
    }
    @Test
    void example3() {
        boolean result = solution.canChange("_R", "R_");
        assertFalse(result);
    }

}