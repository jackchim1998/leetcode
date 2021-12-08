package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    private final SingleNumber solution = new SingleNumber();

    @Test
    void example1() {
        int result = solution.singleNumber(new int[]{2, 2, 1});
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, result);
    }

    @Test
    void example3() {
        int result = solution.singleNumber(new int[]{1});
        assertEquals(1, result);
    }
}
