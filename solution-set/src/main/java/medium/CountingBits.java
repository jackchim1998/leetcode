package medium;

/**
 * @author Jack
 * q.338 bit manipulation
 * constraint:
 * 0 <= num <= 105
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++)
            res[i] = res[i >> 1] + (i & 1);
        return res;
    }
    /**
     * First Attempt, same logic as the above, But the above code is cleaner
     */
//    public int[] countBits(int num) {
//        if (num == 0) return new int[]{0};
//        int[] res = new int[num + 1];
//        res[0] = 0;
//        res[1] = 1;
//        int rndStart = 2;
//        while (true) {
//            for (int i = 0; i < rndStart / 2; i++) {
//                if (rndStart + i > num) return res;
//                res[rndStart + i] = res[rndStart / 2 + i];
//            }
//            for (int i = 0; i < rndStart / 2; i++) {
//                if (rndStart + rndStart / 2 + i > num) return res;
//                res[rndStart + rndStart / 2 + i] = res[rndStart / 2 + i] + 1;
//            }
//            rndStart *= 2;
//        }
//    }
}
