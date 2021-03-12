package bit.medium;

import bit.medium.CheckIfAStringConatinsAllBinaryCOdesOfSizeK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class CheckIfAStringConatinsAllBinaryCOdesOfSizeKTest {
    private final CheckIfAStringConatinsAllBinaryCOdesOfSizeK solution = new CheckIfAStringConatinsAllBinaryCOdesOfSizeK();

    @Test
    void example1() {
        assertTrue(solution.hasAllCodes("00110110", 2));
    }

    @Test
    void example2() {
        assertTrue(solution.hasAllCodes("00110", 2));
    }

    @Test
    void example3() {
        assertTrue(solution.hasAllCodes("0110", 1));
    }

    @Test
    void example4() {
        assertFalse(solution.hasAllCodes("0110", 2));
    }

    @Test
    void example5() {
        assertFalse(solution.hasAllCodes("0000000001011100", 4));
    }

    @Test
    void example6() {
        assertTrue(solution.hasAllCodes("101000100011111001110010", 3));
    }
}
