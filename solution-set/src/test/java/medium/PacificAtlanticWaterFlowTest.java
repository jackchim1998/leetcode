package medium;

import medium.PacificAtlanticWaterFlow;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Jack
 */
class PacificAtlanticWaterFlowTest {
    private final PacificAtlanticWaterFlow solution = new PacificAtlanticWaterFlow();

    @Test
    void example1() {
        int[][] input = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> result = solution.pacificAtlantic(input);
        validate(new int[][]{
                {0, 4},
                {1, 3},
                {1, 4},
                {2, 2},
                {3, 0},
                {3, 1},
                {4, 0}
        }, result, input.length, input[0].length);
    }

    private void validate(int[][] expected, List<List<Integer>> actual, int m, int n) {
        boolean[][] board = new boolean[m][n];
        for (int[] node : expected) {
            int i = node[0];
            int j = node[1];
            board[i][j] = !board[i][j];
        }
        for (List<Integer> node : actual) {
            int i = node.get(0);
            int j = node.get(1);
            board[i][j] = !board[i][j];
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                assertFalse(board[i][j]);
    }
}
