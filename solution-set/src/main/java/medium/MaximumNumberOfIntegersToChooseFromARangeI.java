package medium;

import java.util.Arrays;

public class MaximumNumberOfIntegersToChooseFromARangeI {
    public int maxCount(int[] banned, int n, int maxSum) {
        int result = 0;

        Arrays.sort(banned);
        int j = 0, i = 1;
        while (i <= n) {
            if (maxSum < i) {
                break;
            }
            boolean blocked = false;
            while (j < banned.length && i == banned[j]) {
                blocked = true;
                j++;
            }
            if (!blocked) {
                maxSum -= i;
                result++;
            }
            i++;
        }
        return result;
    }
}
