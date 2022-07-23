package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jack
 */
class LargestNumberTest {
    private final LargestNumber solution = new LargestNumber();

    @Test
    void example1() {
        String result = solution.largestNumber(new int[]{10, 2});
        assertEquals("210", result);
    }

    @Test
    void example2() {
        String result = solution.largestNumber(new int[]{3, 30, 34, 5, 9});
        assertEquals("9534330", result);
    }

    @Test
    void example3() {
        String result = solution.largestNumber(new int[]{0,0});
        assertEquals("0", result);
    }

}