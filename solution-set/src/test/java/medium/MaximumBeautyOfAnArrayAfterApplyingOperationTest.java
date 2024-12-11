package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumBeautyOfAnArrayAfterApplyingOperationTest {
    private final MaximumBeautyOfAnArrayAfterApplyingOperation solution = new MaximumBeautyOfAnArrayAfterApplyingOperation();

    @Test
    void example1() {
        int result = solution.maximumBeauty(new int[]{4, 6, 1, 2}, 2);
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.maximumBeauty(new int[]{1, 1, 1, 1}, 10);
        assertEquals(4, result);
    }

    @Test
    void example3() {
        int result = solution.maximumBeauty(new int[]{49,26}, 12);
        assertEquals(2, result);
    }


}