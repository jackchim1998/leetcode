package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * q.417
 * note:
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 */
public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return List.of();
        int n = matrix[0].length;
        if (n == 0) return List.of();
        boolean[][] pacific = board(matrix, m, n, true);
        boolean[][] atlantic = board(matrix, m, n, false);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pacific[i][j] && atlantic[i][j])
                    result.add(List.of(i, j));
        return result;
    }

    private boolean[][] board(int[][] matrix, int m, int n, boolean zeroStart) {
        boolean[][] board = new boolean[m][n];
        int x = zeroStart ? 0 : m - 1;
        int y = zeroStart ? 0 : n - 1;
        for (int i = 0; i < n; i++)
            flood(board, x, i, m, n, matrix[x][i], matrix);
        for (int i = 0; i < m; i++)
            flood(board, i, y, m, n, matrix[i][y], matrix);
        return board;
    }

    private void flood(boolean[][] board, int i, int j, int m, int n, int prev, int[][] matrix) {
        if (i < 0 || j < 0 || i >= m || j >= n) return;
        if (board[i][j]) return;
        if (matrix[i][j] < prev) return;
        board[i][j] = true;
        flood(board, i + 1, j, m, n, matrix[i][j], matrix);
        flood(board, i, j + 1, m, n, matrix[i][j], matrix);
        flood(board, i - 1, j, m, n, matrix[i][j], matrix);
        flood(board, i, j - 1, m, n, matrix[i][j], matrix);
    }
}
