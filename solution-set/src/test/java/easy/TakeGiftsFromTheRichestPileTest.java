package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeGiftsFromTheRichestPileTest {
    private final TakeGiftsFromTheRichestPile solution = new TakeGiftsFromTheRichestPile();

    @Test
    void example1() {
        long result = solution.pickGifts(new int[]{25, 64, 9, 4, 100}, 4);
        assertEquals(29, result);
    }

    @Test
    void example2() {
        long result = solution.pickGifts(new int[]{1, 1, 1, 1}, 4);
        assertEquals(4, result);
    }
}