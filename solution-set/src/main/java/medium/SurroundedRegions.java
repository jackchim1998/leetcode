package medium;

/**
 * @author Jack
 * q.130
 */
public class SurroundedRegions {
    public void solve(char[][] board) { // this one is faster by converting the non-flip area to *, then flip all O to X and * back to O
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (!visited[i][0]) flipStar(board, visited, i, 0, m, n);
            if (!visited[i][n - 1]) flipStar(board, visited, i, n - 1, m, n);
        }
        for (int j = 0; j < n; j++) {
            if (!visited[0][j]) flipStar(board, visited, 0, j, m, n);
            if (!visited[m - 1][j]) flipStar(board, visited, m - 1, j, m, n);
        }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '*')
                    board[i][j] = 'O';
    }

    private void flipStar(char[][] board, boolean[][] visited, int i, int j, int m, int n) {
        if (i >= m || i < 0) return;
        if (j >= n || j < 0) return;
        if (visited[i][j]) return;
        if (board[i][j] == 'X') return;
        visited[i][j] = true;
        board[i][j] = '*';
        flipStar(board, visited, i + 1, j, m, n);
        flipStar(board, visited, i - 1, j, m, n);
        flipStar(board, visited, i, j + 1, m, n);
        flipStar(board, visited, i, j - 1, m, n);
    }

    /**
     * The Below Code is slow because it use floodFlow for 2 times, the first is to determine flip or not, the second is flip operation
     */
//    public void solve(char[][] board) {
//        int m = board.length;
//        int n = board[0].length;
//        boolean[][] visited = new boolean[m][n];
//        boolean[][] shouldFill = new boolean[m][n];
//        for (int i = 0; i < m; i++)
//            for (int j = 0; j < n; j++)
//                if (board[i][j] == 'O' && !visited[i][j]) {
//                    floodFill(board, visited, i, j, m, n, shouldFill);
//                    if (shouldFill[i][j])
//                        fill(board, shouldFill);
//                    for (boolean[] booleans : shouldFill) Arrays.fill(booleans, false);
//                }
//    }
//
//    private void fill(char[][] board, boolean[][] shouldFill) {
//        for (int i = 0; i < shouldFill.length; i++)
//            for (int j = 0; j < shouldFill[0].length; j++)
//                if (shouldFill[i][j])
//                    board[i][j] = 'X';
//    }
//
//    private boolean floodFill(char[][] board, boolean[][] visited, int x, int y, int m, int n, boolean[][] shouldFill) {
//        if (x >= m || x < 0) return false;
//        if (y >= n || y < 0) return false;
//        if (visited[x][y]) return true;
//        if (board[x][y] == 'X') return true;
//        visited[x][y] = true;
//        boolean down = floodFill(board, visited, x + 1, y, m, n, shouldFill);
//        boolean up = floodFill(board, visited, x - 1, y, m, n, shouldFill);
//        boolean right = floodFill(board, visited, x, y + 1, m, n, shouldFill);
//        boolean left = floodFill(board, visited, x, y - 1, m, n, shouldFill);
//        if (down && up && right && left) {
//            shouldFill[x][y] = true;
//            return true;
//        }
//        return false;
//    }
}
