package medium;

/**
 * @author Jack
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == '1') {
                    cnt++;
                    floodFillZero(grid, i, j, m, n);
                }
        return cnt;
    }

    private void floodFillZero(char[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n) return;
        if (grid[i][j] == '0') return;
        grid[i][j] = '0';
        floodFillZero(grid, i + 1, j, m, n);
        floodFillZero(grid, i - 1, j, m, n);
        floodFillZero(grid, i, j + 1, m, n);
        floodFillZero(grid, i, j - 1, m, n);
    }
}
