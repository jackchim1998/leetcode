package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    private final CombinationSum solution = new CombinationSum();

    @Test
    void example1() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        AssertUtil.assertEquals(List.of(
                List.of(2, 2, 3),
                List.of(7)
        ), result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 5}, 8);
        AssertUtil.assertEquals(List.of(
                List.of(2, 2, 2, 2),
                List.of(2, 3, 3),
                List.of(3, 5)
        ), result);
    }

    @Test
    void example3() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2}, 1);
        AssertUtil.assertEquals(List.of(
        ), result);
    }
}