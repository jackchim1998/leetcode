package medium;

/**
 * @author Jack
 */
public class MaximumAreaOfIsland {
    int sum = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 1) {
                    floodFill(grid, i, j);
                    max = Math.max(max, sum);
                    sum = 0;
                }
        return max;
    }

    private void floodFill(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) return;
        if (j < 0 || j >= grid[0].length) return;
        if (grid[i][j] == 0) return;
        grid[i][j] = 0;
        sum++;
        floodFill(grid, i + 1, j);
        floodFill(grid, i - 1, j);
        floodFill(grid, i, j + 1);
        floodFill(grid, i, j - 1);
    }
}
