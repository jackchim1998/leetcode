package medium;

import common.AssertUtil;
import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class PathSumIITest {
    private final PathSumII solution = new PathSumII();

    @Test
    void example1() {
        List<List<Integer>> result = solution.pathSum(new BinaryTreeBuilder(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1}).build(), 22);
        List<List<Integer>> expected = List.of(
                List.of(5, 4, 11, 2),
                List.of(5, 8, 4, 5)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.pathSum(new BinaryTreeBuilder(new Integer[]{1, 2}).build(), 1);
        List<List<Integer>> expected = List.of();
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example3() {
        List<List<Integer>> result = solution.pathSum(new BinaryTreeBuilder(new Integer[]{1, -2, -3, 1, 3, -2, null, -1}).build(), -1);
        List<List<Integer>> expected = List.of(
                List.of(1, -2, 1, -1)
        );
        AssertUtil.assertEquals(expected, result);
    }
}
