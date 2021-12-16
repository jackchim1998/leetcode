package medium;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumHeightTreesTest {
    private final MinimumHeightTrees solution = new MinimumHeightTrees();

    @Test
    void example1() {
        List<Integer> result = new ArrayList<>(solution.findMinHeightTrees(4, new int[][]{
                {1, 0},
                {1, 2},
                {1, 3}
        }));
        result.sort(Integer::compare);
        assertEquals(List.of(1), result);
    }

    @Test
    void example2() {
        List<Integer> result = new ArrayList<>(solution.findMinHeightTrees(6, new int[][]{
                {3, 0},
                {3, 1},
                {3, 2},
                {3, 4},
                {4, 5}
        }));
        result.sort(Integer::compare);
        assertEquals(List.of(3, 4), result);
    }

    @Test
    void example3() {
        List<Integer> result = new ArrayList<>(solution.findMinHeightTrees(1, new int[][]{}));
        result.sort(Integer::compare);
        assertEquals(List.of(0), result);
    }

    @Test
    void example4() {
        List<Integer> result = new ArrayList<>(solution.findMinHeightTrees(2, new int[][]{{0, 1}}));
        result.sort(Integer::compare);
        assertEquals(List.of(0, 1), result);
    }
}