package hard;

import java.util.Arrays;

/**
 * @author Jack
 */
public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        backtracking(board, 0, 0);
    }

    private boolean backtracking(char[][] board, int x, int y) {
        if (x == 9) return true;
        int newY = (y + 1) % 9;
        int newX = (y + 1) / 9 + x;
        if (board[x][y] != '.')
            return backtracking(board, newX, newY);
        boolean[] possible = new boolean[9];
        Arrays.fill(possible, true);
        determineHorizontal(possible, board, x);
        determineVertical(possible, board, y);
        determineBlock(possible, board, x, y);
        for (int i = 0; i < 9; i++)
            if (possible[i]) {
                board[x][y] = (char) (i + (int) '1');
                if (backtracking(board, newX, newY))
                    return true;
            }
        board[x][y] = '.';
        return false;
    }

    private void determineBlock(boolean[] possible, char[][] board, int x, int y) {
        int blockX = x / 3;
        int blockY = y / 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                char c = board[blockX * 3 + i][blockY * 3 + j];
                if (c != '.')
                    possible[c - '1'] = false;
            }
    }

    private void determineVertical(boolean[] possible, char[][] board, int y) {
        for (int i = 0; i < 9; i++)
            if (board[i][y] != '.')
                possible[board[i][y] - '1'] = false;
    }

    private void determineHorizontal(boolean[] possible, char[][] board, int x) {
        for (char c : board[x])
            if (c != '.')
                possible[c - '1'] = false;
    }
}
