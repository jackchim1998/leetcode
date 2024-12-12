package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class TakeGiftsFromTheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        long result = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int gift : gifts) {
            result+=gift;
            priorityQueue.add(gift);
        }

        while (k > 0) {
            Integer peek = priorityQueue.poll();
            int left = (int) Math.sqrt(peek);
            result -= peek-left;
            priorityQueue.add(left);
            k--;
        }

        return result;
    }
}
