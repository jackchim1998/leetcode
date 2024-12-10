package medium;

import java.util.Arrays;

public class FindLongestSpecialSubstringThatOccursThriceI {
    public int maximumLength(String s) {
        if (s.length() <= 2) {
            return -1;
        }
        int[][] count = new int[26][4];
        for (int[] ints : count) {
            Arrays.fill(ints, -1);
        }


        char c = s.charAt(0);
        int cnt = 1;
        int idx = 1;
        while (idx < s.length()) {
            if (s.charAt(idx) == c) {
                cnt++;
            } else {
                updateCount(count, c, cnt);
                c = s.charAt(idx);
                cnt = 1;
            }
            idx++;
        }
        updateCount(count, c, cnt);

        int result = -1;
        for (int i = 0; i < 26; i++) {
            int[] arr = count[i];
            if (arr[1] >= 3) {
                result = Math.max(result, arr[0]);
            } else if (arr[1] == 2) {
                if (arr[0] <= 1) {
                    continue;
                }
                result = Math.max(result, arr[0] - 1);
            } else if (arr[1] == 1) {
                if (arr[0] == arr[2] + 1) {
                    if (arr[0] <= 1) {
                        continue;
                    }
                    result = Math.max(result, arr[0] - 1);
                } else {
                    if (arr[0] <= 2) {
                        continue;
                    }
                    result = Math.max(result, arr[0] - 2);
                }
            }
        }
        return result;
    }

    private void updateCount(int[][] count, char c, int cnt) {
        int[] arr = count[c - 'a'];
        if (cnt == arr[0]) {
            arr[1]++;
            return;
        }
        if (cnt == arr[2]) {
            arr[3]++;
            return;
        }
        if (cnt > arr[0]) {
            arr[2] = arr[0];
            arr[3] = arr[1];
            arr[0] = cnt;
            arr[1] = 1;
            return;
        }
        if (cnt > arr[2]) {
            arr[2] = cnt;
            arr[3] = 1;
        }
    }
}
