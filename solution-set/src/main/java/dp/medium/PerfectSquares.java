package dp.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author Jack
 */
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i=1; i<=n;i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                dp[i]=1;
                continue;
            }
            for (int j=1; j<=sqrt; j++)
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
        }
        return dp[n];
    }
    /**
     * The Below code is BFS, almost same speed
     */
//    public int numSquares(int n) {
//        Queue<Item> queue = new ArrayDeque<>();
//        queue.offer(new Item(n, 0));
//        while (!queue.isEmpty()) {
//            Item item = queue.poll();
//            for (int i = (int)Math.sqrt(item.remaining); i >=1; i--) {
//                if (item.remaining == i*i)
//                    return item.step +1;
//                queue.offer(new Item(item.remaining-i*i, item.step + 1));
//            }
//        }
//        return 0;
//    }
//
//    static class Item {
//        public int remaining;
//        public int step;
//
//        public Item(int remaining, int step) {
//            this.remaining = remaining;
//            this.step = step;
//        }
//    }
}
