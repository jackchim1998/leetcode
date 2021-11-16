package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPeakElementTest {
    private final FindPeakElement solution = new FindPeakElement();

    @Test
    void example1() {
        int result = solution.findPeakElement(new int[]{1, 2, 3, 1});
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        assertEquals(5, result);
    }
}