package medium;

import java.util.PriorityQueue;

/**
 * @author Jack
 */
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
        for (int[] ints : matrix)
            for (int j = 0; j < matrix.length; j++)
                pq.add(ints[j]);
        for (int i = 0; i < k - 1; i++)
            pq.poll();
        return pq.poll();
    }

}
