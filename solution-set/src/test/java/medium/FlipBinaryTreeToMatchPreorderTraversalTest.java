package medium;

import common.BinaryTreeBuilder;
import medium.FlipBinaryTreeToMatchPreorderTraversal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class FlipBinaryTreeToMatchPreorderTraversalTest {
    private final FlipBinaryTreeToMatchPreorderTraversal solution = new FlipBinaryTreeToMatchPreorderTraversal();

    @Test
    void example1() {
        List<Integer> results = solution.flipMatchVoyage(new BinaryTreeBuilder(new Integer[]{1, 2}).build(), new int[]{2, 1});
        validateResult(new int[]{-1}, results);
    }

    @Test
    void example2() {
        List<Integer> results = solution.flipMatchVoyage(new BinaryTreeBuilder(new Integer[]{1, 2, 3}).build(), new int[]{1, 3, 2});
        validateResult(new int[]{1}, results);
    }

    @Test
    void example3() {
        List<Integer> results = solution.flipMatchVoyage(new BinaryTreeBuilder(new Integer[]{1, null, 2}).build(), new int[]{1, 2});
        validateResult(new int[]{}, results);
    }

    @Test
    void example4() {
        List<Integer> results = solution.flipMatchVoyage(new BinaryTreeBuilder(new Integer[]{1, 2, 3}).build(), new int[]{1, 2, 3});
        validateResult(new int[]{}, results);
    }

    @Test
    void example5() {
        List<Integer> results = solution.flipMatchVoyage(new BinaryTreeBuilder(new Integer[]{1, 2, null, 3}).build(), new int[]{1, 3, 2});
        validateResult(new int[]{-1}, results);
    }

    @Test
    void example6() {
        List<Integer> results = solution.flipMatchVoyage(new BinaryTreeBuilder(new Integer[]{2, 1, 4, 5, null, 3}).build(), new int[]{2, 4, 3, 1, 5});
        validateResult(new int[]{2}, results);
    }

    private void validateResult(int[] expected, List<Integer> results) {
        assertEquals(expected.length, results.size());
        for (int i = 0; i < results.size(); i++)
            assertEquals(expected[i], results.get(i));
    }

}
