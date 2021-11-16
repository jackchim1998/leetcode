package medium;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) return false;

        int start = 0;
        int end = m * n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int midVal = matrix[mid / n][mid % n];
            if (midVal > target) end = mid - 1;
            else if (midVal < target) start = mid + 1;
            else return true;
        }
        return false;
    }
}
