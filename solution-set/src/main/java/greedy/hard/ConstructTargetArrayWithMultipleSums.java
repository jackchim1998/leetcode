package greedy.hard;

import java.util.PriorityQueue;

/**
 * @author Jack
 */
public class ConstructTargetArrayWithMultipleSums {
    public boolean isPossible(int[] target) {
        if (target.length == 1)
            return target[0] == 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(target.length, (a, b) -> b - a);
        long totalSum = 0;
        for (int num : target) {
            pq.add(num);
            totalSum += num;
        }
        while (true) {
            Integer top = pq.poll();
            if (top == 1) return true;
            long prev = top * 2 - totalSum;
            if (totalSum - top == 1) return true;
            prev = prev % (totalSum - top);
            if (prev < 1)
                return false;
            pq.add(Math.toIntExact(prev));
            totalSum += -top + prev;
        }
    }
}
