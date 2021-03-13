package dp.medium;

/**
 * @author Jack
 * q.221
 * constraint:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 300
 * matrix[i][j] is '0' or '1'.
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int side = 0;
        int result = 0;
        for (; side <= Math.min(matrix.length, matrix[0].length); side++) {
            for (int i = 0; i < matrix.length - side; i++) {
                for (int j = 0; j < matrix[0].length - side; j++) {
                    if (side == 0) {
                        if (matrix[i][j] == '1')
                            result = 1;
                    } else {
                        if (matrix[i][j] == '0' || matrix[i + 1][j] == '0' || matrix[i][j + 1] == '0' || matrix[i + 1][j + 1] == '0')
                            matrix[i][j] = '0';
                        else
                            result = (side + 1) * (side + 1);
                    }
                }
            }
        }
        return result;
    }
}
