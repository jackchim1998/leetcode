package array.medium;

/**
 * @author Jack
 * q.667
 * constraint:
 * The n and k are in the range 1 <= k < n <= 104.
 */
public class BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int prev = 0;
        boolean up = true;
        for (int i = 0; i < res.length; i++) {
            res[i] = up ? prev + n : prev - n;
            n--;
            k--;
            if (k > 0) {
                up = !up;
                prev = res[i];
            }
        }
        return res;
    }
}
