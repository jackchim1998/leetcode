package medium;

import common.AssertUtil;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class KClosestPointsToOriginTest {
    private final KClosestPointsToOrigin solution = new KClosestPointsToOrigin();

    @Test
    void example1() {
        int[][] result = solution.kClosest(new int[][]{
                {1, 3},
                {-2, 2}
        }, 1);
        int[][] expected = new int[][]{{-2, 2}};
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example2() {
        int[][] result = solution.kClosest(new int[][]{
                {3, 3},
                {5, -1},
                {-2, 4}
        }, 2);
        Arrays.sort(result, Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1]));
        int[][] expected = new int[][]{{-2, 4}, {3, 3}};
        AssertUtil.assertEquals(expected, result);
    }
}