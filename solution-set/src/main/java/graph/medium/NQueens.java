package graph.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] solution = new int[n];
        backtracking(result, solution, 0, n);
        return result;
    }

    private void backtracking(List<List<String>> result, int[] solution, int level, int n) {
        if (level == n) {
            result.add(format(solution));
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
                backtracking(result, solution, level + 1, n);
            }
        }
    }

    private List<String> format(int[] solution) {
        List<String> result = new ArrayList<>();
        for (int idx : solution)
            result.add(".".repeat(Math.max(0, idx)) + 'Q' + ".".repeat(Math.max(0, solution.length - (idx + 1))));
        return result;
    }
}
