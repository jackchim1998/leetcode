package hard;

/**
 * @author Jack
 */
public class MakingALargeIsland {
    private static final int TEMP_STATUS = -1;

    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int[] map = new int[n * n + 1];
        map[0] = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 1) {
                    int id = n * i + j + 1;
                    map[id] = flood(grid, i, j, n);
                    fill(grid, id, i, j, n);
                }
        int result = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0) {
                    int currSize = 1;
                    int up = i > 0 ? grid[i - 1][j] : 0;
                    int down = i < n - 1 ? grid[i + 1][j] : 0;
                    int left = j > 0 ? grid[i][j - 1] : 0;
                    int right = j < n - 1 ? grid[i][j + 1] : 0;
                    currSize += map[up];
                    if (down != up)
                        currSize += map[down];
                    if (left != up && left != down)
                        currSize += map[left];
                    if (right != up && right != down && right != left)
                        currSize += map[right];
                    result = Math.max(result, currSize);
                }
        return result == 0 ? n * n : result;
    }

    private void fill(int[][] grid, int id, int i, int j, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n) return;
        if (grid[i][j] != TEMP_STATUS) return;
        grid[i][j] = id;
        fill(grid, id, i + 1, j, n);
        fill(grid, id, i - 1, j, n);
        fill(grid, id, i, j + 1, n);
        fill(grid, id, i, j - 1, n);
    }

    private int flood(int[][] grid, int i, int j, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n) return 0;
        if (grid[i][j] == 0 || grid[i][j] == TEMP_STATUS) return 0;
        grid[i][j] = TEMP_STATUS;
        int count = 1;
        count += flood(grid, i + 1, j, n);
        count += flood(grid, i - 1, j, n);
        count += flood(grid, i, j + 1, n);
        count += flood(grid, i, j - 1, n);
        return count;
    }
}
