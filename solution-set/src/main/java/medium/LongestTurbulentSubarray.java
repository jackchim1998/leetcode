package medium;

public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) return 1;
        int up = 1;
        int down = 1;
        int max = 1;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1]) {
                down = up + 1;
                up = 1;
                max = Math.max(max, down);
            } else if (arr[i] > arr[i - 1]) {
                up = down + 1;
                down = 1;
                max = Math.max(max, up);
            } else {
                up = 1;
                down = 1;
            }
        return Math.max(Math.max(max, down), up);
    }
}
