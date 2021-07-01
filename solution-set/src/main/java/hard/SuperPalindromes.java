package hard;

/**
 * @author Jack
 */
public class SuperPalindromes {
    public int superpalindromesInRange(String left, String right) {
        long l = (long) Math.sqrt(Long.parseLong(left));
        long r = (long) Math.sqrt(Long.parseLong(right));
        int cnt = 0;
        PalindromicIterator palindromicIterator = new PalindromicIterator(l);
        while (true) {
            long val = palindromicIterator.next();
            if (val > r) break;
            if (isPalindromic(val) && isPalindromic(val * val))
                cnt++;
        }
        return cnt;
    }

    private boolean isPalindromic(long num) {
        long n = num;
        long rev = 0;
        while (num > 0) {
            long dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        return n == rev;
    }

    private static class PalindromicIterator {
        long next;

        private PalindromicIterator(long l) {
            if (l < 9)
                next = l;
            else {
                int digits = digitsCnt(l);
                if (digits % 2 == 0) {
                    long pow = (long) Math.pow(10, digits >> 1);
                    long upperHalf = l / pow;
                    this.next = upperHalf * pow + reverse(upperHalf);
                } else {
                    long pow = (long) Math.pow(10, digits >> 1);
                    long upperHalf = l / (pow * 10);
                    long mid = (l / pow) % 10;
                    this.next = upperHalf * (pow * 10) + mid * pow + reverse(upperHalf);
                }
            }
            if (this.next < l)
                next();
        }

        public long next() {
            long val = this.next;
            if (this.next < 9) this.next = this.next + 1;
            else {
                int digits = digitsCnt(this.next);
                if (digits % 2 == 0) {
                    long pow = (long) Math.pow(10, digits >> 1);
                    long upperHalf = this.next / pow;
                    this.next = (upperHalf + 1) * pow + reverse(upperHalf + 1);
                } else {
                    long pow = (long) Math.pow(10, digits >> 1);
                    long upperHalf = this.next / (pow * 10);
                    long mid = (this.next / pow) % 10;
                    if (mid < 9)
                        this.next = upperHalf * (pow * 10) + mid * pow + pow + reverse(upperHalf);
                    else
                        this.next = upperHalf * (pow * 10) + (pow * 10) + reverse(upperHalf + 1);
                }
            }
            return val;
        }

        private int digitsCnt(long num) {
            int digits = 0;
            while (num > 0) {
                digits++;
                num = num / 10;
            }
            return digits;
        }

        private long reverse(long num) {
            long rev = 0;
            while (num > 0) {
                long dig = num % 10;
                rev = rev * 10 + dig;
                num = num / 10;
            }
            return rev;
        }
    }
}
