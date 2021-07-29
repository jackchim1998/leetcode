package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * 1 <= m, n <= 10^4
 * 1 <= m * n <= 10^4
 */
public class ZeroOneMatrix { // bfs
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<Coordinate> coordinates = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) mat[i][j] = Integer.MAX_VALUE;
                else coordinates.add(new Coordinate(i, j));
            }

        int level = 0;
        while (!coordinates.isEmpty()) {
            List<Coordinate> newCoordinates = new ArrayList<>();
            for (Coordinate coordinate : coordinates) {
                int x = coordinate.x;
                int y = coordinate.y;
                if (x > 0 && mat[x - 1][y] > level) {
                    mat[x - 1][y] = level + 1;
                    newCoordinates.add(new Coordinate(x - 1, y));
                }
                if (x < m - 1 && mat[x + 1][y] > level) {
                    mat[x + 1][y] = level + 1;
                    newCoordinates.add(new Coordinate(x + 1, y));
                }
                if (y > 0 && mat[x][y - 1] > level) {
                    mat[x][y - 1] = level + 1;
                    newCoordinates.add(new Coordinate(x, y - 1));
                }
                if (y < n - 1 && mat[x][y + 1] > level) {
                    mat[x][y + 1] = level + 1;
                    newCoordinates.add(new Coordinate(x, y + 1));
                }
            }
            level++;
            coordinates = newCoordinates;
        }

        return mat;
    }

    private static final class Coordinate {
        final int x;
        final int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
