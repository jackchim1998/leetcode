package medium;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AllPathsFromSourceToTargetTest {
    private final AllPathsFromSourceToTarget solution = new AllPathsFromSourceToTarget();

    @Test
    void example1() {
        List<List<Integer>> result = solution.allPathsSourceTarget(new int[][]{
                {1, 2},
                {3},
                {3},
                {}
        });
        int[][] expected = {
                {0, 1, 3},
                {0, 2, 3}
        };
        assertEquals(expected, result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.allPathsSourceTarget(new int[][]{
                {4, 3, 1},
                {3, 2, 4},
                {3},
                {4},
                {}
        });
        int[][] expected = {
                {0, 4},
                {0, 3, 4},
                {0, 1, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 4}
        };
        assertEquals(expected, result);
    }

    @Test
    void example3() {
        List<List<Integer>> result = solution.allPathsSourceTarget(new int[][]{
                {1},
                {}
        });
        int[][] expected = {
                {0, 1},
        };
        assertEquals(expected, result);
    }

    @Test
    void example4() {
        List<List<Integer>> result = solution.allPathsSourceTarget(new int[][]{
                {1, 2, 3},
                {2},
                {3},
                {}
        });
        int[][] expected = {
                {0, 1, 2, 3},
                {0, 2, 3},
                {0, 3}
        };
        assertEquals(expected, result);
    }

    @Test
    void example5() {
        List<List<Integer>> result = solution.allPathsSourceTarget(new int[][]{
                {1, 3},
                {2},
                {3},
                {}
        });
        int[][] expected = {
                {0, 1, 2, 3},
                {0, 3}
        };
        assertEquals(expected, result);
    }

    private void assertEquals(int[][] expected, List<List<Integer>> result) {
        Assertions.assertEquals(expected.length, result.size());
        for (int i = 0; i < expected.length; i++)
            assertArrayEquals(expected[i], result.get(i).stream().mapToInt(x -> x).toArray());
    }
}