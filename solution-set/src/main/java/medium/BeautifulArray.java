package medium;

/**
 * @author Jack
 */
public class BeautifulArray {
    public int[] beautifulArray(int n) {
        int[] arr = new int[n * 2];
        arr[0] = 1;
        int len = 1;
        while (len < n) {
            for (int i = 0; i < len; i++)
                arr[i] = arr[i] * 2 - 1;
            for (int i = 0; i < len; i++)
                arr[i + len] = arr[i] + 1;
            len *= 2;
        }

        int[] result = new int[n];
        int idx = 0;
        for (int i = 0; i < len; i++)
            if (arr[i] <= n) {
                result[idx] = arr[i];
                idx++;
            }
        return result;
    }
}
