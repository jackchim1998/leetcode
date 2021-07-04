package hard;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Jack
 */
public class MaxSumOfRectangleNoLargerThanK {
    int result = Integer.MIN_VALUE;

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int[] rowSum = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(rowSum, 0);
            for (int row = i; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++)
                    rowSum[col] += matrix[row][col];
                updateResult(rowSum, k);
                if (result == k)
                    return result;
            }
        }
        return result;
    }

    private void updateResult(int[] nums, int k) {
        int sum = 0;
        TreeSet<Integer> sortedSum = new TreeSet<>();
        sortedSum.add(0);
        for (int num : nums) {
            sum += num;
            Integer x = sortedSum.ceiling(sum - k); // sum - x <= k    <--->  sum - k <= x
            if (x != null)
                result = Math.max(result, sum - x);
            sortedSum.add(sum);
        }
    }
}
