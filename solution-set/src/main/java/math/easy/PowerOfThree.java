package math.easy;

import java.util.Set;

/**
 * @author Jack
 */
public class PowerOfThree {
//    private final static Set<Integer> powerOfThreeSet = Set.of(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467);
//
//    public boolean isPowerOfThree(int n) {
//        return powerOfThreeSet.contains(n);
//    }

    public boolean isPowerOfThree(int n) {
        while(n>=3) {
            if (n%3 != 0) return false;
            n/=3;
        }
        return n==1;
    }
}
