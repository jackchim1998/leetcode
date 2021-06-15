import java.util.Arrays;

/**
 * @author Jack
 */
public class MatchSticksToSquare {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int matchstick : matchsticks) sum += matchstick;
        if (sum % 4 != 0) return false;
        int maxSide = sum / 4;
        Arrays.sort(matchsticks);
        boolean[] used = new boolean[matchsticks.length];
        for (int i = 0; i < 4; i++)
            if (!dfs(matchsticks, used, matchsticks.length - 1, maxSide))
                return false;
        return true;
    }

    private boolean dfs(int[] matchsticks, boolean[] used, int end, int length) {
        for (int i = end; i >= 0; i--)
            if (!used[i] && length - matchsticks[i] == 0) {
                used[i] = true;
                return true;
            } else if (!used[i] && length - matchsticks[i] > 0) {
                used[i] = true;
                if (dfs(matchsticks, used, i - 1, length - matchsticks[i])) return true;
                used[i] = false;
            }
        return false;
    }
}
