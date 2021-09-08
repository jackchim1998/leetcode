package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftingLettersTest {
    private final ShiftingLetters solution = new ShiftingLetters();

    @Test
    void example1() {
        String result = solution.shiftingLetters("abc", new int[]{3, 5, 9});
        assertEquals("rpl", result);
    }

    @Test
    void example2() {
        String result = solution.shiftingLetters("aaa", new int[]{1, 2, 3});
        assertEquals("gfd", result);
    }
}