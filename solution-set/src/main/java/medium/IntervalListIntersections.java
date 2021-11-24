package medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstIdx = 0;
        int secondIdx = 0;
        List<int[]> intersections = new ArrayList<>();
        while (firstIdx < firstList.length && secondIdx < secondList.length) {
            int lowerBound = Math.max(firstList[firstIdx][0], secondList[secondIdx][0]);
            int upperBound = Math.min(firstList[firstIdx][1], secondList[secondIdx][1]);
            if (lowerBound <= upperBound)
                intersections.add(new int[]{lowerBound, upperBound});
            if (firstList[firstIdx][1] < secondList[secondIdx][1])
                firstIdx++;
            else
                secondIdx++;
        }
        return intersections.toArray(new int[intersections.size()][]);
    }
}
