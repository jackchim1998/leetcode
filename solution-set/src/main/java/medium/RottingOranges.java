package medium;

import java.util.ArrayList;
import java.util.List;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        List<Coordinate> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 2)
                    list.add(new Coordinate(i, j));

        int step = 0;
        while (!list.isEmpty()) {
            List<Coordinate> newList = new ArrayList<>();
            for (Coordinate coordinate : list) {
                int x = coordinate.x;
                int y = coordinate.y;
                if (x > 0 && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 2;
                    newList.add(new Coordinate(x - 1, y));
                }
                if (x < m - 1 && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 2;
                    newList.add(new Coordinate(x + 1, y));
                }
                if (y > 0 && grid[x][y - 1] == 1) {
                    grid[x][y - 1] = 2;
                    newList.add(new Coordinate(x, y - 1));
                }
                if (y < n - 1 && grid[x][y + 1] == 1) {
                    grid[x][y + 1] = 2;
                    newList.add(new Coordinate(x, y + 1));
                }
            }
            list = newList;
            if (!list.isEmpty())
                step++;
        }
        for (int[] row : grid)
            for (int pt : row)
                if (pt == 1)
                    return -1;
        return step;
    }

    private static class Coordinate {
        private final int x;
        private final int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
