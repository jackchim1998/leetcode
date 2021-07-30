package medium;

import common.AssertUtil;
import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class BinaryTreeZigzagLevelOrderTraversalTest {
    private final BinaryTreeZigzagLevelOrderTraversal solution = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    void bfsZigzagLevelOrderExample1() {
        List<List<Integer>> result = solution.bfsZigzagLevelOrder(new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build());
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15, 7)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void bfsZigzagLevelOrderExample2() {
        List<List<Integer>> result = solution.bfsZigzagLevelOrder(new BinaryTreeBuilder(new Integer[]{1}).build());
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void bfsZigzagLevelOrderExample3() {
        List<List<Integer>> result = solution.bfsZigzagLevelOrder(new BinaryTreeBuilder(new Integer[]{}).build());
        List<List<Integer>> expected = List.of();
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void dfsZigzagLevelOrderExample1() {
        List<List<Integer>> result = solution.dfsZigzagLevelOrder(new BinaryTreeBuilder(new Integer[]{3, 9, 20, null, null, 15, 7}).build());
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15, 7)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void dfsZigzagLevelOrderExample2() {
        List<List<Integer>> result = solution.dfsZigzagLevelOrder(new BinaryTreeBuilder(new Integer[]{1}).build());
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void dfsZigzagLevelOrderExample3() {
        List<List<Integer>> result = solution.dfsZigzagLevelOrder(new BinaryTreeBuilder(new Integer[]{}).build());
        List<List<Integer>> expected = List.of();
        AssertUtil.assertEquals(expected, result);
    }

}
