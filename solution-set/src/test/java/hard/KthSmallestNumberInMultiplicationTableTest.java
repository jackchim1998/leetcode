package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSmallestNumberInMultiplicationTableTest {
    private final KthSmallestNumberInMultiplicationTable solution = new KthSmallestNumberInMultiplicationTable();

    @Test
    void example1() {
        int result = solution.findKthNumber(3, 3, 5);
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.findKthNumber(2, 3, 6);
        assertEquals(6, result);
    }

}