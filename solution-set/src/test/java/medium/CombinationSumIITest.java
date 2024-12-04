package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIITest {
    private final CombinationSumII solution = new CombinationSumII();

    @Test
    void example1() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        AssertUtil.assertEquals(List.of(
                List.of(1,1,6),
                List.of(1,2,5),
                List.of(1,7),
                List.of(2,6)
        ), result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{2,5,2,1,2}, 5);
        AssertUtil.assertEquals(List.of(
                List.of(1,2,2),
                List.of(5)
        ), result);
    }

}