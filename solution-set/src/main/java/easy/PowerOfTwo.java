package easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        while (n != 0) {
            if ((n & 1) == 1)
                return n == 1;
            n >>= 1;
        }
        return false;
    }
}
