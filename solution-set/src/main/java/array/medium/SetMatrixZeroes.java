package array.medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class SetMatrixZeroes { // O(1) space, but it is really complex
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 1 || n == 1) {
            boolean hasZero = false;
            for (int[] row : matrix)
                for (int ele : row)
                    if (ele == 0) {
                        hasZero = true;
                        break;
                    }
            if (hasZero)
                for (int[] row : matrix)
                    Arrays.fill(row, 0);
            return;
        }
        boolean hasZero = false;
        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0) {
                hasZero = true;
                break;
            }
        boolean newRowHasZero = false;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    newRowHasZero = true;
                    for (int k = i; k >= 0; k--)
                        matrix[k][j] = 0;
                }
                if (matrix[i - 1][j] == 0)
                    matrix[i][j] = 0;
            }
            if (hasZero)
                Arrays.fill(matrix[i - 1], 0);
            hasZero = newRowHasZero;
            newRowHasZero = false;
        }
        if (hasZero)
            Arrays.fill(matrix[m - 1], 0);
    }
}
