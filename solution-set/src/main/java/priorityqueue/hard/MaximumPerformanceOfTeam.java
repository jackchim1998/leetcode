package priorityqueue.hard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Jack
 */
public class MaximumPerformanceOfTeam {
    private static final int MODULO = 1_000_000_007;

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++)
            pairs.add(new Pair(speed[i], efficiency[i]));
        pairs.sort((a, b) -> b.efficiency - a.efficiency);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        long performance = 0;
        long speedSum = 0;
        for (Pair pair : pairs) {
            if (pq.size() > k - 1) speedSum -= pq.poll();
            pq.add(pair.speed);
            speedSum += pair.speed;
            performance = Math.max(performance, speedSum * pair.efficiency);
        }

        return (int) (performance % MODULO);
    }

    private static class Pair {
        final int speed;
        final int efficiency;

        public Pair(int speed, int efficiency) {
            this.speed = speed;
            this.efficiency = efficiency;
        }
    }
}
