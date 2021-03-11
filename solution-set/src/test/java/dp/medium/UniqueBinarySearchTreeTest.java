package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class UniqueBinarySearchTreeTest {
    private final UniqueBinarySearchTree solution = new UniqueBinarySearchTree();

    @Test
    void example1() {
        assertEquals(1, solution.numTrees(1));
    }

    @Test
    void example2() {
        assertEquals(2, solution.numTrees(2));
    }

    @Test
    void example3() {
        assertEquals(5, solution.numTrees(3));
    }

    @Test
    void example4() {
        assertEquals(14, solution.numTrees(4));
    }
}
