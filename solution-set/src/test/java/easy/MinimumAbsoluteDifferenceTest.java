package easy;

import common.AssertUtil;
import java.util.List;
import org.junit.jupiter.api.Test;

class MinimumAbsoluteDifferenceTest {
    private final MinimumAbsoluteDifference solution = new MinimumAbsoluteDifference();

    @Test
    void example1() {
        List<List<Integer>> result = solution.minimumAbsDifference(new int[]{4, 2, 1, 3});
        List<List<Integer>> expected = List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(3, 4)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.minimumAbsDifference(new int[]{1, 3, 6, 10, 15});
        List<List<Integer>> expected = List.of(
                List.of(1, 3)
        );
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example3() {
        List<List<Integer>> result = solution.minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27});
        List<List<Integer>> expected = List.of(
                List.of(-14, -10),
                List.of(19, 23),
                List.of(23, 27)
        );
        AssertUtil.assertEquals(expected, result);
    }

}