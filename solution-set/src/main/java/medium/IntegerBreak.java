package medium;

/**
 * @author Jack
 * q.343
 * constraint:
 * 2 <= n <= 58
 */
public class IntegerBreak { // for any factor f>=4, we can make it become 2, f-2 to optimize. Therefore we only consider 1,2,3
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int numOf3 = n / 3;
        int remain = n % 3;
        if (remain == 0)
            return (int) Math.pow(3, numOf3);
        if (remain == 1)
            return (int) Math.pow(3, numOf3 - 1) * 4;
        else
            return (int) Math.pow(3, numOf3) * 2;
    }
}
