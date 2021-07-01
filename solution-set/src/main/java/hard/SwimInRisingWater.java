package hard;

/**
 * @author Jack
 */
public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int left = 0;
        int right = n * n;
        while (left != right - 1) {
            int mid = (left + right) >> 1;
            boolean isPassed = isPassed(grid, mid);
            if (isPassed) right = mid;
            else left = mid;
        }
        return right;
    }

    boolean isPassed(int[][] grid, int waterLevel) {
        boolean[][] visited = new boolean[grid.length][grid.length];
        return floodFill(grid, visited, waterLevel, 0, 0);
    }

    private boolean floodFill(int[][] grid, boolean[][] visited, int waterLevel, int i, int j) {
        if (i < 0 || i >= grid.length) return false;
        if (j < 0 || j >= grid.length) return false;
        if (visited[i][j]) return false;
        if (grid[i][j] > waterLevel) return false;
        if (i == grid.length - 1 && j == grid.length - 1) return true;
        visited[i][j] = true;
        boolean result = floodFill(grid, visited, waterLevel, i + 1, j);
        result |= floodFill(grid, visited, waterLevel, i - 1, j);
        result |= floodFill(grid, visited, waterLevel, i, j + 1);
        result |= floodFill(grid, visited, waterLevel, i, j - 1);
        return result;
    }
}
