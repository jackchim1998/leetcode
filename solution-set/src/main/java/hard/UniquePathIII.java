package hard;

public class UniquePathIII {
    private int count = 0;
    private int allVisited = 0;

    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mn = m * n;
        int visited = 0;
        for (int i = 0; i < mn; i++) {
            int bit = 1 << i;
            allVisited |= bit;
            if (grid[i / n][i % n] == -1)
                visited |= bit;
        }

        for (int i = 0; i < mn; i++)
            if (grid[i / n][i % n] == 1) {
                visited |= 1 << i;
                backtracking(grid, i, visited);
            }

        return count;
    }

    private void backtracking(int[][] grid, int idx, int visited) {
        int x = idx / grid[0].length;
        int y = idx % grid[0].length;
        if (grid[x][y] == 2) {
            if (visited == allVisited) count++;
            return;
        }

        move(grid, x - 1, y, visited);
        move(grid, x + 1, y, visited);
        move(grid, x, y - 1, visited);
        move(grid, x, y + 1, visited);
    }

    private void move(int[][] grid, int x, int y, int visited) {
        if (x < 0 || x >= grid.length) return;
        if (y < 0 || y >= grid[0].length) return;

        int idx = x * grid[0].length + y;
        int bit = 1 << idx;
        if ((visited & bit) == 0) {
            visited |= bit;
            backtracking(grid, idx, visited);
        }
    }

}
