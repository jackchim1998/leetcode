package easy;

public class ArrangingCoins {
    /**
     * (1+ x) * x / 2 = n
     * x^2 + x - 2n = 0
     */
    public int arrangeCoins(int n) {
        long discriminant = 1 + 8L * n;
        double root = (-1 + Math.sqrt(discriminant)) / 2;
        return (int) root;
    }
}
