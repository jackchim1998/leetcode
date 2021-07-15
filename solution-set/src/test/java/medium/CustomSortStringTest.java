package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CustomSortStringTest {
    private final CustomSortString solution = new CustomSortString();

    @Test
    void example1() {
        String result = solution.customSortString("cba", "abcd");
        assertEquals("cbad", result);
    }
}
