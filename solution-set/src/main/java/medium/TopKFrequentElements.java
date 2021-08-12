package medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Jack
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) { // to solve topK problem, we can use quickSelect algorithm
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums)
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        Queue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(counts::get));
        for (Integer num : counts.keySet()) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = pq.poll();
        return result;
    }
}
