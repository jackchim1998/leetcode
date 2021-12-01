package hard;

import java.util.Deque;
import java.util.LinkedList;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[] height = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++)
            height[i] = matrix[0][i] - '0';
        int result = maxArea(height);
        for (int i = 1; i < matrix.length; i++) {
            resetHeight(matrix, height, i);
            result = Math.max(result, maxArea(height));
        }

        return result;
    }

    private void resetHeight(char[][] matrix, int[] height, int rowIdx) {
        for (int i = 0; i < matrix[0].length; i++)
            height[i] = matrix[rowIdx][i] == '1' ? height[i] + 1 : 0;
    }

    private int maxArea(int[] height) {
        int max = 0;
        Deque<Integer> stack = new LinkedList<>();
        int idx = 0;
        while (idx < height.length) {
            if (stack.isEmpty() || height[idx] >= height[stack.peek()]) {
                stack.push(idx);
                idx++;
            } else {
                int tp = stack.pop();
                int area = height[tp] * (stack.isEmpty() ? idx : idx - 1 - stack.peek());
                max = Math.max(area, max);
            }
        }
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            int area = height[tp] * (stack.isEmpty() ? idx : height.length - 1 - stack.peek());
            max = Math.max(area, max);
        }
        return max;
    }
}
