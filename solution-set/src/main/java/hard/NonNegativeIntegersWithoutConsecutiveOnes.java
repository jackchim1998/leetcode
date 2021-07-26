package hard;

/**
 * @author Jack
 */
public class NonNegativeIntegersWithoutConsecutiveOnes {
    public int findIntegers(int n) {
        if (n == 1) return 2;
        int numOfDigits = numOfDigits(n);
        int[] dp = dp(numOfDigits);
        return findIntegers(n, dp, numOfDigits);
    }

    private int findIntegers(int n, int[] dp, int numOfDigits) {
        if (n == 1) return 2;
        if (n == 0) return 1;
        int cnt = dp[numOfDigits - 1];
        // consider n=18, we know the cnt of 0->15, the rest is 16->18 (=0->2)
        int x = (int) (n - Math.pow(2, numOfDigits - 1));
        // consider n=28, we know the cnt of 0->15, discard 24->28 because first and second digits are 1, the rest is 16->23 (=0->7)
        int y = (int) (Math.pow(2, numOfDigits - 2) - 1);
        if (x < y)
            return cnt + findIntegers(x, dp, numOfDigits(x));
        else
            return cnt + findIntegers(y, dp, numOfDigits - 2);
    }

    private int[] dp(int numOfDigits) {
        int[] dp = new int[numOfDigits + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i <= numOfDigits; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp;
    }

    private int numOfDigits(int n) {
        int i = 1;
        while (n > Math.pow(2, i) - 1)
            i++;
        return i;
    }

}
