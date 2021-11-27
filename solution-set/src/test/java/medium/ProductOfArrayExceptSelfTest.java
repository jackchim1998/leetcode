package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    void productExceptSelfNotUseDivision1() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelfNotUseDivision(new int[]{1, 2, 3, 4}));
    }

    @Test
    void productExceptSelfNotUseDivision2() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelfNotUseDivision(new int[]{-1, 1, 0, -3, 3}));
    }
    @Test
    void productExceptSelfConstantSpaceComplexity1() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelfConstantSpaceComplexity(new int[]{1, 2, 3, 4}));
    }

    @Test
    void productExceptSelfConstantSpaceComplexity2() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelfConstantSpaceComplexity(new int[]{-1, 1, 0, -3, 3}));
    }
}
