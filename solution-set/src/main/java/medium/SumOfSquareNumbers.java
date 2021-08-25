package medium;

/**
 * @author Jack
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j = (int) Math.sqrt(c);
        while (i<=j) {
            int powSum = i * i + j * j;
            if (powSum == c) return true;
            if (powSum > c) j--;
            else i++;
        }
        return false;
    }
}
