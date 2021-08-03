package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class SubsetsIITest {
    private final SubsetsII solution = new SubsetsII();

    @Test
    void example1() {
        List<List<Integer>> lists = solution.subsetsWithDup(new int[]{1, 2, 2});
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 2),
                List.of(2),
                List.of(2, 2)
        );
        AssertUtil.assertEqualsIgnoreOrders(expected, lists);
    }

    @Test
    void example2() {
        List<List<Integer>> lists = solution.subsetsWithDup(new int[]{0});
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(0)
        );
        AssertUtil.assertEqualsIgnoreOrders(expected, lists);
    }
}
