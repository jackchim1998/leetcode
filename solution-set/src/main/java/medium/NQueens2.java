package medium;

/**
 * @author Jack
 */
public class NQueens2 {
    private int count = 0;

    public int totalNQueens(int n) {
        int[] solution = new int[n];
        backtracking(solution, 0, n);
        return count;
    }

    private void backtracking(int[] solution, int level, int n) {
        if (level == n) {
            count++;
            return;
        }
        boolean[] unavailable = new boolean[n];
        for (int i = 0; i < level; i++) {
            int occupy = solution[i];
            unavailable[occupy] = true;
            if (occupy + level - i < n)
                unavailable[occupy + level - i] = true;
            if (occupy - level + i >= 0)
                unavailable[occupy - level + i] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!unavailable[i]) {
                solution[level] = i;
                backtracking(solution, level + 1, n);
            }
        }
    }

}
