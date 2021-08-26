package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class MergeIntervalsTest {
    private final MergeIntervals solution = new MergeIntervals();

    @Test
    void example1() {
        int[][] input = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] expected = {
                {1, 6},
                {8, 10},
                {15, 18}
        };
        AssertUtil.assertEquals(expected, solution.merge(input));
    }

    @Test
    void example2() {
        int[][] input = {
                {1, 4},
                {4, 5}
        };
        int[][] expected = {
                {1, 5}
        };
        AssertUtil.assertEquals(expected, solution.merge(input));
    }
}
