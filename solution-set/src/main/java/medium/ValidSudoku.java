package medium;

/**
 * @author Jack
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++)
            if (!isRowValid(board, i)) return false;
        for (int j = 0; j < 9; j++)
            if (!isColValid(board, j)) return false;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (!isBlockValid(board, i, j)) return false;
        return true;
    }

    private boolean isRowValid(char[][] board, int rowIdx) {
        boolean[] exist = new boolean[9];
        for (char c : board[rowIdx]) {
            if (c != '.') {
                int idx = c - '1';
                if (exist[idx]) return false;
                exist[idx] = true;
            }
        }
        return true;
    }

    private boolean isColValid(char[][] board, int colIdx) {
        boolean[] exist = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[i][colIdx] != '.') {
                int idx = board[i][colIdx] - '1';
                if (exist[idx]) return false;
                exist[idx] = true;
            }
        }
        return true;
    }

    private boolean isBlockValid(char[][] board, int blockRowIdx, int blockColIdx) {
        boolean[] exist = new boolean[9];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int x = blockRowIdx * 3 + i;
                int y = blockColIdx * 3 + j;
                if (board[x][y] != '.') {
                    int idx = board[x][y] - '1';
                    if (exist[idx]) return false;
                    exist[idx] = true;
                }
            }
        return true;
    }
}
