package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class SubsetsTest {
    private final Subsets solution = new Subsets();

    @Test
    void example1() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 2, 3});
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1,2),
                List.of(3),
                List.of(1,3),
                List.of(2,3),
                List.of(1,2,3)
        );
        AssertUtil.assertEqualsIgnoreOrders(expected,result);
    }

}
