package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class ThreeSumTest {
    private final ThreeSum solution = new ThreeSum();

    @Test
    void example1() {
        List<List<Integer>> result = this.solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = this.solution.threeSum(new int[]{});
        List<List<Integer>> expected = List.of();
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example3() {
        List<List<Integer>> result = this.solution.threeSum(new int[]{0});
        List<List<Integer>> expected = List.of();
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example4() {
        List<List<Integer>> result = this.solution.threeSum(new int[]{0, 0, 0, 0});
        List<List<Integer>> expected = List.of(List.of(0, 0, 0));
        AssertUtil.assertEquals(expected, result);
    }

}
