package easy;

import common.LinkedListBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertBinaryNumberInALinkedListToIntegerTest {
    private final ConvertBinaryNumberInALinkedListToInteger solution = new ConvertBinaryNumberInALinkedListToInteger();

    @Test
    void example1() {
        int result = solution.getDecimalValue(new LinkedListBuilder(new int[]{1, 0, 1}).build());
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.getDecimalValue(new LinkedListBuilder(new int[]{0}).build());
        assertEquals(0, result);
    }

    @Test
    void example3() {
        int result = solution.getDecimalValue(new LinkedListBuilder(new int[]{1}).build());
        assertEquals(1, result);
    }

    @Test
    void example4() {
        int result = solution.getDecimalValue(new LinkedListBuilder(new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}).build());
        assertEquals(18880, result);
    }

    @Test
    void example5() {
        int result = solution.getDecimalValue(new LinkedListBuilder(new int[]{0, 0}).build());
        assertEquals(0, result);
    }
}