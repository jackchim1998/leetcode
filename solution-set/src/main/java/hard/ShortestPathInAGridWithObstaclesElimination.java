package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestPathInAGridWithObstaclesElimination {
    public int shortestPath(int[][] grid, int k) {
        List<Point> list = new ArrayList<>();
        int[][] kCounts = new int[grid.length][grid[0].length];
        for (int[] x : kCounts) Arrays.fill(x, -1);
        kCounts[0][0] = k;
        list.add(new Point(0, 0, k));
        int result = 0;
        while (list.size() > 0) {
            List<Point> newList = new ArrayList<>();
            for (Point point : list) {
                if (point.x == grid.length - 1 && point.y == grid[0].length - 1) return result;
                if (point.x > 0) {
                    int newK = grid[point.x - 1][point.y] == 1 ? point.k - 1 : point.k;
                    if (newK >= 0 && newK > kCounts[point.x - 1][point.y]) {
                        newList.add(new Point(point.x - 1, point.y, newK));
                        kCounts[point.x - 1][point.y] = newK;
                    }
                }
                if (point.y > 0) {
                    int newK = grid[point.x][point.y - 1] == 1 ? point.k - 1 : point.k;
                    if (newK >= 0 && newK > kCounts[point.x][point.y - 1]) {
                        newList.add(new Point(point.x, point.y - 1, newK));
                        kCounts[point.x][point.y - 1] = newK;
                    }
                }
                if (point.x < grid.length - 1) {
                    int newK = grid[point.x + 1][point.y] == 1 ? point.k - 1 : point.k;
                    if (newK >= 0 && newK > kCounts[point.x + 1][point.y]) {
                        newList.add(new Point(point.x + 1, point.y, newK));
                        kCounts[point.x + 1][point.y] = newK;
                    }
                }
                if (point.y < grid[0].length - 1) {
                    int newK = grid[point.x][point.y + 1] == 1 ? point.k - 1 : point.k;
                    if (newK >= 0 && newK > kCounts[point.x][point.y + 1]) {
                        newList.add(new Point(point.x, point.y + 1, newK));
                        kCounts[point.x][point.y + 1] = newK;
                    }
                }
            }
            result++;
            list = newList;
        }
        return -1;
    }

    private static class Point {
        private final int x;
        private final int y;
        private final int k;

        Point(int x, int y, int k) {
            this.x = x;
            this.y = y;
            this.k = k;
        }
    }
}
