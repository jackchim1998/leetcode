package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BinaryTreeWithFactorsTest {
    private final BinaryTreeWithFactors solution = new BinaryTreeWithFactors();

    @Test
    void example1() {
        assertEquals(3, solution.numFactoredBinaryTrees(new int[]{2, 4}));
    }

    @Test
    void example2() {
        assertEquals(7, solution.numFactoredBinaryTrees(new int[]{2, 4, 5, 10}));
    }

    @Test
    void example3() {
        assertEquals(777, solution.numFactoredBinaryTrees(new int[]{45, 42, 2, 18, 23, 1170, 12, 41, 40, 9, 47, 24, 33, 28, 10, 32, 29, 17, 46, 11, 759, 37, 6, 26, 21, 49, 31, 14, 19, 8, 13, 7, 27, 22, 3, 36, 34, 38, 39, 30, 43, 15, 4, 16, 35, 25, 20, 44, 5, 48}));
    }

    @Test
    void example4() {
        assertEquals(22, solution.numFactoredBinaryTrees(new int[]{2, 5, 10, 11, 55, 110}));
    }
}
