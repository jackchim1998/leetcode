package medium;

/**
 * @author Jack
 * 1.1551
 */
public class MinimumOperationsToMakeArrayEqual {
    public int minOperations(int n) {
        if (n % 2 == 0) return n * n / 4;
        else return (1 + n) * (n / 2) / 2;
    }
}
