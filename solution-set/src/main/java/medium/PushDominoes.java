package medium;

/**
 * @author Jack
 */
public class PushDominoes {
    public String pushDominoes(String dominoes) {
        char[] arr = ('L' + dominoes + 'R').toCharArray();
        int len = arr.length;
        for (int curr = 0, next = 1; next < len; next++) {
            if (arr[next] == '.') continue;
            if (arr[curr] == arr[next])
                fill(arr, curr + 1, next - 1, arr[curr]);
            else if (arr[curr] == 'R' && arr[next] == 'L') {
                int cnt = (next - curr - 1) / 2;
                fill(arr, curr + 1, curr + cnt, 'R');
                fill(arr, next - cnt, next - 1, 'L');
            }
            curr = next;
        }
        return String.valueOf(arr, 1, len - 2);
    }

    private void fill(char[] arr, int start, int end, char c) { // inclusive
        while (start <= end) arr[start++] = c;
    }
}
