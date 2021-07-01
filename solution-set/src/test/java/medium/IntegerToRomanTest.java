package medium;

import medium.IntegerToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class IntegerToRomanTest {
    private final IntegerToRoman solution = new IntegerToRoman();

    @Test
    void example1() {
        assertEquals("IV", solution.intToRoman(4));
    }

    @Test
    void example2() {
        assertEquals("IX", solution.intToRoman(9));
    }

    @Test
    void example3() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void example4() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}
