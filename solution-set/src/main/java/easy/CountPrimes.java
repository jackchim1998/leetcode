package easy;

/**
 * @author Jack
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        int count = 1;
        boolean[] notPrime = new boolean[n];
        for (int i = 3; i * i < n; i += 2)
            if (!notPrime[i]) {
                int multiple = i * 2;
                while (multiple < n) {
                    notPrime[multiple] = true;
                    multiple += i;
                }
            }
        for (int i = 3; i < n; i += 2)
            if (!notPrime[i])
                count++;
        return count;
    }
}
