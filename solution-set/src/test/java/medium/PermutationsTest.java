package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class PermutationsTest {
    private final Permutations solution = new Permutations();

    @Test
    void example1() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        AssertUtil.assertEqualsIgnoreOrders(expected, result);
    }
}
