package medium;

/**
 * @author Jack
 * 1 <= m, n <= 10^4
 * 1 <= m * n <= 10^4
 */
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        //consider left, down
        if (mat[0][0] == 1)
            mat[0][0] = m + n;
        for (int i = 1; i < m; i++)
            if (mat[i][0] == 1)
                mat[i][0] = mat[i - 1][0] + 1;
        for (int j = 1; j < n; j++)
            if (mat[0][j] == 1)
                mat[0][j] = mat[0][j - 1] + 1;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (mat[i][j] == 1)
                    mat[i][j] = Math.min(mat[i - 1][j], mat[i][j - 1]) + 1;

        //consider right, up
        for (int i = m - 2; i >= 0; i--)
            if (mat[i][n - 1] > 0)
                mat[i][n - 1] = Math.min(mat[i][n - 1], mat[i + 1][n - 1] + 1);
        for (int j = n - 2; j >= 0; j--)
            if (mat[m - 1][j] > 0)
                mat[m - 1][j] = Math.min(mat[m - 1][j], mat[m - 1][j + 1] + 1);
        for (int i = m - 2; i >= 0; i--)
            for (int j = n - 2; j >= 0; j--)
                if (mat[i][j] > 0)
                    mat[i][j] = Math.min(Math.min(mat[i][j], mat[i + 1][j] + 1), mat[i][j + 1] + 1);
        return mat;
    }

}
