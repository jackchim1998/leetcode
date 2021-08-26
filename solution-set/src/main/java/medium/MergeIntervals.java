package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Jack
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Deque<int[]> result = new LinkedList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = result.getLast();
            if (prev[1] < intervals[i][0])
                result.addLast(intervals[i]);
            else
                prev[1] = Math.max(prev[1], intervals[i][1]);
        }
        return result.toArray(new int[result.size()][]);
    }

}
