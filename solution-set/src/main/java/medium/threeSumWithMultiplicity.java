package medium;

/**
 * @author Jack
 * q.923
 * constraint:
 * 3 <= arr.length <= 3000
 * 0 <= arr[i] <= 100
 * 0 <= target <= 300
 */
public class threeSumWithMultiplicity {
    public int threeSumMulti(int[] arr, int target) {
        int[] cnt = new int[101];
        int[] used = new int[101];
        long total = 0;
        for (int num : arr)
            cnt[num]++;
        for (int i = 0; i <= target && i <= 100; i++) {
            used[i]++;
            if (used[i] > cnt[i]) {
                used[i]--;
                continue;
            }
            for (int j = i; j + i <= target && j <= 100; j++) {
                used[j]++;
                if (used[j] > cnt[j]) {
                    used[j]--;
                    continue;
                }
                int k = target - i - j;
                if (k < i || k < j || k > 100) {
                    used[j]--;
                    continue;
                }
                used[k]++;
                if (used[k] > cnt[k]) {
                    used[j]--;
                    used[k]--;
                    continue;
                }

                if (i == j && j == k)
                    total += (long)cnt[i] * (cnt[i] - 1) * (cnt[i] - 2) / 6;
                else if (i == j)
                    total += (long)cnt[i] * (cnt[i] - 1) * cnt[k] / 2;
                else if (j == k)
                    total += (long)cnt[j] * (cnt[j] - 1) * cnt[i] / 2;
                else
                    total += (long)cnt[i] * cnt[j] * cnt[k];
                total %= 1_000_000_007;
                used[j]--;
                used[k]--;
            }
            used[i]--;
        }
        return (int) total;
    }
}
