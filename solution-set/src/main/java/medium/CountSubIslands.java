package medium;

/**
 * @author Jack
 */
public class CountSubIslands {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int result = 0;
        for (int i = 0; i < grid1.length; i++)
            for (int j = 0; j < grid1[0].length; j++)
                if (grid2[i][j] != 0 && isSubIsland(grid1, grid2, i, j))
                    result++;
        return result;
    }

    private boolean isSubIsland(int[][] grid1, int[][] grid2, int i, int j) {
        int m = grid1.length;
        int n = grid1[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) return true;
        if (grid2[i][j] == 0) return true;
        grid2[i][j] = 0;
        boolean result = isSubIsland(grid1, grid2, i + 1, j);
        result &= isSubIsland(grid1, grid2, i - 1, j);
        result &= isSubIsland(grid1, grid2, i, j + 1);
        result &= isSubIsland(grid1, grid2, i, j - 1);
        return result && grid1[i][j] == 1;
    }

}
