package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

class IntervalListIntersectionsTest {
    private final IntervalListIntersections solution = new IntervalListIntersections();

    @Test
    void example1() {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] expected = {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        int[][] result = solution.intervalIntersection(firstList, secondList);
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example2() {
        int[][] firstList = {{1, 3}, {5, 9}};
        int[][] secondList = {};
        int[][] expected = {};
        int[][] result = solution.intervalIntersection(firstList, secondList);
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example3() {
        int[][] firstList = {};
        int[][] secondList = {{4, 8}, {10, 12}};
        int[][] expected = {};
        int[][] result = solution.intervalIntersection(firstList, secondList);
        AssertUtil.assertEquals(expected, result);
    }

    @Test
    void example4() {
        int[][] firstList = {{1, 7}};
        int[][] secondList = {{3, 10}};
        int[][] expected = {{3, 7}};
        int[][] result = solution.intervalIntersection(firstList, secondList);
        AssertUtil.assertEquals(expected, result);
    }

}