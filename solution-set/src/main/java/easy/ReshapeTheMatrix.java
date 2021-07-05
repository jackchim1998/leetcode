package easy;

/**
 * @author Jack
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (r * c != m * n) return mat;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int idx = i * c + j;
                result[i][j] = mat[idx / n][idx % n];
            }
        }
        return result;
    }
}
