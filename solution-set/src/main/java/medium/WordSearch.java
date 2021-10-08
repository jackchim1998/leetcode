package medium;

/**
 * @author Jack
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int x = 0; x < board.length; x++)
            for (int y = 0; y < board[0].length; y++)
                if (floodFill(board, word, word.length() - 1, x, y, new boolean[board.length][board[0].length]))
                    return true;
        return false;
    }

    private boolean floodFill(char[][] board, String word, int idx, int x, int y, boolean[][] visited) {
        if (idx < 0) return true;
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
        if (visited[x][y] || board[x][y] != word.charAt(idx)) return false;
        visited[x][y] = true;
        boolean match = floodFill(board, word, idx - 1, x, y + 1, visited);
        match |= floodFill(board, word, idx - 1, x + 1, y, visited);
        match |= floodFill(board, word, idx - 1, x, y - 1, visited);
        match |= floodFill(board, word, idx - 1, x - 1, y, visited);
        visited[x][y] = false;
        return match;
    }
}
