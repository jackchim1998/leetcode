package easy;

/**
 * @author Jack
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int selfCount = 0;
        int pardosiCount = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 1) {
                    selfCount++;
                    if (i < m - 1 && grid[i + 1][j] == 1) pardosiCount++;
                    if (j < n - 1 && grid[i][j + 1] == 1) pardosiCount++;
                }
        return 4 * selfCount - 2 * pardosiCount;
    }
}
