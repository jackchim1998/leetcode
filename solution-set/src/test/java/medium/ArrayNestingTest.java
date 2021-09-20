package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayNestingTest {
    private final ArrayNesting solution = new ArrayNesting();

    @Test
    void example1() {
        int result = solution.arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2});
        assertEquals(4, result);
    }

    @Test
    void example2() {
        int result = solution.arrayNesting(new int[]{0, 1, 2});
        assertEquals(1, result);

    }
}