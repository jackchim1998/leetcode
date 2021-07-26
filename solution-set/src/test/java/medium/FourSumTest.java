package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class FourSumTest {
    private final FourSum solution = new FourSum();

    @Test
    void example1() {
        List<List<Integer>> result = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-2, -1, 1, 2));
        expected.add(List.of(-2, 0, 0, 2));
        expected.add(List.of(-1, 0, 0, 1));
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.fourSum(new int[]{0, 0, 0}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        AssertUtil.assertEquals(expected, result);
    }

}
