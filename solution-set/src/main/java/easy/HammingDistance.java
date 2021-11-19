package easy;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int bitsDifferent = 0;
        while (xor != 0) {
            if ((xor & 1) == 1) bitsDifferent++;
            xor >>= 1;
        }
        return bitsDifferent;
    }
}
