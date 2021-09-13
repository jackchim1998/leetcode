package medium;

import java.util.Arrays;

public class LargestPlusSign {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] board = new int[n][n];
        for (int row = 0; row < n; row++)
            Arrays.fill(board[row], Integer.MAX_VALUE);
        for (int[] mine : mines)
            board[mine[0]][mine[1]] = 0;

        for (int i = 0; i < n; i++) {
            int accumulated = 0;
            for (int j = 0; j < n; j++)
                if (board[i][j] == 0) accumulated = 0;
                else board[i][j] = Math.min(board[i][j], ++accumulated);
            accumulated = 0;
            for (int j = n - 1; j >= 0; j--)
                if (board[i][j] == 0) accumulated = 0;
                else board[i][j] = Math.min(board[i][j], ++accumulated);
            accumulated = 0;
            for (int j = 0; j < n; j++)
                if (board[j][i] == 0) accumulated = 0;
                else board[j][i] = Math.min(board[j][i], ++accumulated);
            accumulated = 0;
            for (int j = n - 1; j >= 0; j--)
                if (board[j][i] == 0) accumulated = 0;
                else board[j][i] = Math.min(board[j][i], ++accumulated);
        }

        int max = 0;
        for (int row = 0; row < n; row++)
            for (int col = 0; col < n; col++)
                max = Math.max(max, board[row][col]);
        return max;
    }
}
