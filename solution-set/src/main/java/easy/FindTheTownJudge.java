package easy;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trusts) {
        int[] counts = new int[n + 1];
        for (int[] trust : trusts) {
            counts[trust[0]]--;
            counts[trust[1]]++;
        }

        for (int i = 1; i <= n; i++)
            if (counts[i] == n - 1)
                return i;
        return -1;
    }
}
