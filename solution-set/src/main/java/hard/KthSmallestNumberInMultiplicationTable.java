package hard;

public class KthSmallestNumberInMultiplicationTable {
    public int findKthNumber(int m, int n, int k) {
        int left = 1;
        int right = m * n;
        do {
            int mid = (left + right) / 2;
            if (count(mid, m, n) < k)
                left = mid + 1;
            else
                right = mid;
        } while (left < right);
        return left;
    }

    private int count(int x, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++)
            count += Math.min(n, x / i);
        return count;
    }
}
